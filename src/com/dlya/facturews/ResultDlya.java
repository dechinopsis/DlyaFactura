package com.dlya.facturews;

import com.dlya.facturexsd.Comprobante;

public class ResultDlya {
    private Resultado goResultado;
    private Comprobante goComprobante;
    private int gnState;
    private String gcDesc;
    private String gcPath;
    private String gcPathCond;
    
    private String gcFolioFiscal;
    
    private String Scnom;
    private String Scsuc;
    private String Sccta;
    private String Scoper;
    private String Pp1fech;
    private String Ithora;
    private String Ppfpag;
    private String ScdoAnt;
    private String ScdoPri;
    private String ScdoCom;
    private String MtoLiqu;
    private String FechPrp;
    private String FechHor;
    private String logoPath;    
    private String modTran;
    private String castigado;
    
    private String ivaInteres;
    private String ivaComisAp;
    private String ivaMorIva;
    private String ivaComisAn;
    
    private String sdoCapital;
    private String sdoInteres;
    private String sdoComisAp;
    private String sdoMorInt;
    private String sdoComisAn;
    private String sdoTotal;
    
    private String capitalCN;
    private String interesCN;
    private String moraCN;
    private String comisApCN;
    private String comisAnCN;
    
    private String ivaInteresCN;
    private String ivaMoraCN;
    private String ivaComisApCN;
    private String ivaComisAnCN;
    
    private String total2;
    private String subtotal2;
    
    private int tipoCoso;
    
    private String gcXML;
    
    private String qrCode;
    private String timeout;
    
    public ResultDlya() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Resultado getGoResultado() {
        return goResultado;
    }

    public void setGoResultado(Resultado goResultado) {
        this.goResultado = goResultado;
        this.setGnState(goResultado.getStatus());
        this.setGcDesc(goResultado.getStrStatus());
    }

    public int getGnState() {	
        return gnState;
    }

    public void setGnState(int gnState) {
        this.gnState = gnState;
    }

    public String getGcDesc() {
        return gcDesc;
    }

    public void setGcDesc(String gcDesc) {
        this.gcDesc = gcDesc;
    }

    public Comprobante getGoComprobante() {
        return goComprobante;
    }

    public void setGoComprobante(Comprobante goComprobante) {
        this.goComprobante = goComprobante;
    }

    public String getScnom() {
        return Scnom;
    }

    public void setScnom(String scnom) {
        Scnom = scnom;
    }

    public String getScsuc() {
        return Scsuc;
    }

    public void setScsuc(String scsuc) {
        Scsuc = this.omCompletar(scsuc,3);
    }

    public String getSccta() {
        return Sccta;
    }

    public void setSccta(String sccta) {
        Sccta = this.omCompletar(sccta,9);
    }

    public String getPp1fech() {
        return Pp1fech;
    }

    public void setPp1fech(String pp1fech) {
        Pp1fech = pp1fech;
    }

    public String getIthora() {
        return Ithora;
    }

    public void setIthora(String ithora) {
        Ithora = ithora;
    }

    public String getPpfpag() {
        return Ppfpag;
    }

    public void setPpfpag(String ppfpag) {
        Ppfpag = ppfpag;
    }

    public String getScoper() {
        return Scoper;
    }

    public void setScoper(String scoper) {
	
        Scoper = this.omCompletar(scoper,9);
    }
    public String omCompletar(String nt,int cant){
		while(nt.length()<cant){
		    nt = "0"+nt;
		}
		return nt;
    }

    public String getScdoAnt() {
        return ScdoAnt;
    }

    public void setScdoAnt(String scdoAnt) {
        ScdoAnt = scdoAnt;
    }

    public String getScdoPri() {
        return ScdoPri;
    }

    public void setScdoPri(String scdoPri) {
        ScdoPri = scdoPri;
    }

    public String getScdoCom() {
        return ScdoCom;
    }

    public void setScdoCom(String scdoCom) {
        ScdoCom = scdoCom;
    }

    public String getMtoLiqu() {
        return MtoLiqu;
    }

    public void setMtoLiqu(String mtoLiqu) {
        MtoLiqu = mtoLiqu;
    }

    public String getFechPrp() {
        return FechPrp;
    }

    public void setFechPrp(String fechPrp) {
        FechPrp = fechPrp;
    }

    public String getGcPath() {
        return gcPath;
    }

    public void setGcPath(String gcPath) {
        this.gcPath = gcPath.trim();
    }

    public String omCompletar(String nt, int cant, char c) {
	// TODO Auto-generated method stub
		while(nt.length()<cant){
		    nt = nt + "0";
		}
		return nt;
    }

    public String getFechHor() {
        return FechHor;
    }

    public void setFechHor(String fechHor) {
        FechHor = fechHor;
    }

    public String getGcFolioFiscal() {
        return gcFolioFiscal;
    }

    public void setGcFolioFiscal(String gcFolioFiscal) {
        this.gcFolioFiscal = gcFolioFiscal;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getModTran() {
        return modTran;
    }

    public void setModTran(String modTran) {
        this.modTran = modTran;
    }

    public String getCastigado() {
        return castigado;
    }

    public void setCastigado(String castigado) {
        this.castigado = castigado;
    }

    public String getGcXML() {
        return gcXML;
    }

    public void setGcXML(String gcXML) {
        this.gcXML = gcXML;
    }

    public String getIvaInteres() {
        return ivaInteres;
    }

    public void setIvaInteres(String ivaInteres) {
        this.ivaInteres = ivaInteres;
    }

    public String getIvaComisAp() {
        return ivaComisAp;
    }

    public void setIvaComisAp(String ivaComisAp) {
        this.ivaComisAp = ivaComisAp;
    }

    public String getIvaMorIva() {
        return ivaMorIva;
    }

    public void setIvaMorIva(String ivaMorIva) {
        this.ivaMorIva = ivaMorIva;
    }

    public String getIvaComisAn() {
        return ivaComisAn;
    }

    public void setIvaComisAn(String ivaComisAn) {
        this.ivaComisAn = ivaComisAn;
    }

    public String getSdoCapital() {
        return sdoCapital;
    }

    public void setSdoCapital(String sdoCapital) {
        this.sdoCapital = sdoCapital;
    }

    public String getSdoInteres() {
        return sdoInteres;
    }

    public void setSdoInteres(String sdoInteres) {
        this.sdoInteres = sdoInteres;
    }

    public String getSdoComisAp() {
        return sdoComisAp;
    }

    public void setSdoComisAp(String sdoComisAp) {
        this.sdoComisAp = sdoComisAp;
    }

    public String getSdoComisAn() {
        return sdoComisAn;
    }

    public void setSdoComisAn(String sdoComisAn) {
        this.sdoComisAn = sdoComisAn;
    }

    public String getSdoTotal() {
        return sdoTotal;
    }

    public void setSdoTotal(String sdoTotal) {
        this.sdoTotal = sdoTotal;
    }

    public String getSdoMorInt() {
        return sdoMorInt;
    }

    public void setSdoMorInt(String sdoMorInt) {
        this.sdoMorInt = sdoMorInt;
    }

    public int getTipoCoso() {
        return tipoCoso;
    }

    public void setTipoCoso(int tipoCoso) {
        this.tipoCoso = tipoCoso;
    }

    public String getGcPathCond() {
        return gcPathCond;
    }

    public void setGcPathCond(String gcPathCond) {
        this.gcPathCond = gcPathCond;
    }

    public String getCapitalCN() {
        return capitalCN;
    }

    public void setCapitalCN(String capitalCN) {
        this.capitalCN = capitalCN;
    }

    public String getInteresCN() {
        return interesCN;
    }

    public void setInteresCN(String interesCN) {
        this.interesCN = interesCN;
    }

    public String getMoraCN() {
        return moraCN;
    }

    public void setMoraCN(String moraCN) {
        this.moraCN = moraCN;
    }

    public String getComisApCN() {
        return comisApCN;
    }

    public void setComisApCN(String comisApCN) {
        this.comisApCN = comisApCN;
    }

    public String getComisAnCN() {
        return comisAnCN;
    }

    public void setComisAnCN(String comisAnCN) {
        this.comisAnCN = comisAnCN;
    }

    public String getIvaInteresCN() {
        return ivaInteresCN;
    }

    public void setIvaInteresCN(String ivaInteresCN) {
        this.ivaInteresCN = ivaInteresCN;
    }

    public String getIvaMoraCN() {
        return ivaMoraCN;
    }

    public void setIvaMoraCN(String ivaMoraCN) {
        this.ivaMoraCN = ivaMoraCN;
    }

    public String getIvaComisApCN() {
        return ivaComisApCN;
    }

    public void setIvaComisApCN(String ivaComisApCN) {
        this.ivaComisApCN = ivaComisApCN;
    }

    public String getIvaComisAnCN() {
        return ivaComisAnCN;
    }

    public void setIvaComisAnCN(String ivaComisAnCN) {
        this.ivaComisAnCN = ivaComisAnCN;
    }

	public String getTotal2() {
		return total2;
	}

	public void setTotal2(String total2) {
		this.total2 = total2;
	}

	public String getSubtotal2() {
		return subtotal2;
	}

	public void setSubtotal2(String subtotal2) {
		this.subtotal2 = subtotal2;
	}

	public void setQrCode(ResultDlya poRD, String folioFiscal) {
		String montoPago = poRD.getGoComprobante().getTotal().toString();

		String[] mPago = montoPago.split("\\.");
		String ent = mPago[0];
		String dec = mPago[1];
		dec = poRD.omCompletar(dec, 6, 'R');

		montoPago = ent + "." + dec;

		String rfcEmisor = poRD.getGoComprobante().getEmisor().getRfc(); // Credito
																			// Familiar
		String rfcReceptor = poRD.getGoComprobante().getReceptor().getRfc(); // Cliente

		String qrCode = "?re=" + rfcEmisor + "&rr=" + rfcReceptor + "&tt"
				+ montoPago + "&id=" + folioFiscal;
		
		this.qrCode = qrCode;
	}
	
	public String getQrCode() {
		return qrCode;
	}
	
	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}
}
