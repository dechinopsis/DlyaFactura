/*      */ package com.dlya.facturews;
/*      */ 
/*      */ import com.lowagie.text.Chunk;
/*      */ import com.lowagie.text.Document;
/*      */ import com.lowagie.text.DocumentException;
/*      */ import com.lowagie.text.FontFactory;
/*      */ import com.lowagie.text.Phrase;
/*      */ import com.lowagie.text.SplitCharacter;
/*      */ import com.lowagie.text.pdf.BaseFont;
/*      */ import com.lowagie.text.pdf.ColumnText;
/*      */ import com.lowagie.text.pdf.FontMapper;
/*      */ import com.lowagie.text.pdf.PdfAction;
/*      */ import com.lowagie.text.pdf.PdfArray;
/*      */ import com.lowagie.text.pdf.PdfContentByte;
/*      */ import com.lowagie.text.pdf.PdfDestination;
/*      */ import com.lowagie.text.pdf.PdfDictionary;
/*      */ import com.lowagie.text.pdf.PdfName;
/*      */ import com.lowagie.text.pdf.PdfOutline;
/*      */ import com.lowagie.text.pdf.PdfString;
/*      */ import com.lowagie.text.pdf.PdfTemplate;
/*      */ import com.lowagie.text.pdf.PdfWriter;
/*      */ import java.awt.Color;
/*      */ import java.awt.Graphics2D;
/*      */ import java.awt.font.TextAttribute;
/*      */ import java.awt.geom.AffineTransform;
/*      */ import java.awt.geom.Dimension2D;
/*      */ import java.awt.geom.Rectangle2D;
/*      */ import java.awt.geom.Rectangle2D.Double;
/*      */ import java.awt.image.BufferedImage;
/*      */ import java.io.File;
/*      */ import java.io.FileOutputStream;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.text.AttributedCharacterIterator;
/*      */ import java.text.AttributedCharacterIterator.Attribute;
/*      */ import java.text.AttributedString;
/*      */ import java.util.Collection;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.LinkedList;
/*      */ import java.util.List;
/*      */ import java.util.Locale;
/*      */ import java.util.Map;
/*      */ import net.sf.jasperreports.engine.DefaultJasperReportsContext;
/*      */ import net.sf.jasperreports.engine.JRAbstractExporter;
/*      */ import net.sf.jasperreports.engine.JRAbstractExporter.BaseExporterContext;
/*      */ import net.sf.jasperreports.engine.JRException;
/*      */ import net.sf.jasperreports.engine.JRExporterParameter;
/*      */ import net.sf.jasperreports.engine.JRFont;
/*      */ import net.sf.jasperreports.engine.JRGenericPrintElement;
/*      */ import net.sf.jasperreports.engine.JRImageRenderer;
/*      */ import net.sf.jasperreports.engine.JRLineBox;
/*      */ import net.sf.jasperreports.engine.JRPen;
/*      */ import net.sf.jasperreports.engine.JRPrintAnchor;
/*      */ import net.sf.jasperreports.engine.JRPrintElement;
/*      */ import net.sf.jasperreports.engine.JRPrintEllipse;
/*      */ import net.sf.jasperreports.engine.JRPrintFrame;
/*      */ import net.sf.jasperreports.engine.JRPrintHyperlink;
/*      */ import net.sf.jasperreports.engine.JRPrintImage;
/*      */ import net.sf.jasperreports.engine.JRPrintLine;
/*      */ import net.sf.jasperreports.engine.JRPrintPage;
/*      */ import net.sf.jasperreports.engine.JRPrintRectangle;
/*      */ import net.sf.jasperreports.engine.JRPrintText;
/*      */ import net.sf.jasperreports.engine.JRPropertiesUtil;
/*      */ import net.sf.jasperreports.engine.JRPropertiesUtil.PropertySuffix;
/*      */ import net.sf.jasperreports.engine.JRRuntimeException;
/*      */ import net.sf.jasperreports.engine.JasperPrint;
/*      */ import net.sf.jasperreports.engine.JasperReportsContext;
/*      */ import net.sf.jasperreports.engine.Renderable;
/*      */ import net.sf.jasperreports.engine.RenderableUtil;
/*      */ import net.sf.jasperreports.engine.base.JRBaseFont;
/*      */ import net.sf.jasperreports.engine.base.JRBasePrintText;
/*      */ import net.sf.jasperreports.engine.base.JRBoxPen;
/*      */ import net.sf.jasperreports.engine.export.AbstractPdfTextRenderer;
/*      */ import net.sf.jasperreports.engine.export.ExporterFilter;
/*      */ import net.sf.jasperreports.engine.export.FontKey;
/*      */ import net.sf.jasperreports.engine.export.GenericElementHandlerEnviroment;
/*      */ import net.sf.jasperreports.engine.export.GenericElementPdfHandler;
/*      */ import net.sf.jasperreports.engine.export.JRExportProgressMonitor;
/*      */ import net.sf.jasperreports.engine.export.JRHyperlinkProducerFactory;
/*      */ import net.sf.jasperreports.engine.export.JRPdfExporter;
/*      */ import net.sf.jasperreports.engine.export.JRPdfExporterContext;
/*      */ import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
/*      */ import net.sf.jasperreports.engine.export.PdfFont;
/*      */ import net.sf.jasperreports.engine.export.PdfTextRenderer;
/*      */ import net.sf.jasperreports.engine.export.SimplePdfTextRenderer;
/*      */ import net.sf.jasperreports.engine.export.legacy.BorderOffset;
/*      */ import net.sf.jasperreports.engine.fonts.FontFace;
/*      */ import net.sf.jasperreports.engine.fonts.FontFamily;
/*      */ import net.sf.jasperreports.engine.fonts.FontInfo;
/*      */ import net.sf.jasperreports.engine.fonts.FontUtil;
/*      */ import net.sf.jasperreports.engine.type.HyperlinkTypeEnum;
/*      */ import net.sf.jasperreports.engine.type.LineDirectionEnum;
/*      */ import net.sf.jasperreports.engine.type.LineStyleEnum;
/*      */ import net.sf.jasperreports.engine.type.ModeEnum;
/*      */ import net.sf.jasperreports.engine.type.RenderableTypeEnum;
/*      */ import net.sf.jasperreports.engine.util.BreakIteratorSplitCharacter;
/*      */ import net.sf.jasperreports.engine.util.JRLoader;
/*      */ import net.sf.jasperreports.engine.util.JRPdfaIccProfileNotFoundException;
/*      */ import net.sf.jasperreports.engine.util.JRStyledText;
/*      */ import net.sf.jasperreports.engine.util.JRTextAttribute;
/*      */ import net.sf.jasperreports.repo.RepositoryUtil;
/*      */ import org.apache.commons.logging.Log;
/*      */ import org.apache.commons.logging.LogFactory;
/*      */ 
/*      */ public class DlyaPdfExporter2 extends JRPdfExporter
/*      */ {
/*  149 */   private static final Log log = LogFactory.getLog(DlyaPdfExporter2.class);
/*      */   public static final String PDF_EXPORTER_PROPERTIES_PREFIX = "net.sf.jasperreports.export.pdf.";
/*      */   public static final String PDF_FONT_FILES_PREFIX = "net.sf.jasperreports.export.pdf.font.";
/*      */   public static final String PDF_FONT_DIRS_PREFIX = "net.sf.jasperreports.export.pdf.fontdir.";
/*      */   public static final String PDF_EXPORTER_KEY = "net.sf.jasperreports.pdf";
/*      */   private static final String EMPTY_BOOKMARK_TITLE = "";
/*      */   protected static final String JR_PAGE_ANCHOR_PREFIX = "JR_PAGE_ANCHOR_";
/*      */   protected static boolean fontsRegistered;
/*      */   protected Document document;
/*      */   protected PdfContentByte pdfContentByte;
/*      */   protected PdfWriter pdfWriter;
/*      */   protected Document imageTesterDocument;
/*      */   protected PdfContentByte imageTesterPdfContentByte;
/*      */   protected JRExportProgressMonitor progressMonitor;
/*      */   protected int reportIndex;
/*      */   protected boolean forceSvgShapes;
/*      */   protected boolean isCreatingBatchModeBookmarks;
/*      */   protected boolean isCompressed;
/*      */   protected boolean isEncrypted;
/*      */   protected boolean is128BitKey;
/*      */   protected String userPassword;
/*      */   protected String ownerPassword;
/*      */   protected int permissions;
/*      */   protected Character pdfVersion;
/*      */   protected String pdfJavaScript;
/*      */   protected String printScaling;
/*      */   private boolean collapseMissingBookmarkLevels;
/*      */   protected Map<Renderable, com.lowagie.text.Image> loadedImagesMap;
/*      */   protected com.lowagie.text.Image pxImage;
/*      */   private BookmarkStack bookmarkStack;
/*      */   private Map<FontKey, PdfFont> pdfFontMap;
/*      */   private SplitCharacter splitCharacter;
/*  235 */   protected JRPdfExporterContext exporterContext = new ExporterContext();
/*      */ 
/*      */   public DlyaPdfExporter2()
/*      */   {
/*  242 */     this(DefaultJasperReportsContext.getInstance());
/*      */   }
/*      */ 
/*      */   public DlyaPdfExporter2(JasperReportsContext jasperReportsContext)
/*      */   {
/*  251 */     super(jasperReportsContext);
/*      */   }
/*      */ 
/*      */   protected com.lowagie.text.Image getPxImage()
/*      */   {
/*  260 */     if (this.pxImage == null)
/*      */     {
/*      */       try
/*      */       {
/*  264 */         this.pxImage = 
/*  265 */           com.lowagie.text.Image.getInstance(
/*  266 */           JRLoader.loadBytesFromResource("net/sf/jasperreports/engine/images/pixel.GIF"));
/*      */       }
/*      */       catch (Exception e)
/*      */       {
/*  271 */         throw new JRRuntimeException(e);
/*      */       }
/*      */     }
/*      */ 
/*  275 */     return this.pxImage;
/*      */   }
/*      */ 
/*      */   public void exportReport()
/*      */     throws JRException
/*      */   {
/*  284 */     registerFonts();
/*      */ 
/*  286 */     this.progressMonitor = ((JRExportProgressMonitor)this.parameters.get(JRExporterParameter.PROGRESS_MONITOR));
/*      */ 
/*  289 */     setOffset();
/*      */     try
/*      */     {
/*  294 */       setExportContext();
/*      */ 
/*  297 */       setInput();
/*      */ 
/*  299 */       if (!this.parameters.containsKey(JRExporterParameter.FILTER))
/*      */       {
/*  301 */         this.filter = createFilter("net.sf.jasperreports.export.pdf.");
/*      */       }
/*      */ 
/*  305 */       if (!this.isModeBatch)
/*      */       {
/*  307 */         setPageRange();
/*      */       }
/*      */ 
/*  310 */       this.isCreatingBatchModeBookmarks = 
/*  311 */         getBooleanParameter(
/*  312 */         JRPdfExporterParameter.IS_CREATING_BATCH_MODE_BOOKMARKS, 
/*  313 */         "net.sf.jasperreports.export.pdf.create.batch.mode.bookmarks", 
/*  314 */         false);
/*      */ 
/*  317 */       this.forceSvgShapes = 
/*  318 */         getBooleanParameter(
/*  319 */         JRPdfExporterParameter.FORCE_SVG_SHAPES, 
/*  320 */         "net.sf.jasperreports.export.pdf.force.svg.shapes", 
/*  321 */         false);
/*      */ 
/*  324 */       this.isCompressed = 
/*  325 */         getBooleanParameter(
/*  326 */         JRPdfExporterParameter.IS_COMPRESSED, 
/*  327 */         "net.sf.jasperreports.export.pdf.compressed", 
/*  328 */         false);
/*      */ 
/*  331 */       this.isEncrypted = 
/*  332 */         getBooleanParameter(
/*  333 */         JRPdfExporterParameter.IS_ENCRYPTED, 
/*  334 */         "net.sf.jasperreports.export.pdf.encrypted", 
/*  335 */         false);
/*      */ 
/*  338 */       this.is128BitKey = 
/*  339 */         getBooleanParameter(
/*  340 */         JRPdfExporterParameter.IS_128_BIT_KEY, 
/*  341 */         "net.sf.jasperreports.export.pdf.128.bit.key", 
/*  342 */         false);
/*      */ 
/*  345 */       this.userPassword = 
/*  346 */         getStringParameter(
/*  347 */         JRPdfExporterParameter.USER_PASSWORD, 
/*  348 */         "net.sf.jasperreports.export.pdf.user.password");
/*      */ 
/*  351 */       this.ownerPassword = 
/*  352 */         getStringParameter(
/*  353 */         JRPdfExporterParameter.OWNER_PASSWORD, 
/*  354 */         "net.sf.jasperreports.export.pdf.owner.password");
/*      */ 
/*  357 */       Integer permissionsParameter = (Integer)this.parameters.get(JRPdfExporterParameter.PERMISSIONS);
/*  358 */       if (permissionsParameter != null)
/*      */       {
/*  360 */         this.permissions = permissionsParameter.intValue();
/*      */       }
/*      */ 
/*  363 */       this.pdfVersion = 
/*  364 */         getCharacterParameter(
/*  365 */         JRPdfExporterParameter.PDF_VERSION, 
/*  366 */         "net.sf.jasperreports.export.pdf.version");
/*      */ 
/*  369 */       setFontMap();
/*  370 */       setSplitCharacter();
/*  371 */       setHyperlinkProducerFactory();
/*      */ 
/*  373 */       this.pdfJavaScript = 
/*  374 */         getStringParameter(
/*  375 */         JRPdfExporterParameter.PDF_JAVASCRIPT, 
/*  376 */         "net.sf.jasperreports.export.pdf.javascript");
/*      */ 
/*  379 */       this.printScaling = 
/*  380 */         getStringParameter(
/*  381 */         JRPdfExporterParameter.PRINT_SCALING, 
/*  382 */         "net.sf.jasperreports.export.pdf.print.scaling");
/*      */ 
/*  387 */       this.collapseMissingBookmarkLevels = JRPropertiesUtil.getInstance(this.jasperReportsContext).getBooleanProperty(this.jasperPrint, 
/*  388 */         "net.sf.jasperreports.export.pdf.collapse.missing.bookmark.levels", false);
/*      */ 
/*  390 */       OutputStream os = (OutputStream)this.parameters.get(JRExporterParameter.OUTPUT_STREAM);
/*  391 */       if (os != null)
/*      */       {
/*  393 */         exportReportToStream(os);
/*      */       }
/*      */       else
/*      */       {
/*  397 */         File destFile = (File)this.parameters.get(JRExporterParameter.OUTPUT_FILE);
/*  398 */         if (destFile == null)
/*      */         {
/*  400 */           String fileName = (String)this.parameters.get(JRExporterParameter.OUTPUT_FILE_NAME);
/*  401 */           if (fileName != null)
/*      */           {
/*  403 */             destFile = new File(fileName);
/*      */           }
/*      */           else
/*      */           {
/*  407 */             throw new JRException("No output specified for the exporter.");
/*      */           }
/*      */         }
/*      */ 
/*      */         try
/*      */         {
/*  413 */           os = new FileOutputStream(destFile);
/*  414 */           exportReportToStream(os);
/*  415 */           os.flush();
/*      */         }
/*      */         catch (IOException e)
/*      */         {
/*  419 */           throw new JRException("Error trying to export to file : " + destFile, e);
/*      */         }
/*      */         finally
/*      */         {
/*  423 */           if (os != null)
/*      */           {
/*      */             try
/*      */             {
/*  427 */               os.close(); } catch (IOException localIOException1) {  }
/*      */           }
/*      */         }try { os.close();
/*      */         }
/*      */         catch (IOException localIOException2)
/*      */         {
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/*  438 */       resetExportContext();
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void setFontMap()
/*      */   {
/*  446 */     this.pdfFontMap = ((Map)this.parameters.get(JRExporterParameter.FONT_MAP));
/*      */   }
/*      */ 
/*      */   protected void setSplitCharacter()
/*      */   {
/*  453 */     Boolean useFillSplitCharacterParam = (Boolean)this.parameters.get(JRPdfExporterParameter.FORCE_LINEBREAK_POLICY);
/*      */     boolean useFillSplitCharacter;
/*      */     boolean useFillSplitCharacter;
/*  454 */     if (useFillSplitCharacterParam == null)
/*      */     {
/*  456 */       useFillSplitCharacter = 
/*  457 */         JRPropertiesUtil.getInstance(this.jasperReportsContext).getBooleanProperty(
/*  458 */         this.jasperPrint.getPropertiesMap(), 
/*  459 */         "net.sf.jasperreports.export.pdf.force.linebreak.policy", 
/*  460 */         false);
/*      */     }
/*      */     else
/*      */     {
/*  465 */       useFillSplitCharacter = useFillSplitCharacterParam.booleanValue();
/*      */     }
/*      */ 
/*  468 */     if (useFillSplitCharacter)
/*      */     {
/*  470 */       this.splitCharacter = new BreakIteratorSplitCharacter();
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void exportReportToStream(OutputStream os)
/*      */     throws JRException
/*      */   {
/*  482 */     this.document = 
/*  483 */       new Document(
/*  484 */       new com.lowagie.text.Rectangle(
/*  485 */       this.jasperPrint.getPageWidth(), 
/*  486 */       this.jasperPrint.getPageHeight()));
/*      */ 
/*  490 */     this.imageTesterDocument = 
/*  491 */       new Document(
/*  492 */       new com.lowagie.text.Rectangle(
/*  493 */       10.0F, 
/*  494 */       10.0F));
/*      */ 
/*  498 */     boolean closeDocuments = true;
/*      */     try
/*      */     {
/*  501 */       this.pdfWriter = PdfWriter.getInstance(this.document, os);
/*  502 */       this.pdfWriter.setCloseStream(false);
/*      */ 
/*  505 */       if (this.pdfVersion != null)
/*      */       {
/*  507 */         this.pdfWriter.setPdfVersion(this.pdfVersion.charValue());
/*      */       }
/*  509 */       if (this.isCompressed)
/*      */       {
/*  511 */         this.pdfWriter.setFullCompression();
/*      */       }
/*  513 */       if (this.isEncrypted)
/*      */       {
/*  515 */         this.pdfWriter.setEncryption(
/*  516 */           this.is128BitKey, 
/*  517 */           this.userPassword, 
/*  518 */           this.ownerPassword, 
/*  519 */           this.permissions);
/*      */       }
/*      */ 
/*  524 */       if (this.printScaling != null)
/*      */       {
/*  526 */         if (!"default".equals(this.printScaling))
/*      */         {
/*  530 */           "none".equals(this.printScaling);
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*  538 */       String title = (String)this.parameters.get(JRPdfExporterParameter.METADATA_TITLE);
/*  539 */       if (title != null)
/*      */       {
/*  541 */         this.document.addTitle(title);
/*      */       }
/*  543 */       String author = (String)this.parameters.get(JRPdfExporterParameter.METADATA_AUTHOR);
/*  544 */       if (author != null)
/*      */       {
/*  546 */         this.document.addAuthor(author);
/*      */       }
/*  548 */       String subject = (String)this.parameters.get(JRPdfExporterParameter.METADATA_SUBJECT);
/*  549 */       if (subject != null)
/*      */       {
/*  551 */         this.document.addSubject(subject);
/*      */       }
/*  553 */       String keywords = (String)this.parameters.get(JRPdfExporterParameter.METADATA_KEYWORDS);
/*  554 */       if (keywords != null)
/*      */       {
/*  556 */         this.document.addKeywords(keywords);
/*      */       }
/*  558 */       String creator = (String)this.parameters.get(JRPdfExporterParameter.METADATA_CREATOR);
/*  559 */       if (creator != null)
/*      */       {
/*  561 */         this.document.addCreator(creator);
/*      */       }
/*      */       else
/*      */       {
/*  565 */         this.document.addCreator("JasperReports (" + this.jasperPrint.getName() + ")");
/*      */       }
/*      */ 
/*  569 */       String pdfaConformance = getStringParameter(JRPdfExporterParameter.PDFA_CONFORMANCE, "net.sf.jasperreports.export.pdfa.conformance");
/*  570 */       boolean gotPdfa = false;
/*  571 */       if ((pdfaConformance != null) && (!"none".equalsIgnoreCase(pdfaConformance)))
/*      */       {
/*  573 */         if ("pdfa1a".equalsIgnoreCase(pdfaConformance))
/*      */         {
/*  576 */           gotPdfa = true;
/*      */         }
/*  578 */         else if ("pdfa1b".equalsIgnoreCase(pdfaConformance))
/*      */         {
/*  581 */           gotPdfa = true;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*  595 */       this.document.open();
/*      */ 
/*  598 */       if (gotPdfa) {
/*  599 */         String iccProfilePath = getStringParameter(JRPdfExporterParameter.PDFA_ICC_PROFILE_PATH, "net.sf.jasperreports.export.pdfa.icc.profile.path");
/*  600 */         if (iccProfilePath != null) {
/*  601 */           PdfDictionary pdfDictionary = new PdfDictionary(PdfName.OUTPUTINTENT);
/*  602 */           pdfDictionary.put(PdfName.OUTPUTCONDITIONIDENTIFIER, new PdfString("sRGB IEC61966-2.1"));
/*  603 */           pdfDictionary.put(PdfName.INFO, new PdfString("sRGB IEC61966-2.1"));
/*      */ 
/*  606 */           InputStream iccIs = RepositoryUtil.getInstance(this.jasperReportsContext).getInputStreamFromLocation(iccProfilePath);
/*      */ 
/*  611 */           this.pdfWriter.getExtraCatalog().put(PdfName.OUTPUTINTENTS, new PdfArray(pdfDictionary));
/*      */         } else {
/*  613 */           throw new JRPdfaIccProfileNotFoundException();
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*  618 */       if (this.pdfJavaScript != null)
/*      */       {
/*  620 */         this.pdfWriter.addJavaScript(this.pdfJavaScript);
/*      */       }
/*      */ 
/*  623 */       this.pdfContentByte = this.pdfWriter.getDirectContent();
/*      */ 
/*  627 */       initBookmarks();
/*      */ 
/*  629 */       PdfWriter imageTesterPdfWriter = 
/*  630 */         PdfWriter.getInstance(
/*  631 */         this.imageTesterDocument, 
/*  632 */         new NullOutputStream());
/*      */ 
/*  634 */       this.imageTesterDocument.open();
/*  635 */       this.imageTesterDocument.newPage();
/*  636 */       this.imageTesterPdfContentByte = imageTesterPdfWriter.getDirectContent();
/*  637 */       this.imageTesterPdfContentByte.setLiteral("\n");
/*      */ 
/*  639 */       for (this.reportIndex = 0; this.reportIndex < this.jasperPrintList.size(); this.reportIndex += 1)
/*      */       {
/*  641 */         setJasperPrint((JasperPrint)this.jasperPrintList.get(this.reportIndex));
/*  642 */         this.loadedImagesMap = new HashMap();
/*      */ 
/*  644 */         setPageSize(null);
/*      */ 
/*  646 */         BorderOffset.setLegacy(
/*  647 */           JRPropertiesUtil.getInstance(this.jasperReportsContext).getBooleanProperty(this.jasperPrint, "net.sf.jasperreports.export.legacy.border.offset", false));
/*      */ 
/*  650 */         boolean sizePageToContent = JRPropertiesUtil.getInstance(this.jasperReportsContext).getBooleanProperty(this.jasperPrint, "net.sf.jasperreports.export.pdf.size.page.to.content", false);
/*      */ 
/*  652 */         List pages = this.jasperPrint.getPages();
/*  653 */         if ((pages != null) && (pages.size() > 0))
/*      */         {
/*  655 */           if (this.isModeBatch)
/*      */           {
/*  657 */             this.document.newPage();
/*      */ 
/*  659 */             if (this.isCreatingBatchModeBookmarks)
/*      */             {
/*  662 */               addBookmark(0, this.jasperPrint.getName(), 0, 0);
/*      */             }
/*      */ 
/*  665 */             this.startPageIndex = 0;
/*  666 */             this.endPageIndex = (pages.size() - 1);
/*      */           }
/*      */ 
/*  669 */           for (int pageIndex = this.startPageIndex; pageIndex <= this.endPageIndex; pageIndex++)
/*      */           {
/*  671 */             if (Thread.interrupted())
/*      */             {
/*  673 */               throw new JRException("Current thread interrupted.");
/*      */             }
/*      */ 
/*  676 */             JRPrintPage page = (JRPrintPage)pages.get(pageIndex);
/*      */ 
/*  678 */             if (sizePageToContent)
/*      */             {
/*  680 */               setPageSize(page);
/*      */             }
/*      */ 
/*  683 */             this.document.newPage();
/*      */ 
/*  685 */             this.pdfContentByte = this.pdfWriter.getDirectContent();
/*      */ 
/*  687 */             this.pdfContentByte.setLineCap(2);
/*      */ 
/*  689 */             writePageAnchor(pageIndex);
/*      */ 
/*  692 */             exportPage(page);
/*      */           }
/*      */         }
/*      */         else
/*      */         {
/*  697 */           this.document.newPage();
/*  698 */           this.pdfContentByte = this.pdfWriter.getDirectContent();
/*  699 */           this.pdfContentByte.setLiteral("\n");
/*      */         }
/*      */       }
/*      */ 
/*  703 */       closeDocuments = false;
/*  704 */       this.document.close();
/*  705 */       this.imageTesterDocument.close();
/*      */     }
/*      */     catch (DocumentException e)
/*      */     {
/*  709 */       throw new JRException("PDF Document error : " + this.jasperPrint.getName(), e);
/*      */     }
/*      */     catch (IOException e)
/*      */     {
/*  713 */       throw new JRException("Error generating PDF report : " + this.jasperPrint.getName(), e);
/*      */     }
/*      */     finally
/*      */     {
/*  717 */       if (closeDocuments)
/*      */       {
/*      */         try
/*      */         {
/*  721 */           this.document.close();
/*      */         }
/*      */         catch (Exception localException)
/*      */         {
/*      */         }
/*      */ 
/*      */         try
/*      */         {
/*  730 */           this.imageTesterDocument.close();
/*      */         }
/*      */         catch (Exception localException1)
/*      */         {
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void writePageAnchor(int pageIndex)
/*      */     throws DocumentException
/*      */   {
/*  745 */     Map attributes = new HashMap();
/*  746 */     FontUtil.getInstance(this.jasperReportsContext).getAttributesWithoutAwtFont(attributes, new JRBasePrintText(this.jasperPrint.getDefaultStyleProvider()));
/*  747 */     com.lowagie.text.Font pdfFont = getFont(attributes, getLocale(), false);
/*  748 */     Chunk chunk = new Chunk(" ", pdfFont);
/*      */ 
/*  750 */     chunk.setLocalDestination("JR_PAGE_ANCHOR_" + this.reportIndex + "_" + (pageIndex + 1));
/*      */ 
/*  754 */     ColumnText colText = new ColumnText(this.pdfContentByte);
/*  755 */     colText.setSimpleColumn(
/*  756 */       new Phrase(chunk), 
/*  757 */       0.0F, 
/*  758 */       this.jasperPrint.getPageHeight(), 
/*  759 */       1.0F, 
/*  760 */       1.0F, 
/*  761 */       0.0F, 
/*  762 */       0);
/*      */ 
/*  765 */     colText.go();
/*      */   }
/*      */ 
/*      */   protected void setPageSize(JRPrintPage page)
/*      */     throws JRException, DocumentException, IOException
/*      */   {
/*  775 */     int pageWidth = this.jasperPrint.getPageWidth();
/*  776 */     int pageHeight = this.jasperPrint.getPageHeight();
/*      */ 
/*  778 */     if (page != null)
/*      */     {
/*  780 */       Collection elements = page.getElements();
/*  781 */       for (JRPrintElement element : elements)
/*      */       {
/*  783 */         int elementRight = element.getX() + element.getWidth();
/*  784 */         int elementBottom = element.getY() + element.getHeight();
/*  785 */         pageWidth = pageWidth < elementRight ? elementRight : pageWidth;
/*  786 */         pageHeight = pageHeight < elementBottom ? elementBottom : pageHeight;
/*      */       }
/*      */ 
/*  789 */       pageWidth += this.jasperPrint.getRightMargin().intValue();
/*  790 */       pageHeight += this.jasperPrint.getBottomMargin().intValue();
/*      */     }
/*      */     com.lowagie.text.Rectangle pageSize;
/*      */     com.lowagie.text.Rectangle pageSize;
/*  794 */     switch ($SWITCH_TABLE$net$sf$jasperreports$engine$type$OrientationEnum()[this.jasperPrint.getOrientationValue().ordinal()])
/*      */     {
/*      */     case 2:
/*  798 */       pageSize = new com.lowagie.text.Rectangle(pageHeight, pageWidth).rotate();
/*  799 */       break;
/*      */     default:
/*  801 */       pageSize = new com.lowagie.text.Rectangle(pageWidth, pageHeight);
/*      */     }
/*      */ 
/*  804 */     this.document.setPageSize(pageSize);
/*      */   }
/*      */ 
/*      */   protected void exportPage(JRPrintPage page)
/*      */     throws JRException, DocumentException, IOException
/*      */   {
/*  814 */     Collection elements = page.getElements();
/*  815 */     exportElements(elements);
/*      */ 
/*  819 */     if (this.progressMonitor != null)
/*      */     {
/*  821 */       this.progressMonitor.afterPageExport();
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void exportElements(Collection<JRPrintElement> elements) throws DocumentException, IOException, JRException
/*      */   {
/*  827 */     if ((elements != null) && (elements.size() > 0))
/*      */     {
/*  829 */       for (Iterator it = elements.iterator(); it.hasNext(); )
/*      */       {
/*  831 */         JRPrintElement element = (JRPrintElement)it.next();
/*      */ 
/*  833 */         if ((this.filter != null) && (!this.filter.isToExport(element)))
/*      */         {
/*      */           continue;
/*      */         }
/*  837 */         if ((element instanceof JRPrintLine))
/*      */         {
/*  839 */           exportLine((JRPrintLine)element);
/*      */         }
/*  841 */         else if ((element instanceof JRPrintRectangle))
/*      */         {
/*  843 */           exportRectangle((JRPrintRectangle)element);
/*      */         }
/*  845 */         else if ((element instanceof JRPrintEllipse))
/*      */         {
/*  847 */           exportEllipse((JRPrintEllipse)element);
/*      */         }
/*  849 */         else if ((element instanceof JRPrintImage))
/*      */         {
/*  851 */           exportImage((JRPrintImage)element);
/*      */         }
/*  853 */         else if ((element instanceof JRPrintText))
/*      */         {
/*  855 */           exportText((JRPrintText)element);
/*      */         }
/*  857 */         else if ((element instanceof JRPrintFrame))
/*      */         {
/*  859 */           exportFrame((JRPrintFrame)element);
/*      */         } else {
/*  861 */           if (!(element instanceof JRGenericPrintElement))
/*      */             continue;
/*  863 */           exportGenericElement((JRGenericPrintElement)element);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void exportLine(JRPrintLine line)
/*      */   {
/*  878 */     float lineWidth = line.getLinePen().getLineWidth().floatValue();
/*  879 */     if (lineWidth > 0.0F)
/*      */     {
/*  881 */       preparePen(this.pdfContentByte, line.getLinePen(), 0);
/*      */ 
/*  883 */       if (line.getWidth() == 1)
/*      */       {
/*  885 */         if (line.getHeight() != 1)
/*      */         {
/*  888 */           if (line.getLinePen().getLineStyleValue() == LineStyleEnum.DOUBLE)
/*      */           {
/*  890 */             this.pdfContentByte.moveTo(
/*  891 */               line.getX() + getOffsetX() + 0.5F - lineWidth / 3.0F, 
/*  892 */               this.jasperPrint.getPageHeight() - line.getY() - getOffsetY());
/*      */ 
/*  894 */             this.pdfContentByte.lineTo(
/*  895 */               line.getX() + getOffsetX() + 0.5F - lineWidth / 3.0F, 
/*  896 */               this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - line.getHeight());
/*      */ 
/*  899 */             this.pdfContentByte.stroke();
/*      */ 
/*  901 */             this.pdfContentByte.moveTo(
/*  902 */               line.getX() + getOffsetX() + 0.5F + lineWidth / 3.0F, 
/*  903 */               this.jasperPrint.getPageHeight() - line.getY() - getOffsetY());
/*      */ 
/*  905 */             this.pdfContentByte.lineTo(
/*  906 */               line.getX() + getOffsetX() + 0.5F + lineWidth / 3.0F, 
/*  907 */               this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - line.getHeight());
/*      */           }
/*      */           else
/*      */           {
/*  912 */             this.pdfContentByte.moveTo(
/*  913 */               line.getX() + getOffsetX() + 0.5F, 
/*  914 */               this.jasperPrint.getPageHeight() - line.getY() - getOffsetY());
/*      */ 
/*  916 */             this.pdfContentByte.lineTo(
/*  917 */               line.getX() + getOffsetX() + 0.5F, 
/*  918 */               this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - line.getHeight());
/*      */           }
/*      */ 
/*      */         }
/*      */ 
/*      */       }
/*  925 */       else if (line.getHeight() == 1)
/*      */       {
/*  928 */         if (line.getLinePen().getLineStyleValue() == LineStyleEnum.DOUBLE)
/*      */         {
/*  930 */           this.pdfContentByte.moveTo(
/*  931 */             line.getX() + getOffsetX(), 
/*  932 */             this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - 0.5F + lineWidth / 3.0F);
/*      */ 
/*  934 */           this.pdfContentByte.lineTo(
/*  935 */             line.getX() + getOffsetX() + line.getWidth(), 
/*  936 */             this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - 0.5F + lineWidth / 3.0F);
/*      */ 
/*  939 */           this.pdfContentByte.stroke();
/*      */ 
/*  941 */           this.pdfContentByte.moveTo(
/*  942 */             line.getX() + getOffsetX(), 
/*  943 */             this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - 0.5F - lineWidth / 3.0F);
/*      */ 
/*  945 */           this.pdfContentByte.lineTo(
/*  946 */             line.getX() + getOffsetX() + line.getWidth(), 
/*  947 */             this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - 0.5F - lineWidth / 3.0F);
/*      */         }
/*      */         else
/*      */         {
/*  952 */           this.pdfContentByte.moveTo(
/*  953 */             line.getX() + getOffsetX(), 
/*  954 */             this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - 0.5F);
/*      */ 
/*  956 */           this.pdfContentByte.lineTo(
/*  957 */             line.getX() + getOffsetX() + line.getWidth(), 
/*  958 */             this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - 0.5F);
/*      */         }
/*      */ 
/*      */       }
/*  965 */       else if (line.getDirectionValue() == LineDirectionEnum.TOP_DOWN)
/*      */       {
/*  967 */         if (line.getLinePen().getLineStyleValue() == LineStyleEnum.DOUBLE)
/*      */         {
/*  969 */           double xtrans = lineWidth / (3.0D * Math.sqrt(1.0D + Math.pow(line.getWidth(), 2.0D) / Math.pow(line.getHeight(), 2.0D)));
/*  970 */           double ytrans = lineWidth / (3.0D * Math.sqrt(1.0D + Math.pow(line.getHeight(), 2.0D) / Math.pow(line.getWidth(), 2.0D)));
/*      */ 
/*  972 */           this.pdfContentByte.moveTo(
/*  973 */             line.getX() + getOffsetX() + (float)xtrans, 
/*  974 */             this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() + (float)ytrans);
/*      */ 
/*  976 */           this.pdfContentByte.lineTo(
/*  977 */             line.getX() + getOffsetX() + line.getWidth() + (float)xtrans, 
/*  978 */             this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - line.getHeight() + (float)ytrans);
/*      */ 
/*  981 */           this.pdfContentByte.stroke();
/*      */ 
/*  983 */           this.pdfContentByte.moveTo(
/*  984 */             line.getX() + getOffsetX() - (float)xtrans, 
/*  985 */             this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - (float)ytrans);
/*      */ 
/*  987 */           this.pdfContentByte.lineTo(
/*  988 */             line.getX() + getOffsetX() + line.getWidth() - (float)xtrans, 
/*  989 */             this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - line.getHeight() - (float)ytrans);
/*      */         }
/*      */         else
/*      */         {
/*  994 */           this.pdfContentByte.moveTo(
/*  995 */             line.getX() + getOffsetX(), 
/*  996 */             this.jasperPrint.getPageHeight() - line.getY() - getOffsetY());
/*      */ 
/*  998 */           this.pdfContentByte.lineTo(
/*  999 */             line.getX() + getOffsetX() + line.getWidth(), 
/* 1000 */             this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - line.getHeight());
/*      */         }
/*      */ 
/*      */       }
/* 1006 */       else if (line.getLinePen().getLineStyleValue() == LineStyleEnum.DOUBLE)
/*      */       {
/* 1008 */         double xtrans = lineWidth / (3.0D * Math.sqrt(1.0D + Math.pow(line.getWidth(), 2.0D) / Math.pow(line.getHeight(), 2.0D)));
/* 1009 */         double ytrans = lineWidth / (3.0D * Math.sqrt(1.0D + Math.pow(line.getHeight(), 2.0D) / Math.pow(line.getWidth(), 2.0D)));
/*      */ 
/* 1011 */         this.pdfContentByte.moveTo(
/* 1012 */           line.getX() + getOffsetX() + (float)xtrans, 
/* 1013 */           this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - line.getHeight() - (float)ytrans);
/*      */ 
/* 1015 */         this.pdfContentByte.lineTo(
/* 1016 */           line.getX() + getOffsetX() + line.getWidth() + (float)xtrans, 
/* 1017 */           this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - (float)ytrans);
/*      */ 
/* 1020 */         this.pdfContentByte.stroke();
/*      */ 
/* 1022 */         this.pdfContentByte.moveTo(
/* 1023 */           line.getX() + getOffsetX() - (float)xtrans, 
/* 1024 */           this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - line.getHeight() + (float)ytrans);
/*      */ 
/* 1026 */         this.pdfContentByte.lineTo(
/* 1027 */           line.getX() + getOffsetX() + line.getWidth() - (float)xtrans, 
/* 1028 */           this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() + (float)ytrans);
/*      */       }
/*      */       else
/*      */       {
/* 1033 */         this.pdfContentByte.moveTo(
/* 1034 */           line.getX() + getOffsetX(), 
/* 1035 */           this.jasperPrint.getPageHeight() - line.getY() - getOffsetY() - line.getHeight());
/*      */ 
/* 1037 */         this.pdfContentByte.lineTo(
/* 1038 */           line.getX() + getOffsetX() + line.getWidth(), 
/* 1039 */           this.jasperPrint.getPageHeight() - line.getY() - getOffsetY());
/*      */       }
/*      */ 
/* 1046 */       this.pdfContentByte.stroke();
/*      */ 
/* 1048 */       this.pdfContentByte.setLineDash(0.0F);
/* 1049 */       this.pdfContentByte.setLineCap(2);
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void exportRectangle(JRPrintRectangle rectangle)
/*      */   {
/* 1059 */     this.pdfContentByte.setRGBColorFill(
/* 1060 */       rectangle.getBackcolor().getRed(), 
/* 1061 */       rectangle.getBackcolor().getGreen(), 
/* 1062 */       rectangle.getBackcolor().getBlue());
/*      */ 
/* 1065 */     preparePen(this.pdfContentByte, rectangle.getLinePen(), 2);
/*      */ 
/* 1067 */     float lineWidth = rectangle.getLinePen().getLineWidth().floatValue();
/* 1068 */     float lineOffset = BorderOffset.getOffset(rectangle.getLinePen());
/*      */ 
/* 1070 */     if (rectangle.getModeValue() == ModeEnum.OPAQUE)
/*      */     {
/* 1072 */       this.pdfContentByte.roundRectangle(
/* 1073 */         rectangle.getX() + getOffsetX(), 
/* 1074 */         this.jasperPrint.getPageHeight() - rectangle.getY() - getOffsetY() - rectangle.getHeight(), 
/* 1075 */         rectangle.getWidth(), 
/* 1076 */         rectangle.getHeight(), 
/* 1077 */         rectangle.getRadius());
/*      */ 
/* 1080 */       this.pdfContentByte.fill();
/*      */     }
/*      */ 
/* 1083 */     if (lineWidth > 0.0F)
/*      */     {
/* 1085 */       if (rectangle.getLinePen().getLineStyleValue() == LineStyleEnum.DOUBLE)
/*      */       {
/* 1087 */         this.pdfContentByte.roundRectangle(
/* 1088 */           rectangle.getX() + getOffsetX() - lineWidth / 3.0F, 
/* 1089 */           this.jasperPrint.getPageHeight() - rectangle.getY() - getOffsetY() - rectangle.getHeight() - lineWidth / 3.0F, 
/* 1090 */           rectangle.getWidth() + 2.0F * lineWidth / 3.0F, 
/* 1091 */           rectangle.getHeight() + 2.0F * lineWidth / 3.0F, 
/* 1092 */           rectangle.getRadius());
/*      */ 
/* 1095 */         this.pdfContentByte.stroke();
/*      */ 
/* 1097 */         this.pdfContentByte.roundRectangle(
/* 1098 */           rectangle.getX() + getOffsetX() + lineWidth / 3.0F, 
/* 1099 */           this.jasperPrint.getPageHeight() - rectangle.getY() - getOffsetY() - rectangle.getHeight() + lineWidth / 3.0F, 
/* 1100 */           rectangle.getWidth() - 2.0F * lineWidth / 3.0F, 
/* 1101 */           rectangle.getHeight() - 2.0F * lineWidth / 3.0F, 
/* 1102 */           rectangle.getRadius());
/*      */ 
/* 1105 */         this.pdfContentByte.stroke();
/*      */       }
/*      */       else
/*      */       {
/* 1109 */         this.pdfContentByte.roundRectangle(
/* 1110 */           rectangle.getX() + getOffsetX() + lineOffset, 
/* 1111 */           this.jasperPrint.getPageHeight() - rectangle.getY() - getOffsetY() - rectangle.getHeight() + lineOffset, 
/* 1112 */           rectangle.getWidth() - 2.0F * lineOffset, 
/* 1113 */           rectangle.getHeight() - 2.0F * lineOffset, 
/* 1114 */           rectangle.getRadius());
/*      */ 
/* 1117 */         this.pdfContentByte.stroke();
/*      */       }
/*      */     }
/*      */ 
/* 1121 */     this.pdfContentByte.setLineDash(0.0F);
/*      */   }
/*      */ 
/*      */   protected void exportEllipse(JRPrintEllipse ellipse)
/*      */   {
/* 1130 */     this.pdfContentByte.setRGBColorFill(
/* 1131 */       ellipse.getBackcolor().getRed(), 
/* 1132 */       ellipse.getBackcolor().getGreen(), 
/* 1133 */       ellipse.getBackcolor().getBlue());
/*      */ 
/* 1136 */     preparePen(this.pdfContentByte, ellipse.getLinePen(), 2);
/*      */ 
/* 1138 */     float lineWidth = ellipse.getLinePen().getLineWidth().floatValue();
/* 1139 */     float lineOffset = BorderOffset.getOffset(ellipse.getLinePen());
/*      */ 
/* 1141 */     if (ellipse.getModeValue() == ModeEnum.OPAQUE)
/*      */     {
/* 1143 */       this.pdfContentByte.ellipse(
/* 1144 */         ellipse.getX() + getOffsetX(), 
/* 1145 */         this.jasperPrint.getPageHeight() - ellipse.getY() - getOffsetY() - ellipse.getHeight(), 
/* 1146 */         ellipse.getX() + getOffsetX() + ellipse.getWidth(), 
/* 1147 */         this.jasperPrint.getPageHeight() - ellipse.getY() - getOffsetY());
/*      */ 
/* 1150 */       this.pdfContentByte.fill();
/*      */     }
/*      */ 
/* 1153 */     if (lineWidth > 0.0F)
/*      */     {
/* 1155 */       if (ellipse.getLinePen().getLineStyleValue() == LineStyleEnum.DOUBLE)
/*      */       {
/* 1157 */         this.pdfContentByte.ellipse(
/* 1158 */           ellipse.getX() + getOffsetX() - lineWidth / 3.0F, 
/* 1159 */           this.jasperPrint.getPageHeight() - ellipse.getY() - getOffsetY() - ellipse.getHeight() - lineWidth / 3.0F, 
/* 1160 */           ellipse.getX() + getOffsetX() + ellipse.getWidth() + lineWidth / 3.0F, 
/* 1161 */           this.jasperPrint.getPageHeight() - ellipse.getY() - getOffsetY() + lineWidth / 3.0F);
/*      */ 
/* 1164 */         this.pdfContentByte.stroke();
/*      */ 
/* 1166 */         this.pdfContentByte.ellipse(
/* 1167 */           ellipse.getX() + getOffsetX() + lineWidth / 3.0F, 
/* 1168 */           this.jasperPrint.getPageHeight() - ellipse.getY() - getOffsetY() - ellipse.getHeight() + lineWidth / 3.0F, 
/* 1169 */           ellipse.getX() + getOffsetX() + ellipse.getWidth() - lineWidth / 3.0F, 
/* 1170 */           this.jasperPrint.getPageHeight() - ellipse.getY() - getOffsetY() - lineWidth / 3.0F);
/*      */ 
/* 1173 */         this.pdfContentByte.stroke();
/*      */       }
/*      */       else
/*      */       {
/* 1177 */         this.pdfContentByte.ellipse(
/* 1178 */           ellipse.getX() + getOffsetX() + lineOffset, 
/* 1179 */           this.jasperPrint.getPageHeight() - ellipse.getY() - getOffsetY() - ellipse.getHeight() + lineOffset, 
/* 1180 */           ellipse.getX() + getOffsetX() + ellipse.getWidth() - lineOffset, 
/* 1181 */           this.jasperPrint.getPageHeight() - ellipse.getY() - getOffsetY() - lineOffset);
/*      */ 
/* 1184 */         this.pdfContentByte.stroke();
/*      */       }
/*      */     }
/*      */ 
/* 1188 */     this.pdfContentByte.setLineDash(0.0F);
/*      */   }
/*      */ 
/*      */   public void exportImage(JRPrintImage printImage)
/*      */     throws DocumentException, IOException, JRException
/*      */   {
/* 1197 */     if (printImage.getModeValue() == ModeEnum.OPAQUE)
/*      */     {
/* 1199 */       this.pdfContentByte.setRGBColorFill(
/* 1200 */         printImage.getBackcolor().getRed(), 
/* 1201 */         printImage.getBackcolor().getGreen(), 
/* 1202 */         printImage.getBackcolor().getBlue());
/*      */ 
/* 1204 */       this.pdfContentByte.rectangle(
/* 1205 */         printImage.getX() + getOffsetX(), 
/* 1206 */         this.jasperPrint.getPageHeight() - printImage.getY() - getOffsetY(), 
/* 1207 */         printImage.getWidth(), 
/* 1208 */         -printImage.getHeight());
/*      */ 
/* 1210 */       this.pdfContentByte.fill();
/*      */     }
/*      */ 
/* 1213 */     int topPadding = printImage.getLineBox().getTopPadding().intValue();
/* 1214 */     int leftPadding = printImage.getLineBox().getLeftPadding().intValue();
/* 1215 */     int bottomPadding = printImage.getLineBox().getBottomPadding().intValue();
/* 1216 */     int rightPadding = printImage.getLineBox().getRightPadding().intValue();
/*      */ 
/* 1218 */     int availableImageWidth = printImage.getWidth() - leftPadding - rightPadding;
/* 1219 */     availableImageWidth = availableImageWidth < 0 ? 0 : availableImageWidth;
/*      */ 
/* 1221 */     int availableImageHeight = printImage.getHeight() - topPadding - bottomPadding;
/* 1222 */     availableImageHeight = availableImageHeight < 0 ? 0 : availableImageHeight;
/*      */ 
/* 1224 */     Renderable renderer = printImage.getRenderable();
/*      */ 
/* 1227 */     if ((renderer != null) && 
/* 1228 */       (availableImageWidth > 0) && 
/* 1229 */       (availableImageHeight > 0))
/*      */     {
/* 1232 */       if (renderer.getTypeValue() == RenderableTypeEnum.IMAGE)
/*      */       {
/* 1236 */         renderer = RenderableUtil.getInstance(this.jasperReportsContext).getOnErrorRendererForImageData(renderer, printImage.getOnErrorTypeValue());
/*      */       }
/*      */     }
/*      */     else
/*      */     {
/* 1241 */       renderer = null;
/*      */     }
/*      */ 
/* 1244 */     if (renderer != null)
/*      */     {
/* 1246 */       int xoffset = 0;
/* 1247 */       int yoffset = 0;
/*      */ 
/* 1249 */       Chunk chunk = null;
/*      */ 
/* 1251 */       float scaledWidth = availableImageWidth;
/* 1252 */       float scaledHeight = availableImageHeight;
/*      */ 
/* 1254 */       if (renderer.getTypeValue() == RenderableTypeEnum.IMAGE)
/*      */       {
/* 1256 */         com.lowagie.text.Image image = null;
/*      */ 
/* 1258 */         float xalignFactor = getXAlignFactor(printImage);
/* 1259 */         float yalignFactor = getYAlignFactor(printImage);
/*      */ 
/* 1261 */         switch ($SWITCH_TABLE$net$sf$jasperreports$engine$type$ScaleImageEnum()[printImage.getScaleImageValue().ordinal()])
/*      */         {
/*      */         case 1:
/* 1267 */           renderer = 
/* 1268 */             RenderableUtil.getInstance(this.jasperReportsContext).getOnErrorRendererForDimension(
/* 1269 */             renderer, 
/* 1270 */             printImage.getOnErrorTypeValue());
/*      */ 
/* 1272 */           if (renderer == null)
/*      */           {
/*      */             break;
/*      */           }
/*      */ 
/* 1277 */           int normalWidth = availableImageWidth;
/* 1278 */           int normalHeight = availableImageHeight;
/*      */ 
/* 1280 */           Dimension2D dimension = renderer.getDimension(this.jasperReportsContext);
/* 1281 */           if (dimension != null)
/*      */           {
/* 1283 */             normalWidth = (int)dimension.getWidth();
/* 1284 */             normalHeight = (int)dimension.getHeight();
/*      */           }
/*      */ 
/* 1287 */           xoffset = (int)(xalignFactor * (availableImageWidth - normalWidth));
/* 1288 */           yoffset = (int)(yalignFactor * (availableImageHeight - normalHeight));
/*      */ 
/* 1290 */           int minWidth = Math.min(normalWidth, availableImageWidth);
/* 1291 */           int minHeight = Math.min(normalHeight, availableImageHeight);
/*      */ 
/* 1293 */           BufferedImage bi = 
/* 1294 */             new BufferedImage(minWidth, minHeight, 2);
/*      */ 
/* 1296 */           Graphics2D g = bi.createGraphics();
/* 1297 */           if (printImage.getModeValue() == ModeEnum.OPAQUE)
/*      */           {
/* 1299 */             g.setColor(printImage.getBackcolor());
/* 1300 */             g.fillRect(0, 0, minWidth, minHeight);
/*      */           }
/* 1302 */           renderer.render(
/* 1303 */             this.jasperReportsContext, 
/* 1304 */             g, 
/* 1305 */             new java.awt.Rectangle(
/* 1306 */             xoffset > 0 ? 0 : xoffset, 
/* 1307 */             yoffset > 0 ? 0 : yoffset, 
/* 1308 */             normalWidth, 
/* 1309 */             normalHeight));
/*      */ 
/* 1312 */           g.dispose();
/*      */ 
/* 1314 */           xoffset = xoffset < 0 ? 0 : xoffset;
/* 1315 */           yoffset = yoffset < 0 ? 0 : yoffset;
/*      */ 
/* 1320 */           image = com.lowagie.text.Image.getInstance(bi, null);
/*      */ 
/* 1322 */           break;
/*      */         case 2:
/* 1326 */           if ((printImage.isUsingCache()) && (this.loadedImagesMap.containsKey(renderer)))
/*      */           {
/* 1328 */             image = (com.lowagie.text.Image)this.loadedImagesMap.get(renderer);
/*      */           }
/*      */           else {
/*      */             JRImageRenderer tmpRenderer;
/*      */             try {
/* 1334 */               image = com.lowagie.text.Image.getInstance(renderer.getImageData(this.jasperReportsContext));
/* 1335 */               this.imageTesterPdfContentByte.addImage(image, 10.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F);
/*      */             }
/*      */             catch (Exception e)
/*      */             {
/* 1339 */               tmpRenderer = 
/* 1340 */                 JRImageRenderer.getOnErrorRendererForImage(
/* 1341 */                 this.jasperReportsContext, 
/* 1342 */                 JRImageRenderer.getInstance(renderer.getImageData(this.jasperReportsContext)), 
/* 1343 */                 printImage.getOnErrorTypeValue());
/*      */ 
/* 1345 */               if (tmpRenderer != null) break label750; 
/*      */             }
/* 1347 */             break;
/*      */ 
/* 1349 */             java.awt.Image awtImage = tmpRenderer.getImage(this.jasperReportsContext);
/* 1350 */             image = com.lowagie.text.Image.getInstance(awtImage, null);
/*      */ 
/* 1353 */             if (printImage.isUsingCache())
/*      */             {
/* 1355 */               this.loadedImagesMap.put(renderer, image);
/*      */             }
/*      */           }
/*      */ 
/* 1359 */           image.scaleAbsolute(availableImageWidth, availableImageHeight);
/* 1360 */           break;
/*      */         case 3:
/*      */         default:
/* 1365 */           label750: if ((printImage.isUsingCache()) && (this.loadedImagesMap.containsKey(renderer)))
/*      */           {
/* 1367 */             image = (com.lowagie.text.Image)this.loadedImagesMap.get(renderer);
/*      */           }
/*      */           else {
/*      */             JRImageRenderer tmpRenderer;
/*      */             try {
/* 1373 */               image = com.lowagie.text.Image.getInstance(renderer.getImageData(this.jasperReportsContext));
/* 1374 */               this.imageTesterPdfContentByte.addImage(image, 10.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F);
/*      */             }
/*      */             catch (Exception e)
/*      */             {
/* 1378 */               tmpRenderer = 
/* 1379 */                 JRImageRenderer.getOnErrorRendererForImage(
/* 1380 */                 this.jasperReportsContext, 
/* 1381 */                 JRImageRenderer.getInstance(renderer.getImageData(this.jasperReportsContext)), 
/* 1382 */                 printImage.getOnErrorTypeValue());
/*      */ 
/* 1384 */               if (tmpRenderer != null) break label925; 
/*      */             }
/* 1386 */             break;
/*      */ 
/* 1388 */             java.awt.Image awtImage = tmpRenderer.getImage(this.jasperReportsContext);
/* 1389 */             image = com.lowagie.text.Image.getInstance(awtImage, null);
/*      */ 
/* 1392 */             if (printImage.isUsingCache())
/*      */             {
/* 1394 */               this.loadedImagesMap.put(renderer, image);
/*      */             }
/*      */           }
/*      */ 
/* 1398 */           label925: image.scaleToFit(availableImageWidth, availableImageHeight);
/*      */ 
/* 1400 */           xoffset = (int)(xalignFactor * (availableImageWidth - image.plainWidth()));
/* 1401 */           yoffset = (int)(yalignFactor * (availableImageHeight - image.plainHeight()));
/*      */ 
/* 1403 */           xoffset = xoffset < 0 ? 0 : xoffset;
/* 1404 */           yoffset = yoffset < 0 ? 0 : yoffset;
/*      */         }
/*      */ 
/* 1410 */         if (image != null)
/*      */         {
/* 1412 */           chunk = new Chunk(image, 0.0F, 0.0F);
/*      */ 
/* 1414 */           scaledWidth = image.scaledWidth();
/* 1415 */           scaledHeight = image.scaledHeight();
/*      */         }
/*      */       }
/*      */       else
/*      */       {
/* 1420 */         double normalWidth = availableImageWidth;
/* 1421 */         double normalHeight = availableImageHeight;
/*      */ 
/* 1423 */         double displayWidth = availableImageWidth;
/* 1424 */         double displayHeight = availableImageHeight;
/*      */ 
/* 1426 */         double ratioX = 1.0D;
/* 1427 */         double ratioY = 1.0D;
/*      */ 
/* 1429 */         Rectangle2D clip = null;
/*      */ 
/* 1431 */         Dimension2D dimension = renderer.getDimension(this.jasperReportsContext);
/* 1432 */         if (dimension != null)
/*      */         {
/* 1434 */           normalWidth = dimension.getWidth();
/* 1435 */           normalHeight = dimension.getHeight();
/* 1436 */           displayWidth = normalWidth;
/* 1437 */           displayHeight = normalHeight;
/*      */ 
/* 1439 */           float xalignFactor = getXAlignFactor(printImage);
/* 1440 */           float yalignFactor = getYAlignFactor(printImage);
/*      */ 
/* 1442 */           switch ($SWITCH_TABLE$net$sf$jasperreports$engine$type$ScaleImageEnum()[printImage.getScaleImageValue().ordinal()])
/*      */           {
/*      */           case 1:
/* 1446 */             xoffset = (int)(xalignFactor * (availableImageWidth - normalWidth));
/* 1447 */             yoffset = (int)(yalignFactor * (availableImageHeight - normalHeight));
/* 1448 */             clip = 
/* 1449 */               new Rectangle2D.Double(
/* 1450 */               -xoffset, 
/* 1451 */               -yoffset, 
/* 1452 */               availableImageWidth, 
/* 1453 */               availableImageHeight);
/*      */ 
/* 1455 */             break;
/*      */           case 2:
/* 1459 */             ratioX = availableImageWidth / normalWidth;
/* 1460 */             ratioY = availableImageHeight / normalHeight;
/* 1461 */             normalWidth *= ratioX;
/* 1462 */             normalHeight *= ratioY;
/* 1463 */             xoffset = 0;
/* 1464 */             yoffset = 0;
/* 1465 */             break;
/*      */           case 3:
/*      */           default:
/* 1470 */             ratioX = availableImageWidth / normalWidth;
/* 1471 */             ratioY = availableImageHeight / normalHeight;
/* 1472 */             ratioX = ratioX < ratioY ? ratioX : ratioY;
/* 1473 */             ratioY = ratioX;
/* 1474 */             normalWidth *= ratioX;
/* 1475 */             normalHeight *= ratioY;
/* 1476 */             xoffset = (int)(xalignFactor * (availableImageWidth - normalWidth));
/* 1477 */             yoffset = (int)(yalignFactor * (availableImageHeight - normalHeight));
/*      */           }
/*      */ 
/*      */         }
/*      */ 
/* 1483 */         PdfTemplate template = this.pdfContentByte.createTemplate((float)displayWidth, (float)displayHeight);
/*      */ 
/* 1485 */         Graphics2D g = this.forceSvgShapes ? 
/* 1486 */           template.createGraphicsShapes((float)displayWidth, (float)displayHeight) : 
/* 1487 */           template.createGraphics(availableImageWidth, availableImageHeight, new LocalFontMapper());
/*      */ 
/* 1489 */         if (clip != null)
/*      */         {
/* 1491 */           g.setClip(clip);
/*      */         }
/*      */ 
/* 1494 */         if (printImage.getModeValue() == ModeEnum.OPAQUE)
/*      */         {
/* 1496 */           g.setColor(printImage.getBackcolor());
/* 1497 */           g.fillRect(0, 0, (int)displayWidth, (int)displayHeight);
/*      */         }
/*      */ 
/* 1500 */         Rectangle2D rectangle = new Rectangle2D.Double(0.0D, 0.0D, displayWidth, displayHeight);
/*      */ 
/* 1502 */         renderer.render(this.jasperReportsContext, g, rectangle);
/* 1503 */         g.dispose();
/*      */ 
/* 1505 */         this.pdfContentByte.saveState();
/* 1506 */         this.pdfContentByte.addTemplate(
/* 1507 */           template, 
/* 1508 */           (float)ratioX, 0.0F, 0.0F, (float)ratioY, 
/* 1509 */           printImage.getX() + getOffsetX() + xoffset, 
/* 1510 */           this.jasperPrint.getPageHeight() - 
/* 1511 */           printImage.getY() - getOffsetY() - 
/* 1512 */           (int)normalHeight - 
/* 1513 */           yoffset);
/*      */ 
/* 1515 */         this.pdfContentByte.restoreState();
/*      */ 
/* 1517 */         com.lowagie.text.Image image = getPxImage();
/* 1518 */         image.scaleAbsolute(availableImageWidth, availableImageHeight);
/* 1519 */         chunk = new Chunk(image, 0.0F, 0.0F);
/*      */       }
/*      */ 
/* 1532 */       if (chunk != null)
/*      */       {
/* 1534 */         setAnchor(chunk, printImage, printImage);
/* 1535 */         setHyperlinkInfo(chunk, printImage);
/*      */ 
/* 1539 */         ColumnText colText = new ColumnText(this.pdfContentByte);
/* 1540 */         int upperY = this.jasperPrint.getPageHeight() - printImage.getY() - topPadding - getOffsetY() - yoffset;
/* 1541 */         int lowerX = printImage.getX() + leftPadding + getOffsetX() + xoffset;
/* 1542 */         colText.setSimpleColumn(
/* 1543 */           new Phrase(chunk), 
/* 1544 */           lowerX, 
/* 1545 */           upperY - scaledHeight, 
/* 1546 */           lowerX + scaledWidth, 
/* 1547 */           upperY, 
/* 1548 */           scaledHeight, 
/* 1549 */           0);
/*      */ 
/* 1552 */         colText.go();
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1560 */     if ((printImage.getLineBox().getTopPen().getLineWidth().floatValue() <= 0.0F) && 
/* 1561 */       (printImage.getLineBox().getLeftPen().getLineWidth().floatValue() <= 0.0F) && 
/* 1562 */       (printImage.getLineBox().getBottomPen().getLineWidth().floatValue() <= 0.0F) && 
/* 1563 */       (printImage.getLineBox().getRightPen().getLineWidth().floatValue() <= 0.0F))
/*      */     {
/* 1566 */       if (printImage.getLinePen().getLineWidth().floatValue() > 0.0F)
/*      */       {
/* 1568 */         exportPen(printImage.getLinePen(), printImage);
/*      */       }
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/* 1574 */       exportBox(
/* 1575 */         printImage.getLineBox(), 
/* 1576 */         printImage);
/*      */     }
/*      */   }
/*      */ 
/*      */   private float getXAlignFactor(JRPrintImage printImage)
/*      */   {
/* 1584 */     float xalignFactor = 0.0F;
/* 1585 */     switch ($SWITCH_TABLE$net$sf$jasperreports$engine$type$HorizontalAlignEnum()[printImage.getHorizontalAlignmentValue().ordinal()])
/*      */     {
/*      */     case 3:
/* 1589 */       xalignFactor = 1.0F;
/* 1590 */       break;
/*      */     case 2:
/* 1594 */       xalignFactor = 0.5F;
/* 1595 */       break;
/*      */     case 1:
/*      */     default:
/* 1600 */       xalignFactor = 0.0F;
/*      */     }
/*      */ 
/* 1604 */     return xalignFactor;
/*      */   }
/*      */ 
/*      */   private float getYAlignFactor(JRPrintImage printImage)
/*      */   {
/* 1610 */     float yalignFactor = 0.0F;
/* 1611 */     switch ($SWITCH_TABLE$net$sf$jasperreports$engine$type$VerticalAlignEnum()[printImage.getVerticalAlignmentValue().ordinal()])
/*      */     {
/*      */     case 3:
/* 1615 */       yalignFactor = 1.0F;
/* 1616 */       break;
/*      */     case 2:
/* 1620 */       yalignFactor = 0.5F;
/* 1621 */       break;
/*      */     case 1:
/*      */     default:
/* 1626 */       yalignFactor = 0.0F;
/*      */     }
/*      */ 
/* 1630 */     return yalignFactor;
/*      */   }
/*      */ 
/*      */   protected void setHyperlinkInfo(Chunk chunk, JRPrintHyperlink link)
/*      */   {
/* 1639 */     if (link != null)
/*      */     {
/* 1641 */       switch ($SWITCH_TABLE$net$sf$jasperreports$engine$type$HyperlinkTypeEnum()[link.getHyperlinkTypeValue().ordinal()])
/*      */       {
/*      */       case 3:
/* 1645 */         if (link.getHyperlinkReference() == null)
/*      */           break;
/* 1647 */         switch ($SWITCH_TABLE$net$sf$jasperreports$engine$type$HyperlinkTargetEnum()[link.getHyperlinkTargetValue().ordinal()])
/*      */         {
/*      */         case 3:
/* 1651 */           chunk.setAction(
/* 1652 */             PdfAction.javaScript(
/* 1653 */             "if (app.viewerVersion < 7){this.getURL(\"" + 
/* 1654 */             link.getHyperlinkReference() + "\");}" + 
/* 1655 */             "else {app.launchURL(\"" + link.getHyperlinkReference() + "\", true);};", 
/* 1656 */             this.pdfWriter));
/*      */ 
/* 1659 */           break;
/*      */         case 2:
/*      */         default:
/* 1664 */           chunk.setAnchor(link.getHyperlinkReference());
/*      */         }
/*      */ 
/* 1669 */         break;
/*      */       case 4:
/* 1673 */         if (link.getHyperlinkAnchor() == null)
/*      */           break;
/* 1675 */         chunk.setLocalGoto(link.getHyperlinkAnchor());
/*      */ 
/* 1677 */         break;
/*      */       case 5:
/* 1681 */         if (link.getHyperlinkPage() == null)
/*      */           break;
/* 1683 */         chunk.setLocalGoto("JR_PAGE_ANCHOR_" + this.reportIndex + "_" + link.getHyperlinkPage().toString());
/*      */ 
/* 1685 */         break;
/*      */       case 6:
/* 1690 */         if ((link.getHyperlinkReference() == null) || 
/* 1691 */           (link.getHyperlinkAnchor() == null)) {
/*      */           break;
/*      */         }
/* 1694 */         chunk.setRemoteGoto(
/* 1695 */           link.getHyperlinkReference(), 
/* 1696 */           link.getHyperlinkAnchor());
/*      */ 
/* 1699 */         break;
/*      */       case 7:
/* 1704 */         if ((link.getHyperlinkReference() == null) || 
/* 1705 */           (link.getHyperlinkPage() == null)) {
/*      */           break;
/*      */         }
/* 1708 */         chunk.setRemoteGoto(
/* 1709 */           link.getHyperlinkReference(), 
/* 1710 */           link.getHyperlinkPage().intValue());
/*      */ 
/* 1713 */         break;
/*      */       case 8:
/* 1717 */         if (this.hyperlinkProducerFactory == null)
/*      */           break;
/* 1719 */         String hyperlink = this.hyperlinkProducerFactory.produceHyperlink(link);
/* 1720 */         if (hyperlink == null)
/*      */           break;
/* 1722 */         switch ($SWITCH_TABLE$net$sf$jasperreports$engine$type$HyperlinkTargetEnum()[link.getHyperlinkTargetValue().ordinal()])
/*      */         {
/*      */         case 3:
/* 1726 */           chunk.setAction(
/* 1727 */             PdfAction.javaScript(
/* 1728 */             "if (app.viewerVersion < 7){this.getURL(\"" + 
/* 1729 */             hyperlink + "\");}" + 
/* 1730 */             "else {app.launchURL(\"" + hyperlink + "\", true);};", 
/* 1731 */             this.pdfWriter));
/*      */ 
/* 1734 */           break;
/*      */         case 2:
/*      */         default:
/* 1739 */           chunk.setAnchor(hyperlink);
/*      */         }
/*      */       case 2:
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   protected Phrase getPhrase(AttributedString as, String text, JRPrintText textElement)
/*      */   {
/* 1761 */     Phrase phrase = new Phrase();
/* 1762 */     int runLimit = 0;
/*      */ 
/* 1764 */     AttributedCharacterIterator iterator = as.getIterator();
/* 1765 */     Locale locale = getTextLocale(textElement);
/*      */ 
/* 1767 */     boolean firstChunk = true;
/* 1768 */     while ((runLimit < text.length()) && ((runLimit = iterator.getRunLimit()) <= text.length()))
/*      */     {
/* 1770 */       Map attributes = iterator.getAttributes();
/* 1771 */       Chunk chunk = getChunk(attributes, text.substring(iterator.getIndex(), runLimit), locale);
/*      */ 
/* 1773 */       if (firstChunk)
/*      */       {
/* 1776 */         setAnchor(chunk, textElement, textElement);
/*      */       }
/*      */ 
/* 1779 */       JRPrintHyperlink hyperlink = textElement;
/* 1780 */       if (hyperlink.getHyperlinkTypeValue() == HyperlinkTypeEnum.NONE)
/*      */       {
/* 1782 */         hyperlink = (JRPrintHyperlink)attributes.get(JRTextAttribute.HYPERLINK);
/*      */       }
/*      */ 
/* 1785 */       setHyperlinkInfo(chunk, hyperlink);
/* 1786 */       phrase.add(chunk);
/*      */ 
/* 1788 */       iterator.setIndex(runLimit);
/* 1789 */       firstChunk = false;
/*      */     }
/*      */ 
/* 1792 */     return phrase;
/*      */   }
/*      */ 
/*      */   protected Chunk getChunk(Map<AttributedCharacterIterator.Attribute, Object> attributes, String text, Locale locale)
/*      */   {
/* 1802 */     com.lowagie.text.Font font = getFont(attributes, locale, false);
/*      */ 
/* 1804 */     Chunk chunk = new Chunk(text, font);
/*      */ 
/* 1806 */     if (hasUnderline(attributes))
/*      */     {
/* 1809 */       chunk.setUnderline(null, 0.0F, 0.05555556F, 0.0F, -0.08333334F, 0);
/*      */     }
/*      */ 
/* 1812 */     if (hasStrikethrough(attributes))
/*      */     {
/* 1817 */       chunk.setUnderline(null, 0.0F, 0.05555556F, 0.0F, 0.3333333F, 0);
/*      */     }
/*      */ 
/* 1820 */     Color backcolor = (Color)attributes.get(TextAttribute.BACKGROUND);
/* 1821 */     if (backcolor != null)
/*      */     {
/* 1823 */       chunk.setBackground(backcolor);
/*      */     }
/*      */ 
/* 1826 */     Object script = attributes.get(TextAttribute.SUPERSCRIPT);
/* 1827 */     if (script != null)
/*      */     {
/* 1829 */       if (TextAttribute.SUPERSCRIPT_SUPER.equals(script))
/*      */       {
/* 1831 */         chunk.setTextRise(font.getCalculatedSize() / 2.0F);
/*      */       }
/* 1833 */       else if (TextAttribute.SUPERSCRIPT_SUB.equals(script))
/*      */       {
/* 1835 */         chunk.setTextRise(-font.getCalculatedSize() / 2.0F);
/*      */       }
/*      */     }
/*      */ 
/* 1839 */     if (this.splitCharacter != null)
/*      */     {
/* 1842 */       chunk.setSplitCharacter(this.splitCharacter);
/*      */     }
/*      */ 
/* 1845 */     return chunk;
/*      */   }
/*      */ 
/*      */   protected boolean hasUnderline(Map<AttributedCharacterIterator.Attribute, Object> textAttributes)
/*      */   {
/* 1850 */     Integer underline = (Integer)textAttributes.get(TextAttribute.UNDERLINE);
/* 1851 */     return TextAttribute.UNDERLINE_ON.equals(underline);
/*      */   }
/*      */ 
/*      */   protected boolean hasStrikethrough(Map<AttributedCharacterIterator.Attribute, Object> textAttributes)
/*      */   {
/* 1856 */     Boolean strike = (Boolean)textAttributes.get(TextAttribute.STRIKETHROUGH);
/* 1857 */     return TextAttribute.STRIKETHROUGH_ON.equals(strike);
/*      */   }
/*      */ 
/*      */   protected com.lowagie.text.Font getFont(Map<AttributedCharacterIterator.Attribute, Object> attributes, Locale locale, boolean setFontLines)
/*      */   {
/* 1872 */     JRFont jrFont = new JRBaseFont(attributes);
/*      */ 
/* 1874 */     Exception initialException = null;
/*      */ 
/* 1876 */     Color forecolor = (Color)attributes.get(TextAttribute.FOREGROUND);
/*      */ 
/* 1879 */     float fontSizeScale = 1.0F;
/* 1880 */     Integer scriptStyle = (Integer)attributes.get(TextAttribute.SUPERSCRIPT);
/* 1881 */     if ((scriptStyle != null) && (
/* 1882 */       (TextAttribute.SUPERSCRIPT_SUB.equals(scriptStyle)) || 
/* 1883 */       (TextAttribute.SUPERSCRIPT_SUPER.equals(scriptStyle))))
/*      */     {
/* 1885 */       fontSizeScale = 0.6666667F;
/*      */     }
/*      */ 
/* 1888 */     com.lowagie.text.Font font = null;
/* 1889 */     PdfFont pdfFont = null;
/* 1890 */     FontKey key = new FontKey(jrFont.getFontName(), jrFont.isBold(), jrFont.isItalic());
/*      */ 
/* 1892 */     if ((this.fontMap != null) && (this.fontMap.containsKey(key)))
/*      */     {
/* 1894 */       pdfFont = (PdfFont)this.pdfFontMap.get(key);
/*      */     }
/*      */     else
/*      */     {
/* 1898 */       FontInfo fontInfo = FontUtil.getInstance(this.jasperReportsContext).getFontInfo(jrFont.getFontName(), locale);
/* 1899 */       if (fontInfo == null)
/*      */       {
/* 1902 */         pdfFont = new PdfFont(jrFont.getPdfFontName(), jrFont.getPdfEncoding(), jrFont.isPdfEmbedded());
/*      */       }
/*      */       else
/*      */       {
/* 1907 */         FontFamily family = fontInfo.getFontFamily();
/* 1908 */         FontFace face = fontInfo.getFontFace();
/* 1909 */         int faceStyle = 0;
/*      */ 
/* 1911 */         if (face == null)
/*      */         {
/* 1914 */           if ((jrFont.isBold()) && (jrFont.isItalic()))
/*      */           {
/* 1916 */             face = family.getBoldItalicFace();
/* 1917 */             faceStyle = 3;
/*      */           }
/*      */ 
/* 1920 */           if ((face == null) && (jrFont.isBold()))
/*      */           {
/* 1922 */             face = family.getBoldFace();
/* 1923 */             faceStyle = 1;
/*      */           }
/*      */ 
/* 1926 */           if ((face == null) && (jrFont.isItalic()))
/*      */           {
/* 1928 */             face = family.getItalicFace();
/* 1929 */             faceStyle = 2;
/*      */           }
/*      */ 
/* 1932 */           if (face == null)
/*      */           {
/* 1934 */             face = family.getNormalFace();
/* 1935 */             faceStyle = 0;
/*      */           }
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/* 1946 */           faceStyle = fontInfo.getStyle();
/*      */         }
/*      */ 
/* 1949 */         String pdfFontName = null;
/* 1950 */         int pdfFontStyle = 0;
/* 1951 */         if ((jrFont.isBold()) && (jrFont.isItalic()))
/*      */         {
/* 1953 */           pdfFontName = family.getBoldItalicPdfFont();
/* 1954 */           pdfFontStyle = 3;
/*      */         }
/*      */ 
/* 1957 */         if ((pdfFontName == null) && (jrFont.isBold()))
/*      */         {
/* 1959 */           pdfFontName = family.getBoldPdfFont();
/* 1960 */           pdfFontStyle = 1;
/*      */         }
/*      */ 
/* 1963 */         if ((pdfFontName == null) && (jrFont.isItalic()))
/*      */         {
/* 1965 */           pdfFontName = family.getItalicPdfFont();
/* 1966 */           pdfFontStyle = 2;
/*      */         }
/*      */ 
/* 1969 */         if (pdfFontName == null)
/*      */         {
/* 1971 */           pdfFontName = family.getNormalPdfFont();
/* 1972 */           pdfFontStyle = 0;
/*      */         }
/*      */ 
/* 1975 */         if (pdfFontName == null)
/*      */         {
/* 1978 */           pdfFontName = (face == null) || (face.getFile() == null) ? jrFont.getPdfFontName() : face.getFile();
/* 1979 */           pdfFontStyle = faceStyle;
/*      */         }
/*      */ 
/* 1988 */         pdfFont = 
/* 1989 */           new PdfFont(
/* 1990 */           pdfFontName, 
/* 1991 */           family.getPdfEncoding() == null ? jrFont.getPdfEncoding() : family.getPdfEncoding(), 
/* 1992 */           family.isPdfEmbedded() == null ? jrFont.isPdfEmbedded() : family.isPdfEmbedded().booleanValue(), 
/* 1993 */           (jrFont.isBold()) && ((pdfFontStyle & 0x1) == 0), 
/* 1994 */           (jrFont.isItalic()) && ((pdfFontStyle & 0x2) == 0));
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1999 */     int pdfFontStyle = (pdfFont.isPdfSimulatedBold() ? 1 : 0) | (
/* 2000 */       pdfFont.isPdfSimulatedItalic() ? 2 : 0);
/* 2001 */     if (setFontLines)
/*      */     {
/* 2004 */       pdfFontStyle = pdfFontStyle | ((jrFont.isUnderline() ? 4 : 0) | (
/* 2004 */         jrFont.isStrikeThrough() ? 8 : 0));
/*      */     }
/*      */ 
/*      */     try
/*      */     {
/* 2009 */       font = FontFactory.getFont(
/* 2010 */         pdfFont.getPdfFontName(), 
/* 2011 */         pdfFont.getPdfEncoding(), 
/* 2012 */         pdfFont.isPdfEmbedded(), 
/* 2013 */         jrFont.getFontSize() * fontSizeScale, 
/* 2014 */         pdfFontStyle, 
/* 2015 */         forecolor);
/*      */ 
/* 2019 */       if ((font.getBaseFont() == null) && (font.family() == -1))
/*      */       {
/* 2021 */         font = null;
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 2026 */       initialException = e;
/*      */     }
/*      */ 
/* 2029 */     if (font == null)
/*      */     {
/* 2031 */       byte[] bytes = null;
/*      */       try
/*      */       {
/* 2035 */         bytes = RepositoryUtil.getInstance(this.jasperReportsContext).getBytesFromLocation(pdfFont.getPdfFontName());
/*      */       }
/*      */       catch (JRException e)
/*      */       {
/* 2039 */         throw 
/* 2040 */           new JRRuntimeException(
/* 2041 */           "Could not load the following font : \npdfFontName   : " + 
/* 2042 */           pdfFont.getPdfFontName() + 
/* 2043 */           "\npdfEncoding   : " + pdfFont.getPdfEncoding() + 
/* 2044 */           "\nisPdfEmbedded : " + pdfFont.isPdfEmbedded(), 
/* 2045 */           initialException);
/*      */       }
/*      */ 
/* 2049 */       BaseFont baseFont = null;
/*      */       try
/*      */       {
/* 2053 */         baseFont = 
/* 2054 */           BaseFont.createFont(
/* 2055 */           pdfFont.getPdfFontName(), 
/* 2056 */           pdfFont.getPdfEncoding(), 
/* 2057 */           pdfFont.isPdfEmbedded(), 
/* 2058 */           true, 
/* 2059 */           bytes, 
/* 2060 */           null);
/*      */       }
/*      */       catch (DocumentException e)
/*      */       {
/* 2065 */         throw new JRRuntimeException(e);
/*      */       }
/*      */       catch (IOException e)
/*      */       {
/* 2069 */         throw new JRRuntimeException(e);
/*      */       }
/*      */ 
/* 2072 */       font = 
/* 2073 */         new com.lowagie.text.Font(
/* 2074 */         baseFont, 
/* 2075 */         jrFont.getFontSize() * fontSizeScale, 
/* 2076 */         pdfFontStyle, 
/* 2077 */         forecolor);
/*      */     }
/*      */ 
/* 2081 */     return font;
/*      */   }
/*      */ 
/*      */   public void exportText(JRPrintText text)
/*      */     throws DocumentException
/*      */   {
/* 2090 */     AbstractPdfTextRenderer textRenderer = 
/* 2091 */       text.getLeadingOffset() == 0.0F ? 
/* 2092 */       new PdfTextRenderer(
/* 2093 */       this.jasperReportsContext, 
/* 2094 */       getPropertiesUtil().getBooleanProperty("net.sf.jasperreports.awt.ignore.missing.font")) : 
/* 2096 */       new SimplePdfTextRenderer(
/* 2097 */       this.jasperReportsContext, 
/* 2098 */       getPropertiesUtil().getBooleanProperty("net.sf.jasperreports.awt.ignore.missing.font"));
/*      */ 
/* 2101 */     textRenderer.initialize(this, this.pdfContentByte, text, getOffsetX(), getOffsetY());
/*      */ 
/* 2103 */     JRStyledText styledText = textRenderer.getStyledText();
/*      */ 
/* 2105 */     if (styledText == null)
/*      */     {
/* 2107 */       return;
/*      */     }
/*      */ 
/* 2110 */     double angle = 0.0D;
/*      */ 
/* 2112 */     switch ($SWITCH_TABLE$net$sf$jasperreports$engine$type$RotationEnum()[text.getRotationValue().ordinal()])
/*      */     {
/*      */     case 2:
/* 2116 */       angle = 1.570796326794897D;
/* 2117 */       break;
/*      */     case 3:
/* 2121 */       angle = -1.570796326794897D;
/* 2122 */       break;
/*      */     case 4:
/* 2126 */       angle = 3.141592653589793D;
/*      */     case 1:
/*      */     }
/*      */ 
/* 2135 */     AffineTransform atrans = new AffineTransform();
/* 2136 */     atrans.rotate(angle, textRenderer.getX(), this.jasperPrint.getPageHeight() - textRenderer.getY());
/* 2137 */     this.pdfContentByte.transform(atrans);
/*      */ 
/* 2139 */     if (text.getModeValue() == ModeEnum.OPAQUE)
/*      */     {
/* 2141 */       Color backcolor = text.getBackcolor();
/* 2142 */       this.pdfContentByte.setRGBColorFill(
/* 2143 */         backcolor.getRed(), 
/* 2144 */         backcolor.getGreen(), 
/* 2145 */         backcolor.getBlue());
/*      */ 
/* 2147 */       this.pdfContentByte.rectangle(
/* 2148 */         textRenderer.getX(), 
/* 2149 */         this.jasperPrint.getPageHeight() - textRenderer.getY(), 
/* 2150 */         textRenderer.getWidth(), 
/* 2151 */         -textRenderer.getHeight());
/*      */ 
/* 2153 */       this.pdfContentByte.fill();
/*      */     }
/*      */ 
/* 2156 */     if (styledText.length() > 0)
/*      */     {
/* 2161 */       textRenderer.render();
/*      */     }
/*      */ 
/* 2166 */     atrans = new AffineTransform();
/* 2167 */     atrans.rotate(-angle, textRenderer.getX(), this.jasperPrint.getPageHeight() - textRenderer.getY());
/* 2168 */     this.pdfContentByte.transform(atrans);
/*      */ 
/* 2171 */     exportBox(
/* 2172 */       text.getLineBox(), 
/* 2173 */       text);
/*      */   }
/*      */ 
/*      */   protected void exportBox(JRLineBox box, JRPrintElement element)
/*      */   {
/* 2183 */     exportTopPen(box.getTopPen(), box.getLeftPen(), box.getRightPen(), element);
/* 2184 */     exportLeftPen(box.getTopPen(), box.getLeftPen(), box.getBottomPen(), element);
/* 2185 */     exportBottomPen(box.getLeftPen(), box.getBottomPen(), box.getRightPen(), element);
/* 2186 */     exportRightPen(box.getTopPen(), box.getBottomPen(), box.getRightPen(), element);
/*      */ 
/* 2188 */     this.pdfContentByte.setLineDash(0.0F);
/* 2189 */     this.pdfContentByte.setLineCap(2);
/*      */   }
/*      */ 
/*      */   protected void exportPen(JRPen pen, JRPrintElement element)
/*      */   {
/* 2198 */     exportTopPen(pen, pen, pen, element);
/* 2199 */     exportLeftPen(pen, pen, pen, element);
/* 2200 */     exportBottomPen(pen, pen, pen, element);
/* 2201 */     exportRightPen(pen, pen, pen, element);
/*      */ 
/* 2203 */     this.pdfContentByte.setLineDash(0.0F);
/* 2204 */     this.pdfContentByte.setLineCap(2);
/*      */   }
/*      */ 
/*      */   protected void exportTopPen(JRPen topPen, JRPen leftPen, JRPen rightPen, JRPrintElement element)
/*      */   {
/* 2217 */     if (topPen.getLineWidth().floatValue() > 0.0F)
/*      */     {
/* 2219 */       float leftOffset = leftPen.getLineWidth().floatValue() / 2.0F - BorderOffset.getOffset(leftPen);
/* 2220 */       float rightOffset = rightPen.getLineWidth().floatValue() / 2.0F - BorderOffset.getOffset(rightPen);
/*      */ 
/* 2222 */       preparePen(this.pdfContentByte, topPen, 0);
/*      */ 
/* 2224 */       if (topPen.getLineStyleValue() == LineStyleEnum.DOUBLE)
/*      */       {
/* 2226 */         float topOffset = topPen.getLineWidth().floatValue();
/*      */ 
/* 2228 */         this.pdfContentByte.moveTo(
/* 2229 */           element.getX() + getOffsetX() - leftOffset, 
/* 2230 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() + topOffset / 3.0F);
/*      */ 
/* 2232 */         this.pdfContentByte.lineTo(
/* 2233 */           element.getX() + getOffsetX() + element.getWidth() + rightOffset, 
/* 2234 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() + topOffset / 3.0F);
/*      */ 
/* 2236 */         this.pdfContentByte.stroke();
/*      */ 
/* 2238 */         this.pdfContentByte.moveTo(
/* 2239 */           element.getX() + getOffsetX() + leftOffset / 3.0F, 
/* 2240 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - topOffset / 3.0F);
/*      */ 
/* 2242 */         this.pdfContentByte.lineTo(
/* 2243 */           element.getX() + getOffsetX() + element.getWidth() - rightOffset / 3.0F, 
/* 2244 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - topOffset / 3.0F);
/*      */ 
/* 2246 */         this.pdfContentByte.stroke();
/*      */       }
/*      */       else
/*      */       {
/* 2250 */         float topOffset = BorderOffset.getOffset(topPen);
/* 2251 */         this.pdfContentByte.moveTo(
/* 2252 */           element.getX() + getOffsetX() - leftOffset, 
/* 2253 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - topOffset);
/*      */ 
/* 2255 */         this.pdfContentByte.lineTo(
/* 2256 */           element.getX() + getOffsetX() + element.getWidth() + rightOffset, 
/* 2257 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - topOffset);
/*      */ 
/* 2259 */         this.pdfContentByte.stroke();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void exportLeftPen(JRPen topPen, JRPen leftPen, JRPen bottomPen, JRPrintElement element)
/*      */   {
/* 2270 */     if (leftPen.getLineWidth().floatValue() > 0.0F)
/*      */     {
/* 2272 */       float topOffset = topPen.getLineWidth().floatValue() / 2.0F - BorderOffset.getOffset(topPen);
/* 2273 */       float bottomOffset = bottomPen.getLineWidth().floatValue() / 2.0F - BorderOffset.getOffset(bottomPen);
/*      */ 
/* 2275 */       preparePen(this.pdfContentByte, leftPen, 0);
/*      */ 
/* 2277 */       if (leftPen.getLineStyleValue() == LineStyleEnum.DOUBLE)
/*      */       {
/* 2279 */         float leftOffset = leftPen.getLineWidth().floatValue();
/*      */ 
/* 2281 */         this.pdfContentByte.moveTo(
/* 2282 */           element.getX() + getOffsetX() - leftOffset / 3.0F, 
/* 2283 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() + topOffset);
/*      */ 
/* 2285 */         this.pdfContentByte.lineTo(
/* 2286 */           element.getX() + getOffsetX() - leftOffset / 3.0F, 
/* 2287 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - element.getHeight() - bottomOffset);
/*      */ 
/* 2289 */         this.pdfContentByte.stroke();
/*      */ 
/* 2291 */         this.pdfContentByte.moveTo(
/* 2292 */           element.getX() + getOffsetX() + leftOffset / 3.0F, 
/* 2293 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - topOffset / 3.0F);
/*      */ 
/* 2295 */         this.pdfContentByte.lineTo(
/* 2296 */           element.getX() + getOffsetX() + leftOffset / 3.0F, 
/* 2297 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - element.getHeight() + bottomOffset / 3.0F);
/*      */ 
/* 2299 */         this.pdfContentByte.stroke();
/*      */       }
/*      */       else
/*      */       {
/* 2303 */         float leftOffset = BorderOffset.getOffset(leftPen);
/* 2304 */         this.pdfContentByte.moveTo(
/* 2305 */           element.getX() + getOffsetX() + leftOffset, 
/* 2306 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() + topOffset);
/*      */ 
/* 2308 */         this.pdfContentByte.lineTo(
/* 2309 */           element.getX() + getOffsetX() + leftOffset, 
/* 2310 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - element.getHeight() - bottomOffset);
/*      */ 
/* 2312 */         this.pdfContentByte.stroke();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void exportBottomPen(JRPen leftPen, JRPen bottomPen, JRPen rightPen, JRPrintElement element)
/*      */   {
/* 2323 */     if (bottomPen.getLineWidth().floatValue() > 0.0F)
/*      */     {
/* 2325 */       float leftOffset = leftPen.getLineWidth().floatValue() / 2.0F - BorderOffset.getOffset(leftPen);
/* 2326 */       float rightOffset = rightPen.getLineWidth().floatValue() / 2.0F - BorderOffset.getOffset(rightPen);
/*      */ 
/* 2328 */       preparePen(this.pdfContentByte, bottomPen, 0);
/*      */ 
/* 2330 */       if (bottomPen.getLineStyleValue() == LineStyleEnum.DOUBLE)
/*      */       {
/* 2332 */         float bottomOffset = bottomPen.getLineWidth().floatValue();
/*      */ 
/* 2334 */         this.pdfContentByte.moveTo(
/* 2335 */           element.getX() + getOffsetX() - leftOffset, 
/* 2336 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - element.getHeight() - bottomOffset / 3.0F);
/*      */ 
/* 2338 */         this.pdfContentByte.lineTo(
/* 2339 */           element.getX() + getOffsetX() + element.getWidth() + rightOffset, 
/* 2340 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - element.getHeight() - bottomOffset / 3.0F);
/*      */ 
/* 2342 */         this.pdfContentByte.stroke();
/*      */ 
/* 2344 */         this.pdfContentByte.moveTo(
/* 2345 */           element.getX() + getOffsetX() + leftOffset / 3.0F, 
/* 2346 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - element.getHeight() + bottomOffset / 3.0F);
/*      */ 
/* 2348 */         this.pdfContentByte.lineTo(
/* 2349 */           element.getX() + getOffsetX() + element.getWidth() - rightOffset / 3.0F, 
/* 2350 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - element.getHeight() + bottomOffset / 3.0F);
/*      */ 
/* 2352 */         this.pdfContentByte.stroke();
/*      */       }
/*      */       else
/*      */       {
/* 2356 */         float bottomOffset = BorderOffset.getOffset(bottomPen);
/* 2357 */         this.pdfContentByte.moveTo(
/* 2358 */           element.getX() + getOffsetX() - leftOffset, 
/* 2359 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - element.getHeight() + bottomOffset);
/*      */ 
/* 2361 */         this.pdfContentByte.lineTo(
/* 2362 */           element.getX() + getOffsetX() + element.getWidth() + rightOffset, 
/* 2363 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - element.getHeight() + bottomOffset);
/*      */ 
/* 2365 */         this.pdfContentByte.stroke();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void exportRightPen(JRPen topPen, JRPen bottomPen, JRPen rightPen, JRPrintElement element)
/*      */   {
/* 2376 */     if (rightPen.getLineWidth().floatValue() > 0.0F)
/*      */     {
/* 2378 */       float topOffset = topPen.getLineWidth().floatValue() / 2.0F - BorderOffset.getOffset(topPen);
/* 2379 */       float bottomOffset = bottomPen.getLineWidth().floatValue() / 2.0F - BorderOffset.getOffset(bottomPen);
/*      */ 
/* 2381 */       preparePen(this.pdfContentByte, rightPen, 0);
/*      */ 
/* 2383 */       if (rightPen.getLineStyleValue() == LineStyleEnum.DOUBLE)
/*      */       {
/* 2385 */         float rightOffset = rightPen.getLineWidth().floatValue();
/*      */ 
/* 2387 */         this.pdfContentByte.moveTo(
/* 2388 */           element.getX() + getOffsetX() + element.getWidth() + rightOffset / 3.0F, 
/* 2389 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() + topOffset);
/*      */ 
/* 2391 */         this.pdfContentByte.lineTo(
/* 2392 */           element.getX() + getOffsetX() + element.getWidth() + rightOffset / 3.0F, 
/* 2393 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - element.getHeight() - bottomOffset);
/*      */ 
/* 2395 */         this.pdfContentByte.stroke();
/*      */ 
/* 2397 */         this.pdfContentByte.moveTo(
/* 2398 */           element.getX() + getOffsetX() + element.getWidth() - rightOffset / 3.0F, 
/* 2399 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - topOffset / 3.0F);
/*      */ 
/* 2401 */         this.pdfContentByte.lineTo(
/* 2402 */           element.getX() + getOffsetX() + element.getWidth() - rightOffset / 3.0F, 
/* 2403 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - element.getHeight() + bottomOffset / 3.0F);
/*      */ 
/* 2405 */         this.pdfContentByte.stroke();
/*      */       }
/*      */       else
/*      */       {
/* 2409 */         float rightOffset = BorderOffset.getOffset(rightPen);
/* 2410 */         this.pdfContentByte.moveTo(
/* 2411 */           element.getX() + getOffsetX() + element.getWidth() - rightOffset, 
/* 2412 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() + topOffset);
/*      */ 
/* 2414 */         this.pdfContentByte.lineTo(
/* 2415 */           element.getX() + getOffsetX() + element.getWidth() - rightOffset, 
/* 2416 */           this.jasperPrint.getPageHeight() - element.getY() - getOffsetY() - element.getHeight() - bottomOffset);
/*      */ 
/* 2418 */         this.pdfContentByte.stroke();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   private static void preparePen(PdfContentByte pdfContentByte, JRPen pen, int lineCap)
/*      */   {
/* 2429 */     float lineWidth = pen.getLineWidth().floatValue();
/*      */ 
/* 2431 */     if (lineWidth <= 0.0F)
/*      */     {
/* 2433 */       return;
/*      */     }
/*      */ 
/* 2436 */     pdfContentByte.setLineWidth(lineWidth);
/* 2437 */     pdfContentByte.setLineCap(lineCap);
/*      */ 
/* 2439 */     Color color = pen.getLineColor();
/* 2440 */     pdfContentByte.setRGBColorStroke(
/* 2441 */       color.getRed(), 
/* 2442 */       color.getGreen(), 
/* 2443 */       color.getBlue());
/*      */ 
/* 2446 */     switch ($SWITCH_TABLE$net$sf$jasperreports$engine$type$LineStyleEnum()[pen.getLineStyleValue().ordinal()])
/*      */     {
/*      */     case 4:
/* 2450 */       pdfContentByte.setLineWidth(lineWidth / 3.0F);
/* 2451 */       pdfContentByte.setLineDash(0.0F);
/* 2452 */       break;
/*      */     case 3:
/* 2456 */       switch (lineCap)
/*      */       {
/*      */       case 0:
/* 2460 */         pdfContentByte.setLineDash(lineWidth, lineWidth, 0.0F);
/* 2461 */         break;
/*      */       case 2:
/* 2465 */         pdfContentByte.setLineDash(0.0F, 2.0F * lineWidth, 0.0F);
/*      */       case 1:
/*      */       }
/*      */ 
/* 2469 */       break;
/*      */     case 2:
/* 2473 */       switch (lineCap)
/*      */       {
/*      */       case 0:
/* 2477 */         pdfContentByte.setLineDash(5.0F * lineWidth, 3.0F * lineWidth, 0.0F);
/* 2478 */         break;
/*      */       case 2:
/* 2482 */         pdfContentByte.setLineDash(4.0F * lineWidth, 4.0F * lineWidth, 0.0F);
/*      */       case 1:
/*      */       }
/*      */ 
/* 2486 */       break;
/*      */     case 1:
/*      */     default:
/* 2491 */       pdfContentByte.setLineDash(0.0F);
/*      */     }
/*      */   }
/*      */ 
/*      */   protected static synchronized void registerFonts()
/*      */   {
/* 2500 */     if (!fontsRegistered)
/*      */     {
/* 2502 */       List fontFiles = JRPropertiesUtil.getInstance(DefaultJasperReportsContext.getInstance()).getProperties("net.sf.jasperreports.export.pdf.font.");
/* 2503 */       if (!fontFiles.isEmpty())
/*      */       {
/* 2505 */         for (Iterator i = fontFiles.iterator(); i.hasNext(); )
/*      */         {
/* 2507 */           JRPropertiesUtil.PropertySuffix font = (JRPropertiesUtil.PropertySuffix)i.next();
/* 2508 */           String file = font.getValue();
/* 2509 */           if (file.toLowerCase().endsWith(".ttc"))
/*      */           {
/* 2511 */             FontFactory.register(file);
/*      */           }
/*      */           else
/*      */           {
/* 2515 */             String alias = font.getSuffix();
/* 2516 */             FontFactory.register(file, alias);
/*      */           }
/*      */         }
/*      */       }
/*      */ 
/* 2521 */       List fontDirs = JRPropertiesUtil.getInstance(DefaultJasperReportsContext.getInstance()).getProperties("net.sf.jasperreports.export.pdf.fontdir.");
/* 2522 */       if (!fontDirs.isEmpty())
/*      */       {
/* 2524 */         for (Iterator i = fontDirs.iterator(); i.hasNext(); )
/*      */         {
/* 2526 */           JRPropertiesUtil.PropertySuffix dir = (JRPropertiesUtil.PropertySuffix)i.next();
/* 2527 */           FontFactory.registerDirectory(dir.getValue());
/*      */         }
/*      */       }
/*      */ 
/* 2531 */       fontsRegistered = true;
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void initBookmarks()
/*      */   {
/* 2587 */     this.bookmarkStack = new BookmarkStack();
/*      */ 
/* 2589 */     int rootLevel = (this.isModeBatch) && (this.isCreatingBatchModeBookmarks) ? -1 : 0;
/* 2590 */     Bookmark bookmark = new Bookmark(this.pdfContentByte.getRootOutline(), rootLevel);
/* 2591 */     this.bookmarkStack.push(bookmark);
/*      */   }
/*      */ 
/*      */   protected void addBookmark(int level, String title, int x, int y)
/*      */   {
/* 2597 */     Bookmark parent = this.bookmarkStack.peek();
/*      */ 
/* 2599 */     while (parent.level >= level)
/*      */     {
/* 2601 */       this.bookmarkStack.pop();
/* 2602 */       parent = this.bookmarkStack.peek();
/*      */     }
/*      */ 
/* 2605 */     if (!this.collapseMissingBookmarkLevels)
/*      */     {
/* 2608 */       for (int i = parent.level + 1; i < level; i++)
/*      */       {
/* 2610 */         Bookmark emptyBookmark = new Bookmark(parent, parent.pdfOutline.getPdfDestination(), "");
/* 2611 */         this.bookmarkStack.push(emptyBookmark);
/* 2612 */         parent = emptyBookmark;
/*      */       }
/*      */     }
/*      */ 
/* 2616 */     Bookmark bookmark = new Bookmark(parent, x, this.jasperPrint.getPageHeight() - y, title);
/* 2617 */     this.bookmarkStack.push(bookmark);
/*      */   }
/*      */ 
/*      */   protected void setAnchor(Chunk chunk, JRPrintAnchor anchor, JRPrintElement element)
/*      */   {
/* 2623 */     String anchorName = anchor.getAnchorName();
/* 2624 */     if (anchorName != null)
/*      */     {
/* 2626 */       chunk.setLocalDestination(anchorName);
/*      */ 
/* 2628 */       if (anchor.getBookmarkLevel() != 0)
/*      */       {
/* 2630 */         addBookmark(anchor.getBookmarkLevel(), anchor.getAnchorName(), element.getX(), element.getY());
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void exportFrame(JRPrintFrame frame)
/*      */     throws DocumentException, IOException, JRException
/*      */   {
/* 2638 */     if (frame.getModeValue() == ModeEnum.OPAQUE)
/*      */     {
/* 2640 */       x = frame.getX() + getOffsetX();
/* 2641 */       int y = frame.getY() + getOffsetY();
/*      */ 
/* 2643 */       Color backcolor = frame.getBackcolor();
/* 2644 */       this.pdfContentByte.setRGBColorFill(
/* 2645 */         backcolor.getRed(), 
/* 2646 */         backcolor.getGreen(), 
/* 2647 */         backcolor.getBlue());
/*      */ 
/* 2649 */       this.pdfContentByte.rectangle(
/* 2650 */         x, 
/* 2651 */         this.jasperPrint.getPageHeight() - y, 
/* 2652 */         frame.getWidth(), 
/* 2653 */         -frame.getHeight());
/*      */ 
/* 2655 */       this.pdfContentByte.fill();
/*      */     }
/*      */ 
/* 2658 */     setFrameElementsOffset(frame, false);
/*      */     try
/*      */     {
/* 2661 */       exportElements(frame.getElements());
/*      */     }
/*      */     finally
/*      */     {
/* 2665 */       restoreElementOffsets();
/*      */     }
/*      */ 
/* 2668 */     exportBox(frame.getLineBox(), frame);
/*      */   }
/*      */ 
/*      */   protected void exportGenericElement(JRGenericPrintElement element)
/*      */   {
/* 2729 */     GenericElementPdfHandler handler = (GenericElementPdfHandler)
/* 2730 */       GenericElementHandlerEnviroment.getInstance(getJasperReportsContext()).getElementHandler(
/* 2731 */       element.getGenericType(), "net.sf.jasperreports.pdf");
/*      */ 
/* 2733 */     if (handler != null)
/*      */     {
/* 2735 */       handler.exportElement(this.exporterContext, element);
/*      */     }
/* 2739 */     else if (log.isDebugEnabled())
/*      */     {
/* 2741 */       log.debug("No PDF generic element handler for " + 
/* 2742 */         element.getGenericType());
/*      */     }
/*      */   }
/*      */ 
/*      */   protected String getExporterKey()
/*      */   {
/* 2753 */     return "net.sf.jasperreports.pdf";
/*      */   }
/*      */ 
/*      */   protected static class Bookmark
/*      */   {
/*      */     final PdfOutline pdfOutline;
/*      */     final int level;
/*      */ 
/*      */     Bookmark(Bookmark parent, int x, int top, String title)
/*      */     {
/* 2543 */       this(parent, new PdfDestination(0, x, top, 0.0F), title);
/*      */     }
/*      */ 
/*      */     Bookmark(Bookmark parent, PdfDestination destination, String title)
/*      */     {
/* 2548 */       this.pdfOutline = new PdfOutline(parent.pdfOutline, destination, title, false);
/* 2549 */       parent.level += 1;
/*      */     }
/*      */ 
/*      */     Bookmark(PdfOutline pdfOutline, int level)
/*      */     {
/* 2554 */       this.pdfOutline = pdfOutline;
/* 2555 */       this.level = level;
/*      */     }
/*      */   }
/*      */ 
/*      */   protected static class BookmarkStack
/*      */   {
/*      */     LinkedList<DlyaPdfExporter2.Bookmark> stack;
/*      */ 
/*      */     BookmarkStack() {
/* 2565 */       this.stack = new LinkedList();
/*      */     }
/*      */ 
/*      */     void push(DlyaPdfExporter2.Bookmark bookmark)
/*      */     {
/* 2570 */       this.stack.add(bookmark);
/*      */     }
/*      */ 
/*      */     DlyaPdfExporter2.Bookmark pop()
/*      */     {
/* 2575 */       return (DlyaPdfExporter2.Bookmark)this.stack.removeLast();
/*      */     }
/*      */ 
/*      */     DlyaPdfExporter2.Bookmark peek()
/*      */     {
/* 2580 */       return (DlyaPdfExporter2.Bookmark)this.stack.getLast();
/*      */     }
/*      */   }
/*      */ 
/*      */   protected class ExporterContext extends JRAbstractExporter.BaseExporterContext
/*      */     implements JRPdfExporterContext
/*      */   {
/*      */     protected ExporterContext()
/*      */     {
/*  178 */       super();
/*      */     }
/*      */ 
/*      */     public String getExportPropertiesPrefix() {
/*  182 */       return "net.sf.jasperreports.export.pdf.";
/*      */     }
/*      */ 
/*      */     public PdfWriter getPdfWriter()
/*      */     {
/*  187 */       return DlyaPdfExporter2.this.pdfWriter;
/*      */     }
/*      */   }
/*      */ 
/*      */   class LocalFontMapper
/*      */     implements FontMapper
/*      */   {
/*      */     public LocalFontMapper()
/*      */     {
/*      */     }
/*      */ 
/*      */     public BaseFont awtToPdf(java.awt.Font font)
/*      */     {
/* 2712 */       Map atts = new HashMap();
/* 2713 */       atts.putAll(font.getAttributes());
/* 2714 */       return DlyaPdfExporter2.this.getFont(atts, null, false).getBaseFont();
/*      */     }
/*      */ 
/*      */     public java.awt.Font pdfToAwt(BaseFont font, int size)
/*      */     {
/* 2719 */       return null;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class NullOutputStream extends OutputStream
/*      */   {
/*      */     public void write(int b)
/*      */     {
/*      */     }
/*      */ 
/*      */     public void write(byte[] b, int off, int len)
/*      */     {
/*      */     }
/*      */ 
/*      */     public void write(byte[] b)
/*      */     {
/*      */     }
/*      */   }
/*      */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturews.DlyaPdfExporter2
 * JD-Core Version:    0.6.0
 */