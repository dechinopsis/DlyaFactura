/*     */ package com.dlya.facturews;
/*     */ 
/*     */ import com.dlya.facturexsd.Comprobante;
/*     */ import com.dlya.facturexsd.Emisor;
/*     */ import com.dlya.facturexsd.Receptor;
/*     */ import java.math.BigDecimal;
/*     */ 
/*     */ public class ResultDlya
/*     */ {
/*     */   private Resultado goResultado;
/*     */   private Comprobante goComprobante;
/*     */   private int gnState;
/*     */   private String gcDesc;
/*     */   private String gcPath;
/*     */   private String gcPathCond;
/*     */   private String gcFolioFiscal;
/*     */   private String Scnom;
/*     */   private String Scsuc;
/*     */   private String Sccta;
/*     */   private String Scoper;
/*     */   private String Pp1fech;
/*     */   private String Ithora;
/*     */   private String Ppfpag;
/*     */   private String ScdoAnt;
/*     */   private String ScdoPri;
/*     */   private String ScdoCom;
/*     */   private String MtoLiqu;
/*     */   private String FechPrp;
/*     */   private String FechHor;
/*     */   private String logoPath;
/*     */   private String modTran;
/*     */   private String castigado;
/*     */   private String ivaInteres;
/*     */   private String ivaComisAp;
/*     */   private String ivaMorIva;
/*     */   private String ivaComisAn;
/*     */   private String sdoCapital;
/*     */   private String sdoInteres;
/*     */   private String sdoComisAp;
/*     */   private String sdoMorInt;
/*     */   private String sdoComisAn;
/*     */   private String sdoTotal;
/*     */   private String capitalCN;
/*     */   private String interesCN;
/*     */   private String moraCN;
/*     */   private String comisApCN;
/*     */   private String comisAnCN;
/*     */   private String ivaInteresCN;
/*     */   private String ivaMoraCN;
/*     */   private String ivaComisApCN;
/*     */   private String ivaComisAnCN;
/*     */   private String total2;
/*     */   private String subtotal2;
/*     */   private int tipoCoso;
/*     */   private String gcXML;
/*     */   private String qrCode;
/*     */   private String timeout;
/*     */ 
/*     */   public Resultado getGoResultado()
/*     */   {
/*  71 */     return this.goResultado;
/*     */   }
/*     */ 
/*     */   public void setGoResultado(Resultado goResultado) {
/*  75 */     this.goResultado = goResultado;
/*  76 */     setGnState(goResultado.getStatus());
/*  77 */     setGcDesc(goResultado.getStrStatus());
/*     */   }
/*     */ 
/*     */   public int getGnState() {
/*  81 */     return this.gnState;
/*     */   }
/*     */ 
/*     */   public void setGnState(int gnState) {
/*  85 */     this.gnState = gnState;
/*     */   }
/*     */ 
/*     */   public String getGcDesc() {
/*  89 */     return this.gcDesc;
/*     */   }
/*     */ 
/*     */   public void setGcDesc(String gcDesc) {
/*  93 */     this.gcDesc = gcDesc;
/*     */   }
/*     */ 
/*     */   public Comprobante getGoComprobante() {
/*  97 */     return this.goComprobante;
/*     */   }
/*     */ 
/*     */   public void setGoComprobante(Comprobante goComprobante) {
/* 101 */     this.goComprobante = goComprobante;
/*     */   }
/*     */ 
/*     */   public String getScnom() {
/* 105 */     return this.Scnom;
/*     */   }
/*     */ 
/*     */   public void setScnom(String scnom) {
/* 109 */     this.Scnom = scnom;
/*     */   }
/*     */ 
/*     */   public String getScsuc() {
/* 113 */     return this.Scsuc;
/*     */   }
/*     */ 
/*     */   public void setScsuc(String scsuc) {
/* 117 */     this.Scsuc = omCompletar(scsuc, 3);
/*     */   }
/*     */ 
/*     */   public String getSccta() {
/* 121 */     return this.Sccta;
/*     */   }
/*     */ 
/*     */   public void setSccta(String sccta) {
/* 125 */     this.Sccta = omCompletar(sccta, 9);
/*     */   }
/*     */ 
/*     */   public String getPp1fech() {
/* 129 */     return this.Pp1fech;
/*     */   }
/*     */ 
/*     */   public void setPp1fech(String pp1fech) {
/* 133 */     this.Pp1fech = pp1fech;
/*     */   }
/*     */ 
/*     */   public String getIthora() {
/* 137 */     return this.Ithora;
/*     */   }
/*     */ 
/*     */   public void setIthora(String ithora) {
/* 141 */     this.Ithora = ithora;
/*     */   }
/*     */ 
/*     */   public String getPpfpag() {
/* 145 */     return this.Ppfpag;
/*     */   }
/*     */ 
/*     */   public void setPpfpag(String ppfpag) {
/* 149 */     this.Ppfpag = ppfpag;
/*     */   }
/*     */ 
/*     */   public String getScoper() {
/* 153 */     return this.Scoper;
/*     */   }
/*     */ 
/*     */   public void setScoper(String scoper)
/*     */   {
/* 158 */     this.Scoper = omCompletar(scoper, 9);
/*     */   }
/*     */   public String omCompletar(String nt, int cant) {
/* 161 */     while (nt.length() < cant) {
/* 162 */       nt = "0" + nt;
/*     */     }
/* 164 */     return nt;
/*     */   }
/*     */ 
/*     */   public String getScdoAnt() {
/* 168 */     return this.ScdoAnt;
/*     */   }
/*     */ 
/*     */   public void setScdoAnt(String scdoAnt) {
/* 172 */     this.ScdoAnt = scdoAnt;
/*     */   }
/*     */ 
/*     */   public String getScdoPri() {
/* 176 */     return this.ScdoPri;
/*     */   }
/*     */ 
/*     */   public void setScdoPri(String scdoPri) {
/* 180 */     this.ScdoPri = scdoPri;
/*     */   }
/*     */ 
/*     */   public String getScdoCom() {
/* 184 */     return this.ScdoCom;
/*     */   }
/*     */ 
/*     */   public void setScdoCom(String scdoCom) {
/* 188 */     this.ScdoCom = scdoCom;
/*     */   }
/*     */ 
/*     */   public String getMtoLiqu() {
/* 192 */     return this.MtoLiqu;
/*     */   }
/*     */ 
/*     */   public void setMtoLiqu(String mtoLiqu) {
/* 196 */     this.MtoLiqu = mtoLiqu;
/*     */   }
/*     */ 
/*     */   public String getFechPrp() {
/* 200 */     return this.FechPrp;
/*     */   }
/*     */ 
/*     */   public void setFechPrp(String fechPrp) {
/* 204 */     this.FechPrp = fechPrp;
/*     */   }
/*     */ 
/*     */   public String getGcPath() {
/* 208 */     return this.gcPath;
/*     */   }
/*     */ 
/*     */   public void setGcPath(String gcPath) {
/* 212 */     this.gcPath = gcPath.trim();
/*     */   }
/*     */ 
/*     */   public String omCompletar(String nt, int cant, char c)
/*     */   {
/* 217 */     while (nt.length() < cant) {
/* 218 */       nt = nt + "0";
/*     */     }
/* 220 */     return nt;
/*     */   }
/*     */ 
/*     */   public String getFechHor() {
/* 224 */     return this.FechHor;
/*     */   }
/*     */ 
/*     */   public void setFechHor(String fechHor) {
/* 228 */     this.FechHor = fechHor;
/*     */   }
/*     */ 
/*     */   public String getGcFolioFiscal() {
/* 232 */     return this.gcFolioFiscal;
/*     */   }
/*     */ 
/*     */   public void setGcFolioFiscal(String gcFolioFiscal) {
/* 236 */     this.gcFolioFiscal = gcFolioFiscal;
/*     */   }
/*     */ 
/*     */   public String getLogoPath() {
/* 240 */     return this.logoPath;
/*     */   }
/*     */ 
/*     */   public void setLogoPath(String logoPath) {
/* 244 */     this.logoPath = logoPath;
/*     */   }
/*     */ 
/*     */   public String getModTran() {
/* 248 */     return this.modTran;
/*     */   }
/*     */ 
/*     */   public void setModTran(String modTran) {
/* 252 */     this.modTran = modTran;
/*     */   }
/*     */ 
/*     */   public String getCastigado() {
/* 256 */     return this.castigado;
/*     */   }
/*     */ 
/*     */   public void setCastigado(String castigado) {
/* 260 */     this.castigado = castigado;
/*     */   }
/*     */ 
/*     */   public String getGcXML() {
/* 264 */     return this.gcXML;
/*     */   }
/*     */ 
/*     */   public void setGcXML(String gcXML) {
/* 268 */     this.gcXML = gcXML;
/*     */   }
/*     */ 
/*     */   public String getIvaInteres() {
/* 272 */     return this.ivaInteres;
/*     */   }
/*     */ 
/*     */   public void setIvaInteres(String ivaInteres) {
/* 276 */     this.ivaInteres = ivaInteres;
/*     */   }
/*     */ 
/*     */   public String getIvaComisAp() {
/* 280 */     return this.ivaComisAp;
/*     */   }
/*     */ 
/*     */   public void setIvaComisAp(String ivaComisAp) {
/* 284 */     this.ivaComisAp = ivaComisAp;
/*     */   }
/*     */ 
/*     */   public String getIvaMorIva() {
/* 288 */     return this.ivaMorIva;
/*     */   }
/*     */ 
/*     */   public void setIvaMorIva(String ivaMorIva) {
/* 292 */     this.ivaMorIva = ivaMorIva;
/*     */   }
/*     */ 
/*     */   public String getIvaComisAn() {
/* 296 */     return this.ivaComisAn;
/*     */   }
/*     */ 
/*     */   public void setIvaComisAn(String ivaComisAn) {
/* 300 */     this.ivaComisAn = ivaComisAn;
/*     */   }
/*     */ 
/*     */   public String getSdoCapital() {
/* 304 */     return this.sdoCapital;
/*     */   }
/*     */ 
/*     */   public void setSdoCapital(String sdoCapital) {
/* 308 */     this.sdoCapital = sdoCapital;
/*     */   }
/*     */ 
/*     */   public String getSdoInteres() {
/* 312 */     return this.sdoInteres;
/*     */   }
/*     */ 
/*     */   public void setSdoInteres(String sdoInteres) {
/* 316 */     this.sdoInteres = sdoInteres;
/*     */   }
/*     */ 
/*     */   public String getSdoComisAp() {
/* 320 */     return this.sdoComisAp;
/*     */   }
/*     */ 
/*     */   public void setSdoComisAp(String sdoComisAp) {
/* 324 */     this.sdoComisAp = sdoComisAp;
/*     */   }
/*     */ 
/*     */   public String getSdoComisAn() {
/* 328 */     return this.sdoComisAn;
/*     */   }
/*     */ 
/*     */   public void setSdoComisAn(String sdoComisAn) {
/* 332 */     this.sdoComisAn = sdoComisAn;
/*     */   }
/*     */ 
/*     */   public String getSdoTotal() {
/* 336 */     return this.sdoTotal;
/*     */   }
/*     */ 
/*     */   public void setSdoTotal(String sdoTotal) {
/* 340 */     this.sdoTotal = sdoTotal;
/*     */   }
/*     */ 
/*     */   public String getSdoMorInt() {
/* 344 */     return this.sdoMorInt;
/*     */   }
/*     */ 
/*     */   public void setSdoMorInt(String sdoMorInt) {
/* 348 */     this.sdoMorInt = sdoMorInt;
/*     */   }
/*     */ 
/*     */   public int getTipoCoso() {
/* 352 */     return this.tipoCoso;
/*     */   }
/*     */ 
/*     */   public void setTipoCoso(int tipoCoso) {
/* 356 */     this.tipoCoso = tipoCoso;
/*     */   }
/*     */ 
/*     */   public String getGcPathCond() {
/* 360 */     return this.gcPathCond;
/*     */   }
/*     */ 
/*     */   public void setGcPathCond(String gcPathCond) {
/* 364 */     this.gcPathCond = gcPathCond;
/*     */   }
/*     */ 
/*     */   public String getCapitalCN() {
/* 368 */     return this.capitalCN;
/*     */   }
/*     */ 
/*     */   public void setCapitalCN(String capitalCN) {
/* 372 */     this.capitalCN = capitalCN;
/*     */   }
/*     */ 
/*     */   public String getInteresCN() {
/* 376 */     return this.interesCN;
/*     */   }
/*     */ 
/*     */   public void setInteresCN(String interesCN) {
/* 380 */     this.interesCN = interesCN;
/*     */   }
/*     */ 
/*     */   public String getMoraCN() {
/* 384 */     return this.moraCN;
/*     */   }
/*     */ 
/*     */   public void setMoraCN(String moraCN) {
/* 388 */     this.moraCN = moraCN;
/*     */   }
/*     */ 
/*     */   public String getComisApCN() {
/* 392 */     return this.comisApCN;
/*     */   }
/*     */ 
/*     */   public void setComisApCN(String comisApCN) {
/* 396 */     this.comisApCN = comisApCN;
/*     */   }
/*     */ 
/*     */   public String getComisAnCN() {
/* 400 */     return this.comisAnCN;
/*     */   }
/*     */ 
/*     */   public void setComisAnCN(String comisAnCN) {
/* 404 */     this.comisAnCN = comisAnCN;
/*     */   }
/*     */ 
/*     */   public String getIvaInteresCN() {
/* 408 */     return this.ivaInteresCN;
/*     */   }
/*     */ 
/*     */   public void setIvaInteresCN(String ivaInteresCN) {
/* 412 */     this.ivaInteresCN = ivaInteresCN;
/*     */   }
/*     */ 
/*     */   public String getIvaMoraCN() {
/* 416 */     return this.ivaMoraCN;
/*     */   }
/*     */ 
/*     */   public void setIvaMoraCN(String ivaMoraCN) {
/* 420 */     this.ivaMoraCN = ivaMoraCN;
/*     */   }
/*     */ 
/*     */   public String getIvaComisApCN() {
/* 424 */     return this.ivaComisApCN;
/*     */   }
/*     */ 
/*     */   public void setIvaComisApCN(String ivaComisApCN) {
/* 428 */     this.ivaComisApCN = ivaComisApCN;
/*     */   }
/*     */ 
/*     */   public String getIvaComisAnCN() {
/* 432 */     return this.ivaComisAnCN;
/*     */   }
/*     */ 
/*     */   public void setIvaComisAnCN(String ivaComisAnCN) {
/* 436 */     this.ivaComisAnCN = ivaComisAnCN;
/*     */   }
/*     */ 
/*     */   public String getTotal2() {
/* 440 */     return this.total2;
/*     */   }
/*     */ 
/*     */   public void setTotal2(String total2) {
/* 444 */     this.total2 = total2;
/*     */   }
/*     */ 
/*     */   public String getSubtotal2() {
/* 448 */     return this.subtotal2;
/*     */   }
/*     */ 
/*     */   public void setSubtotal2(String subtotal2) {
/* 452 */     this.subtotal2 = subtotal2;
/*     */   }
/*     */ 
/*     */   public void setQrCode(ResultDlya poRD, String folioFiscal) {
/* 456 */     String montoPago = poRD.getGoComprobante().getTotal().toString();
/*     */ 
/* 458 */     String[] mPago = montoPago.split("\\.");
/* 459 */     String ent = mPago[0];
/* 460 */     String dec = mPago[1];
/* 461 */     dec = poRD.omCompletar(dec, 6, 'R');
/*     */ 
/* 463 */     montoPago = ent + "." + dec;
/*     */ 
/* 465 */     String rfcEmisor = poRD.getGoComprobante().getEmisor().getRfc();
/*     */ 
/* 467 */     String rfcReceptor = poRD.getGoComprobante().getReceptor().getRfc();
/*     */ 
/* 469 */     String qrCode = "?re=" + rfcEmisor + "&rr=" + rfcReceptor + "&tt" + 
/* 470 */       montoPago + "&id=" + folioFiscal;
/*     */ 
/* 472 */     this.qrCode = qrCode;
/*     */   }
/*     */ 
/*     */   public String getQrCode() {
/* 476 */     return this.qrCode;
/*     */   }
/*     */ 
/*     */   public String getTimeout() {
/* 480 */     return this.timeout;
/*     */   }
/*     */ 
/*     */   public void setTimeout(String timeout) {
/* 484 */     this.timeout = timeout;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturews.ResultDlya
 * JD-Core Version:    0.6.0
 */