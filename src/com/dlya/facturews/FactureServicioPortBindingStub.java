/*     */ package com.dlya.facturews;
/*     */ 
/*     */ import java.net.URL;
/*     */ import java.rmi.RemoteException;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Properties;
/*     */ import java.util.Vector;
/*     */ import javax.xml.namespace.QName;
/*     */ import org.apache.axis.AxisFault;
/*     */ import org.apache.axis.NoEndPointException;
/*     */ import org.apache.axis.client.Call;
/*     */ import org.apache.axis.client.Stub;
/*     */ import org.apache.axis.constants.Style;
/*     */ import org.apache.axis.constants.Use;
/*     */ import org.apache.axis.description.OperationDesc;
/*     */ import org.apache.axis.description.ParameterDesc;
/*     */ import org.apache.axis.encoding.DeserializerFactory;
/*     */ import org.apache.axis.encoding.ser.ArrayDeserializerFactory;
/*     */ import org.apache.axis.encoding.ser.ArraySerializerFactory;
/*     */ import org.apache.axis.encoding.ser.BeanDeserializerFactory;
/*     */ import org.apache.axis.encoding.ser.BeanSerializerFactory;
/*     */ import org.apache.axis.encoding.ser.EnumDeserializerFactory;
/*     */ import org.apache.axis.encoding.ser.EnumSerializerFactory;
/*     */ import org.apache.axis.encoding.ser.SimpleDeserializerFactory;
/*     */ import org.apache.axis.encoding.ser.SimpleListDeserializerFactory;
/*     */ import org.apache.axis.encoding.ser.SimpleListSerializerFactory;
/*     */ import org.apache.axis.encoding.ser.SimpleSerializerFactory;
/*     */ import org.apache.axis.soap.SOAPConstants;
/*     */ import org.apache.axis.utils.JavaUtils;
/*     */ 
/*     */ public class FactureServicioPortBindingStub extends Stub
/*     */   implements FactureServicio
/*     */ {
/*  11 */   private Vector cachedSerClasses = new Vector();
/*  12 */   private Vector cachedSerQNames = new Vector();
/*  13 */   private Vector cachedSerFactories = new Vector();
/*  14 */   private Vector cachedDeserFactories = new Vector();
/*     */ 
/*  19 */   static OperationDesc[] _operations = new OperationDesc[2];
/*     */ 
/*  20 */   static { _initOperationDesc1();
/*     */   }
/*     */ 
/*     */   private static void _initOperationDesc1()
/*     */   {
/*  26 */     OperationDesc oper = new OperationDesc();
/*  27 */     oper.setName("generaFactura");
/*  28 */     ParameterDesc param = new ParameterDesc(new QName("", "arg0"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
/*  29 */     param.setOmittable(true);
/*  30 */     oper.addParameter(param);
/*  31 */     oper.setReturnType(new QName("http://facturews/", "resultado"));
/*  32 */     oper.setReturnClass(Resultado.class);
/*  33 */     oper.setReturnQName(new QName("", "return"));
/*  34 */     oper.setStyle(Style.WRAPPED);
/*  35 */     oper.setUse(Use.LITERAL);
/*  36 */     _operations[0] = oper;
/*     */ 
/*  38 */     oper = new OperationDesc();
/*  39 */     oper.setName("cancelaFactura");
/*  40 */     param = new ParameterDesc(new QName("", "arg0"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
/*  41 */     param.setOmittable(true);
/*  42 */     oper.addParameter(param);
/*  43 */     param = new ParameterDesc(new QName("", "arg1"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
/*  44 */     param.setOmittable(true);
/*  45 */     oper.addParameter(param);
/*  46 */     param = new ParameterDesc(new QName("", "arg2"), 1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
/*  47 */     oper.addParameter(param);
/*  48 */     param = new ParameterDesc(new QName("", "arg3"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
/*  49 */     param.setOmittable(true);
/*  50 */     oper.addParameter(param);
/*  51 */     param = new ParameterDesc(new QName("", "arg4"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
/*  52 */     param.setOmittable(true);
/*  53 */     oper.addParameter(param);
/*  54 */     oper.setReturnType(new QName("http://facturews/", "resultadoCancelacion"));
/*  55 */     oper.setReturnClass(ResultadoCancelacion.class);
/*  56 */     oper.setReturnQName(new QName("", "return"));
/*  57 */     oper.setStyle(Style.WRAPPED);
/*  58 */     oper.setUse(Use.LITERAL);
/*  59 */     _operations[1] = oper;
/*     */   }
/*     */ 
/*     */   public FactureServicioPortBindingStub() throws AxisFault
/*     */   {
/*  64 */     this(null);
/*     */   }
/*     */ 
/*     */   public FactureServicioPortBindingStub(URL endpointURL, javax.xml.rpc.Service service) throws AxisFault {
/*  68 */     this(service);
/*  69 */     this.cachedEndpoint = endpointURL;
/*     */   }
/*     */ 
/*     */   public FactureServicioPortBindingStub(javax.xml.rpc.Service service) throws AxisFault {
/*  73 */     if (service == null)
/*  74 */       this.service = new org.apache.axis.client.Service();
/*     */     else {
/*  76 */       this.service = service;
/*     */     }
/*  78 */     ((org.apache.axis.client.Service)this.service).setTypeMappingVersion("1.2");
/*     */ 
/*  83 */     Class beansf = BeanSerializerFactory.class;
/*  84 */     Class beandf = BeanDeserializerFactory.class;
/*  85 */     Class enumsf = EnumSerializerFactory.class;
/*  86 */     Class enumdf = EnumDeserializerFactory.class;
/*  87 */     Class arraysf = ArraySerializerFactory.class;
/*  88 */     Class arraydf = ArrayDeserializerFactory.class;
/*  89 */     Class simplesf = SimpleSerializerFactory.class;
/*  90 */     Class simpledf = SimpleDeserializerFactory.class;
/*  91 */     Class simplelistsf = SimpleListSerializerFactory.class;
/*  92 */     Class simplelistdf = SimpleListDeserializerFactory.class;
/*  93 */     QName qName = new QName("http://facturews/", "resultado");
/*  94 */     this.cachedSerQNames.add(qName);
/*  95 */     Class cls = Resultado.class;
/*  96 */     this.cachedSerClasses.add(cls);
/*  97 */     this.cachedSerFactories.add(beansf);
/*  98 */     this.cachedDeserFactories.add(beandf);
/*     */ 
/* 100 */     qName = new QName("http://facturews/", "resultadoCancelacion");
/* 101 */     this.cachedSerQNames.add(qName);
/* 102 */     cls = ResultadoCancelacion.class;
/* 103 */     this.cachedSerClasses.add(cls);
/* 104 */     this.cachedSerFactories.add(beansf);
/* 105 */     this.cachedDeserFactories.add(beandf);
/*     */   }
/*     */ 
/*     */   protected Call createCall() throws RemoteException
/*     */   {
/*     */     try {
/* 111 */       Call _call = super._createCall();
/* 112 */       if (this.maintainSessionSet) {
/* 113 */         _call.setMaintainSession(this.maintainSession);
/*     */       }
/* 115 */       if (this.cachedUsername != null) {
/* 116 */         _call.setUsername(this.cachedUsername);
/*     */       }
/* 118 */       if (this.cachedPassword != null) {
/* 119 */         _call.setPassword(this.cachedPassword);
/*     */       }
/* 121 */       if (this.cachedEndpoint != null) {
/* 122 */         _call.setTargetEndpointAddress(this.cachedEndpoint);
/*     */       }
/* 124 */       if (this.cachedTimeout != null) {
/* 125 */         _call.setTimeout(this.cachedTimeout);
/*     */       }
/* 127 */       if (this.cachedPortName != null) {
/* 128 */         _call.setPortName(this.cachedPortName);
/*     */       }
/* 130 */       Enumeration keys = this.cachedProperties.keys();
/* 131 */       while (keys.hasMoreElements()) {
/* 132 */         String key = (String)keys.nextElement();
/* 133 */         _call.setProperty(key, this.cachedProperties.get(key));
/*     */       }
/*     */ 
/* 140 */       synchronized (this) {
/* 141 */         if (firstCall())
/*     */         {
/* 143 */           _call.setEncodingStyle(null);
/* 144 */           for (int i = 0; i < this.cachedSerFactories.size(); i++) {
/* 145 */             Class cls = (Class)this.cachedSerClasses.get(i);
/* 146 */             QName qName = 
/* 147 */               (QName)this.cachedSerQNames.get(i);
/* 148 */             Object x = this.cachedSerFactories.get(i);
/* 149 */             if ((x instanceof Class)) {
/* 150 */               Class sf = 
/* 151 */                 (Class)this.cachedSerFactories.get(i);
/* 152 */               Class df = 
/* 153 */                 (Class)this.cachedDeserFactories.get(i);
/* 154 */               _call.registerTypeMapping(cls, qName, sf, df, false);
/*     */             }
/* 156 */             else if ((x instanceof javax.xml.rpc.encoding.SerializerFactory)) {
/* 157 */               org.apache.axis.encoding.SerializerFactory sf = 
/* 158 */                 (org.apache.axis.encoding.SerializerFactory)this.cachedSerFactories.get(i);
/* 159 */               DeserializerFactory df = 
/* 160 */                 (DeserializerFactory)this.cachedDeserFactories.get(i);
/* 161 */               _call.registerTypeMapping(cls, qName, sf, df, false);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 166 */       return _call;
/*     */     } catch (Throwable _t) {
/*     */     }
/* 169 */     throw new AxisFault("Failure trying to get the Call object", _t);
/*     */   }
/*     */ 
/*     */   public Resultado generaFactura(String arg0) throws RemoteException
/*     */   {
/* 174 */     if (this.cachedEndpoint == null) {
/* 175 */       throw new NoEndPointException();
/*     */     }
/* 177 */     Call _call = createCall();
/* 178 */     _call.setOperation(_operations[0]);
/* 179 */     _call.setUseSOAPAction(true);
/* 180 */     _call.setSOAPActionURI("");
/* 181 */     _call.setEncodingStyle(null);
/* 182 */     _call.setProperty("sendXsiTypes", Boolean.FALSE);
/* 183 */     _call.setProperty("sendMultiRefs", Boolean.FALSE);
/* 184 */     _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
/* 185 */     _call.setOperationName(new QName("http://facturews/", "generaFactura"));
/*     */ 
/* 187 */     setRequestHeaders(_call);
/* 188 */     setAttachments(_call);
/*     */     try { Object _resp = _call.invoke(new Object[] { arg0 });
/*     */ 
/* 191 */       if ((_resp instanceof RemoteException)) {
/* 192 */         throw ((RemoteException)_resp);
/*     */       }
/*     */ 
/* 195 */       extractAttachments(_call);
/*     */       try {
/* 197 */         return (Resultado)_resp;
/*     */       } catch (Exception _exception) {
/* 199 */         return (Resultado)JavaUtils.convert(_resp, Resultado.class);
/*     */       }
/*     */     } catch (AxisFault axisFaultException) {
/*     */     }
/* 203 */     throw axisFaultException;
/*     */   }
/*     */ 
/*     */   public ResultadoCancelacion cancelaFactura(String arg0, String arg1, int arg2, String arg3, String arg4) throws RemoteException
/*     */   {
/* 208 */     if (this.cachedEndpoint == null) {
/* 209 */       throw new NoEndPointException();
/*     */     }
/* 211 */     Call _call = createCall();
/* 212 */     _call.setOperation(_operations[1]);
/* 213 */     _call.setUseSOAPAction(true);
/* 214 */     _call.setSOAPActionURI("");
/* 215 */     _call.setEncodingStyle(null);
/* 216 */     _call.setProperty("sendXsiTypes", Boolean.FALSE);
/* 217 */     _call.setProperty("sendMultiRefs", Boolean.FALSE);
/* 218 */     _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
/* 219 */     _call.setOperationName(new QName("http://facturews/", "cancelaFactura"));
/*     */ 
/* 221 */     setRequestHeaders(_call);
/* 222 */     setAttachments(_call);
/*     */     try { Object _resp = _call.invoke(new Object[] { arg0, arg1, new Integer(arg2), arg3, arg4 });
/*     */ 
/* 225 */       if ((_resp instanceof RemoteException)) {
/* 226 */         throw ((RemoteException)_resp);
/*     */       }
/*     */ 
/* 229 */       extractAttachments(_call);
/*     */       try {
/* 231 */         return (ResultadoCancelacion)_resp;
/*     */       } catch (Exception _exception) {
/* 233 */         return (ResultadoCancelacion)JavaUtils.convert(_resp, ResultadoCancelacion.class);
/*     */       }
/*     */     } catch (AxisFault axisFaultException) {
/*     */     }
/* 237 */     throw axisFaultException;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturews.FactureServicioPortBindingStub
 * JD-Core Version:    0.6.0
 */