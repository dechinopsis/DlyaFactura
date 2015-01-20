/*     */ package com.dlya.facturews;
/*     */ 
/*     */ import com.dlya.facturexsd.Comprobante;
/*     */ import com.dlya.facturexsd.Concepto;
/*     */ import com.dlya.facturexsd.ConceptoAdicional;
/*     */ import com.dlya.facturexsd.Emisor;
/*     */ import com.dlya.facturexsd.ExpedidoEn;
/*     */ import com.dlya.facturexsd.Impuestos;
/*     */ import com.dlya.facturexsd.Receptor;
/*     */ import com.google.zxing.BarcodeFormat;
/*     */ import com.google.zxing.Writer;
/*     */ import com.google.zxing.WriterException;
/*     */ import com.google.zxing.common.BitMatrix;
/*     */ import com.google.zxing.qrcode.QRCodeWriter;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.StringWriter;
/*     */ import java.math.BigDecimal;
/*     */ import java.rmi.RemoteException;
/*     */ import java.text.DecimalFormat;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.xml.bind.JAXBContext;
/*     */ import javax.xml.bind.JAXBException;
/*     */ import javax.xml.bind.Marshaller;
/*     */ import javax.xml.rpc.ServiceException;
/*     */ import net.sf.jasperreports.engine.JREmptyDataSource;
/*     */ import net.sf.jasperreports.engine.JRException;
/*     */ import net.sf.jasperreports.engine.JRExporterParameter;
/*     */ import net.sf.jasperreports.engine.JRPrintPage;
/*     */ import net.sf.jasperreports.engine.JasperFillManager;
/*     */ import net.sf.jasperreports.engine.JasperPrint;
/*     */ import net.sf.jasperreports.engine.JasperReport;
/*     */ import net.sf.jasperreports.engine.util.JRLoader;
/*     */ 
/*     */ public class CDlyaFacture
/*     */ {
/*     */   private FactureServicioServiceLocator goLocator;
/*     */ 
/*     */   public CDlyaFacture()
/*     */   {
/*  52 */     this.goLocator = new FactureServicioServiceLocator();
/*     */   }
/*     */ 
/*     */   public ResultadoCancelacion omAnularFactura(String arg0, String arg1, int arg2, String arg3, String arg4)
/*     */   {
/*  57 */     ResultadoCancelacion loRet = null;
/*  58 */     ResultadoCancelacion loReal = null;
/*  59 */     ResultadoCancelacion loAux = new ResultadoCancelacion();
/*  60 */     loAux.setRespuesta(69);
/*  61 */     loAux.setCancelado(false);
/*  62 */     loAux.setResultado("Exception");
/*     */     try
/*     */     {
/*  65 */       FactureServicio loservicio = this.goLocator
/*  66 */         .getFactureServicioPort();
/*  67 */       loReal = loservicio.cancelaFactura(arg0, arg1, arg2, arg3, arg4);
/*     */     }
/*     */     catch (ServiceException localServiceException)
/*     */     {
/*     */     }
/*     */     catch (RemoteException localRemoteException)
/*     */     {
/*     */     }
/*     */ 
/*  76 */     if (loReal != null)
/*  77 */       loRet = loReal;
/*     */     else {
/*  79 */       loRet = loAux;
/*     */     }
/*  81 */     return loRet;
/*     */   }
/*     */ 
/*     */   public ResultDlya omGenerarFactura(Comprobante poComp)
/*     */   {
/*  86 */     ResultDlya loResult = new ResultDlya();
/*  87 */     loResult.setGnState(66);
/*  88 */     loResult.setGoComprobante(poComp);
/*     */     try {
/*  90 */       FactureServicio loservicio = this.goLocator
/*  91 */         .getFactureServicioPort();
/*  92 */       JAXBContext loContext = JAXBContext.newInstance(new Class[] { Comprobante.class });
/*  93 */       Marshaller loMarshaller = loContext.createMarshaller();
/*  94 */       StringWriter loStringWriter = new StringWriter();
/*     */ 
/*  96 */       loMarshaller.marshal(poComp, loStringWriter);
/*     */ 
/*  98 */       String lcXml = loStringWriter.toString();
/*     */ 
/* 105 */       loResult.setGcXML(lcXml);
/* 106 */       Resultado loResultado = loservicio.generaFactura(lcXml);
/* 107 */       loResult.setGoResultado(loResultado);
/*     */     }
/*     */     catch (ServiceException e)
/*     */     {
/* 140 */       loResult.setGnState(69);
/* 141 */       loResult.setGcDesc(e.getMessage());
/*     */     }
/*     */     catch (JAXBException e) {
/* 144 */       loResult.setGnState(68);
/* 145 */       loResult.setGcDesc(e.getMessage());
/*     */     }
/*     */     catch (RemoteException e) {
/* 148 */       loResult.setGnState(69);
/* 149 */       loResult.setGcDesc(e.getMessage());
/*     */     }
/* 151 */     return loResult;
/*     */   }
/*     */ 
/*     */   public void omSetAddress(String pcAddress) {
/* 155 */     this.goLocator.setFactureServicioPortEndpointAddress(pcAddress);
/*     */   }
/*     */ 
/*     */   public void mxGenerarPdf(ResultDlya poRD) {
/* 159 */     JasperReport jasperReport2 = null;
/* 160 */     JasperPrint jasperPrint2 = null;
/*     */ 
/* 163 */     JasperPrint jasperPrint = null;
/* 164 */     File fuente = new File("QRJasperN.jasper");
/*     */ 
/* 166 */     DecimalFormat loFormat = new DecimalFormat("###,###.##");
/* 167 */     loFormat.setMinimumFractionDigits(2);
/* 168 */     loFormat.setMinimumIntegerDigits(1);
/*     */ 
/* 170 */     int width = 2000;
/* 171 */     int height = 2000;
/*     */ 
/* 174 */     Writer writer = new QRCodeWriter();
/*     */ 
/* 177 */     String folioFiscal = null;
/* 178 */     String certificado = null;
/* 179 */     if ((poRD.getGoResultado() != null) && 
/* 180 */       (poRD.getGoResultado().getCadenaPac() != null)) {
/* 181 */       String[] resuArray = poRD.getGoResultado().getCadenaPac()
/* 182 */         .split("\\|");
/* 183 */       if (resuArray.length > 6) {
/* 184 */         folioFiscal = resuArray[3];
/* 185 */         certificado = resuArray[6];
/*     */       }
/*     */     }
/* 188 */     poRD.setGcFolioFiscal(folioFiscal);
/*     */ 
/* 190 */     poRD.setQrCode(poRD, folioFiscal);
/*     */     try
/*     */     {
/* 193 */       matrix = writer.encode(poRD.getQrCode(), 
/* 194 */         BarcodeFormat.QR_CODE, width, height);
/*     */     }
/*     */     catch (WriterException e)
/*     */     {
/*     */       BitMatrix matrix;
/* 197 */       return;
/*     */     }
/*     */     BitMatrix matrix;
/* 201 */     width = matrix.getWidth();
/* 202 */     height = matrix.getHeight();
/*     */ 
/* 207 */     BufferedImage bi = folioFiscal == null ? null : 
/* 208 */       new BufferedImage(width, height, 1);
/*     */ 
/* 211 */     if (bi != null) {
/* 212 */       for (int y = 0; y < height; y++) {
/* 213 */         for (int x = 0; x < width; x++) {
/* 214 */           int grayValue = 1;
/* 215 */           if (matrix.get(x, y)) {
/* 216 */             grayValue = 0;
/*     */           }
/* 218 */           bi.setRGB(x, y, grayValue == 0 ? 0 : 16777215);
/*     */         }
/*     */       }
/*     */     }
/* 222 */     byte[] imageInByte = null;
/* 223 */     byte[] imageInByte2 = null;
/*     */     try {
/* 225 */       InputStream is = null;
/* 226 */       ByteArrayOutputStream baos = null;
/*     */       try {
/* 228 */         baos = new ByteArrayOutputStream();
/* 229 */         if (bi != null) {
/* 230 */           ImageIO.write(bi, "jpg", baos);
/*     */ 
/* 232 */           baos.flush();
/* 233 */           imageInByte = baos.toByteArray();
/* 234 */           baos.close();
/* 235 */           is = new ByteArrayInputStream(imageInByte);
/*     */         }
/*     */       } catch (IOException e) {
/* 238 */         is = null;
/* 239 */         e.printStackTrace();
/*     */       }
/*     */ 
/* 242 */       JasperReport jasperReport = (JasperReport)JRLoader.loadObject(fuente);
/*     */ 
/* 244 */       Map hm = null;
/* 245 */       hm = new HashMap();
/* 246 */       hm.put("QRImage", is);
/* 247 */       hm.put("Scnom", poRD.getScnom());
/* 248 */       hm.put("Scsuc", poRD.getScsuc());
/* 249 */       hm.put("Sccall", poRD.getGoComprobante().getEmisor()
/* 250 */         .getExpedidoEn().getCalle());
/* 251 */       hm.put("Colonia", poRD.getGoComprobante().getEmisor()
/* 252 */         .getExpedidoEn().getColonia());
/* 253 */       hm.put("Municipio", poRD.getGoComprobante().getEmisor()
/* 254 */         .getExpedidoEn().getMunicipio());
/*     */ 
/* 257 */       hm.put("Sccta", poRD.getSccta());
/* 258 */       hm.put("Scoper", poRD.getScoper());
/* 259 */       hm.put("Penom", poRD.getGoComprobante().getReceptor().getNombre());
/* 260 */       hm.put("RFC", poRD.getGoComprobante().getReceptor().getRfc());
/* 261 */       hm.put("Curp", poRD.getGoComprobante().getCURP());
/*     */ 
/* 263 */       hm.put("FecHoraPago", poRD.getPp1fech() + " " + poRD.getIthora());
/*     */ 
/* 269 */       hm.put("FolioFiscal", folioFiscal);
/* 270 */       hm.put("FolioElectr", 
/* 271 */         poRD.omCompletar(poRD.getGoComprobante().getFolio(), 10));
/* 272 */       hm.put("FHCertif", poRD.getGoComprobante() == null ? null : poRD
/* 273 */         .getGoComprobante().getFecha());
/* 274 */       hm.put("NCertEmisor", poRD.getGoResultado() == null ? null : poRD
/* 275 */         .getGoResultado().getCertificado());
/*     */ 
/* 296 */       hm.put("MontoPrin", 
/* 297 */         "$ " + 
/* 298 */         loFormat.format(poRD.getGoComprobante()
/* 299 */         .getConceptosAdicionales().getConceptoAdicional()[0]
/* 300 */         .getImporte().doubleValue()));
/* 301 */       hm.put("MontoIntOrd", 
/* 302 */         "$ " + 
/* 303 */         loFormat.format(poRD.getGoComprobante()
/* 304 */         .getConceptos().getConcepto()[0]
/* 305 */         .getImporte().doubleValue()));
/* 306 */       hm.put("MontoComAp", 
/* 307 */         "$ " + 
/* 308 */         loFormat.format(poRD.getGoComprobante()
/* 309 */         .getConceptos().getConcepto()[1]
/* 310 */         .getImporte().doubleValue()));
/* 311 */       hm.put("MontoIntMora", 
/* 312 */         "$ " + 
/* 313 */         loFormat.format(poRD.getGoComprobante()
/* 314 */         .getConceptos().getConcepto()[2]
/* 315 */         .getImporte().doubleValue()));
/* 316 */       hm.put("MontoComAnt", 
/* 317 */         "$ " + 
/* 318 */         loFormat.format(poRD.getGoComprobante()
/* 319 */         .getConceptos().getConcepto()[3]
/* 320 */         .getImporte().doubleValue()));
/* 321 */       hm.put("MontoTotal", 
/* 322 */         "$ " + 
/* 323 */         loFormat.format(Double.parseDouble(poRD.getSubtotal2())));
/*     */ 
/* 325 */       hm.put("IVAPrincipal", "$ " + loFormat.format(0L));
/* 326 */       hm.put("IVAIntOrd", 
/* 327 */         "$ " + 
/* 328 */         loFormat.format(Double.parseDouble(poRD
/* 329 */         .getIvaInteres())));
/* 330 */       hm.put("IVAComAp", 
/* 331 */         "$ " + 
/* 332 */         loFormat.format(Double.parseDouble(poRD
/* 333 */         .getIvaComisAp())));
/* 334 */       hm.put("IVAIntMora", 
/* 335 */         "$ " + 
/* 336 */         loFormat.format(Double.parseDouble(poRD
/* 337 */         .getIvaMorIva())));
/* 338 */       hm.put("IVAComAnt", 
/* 339 */         "$ " + 
/* 340 */         loFormat.format(Double.parseDouble(poRD
/* 341 */         .getIvaComisAn())));
/* 342 */       hm.put("IVATotal", 
/* 343 */         "$ " + 
/* 344 */         loFormat.format(poRD.getGoComprobante()
/* 345 */         .getImpuestos()
/* 346 */         .getTotalImpuestosTrasladados()));
/*     */ 
/* 348 */       hm.put("TotalPagPrin", 
/* 349 */         "$ " + 
/* 350 */         loFormat.format(poRD.getGoComprobante()
/* 351 */         .getConceptosAdicionales().getConceptoAdicional()[0]
/* 352 */         .getImporte().doubleValue()));
/*     */ 
/* 354 */       hm.put("TotalPagIntOrd", 
/* 355 */         "$ " + 
/* 356 */         loFormat.format(poRD.getGoComprobante()
/* 357 */         .getConceptos().getConcepto()[0]
/* 358 */         .getValorUnitario().doubleValue() + 
/* 359 */         Double.parseDouble(poRD.getIvaInteres())));
/*     */ 
/* 361 */       hm.put("TotalPagComAp", 
/* 362 */         "$ " + 
/* 363 */         loFormat.format(poRD.getGoComprobante()
/* 364 */         .getConceptos().getConcepto()[1]
/* 365 */         .getValorUnitario().doubleValue() + 
/* 366 */         Double.parseDouble(poRD.getIvaComisAp())));
/*     */ 
/* 368 */       hm.put("TotalPagIntMora", 
/* 369 */         "$ " + 
/* 370 */         loFormat.format(poRD.getGoComprobante()
/* 371 */         .getConceptos().getConcepto()[2]
/* 372 */         .getValorUnitario().doubleValue() + 
/* 373 */         Double.parseDouble(poRD.getIvaMorIva())));
/*     */ 
/* 375 */       hm.put("TotalPagComAnt", 
/* 376 */         "$ " + 
/* 377 */         loFormat.format(poRD.getGoComprobante()
/* 378 */         .getConceptos().getConcepto()[3]
/* 379 */         .getValorUnitario().doubleValue() + 
/* 380 */         Double.parseDouble(poRD.getIvaComisAn())));
/*     */ 
/* 382 */       hm.put("Total", 
/* 383 */         "$ " + 
/* 384 */         loFormat.format(Double.parseDouble(poRD.getTotal2())));
/*     */ 
/* 386 */       hm.put("SaldoPrincipal", 
/* 387 */         "$ " + 
/* 388 */         loFormat.format(Double.parseDouble(poRD
/* 389 */         .getSdoCapital())));
/* 390 */       hm.put("SaldoIntOrd", 
/* 391 */         "$ " + 
/* 392 */         loFormat.format(Double.parseDouble(poRD
/* 393 */         .getSdoInteres())));
/* 394 */       hm.put("SaldoComAp", 
/* 395 */         "$ " + 
/* 396 */         loFormat.format(Double.parseDouble(poRD
/* 397 */         .getSdoComisAp())));
/* 398 */       hm.put("SaldoIntMora", 
/* 399 */         "$ " + 
/* 400 */         loFormat.format(Double.parseDouble(poRD
/* 401 */         .getSdoMorInt())));
/* 402 */       hm.put("SaldoComAnt", 
/* 403 */         "$ " + 
/* 404 */         loFormat.format(Double.parseDouble(poRD
/* 405 */         .getSdoComisAn())));
/* 406 */       hm.put("SaldoTotal", 
/* 407 */         "$ " + 
/* 408 */         loFormat.format(Double.parseDouble(poRD
/* 409 */         .getSdoTotal())));
/*     */ 
/* 411 */       hm.put("MontoLiquidar", 
/* 412 */         "$ " + 
/* 413 */         loFormat.format(Double.parseDouble(poRD
/* 414 */         .getMtoLiqu())));
/* 415 */       hm.put("FechaProxPago", poRD.getFechPrp());
/* 416 */       hm.put("MetodoPago", poRD.getGoComprobante().getMetodoDePago());
/* 417 */       hm.put("TipoPago", poRD.getGoComprobante().getFormaDePago());
/* 418 */       hm.put("PagoEfectivoDesde", poRD.getPpfpag());
/*     */ 
/* 420 */       hm.put("SDEmisor", poRD.getGoResultado() == null ? null : poRD
/* 421 */         .getGoResultado().getSello());
/*     */ 
/* 426 */       if (poRD.getGoResultado() == null) {
/* 427 */         hm.put("SDSAT", null);
/*     */       }
/* 429 */       else if (poRD.getGoResultado().getSelloPac().trim().compareTo("") == 0) {
/* 430 */         hm.put("SDSAT", null);
/*     */       }
/*     */       else {
/* 433 */         hm.put("SDSAT", poRD.getGoResultado().getSelloPac());
/*     */       }
/*     */ 
/* 436 */       hm.put("CadenaOriginal", poRD.getGoResultado() == null ? null : 
/* 437 */         poRD.getGoResultado().getCadenaPac());
/* 438 */       hm.put("NroCSDSAT", certificado);
/* 439 */       hm.put("FHGeneracion", poRD.getFechHor());
/*     */ 
/* 442 */       InputStream is2 = null;
/*     */ 
/* 452 */       File img = new File(poRD.getLogoPath());
/* 453 */       BufferedImage bin = null;
/*     */       try {
/* 455 */         bin = ImageIO.read(img);
/*     */       }
/*     */       catch (Exception localException1) {
/*     */       }
/* 459 */       ByteArrayOutputStream baos2 = null;
/* 460 */       baos2 = new ByteArrayOutputStream();
/* 461 */       if (bin != null) {
/*     */         try {
/* 463 */           ImageIO.write(bin, "jpg", baos2);
/* 464 */           baos2.flush();
/* 465 */           imageInByte2 = baos2.toByteArray();
/* 466 */           baos2.close();
/* 467 */           is2 = new ByteArrayInputStream(imageInByte2);
/*     */         }
/*     */         catch (Exception e) {
/* 470 */           baos2 = null;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 475 */       hm.put("PathLogo", is2);
/*     */ 
/* 477 */       hm.put("ClaveTransaccion", poRD.getModTran());
/*     */ 
/* 481 */       hm.put("Castigado?", poRD.getCastigado());
/*     */ 
/* 483 */       Map hm2 = mxClonar(hm, imageInByte, imageInByte2);
/*     */ 
/* 485 */       jasperPrint = JasperFillManager.fillReport(jasperReport, hm, 
/* 486 */         new JREmptyDataSource());
/*     */ 
/* 499 */       if (poRD.getTipoCoso() == 5) {
/* 500 */         File fuente2 = new File("QRJasperC.jasper");
/*     */ 
/* 502 */         jasperReport2 = (JasperReport)JRLoader.loadObject(fuente2);
/*     */ 
/* 505 */         hm2.put("MontPrinCN", 
/* 506 */           "$ " + 
/* 507 */           loFormat.format(Double.parseDouble(poRD
/* 508 */           .getCapitalCN())));
/* 509 */         hm2.put("MontIntOrdCN", 
/* 510 */           "$ " + 
/* 511 */           loFormat.format(Double.parseDouble(poRD
/* 512 */           .getInteresCN())));
/* 513 */         hm2.put("MontComApCN", 
/* 514 */           "$ " + 
/* 515 */           loFormat.format(Double.parseDouble(poRD
/* 516 */           .getComisApCN())));
/* 517 */         hm2.put("MontIntMoraCN", 
/* 518 */           "$ " + 
/* 519 */           loFormat.format(Double.parseDouble(poRD
/* 520 */           .getMoraCN())));
/* 521 */         hm2.put("MontComPagoAntCN", 
/* 522 */           "$ " + 
/* 523 */           loFormat.format(Double.parseDouble(poRD
/* 524 */           .getComisAnCN())));
/*     */ 
/* 526 */         double lnMontTotalCn = Double.parseDouble(poRD.getCapitalCN()) + 
/* 527 */           Double.parseDouble(poRD.getInteresCN()) + 
/* 528 */           Double.parseDouble(poRD.getComisApCN()) + 
/* 529 */           Double.parseDouble(poRD.getMoraCN()) + 
/* 530 */           Double.parseDouble(poRD.getComisAnCN());
/* 531 */         hm2.put("MonTotalCN", "$ " + loFormat.format(lnMontTotalCn));
/*     */ 
/* 533 */         hm2.put("IVAPrinCN", 
/* 534 */           "$ " + loFormat.format(Double.parseDouble("0")));
/* 535 */         hm2.put("IVAIntOrdCN", 
/* 536 */           "$ " + 
/* 537 */           loFormat.format(Double.parseDouble(poRD
/* 538 */           .getIvaInteresCN())));
/* 539 */         hm2.put("IVAComApCN", 
/* 540 */           "$ " + 
/* 541 */           loFormat.format(Double.parseDouble(poRD
/* 542 */           .getIvaComisApCN())));
/* 543 */         hm2.put("IVAIntMoraCN", 
/* 544 */           "$ " + 
/* 545 */           loFormat.format(Double.parseDouble(poRD
/* 546 */           .getIvaMoraCN())));
/* 547 */         hm2.put("IVAComPagoAntCN", 
/* 548 */           "$ " + 
/* 549 */           loFormat.format(Double.parseDouble(poRD
/* 550 */           .getIvaComisAnCN())));
/*     */ 
/* 552 */         double lnIvaTotalCn = 
/* 553 */           Double.parseDouble(poRD.getIvaInteresCN()) + 
/* 554 */           Double.parseDouble(poRD.getIvaComisApCN()) + 
/* 555 */           Double.parseDouble(poRD.getIvaMoraCN()) + 
/* 556 */           Double.parseDouble(poRD.getIvaComisAnCN());
/*     */ 
/* 558 */         hm2.put("IVATotalCN", "$ " + loFormat.format(lnIvaTotalCn));
/*     */ 
/* 561 */         hm2.put("TotalPrinCN", 
/* 562 */           "$ " + 
/* 563 */           loFormat.format(Double.parseDouble(poRD
/* 564 */           .getCapitalCN())));
/* 565 */         hm2.put("TotalIntOrdCN", 
/* 566 */           "$ " + 
/* 567 */           loFormat.format(Double.parseDouble(poRD
/* 568 */           .getInteresCN()) + 
/* 569 */           Double.parseDouble(poRD
/* 570 */           .getIvaInteresCN())));
/*     */ 
/* 572 */         hm2.put("TotalComApCN", 
/* 573 */           "$ " + 
/* 574 */           loFormat.format(Double.parseDouble(poRD
/* 575 */           .getComisApCN()) + 
/* 576 */           Double.parseDouble(poRD
/* 577 */           .getIvaComisApCN())));
/*     */ 
/* 579 */         hm2.put("TotalIntMoraCN", 
/* 580 */           "$ " + 
/* 581 */           loFormat.format(Double.parseDouble(poRD
/* 582 */           .getMoraCN()) + 
/* 583 */           Double.parseDouble(poRD
/* 584 */           .getIvaMoraCN())));
/*     */ 
/* 586 */         hm2.put("TotalComPagoAntCN", 
/* 587 */           "$ " + 
/* 588 */           loFormat.format(Double.parseDouble(poRD
/* 589 */           .getComisAnCN()) + 
/* 590 */           Double.parseDouble(poRD
/* 591 */           .getIvaComisAnCN())));
/*     */ 
/* 593 */         double lnTotalCn = lnMontTotalCn + lnIvaTotalCn;
/*     */ 
/* 595 */         hm2.put("TotalCN", "$ " + loFormat.format(lnTotalCn));
/*     */ 
/* 599 */         jasperPrint2 = JasperFillManager.fillReport(jasperReport2, hm2, 
/* 600 */           new JREmptyDataSource());
/*     */ 
/* 602 */         List pages = jasperPrint2.getPages();
/* 603 */         for (int j = 0; j < pages.size(); j++) {
/* 604 */           JRPrintPage object = (JRPrintPage)pages.get(j);
/* 605 */           jasperPrint.addPage(object);
/*     */         }
/*     */       }
/*     */ 
/* 609 */       DlyaPdfExporter2 exporter = new DlyaPdfExporter2();
/* 610 */       exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
/* 611 */       exporter.setParameter(JRExporterParameter.OUTPUT_FILE, 
/* 612 */         new File(poRD.getGcPath()));
/* 613 */       exporter.exportReport();
/*     */     }
/*     */     catch (JRException e) {
/* 616 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   private Map<String, Object> mxClonar(Map<String, Object> hm, byte[] imageInByte, byte[] imageInByte2)
/*     */   {
/* 626 */     InputStream is2T = imageInByte2 == null ? null : 
/* 627 */       new ByteArrayInputStream(imageInByte2);
/*     */ 
/* 629 */     InputStream isT = imageInByte == null ? null : 
/* 630 */       new ByteArrayInputStream(imageInByte);
/*     */ 
/* 632 */     Map hm2 = new HashMap();
/* 633 */     Iterator it = hm.keySet().iterator();
/*     */ 
/* 636 */     while (it.hasNext()) {
/* 637 */       String key = (String)it.next();
/* 638 */       if (key.compareTo("QRImage") == 0)
/* 639 */         hm2.put(key, isT);
/* 640 */       else if (key.compareTo("PathLogo") == 0)
/* 641 */         hm2.put(key, is2T);
/*     */       else {
/* 643 */         hm2.put(key, hm.get(key));
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 648 */     return hm2;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturews.CDlyaFacture
 * JD-Core Version:    0.6.0
 */