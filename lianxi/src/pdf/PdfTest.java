package pdf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;  
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;  
  

public class PdfTest {
	public  static  void  main(String [] args) throws FileNotFoundException, DocumentException
	{
		 Document document = new Document();  
		  File  file=new  File("static");
		  if(!file.exists()){
			  file.mkdirs();
			  
		 }
		 File f=new File(file,"Hello.pdf");
		  
		  try   
		    {  
		  
		      // 生成名为 HelloWorld.pdf 的文档  
		      PdfWriter.getInstance(document, new FileOutputStream(f));  
		  
		  /*    // 添加PDF文档的一些信息  
		      document.addTitle("Hello World example");  
		      document.addAuthor("Bruno Lowagie");  
		      document.addSubject("This example explains how to add metadata.");  
		      document.addKeywords("iText, Hello World, step 3, metadata");  
		      document.addCreator("My program using iText");  
		  */
		      
		      BaseFont bfChinese = BaseFont.createFont("STSongStd-Light", "UniGB-UCS2-H", false);  
		      
		        Font fontChinese = new Font(bfChinese, 12, Font.NORMAL);   
		  

		      // 打开文档，将要写入内容  
		      document.open();  
		  
		      // 插入一个段落  
		   //   document.add(new Paragraph("Hello World!"));  
		      
		      Paragraph par = new Paragraph("我们是地球人哈哈哈哈哈哈哈或或或哈哈哈哈哈或哈哈哈哈哈或哈奥或哈哈哈哈哈哈哈哈或",fontChinese);  
		      Paragraph par1 = new Paragraph("终于能用pdf写中文了",fontChinese);  
		      
		      document.add(par);  
		      document.add(par1);
		      
		      
		    }   
		    catch (DocumentException de)   
		    {  
		      System.err.println(de.getMessage());  
		    }  
		    catch (IOException ioe)   
		    {  
		      System.err.println(ioe.getMessage());  
		    }  
		  
		    // 关闭打开的文档  
		    document.close();  
		  }  
		
	
	
}
