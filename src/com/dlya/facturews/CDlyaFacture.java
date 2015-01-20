package com.dlya.facturews;

import java.io.StringWriter;
import java.rmi.RemoteException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.rpc.ServiceException;

import net.sf.jasperreports.engine.JREmptyDataSource;

import com.dlya.facturexsd.Comprobante;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 * DlyaFacture
 * 
 * @author David Torres Palao
 */
public class CDlyaFacture {
	private FactureServicioServiceLocator goLocator;

	public CDlyaFacture() {
		super();
		this.goLocator = new FactureServicioServiceLocator();
	}

	public ResultadoCancelacion omAnularFactura(String arg0, String arg1,
			int arg2, String arg3, String arg4) {
		ResultadoCancelacion loRet = null;
		ResultadoCancelacion loReal = null;
		ResultadoCancelacion loAux = new ResultadoCancelacion();
		loAux.setRespuesta(69);
		loAux.setCancelado(false);
		loAux.setResultado("Exception");

		try {
			FactureServicio loservicio = this.goLocator
					.getFactureServicioPort();
			loReal = loservicio.cancelaFactura(arg0, arg1, arg2, arg3, arg4);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}

		if (loReal != null) {
			loRet = loReal;
		} else {
			loRet = loAux;
		}
		return loRet;
	}

	public ResultDlya omGenerarFactura(Comprobante poComp) {

		ResultDlya loResult = new ResultDlya();
		loResult.setGnState(66);
		loResult.setGoComprobante(poComp);
		try {
			FactureServicio loservicio = this.goLocator
					.getFactureServicioPort();
			JAXBContext loContext = JAXBContext.newInstance(Comprobante.class);
			Marshaller loMarshaller = loContext.createMarshaller();
			StringWriter loStringWriter = new StringWriter();

			loMarshaller.marshal(poComp, loStringWriter);

			String lcXml = loStringWriter.toString();

			/*
			 * System.out.println("===========xml*=========");
			 * System.out.println(lcXml);
			 * System.out.println("===========*xml*=========");
			 */
			loResult.setGcXML(lcXml);
			Resultado loResultado = loservicio.generaFactura(lcXml);
			loResult.setGoResultado(loResultado);

			/*
			 * System.out.println("----------------------------");
			 * System.out.println("Status: "+loResultado.getStatus());
			 * System.out.println("StrStatus: "+ loResultado.getStrStatus());
			 * System.out.println("----------------------------");
			 * System.out.println
			 * ("Anio de aprovación: "+loResultado.getAAprobacion());
			 * System.out.
			 * println("Cadena Original de CFDI: "+loResultado.getCadenaOriginal
			 * ());
			 * System.out.println("Cadena de Complemento del PAC: "+loResultado
			 * .getCadenaPac());
			 * System.out.println("Número de certificado de sellos en el SAT: "
			 * +loResultado.getCertificado());
			 * System.out.println("Cadena de códigos de barra:"
			 * +loResultado.getCodigoBarras());
			 * System.out.println("Fecha de Timbrado:"
			 * +loResultado.getFechaTimbrado());
			 * System.out.println("Numero de Aprobación de Folios SAT:"
			 * +loResultado.getNAprobacion());
			 * System.out.println("Sello fiscal digital:"
			 * +loResultado.getSello());
			 * System.out.println("Sello fiscal digital del PAC:"
			 * +loResultado.getSelloPac());
			 * System.out.println("----------------------------");
			 * 
			 * System.out.println("XML: "+ loResultado.getXml());
			 */
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			loResult.setGnState(69);
			loResult.setGcDesc(e.getMessage());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			loResult.setGnState(68);
			loResult.setGcDesc(e.getMessage());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			loResult.setGnState(69);
			loResult.setGcDesc(e.getMessage());
		}
		return loResult;
	}

	public void omSetAddress(String pcAddress) {
		this.goLocator.setFactureServicioPortEndpointAddress(pcAddress);
	}

	public void mxGenerarPdf(ResultDlya poRD) {
		JasperReport jasperReport2 = null;
		JasperPrint jasperPrint2 = null;

		JasperReport jasperReport;
		JasperPrint jasperPrint = null;
		File fuente = new File("QRJasperN.jasper");

		DecimalFormat loFormat = new DecimalFormat("###,###.##");
		loFormat.setMinimumFractionDigits(2);
		loFormat.setMinimumIntegerDigits(1);

		int width = 2000;
		int height = 2000;

		BitMatrix matrix;
		com.google.zxing.Writer writer = new QRCodeWriter();

		// String folioFiscal = "0C7233AA-37A2-4CC5-A2D3-E99223255B52";
		String folioFiscal = null;
		String certificado = null;
		if (poRD.getGoResultado() != null
				&& poRD.getGoResultado().getCadenaPac() != null) {
			String resuArray[] = poRD.getGoResultado().getCadenaPac()
					.split("\\|");
			folioFiscal = resuArray[3];
			certificado = resuArray[6];
		}
		poRD.setGcFolioFiscal(folioFiscal);

		String montoPago = poRD.getGoComprobante().getTotal().toString();

		String[] mPago = montoPago.split("\\.");
		String ent = mPago[0];
		String dec = mPago[1];
		dec = poRD.omCompletar(dec, 6, 'R');

		montoPago = ent + "." + dec;

		String rfcEmisor = poRD.getGoComprobante().getEmisor().getRfc(); // Credito
																			// Familiar
		String rfcReceptor = poRD.getGoComprobante().getReceptor().getRfc(); // Cliente

		String qrContent = "?re=" + rfcEmisor + "&rr=" + rfcReceptor + "&tt"
				+ montoPago + "&id=" + folioFiscal;

		try {
			matrix = writer.encode(qrContent,
					com.google.zxing.BarcodeFormat.QR_CODE, width, height);
		} catch (com.google.zxing.WriterException e) {
			// exit the method
			return;
		}

		// generate an image from the byte matrix
		width = matrix.getWidth();
		height = matrix.getHeight();

		int grayValue;

		// create buffered image to draw to
		BufferedImage bi = folioFiscal == null ? null : new BufferedImage(
				width, height, BufferedImage.TYPE_INT_RGB);

		// iterate through the matrix and draw the pixels to the image
		if (bi != null) {
			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++) {
					grayValue = 1;
					if (matrix.get(x, y)) {
						grayValue = 0;
					}
					bi.setRGB(x, y, (grayValue == 0 ? 0 : 0xFFFFFF));
				}
			}
		}
		byte[] imageInByte = null;
		byte[] imageInByte2 = null;
		try {
			InputStream is = null;
			ByteArrayOutputStream baos = null;
			try {
				baos = new ByteArrayOutputStream();
				if (bi != null) {
					ImageIO.write(bi, "jpg", baos);

					baos.flush();
					imageInByte = baos.toByteArray();
					baos.close();
					is = new ByteArrayInputStream(imageInByte);
				}
			} catch (IOException e) {
				is = null;
				e.printStackTrace();
			}

			jasperReport = (JasperReport) JRLoader.loadObject(fuente);

			Map<String, Object> hm = null;
			hm = new HashMap<String, Object>();
			hm.put("QRImage", is);
			hm.put("Scnom", poRD.getScnom());
			hm.put("Scsuc", poRD.getScsuc());
			hm.put("Sccall", poRD.getGoComprobante().getEmisor()
					.getExpedidoEn().getCalle());
			hm.put("Colonia", poRD.getGoComprobante().getEmisor()
					.getExpedidoEn().getColonia());
			hm.put("Municipio", poRD.getGoComprobante().getEmisor()
					.getExpedidoEn().getMunicipio());
			// hm.put("Estado",
			// poRD.getGoComprobante().getEmisor().getExpedidoEn().getEstado());
			hm.put("Sccta", poRD.getSccta());
			hm.put("Scoper", poRD.getScoper());
			hm.put("Penom", poRD.getGoComprobante().getReceptor().getNombre());
			hm.put("RFC", poRD.getGoComprobante().getReceptor().getRfc());
			hm.put("Curp", poRD.getGoComprobante().getCURP());// --DAVID TORRES
																// 02/01/2014
			hm.put("FecHoraPago", poRD.getPp1fech() + " " + poRD.getIthora());// --DAVID
																				// TORRES
																				// 02/01/2014
			// hm.put("Pp1fech", poRD.getPp1fech());
			// hm.put("Ithora", poRD.getIthora());

			hm.put("FolioFiscal", folioFiscal);
			hm.put("FolioElectr",
					poRD.omCompletar(poRD.getGoComprobante().getFolio(), 10));
			hm.put("FHCertif", poRD.getGoResultado() == null ? null : poRD
					.getGoResultado().getFechaTimbrado());
			hm.put("NCertEmisor", poRD.getGoResultado() == null ? null : poRD
					.getGoResultado().getCertificado());
			// hm.put("Pago", "$ " +
			// loFormat.format(poRD.getGoComprobante().getTotal().doubleValue()));
			// hm.put("Pp1cap", "$ " +
			// loFormat.format(poRD.getGoComprobante().getConceptos().getConcepto()[0].getValorUnitario().doubleValue()));
			// hm.put("Pp1int", "$ " +
			// loFormat.format(poRD.getGoComprobante().getConceptos().getConcepto()[1].getValorUnitario().doubleValue()));
			// hm.put("Comision", "$ " +
			// loFormat.format(poRD.getGoComprobante().getConceptos().getConcepto()[2].getValorUnitario().doubleValue()));
			// hm.put("Pp1intm", "$ " +
			// loFormat.format(poRD.getGoComprobante().getConceptos().getConcepto()[3].getValorUnitario().doubleValue()));
			// hm.put("Total", "$ " +
			// loFormat.format(poRD.getGoComprobante().getConceptos().getConcepto()[4].getValorUnitario().doubleValue()));
			// hm.put("TipoPago", poRD.getGoComprobante().getFormaDePago());
			// hm.put("PagoEfectivoDesde", poRD.getPpfpag());
			// hm.put("SaldoAnterior",
			// "$ "+loFormat.format(Double.parseDouble(poRD.getScdoAnt())));
			// hm.put("SaldoPrincipal",
			// "$ "+loFormat.format(Double.parseDouble(poRD.getScdoPri())));
			// hm.put("SaldoComision",
			// "$ "+loFormat.format(Double.parseDouble(poRD.getScdoCom())));
			hm.put("MontoPrin",
					"$ "
							+ loFormat.format(poRD.getGoComprobante()
									.getConceptosAdicionales().getConceptoAdicional()[0]
									.getImporte().doubleValue()));
			hm.put("MontoIntOrd",
					"$ "
							+ loFormat.format(poRD.getGoComprobante()
									.getConceptos().getConcepto()[0]
									.getImporte().doubleValue()));
			hm.put("MontoComAp",
					"$ "
							+ loFormat.format(poRD.getGoComprobante()
									.getConceptos().getConcepto()[1]
									.getImporte().doubleValue()));
			hm.put("MontoIntMora",
					"$ "
							+ loFormat.format(poRD.getGoComprobante()
									.getConceptos().getConcepto()[2]
									.getImporte().doubleValue()));
			hm.put("MontoComAnt",
					"$ "
							+ loFormat.format(poRD.getGoComprobante()
									.getConceptos().getConcepto()[3]
									.getImporte().doubleValue()));
			hm.put("MontoTotal",
					"$ "
							+ loFormat.format(Double.parseDouble(poRD.getSubtotal2())));

			hm.put("IVAPrincipal", "$ " + loFormat.format(0));
			hm.put("IVAIntOrd",
					"$ "
							+ loFormat.format(Double.parseDouble(poRD
									.getIvaInteres())));
			hm.put("IVAComAp",
					"$ "
							+ loFormat.format(Double.parseDouble(poRD
									.getIvaComisAp())));
			hm.put("IVAIntMora",
					"$ "
							+ loFormat.format(Double.parseDouble(poRD
									.getIvaMorIva())));
			hm.put("IVAComAnt",
					"$ "
							+ loFormat.format(Double.parseDouble(poRD
									.getIvaComisAn())));
			hm.put("IVATotal",
					"$ "
							+ loFormat.format(poRD.getGoComprobante()
									.getImpuestos()
									.getTotalImpuestosTrasladados()));

			hm.put("TotalPagPrin",
					"$ "
							+ loFormat.format(poRD.getGoComprobante()
									.getConceptosAdicionales().getConceptoAdicional()[0]
									.getImporte().doubleValue()));

			hm.put("TotalPagIntOrd",
					"$ "
							+ loFormat.format(poRD.getGoComprobante()
									.getConceptos().getConcepto()[0]
									.getValorUnitario().doubleValue()
									+ Double.parseDouble(poRD.getIvaInteres())));

			hm.put("TotalPagComAp",
					"$ "
							+ loFormat.format(poRD.getGoComprobante()
									.getConceptos().getConcepto()[1]
									.getValorUnitario().doubleValue()
									+ Double.parseDouble(poRD.getIvaComisAp())));

			hm.put("TotalPagIntMora",
					"$ "
							+ loFormat.format(poRD.getGoComprobante()
									.getConceptos().getConcepto()[2]
									.getValorUnitario().doubleValue()
									+ Double.parseDouble(poRD.getIvaMorIva())));

			hm.put("TotalPagComAnt",
					"$ "
							+ loFormat.format(poRD.getGoComprobante()
									.getConceptos().getConcepto()[3]
									.getValorUnitario().doubleValue()
									+ Double.parseDouble(poRD.getIvaComisAn())));

			hm.put("Total",
					"$ "
							+ loFormat.format(Double.parseDouble(poRD.getTotal2())));

			hm.put("SaldoPrincipal",
					"$ "
							+ loFormat.format(Double.parseDouble(poRD
									.getSdoCapital())));
			hm.put("SaldoIntOrd",
					"$ "
							+ loFormat.format(Double.parseDouble(poRD
									.getSdoInteres())));
			hm.put("SaldoComAp",
					"$ "
							+ loFormat.format(Double.parseDouble(poRD
									.getSdoComisAp())));
			hm.put("SaldoIntMora",
					"$ "
							+ loFormat.format(Double.parseDouble(poRD
									.getSdoMorInt())));
			hm.put("SaldoComAnt",
					"$ "
							+ loFormat.format(Double.parseDouble(poRD
									.getSdoComisAn())));
			hm.put("SaldoTotal",
					"$ "
							+ loFormat.format(Double.parseDouble(poRD
									.getSdoTotal())));

			hm.put("MontoLiquidar",
					"$ "
							+ loFormat.format(Double.parseDouble(poRD
									.getMtoLiqu())));
			hm.put("FechaProxPago", poRD.getFechPrp());
			hm.put("MetodoPago", poRD.getGoComprobante().getMetodoDePago());
			hm.put("TipoPago", poRD.getGoComprobante().getFormaDePago());
			hm.put("PagoEfectivoDesde", poRD.getPpfpag());

			hm.put("SDEmisor", poRD.getGoResultado() == null ? null : poRD
					.getGoResultado().getSello());
			hm.put("SDSAT", poRD.getGoResultado() == null ? null : poRD
					.getGoResultado().getSelloPac());
			hm.put("CadenaOriginal", poRD.getGoResultado() == null ? null
					: poRD.getGoResultado().getCadenaPac());
			hm.put("NroCSDSAT", certificado);
			hm.put("FHGeneracion", poRD.getFechHor());
			// hm.put("PathLogo", poRD.getLogoPath());

			InputStream is2 = null;
			// try {
			// is2 = new BufferedInputStream(new
			// FileInputStream(poRD.getLogoPath()));
			// } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// is2=null;
			// e.printStackTrace();
			// }

			File img = new File(poRD.getLogoPath());
			BufferedImage bin = null;
			try {
				bin = ImageIO.read(img);
			} catch (Exception e) {
			}

			ByteArrayOutputStream baos2 = null;
			baos2 = new ByteArrayOutputStream();
			if (bin != null) {
				try {
					ImageIO.write(bin, "jpg", baos2);
					baos2.flush();
					imageInByte2 = baos2.toByteArray();
					baos2.close();
					is2 = new ByteArrayInputStream(imageInByte2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					baos2 = null;

				}
			}

			hm.put("PathLogo", is2);

			hm.put("ClaveTransaccion", poRD.getModTran());

			// System.out.println("CASTIGO?"+poRD.getCastigado());

			hm.put("Castigado?", poRD.getCastigado());

			Map<String, Object> hm2 = mxClonar(hm, imageInByte, imageInByte2);

			jasperPrint = JasperFillManager.fillReport(jasperReport, hm,
					new JREmptyDataSource());

			// JasperViewer jp = new
			// MyJasperViewer(jasperPrint,"Reporte de Clientes");
			// jp.show();

			// DlyaPdfExporter2 exporter = new DlyaPdfExporter2();
			// exporter.setParameter(JRExporterParameter.JASPER_PRINT,
			// jasperPrint);
			// exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new
			// File(poRD.getGcPath()));
			// exporter.exportReport();

			if (poRD.getTipoCoso() == 5) {// --2ndoComprobante
				File fuente2 = new File("QRJasperC.jasper");

				jasperReport2 = (JasperReport) JRLoader.loadObject(fuente2);

				// --Mas propiedades
				hm2.put("MontPrinCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getCapitalCN())));
				hm2.put("MontIntOrdCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getInteresCN())));
				hm2.put("MontComApCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getComisApCN())));
				hm2.put("MontIntMoraCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getMoraCN())));
				hm2.put("MontComPagoAntCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getComisAnCN())));

				double lnMontTotalCn = Double.parseDouble(poRD.getCapitalCN())
						+ Double.parseDouble(poRD.getInteresCN())
						+ Double.parseDouble(poRD.getComisApCN())
						+ Double.parseDouble(poRD.getMoraCN())
						+ Double.parseDouble(poRD.getComisAnCN());
				hm2.put("MonTotalCN", "$ " + loFormat.format(lnMontTotalCn));

				hm2.put("IVAPrinCN",
						"$ " + loFormat.format(Double.parseDouble("0")));
				hm2.put("IVAIntOrdCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getIvaInteresCN())));
				hm2.put("IVAComApCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getIvaComisApCN())));
				hm2.put("IVAIntMoraCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getIvaMoraCN())));
				hm2.put("IVAComPagoAntCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getIvaComisAnCN())));

				double lnIvaTotalCn = Double
						.parseDouble(poRD.getIvaInteresCN())
						+ Double.parseDouble(poRD.getIvaComisApCN())
						+ Double.parseDouble(poRD.getIvaMoraCN())
						+ Double.parseDouble(poRD.getIvaComisAnCN());

				hm2.put("IVATotalCN", "$ " + loFormat.format(lnIvaTotalCn));

				// --------------------------------------------------------------------------------
				hm2.put("TotalPrinCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getCapitalCN())));
				hm2.put("TotalIntOrdCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getInteresCN())
										+ Double.parseDouble(poRD
												.getIvaInteresCN())));

				hm2.put("TotalComApCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getComisApCN())
										+ Double.parseDouble(poRD
												.getIvaComisApCN())));

				hm2.put("TotalIntMoraCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getMoraCN())
										+ Double.parseDouble(poRD
												.getIvaMoraCN())));

				hm2.put("TotalComPagoAntCN",
						"$ "
								+ loFormat.format(Double.parseDouble(poRD
										.getComisAnCN())
										+ Double.parseDouble(poRD
												.getIvaComisAnCN())));

				double lnTotalCn = lnMontTotalCn + lnIvaTotalCn;

				hm2.put("TotalCN", "$ " + loFormat.format(lnTotalCn));

				// --Fin Mas propiedades

				jasperPrint2 = JasperFillManager.fillReport(jasperReport2, hm2,
						new JREmptyDataSource());

				List<JRPrintPage> pages = jasperPrint2.getPages();
				for (int j = 0; j < pages.size(); j++) {
					JRPrintPage object = pages.get(j);
					jasperPrint.addPage(object);
				}

			}
			DlyaPdfExporter2 exporter = new DlyaPdfExporter2();
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new File(
					poRD.getGcPath()));
			exporter.exportReport();

		} catch (JRException e) {
			e.printStackTrace();
			// } catch (IOException e) {
			// e.printStackTrace();
		}

	}

	private Map<String, Object> mxClonar(Map<String, Object> hm,
			byte[] imageInByte, byte[] imageInByte2) {

		InputStream is2T = imageInByte2 == null ? null
				: new ByteArrayInputStream(imageInByte2);

		InputStream isT = imageInByte == null ? null
				: new ByteArrayInputStream(imageInByte);

		Map<String, Object> hm2 = new HashMap<String, Object>();
		Iterator<String> it = hm.keySet().iterator();

		String key;
		while (it.hasNext()) {
			key = it.next();
			if (key.compareTo("QRImage") == 0) {
				hm2.put(key, isT);
			} else if (key.compareTo("PathLogo") == 0) {
				hm2.put(key, is2T);
			} else {
				hm2.put(key, hm.get(key));
			}

		}

		return hm2;
	}

}
