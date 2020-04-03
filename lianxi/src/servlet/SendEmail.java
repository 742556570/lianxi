package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendEmail
 */
@WebServlet("/SendEmail")
public class SendEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  int  number=1;
      AtomicInteger   atomicInteger=new  AtomicInteger(number); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendEmail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 {

			 
			 
			 
			 // 收件人的电子邮件 ID 836713278          
		      String to = " 934449300@qq.com";
		    
		      // 发件人的电子邮件 ID
		      String from = "1739452535@qq.com";
		 
		      // 假设您是从本地主机发送电子邮件
		  //    String host = "smtp.exmail.qq.com";
		 
		      // 获取系统的属性
		      Properties properties = System.getProperties();  
		     
		 
		      // 设置邮件服务器
		     // properties.setProperty("mail.smtp.host", host);
		      properties.setProperty("mail.smtp.host", "smtp.qq.com");
		      properties.setProperty("mail.smtp.port", "25");
		      properties.put("mail.smtp.auth", "true");  
		      // 获取默认的 Session 对象
		     // Session session = Session.getDefaultInstance(properties);
		      Session session = Session.getDefaultInstance(properties,new Authenticator(){
		    	    public PasswordAuthentication getPasswordAuthentication()
		    	    {
		    	     return new PasswordAuthentication("1739452535@qq.com", "ihloufgpzsdcegfh"); //发件人邮件用户名、生成的授权码
		    	    }
		    	   });
		   // 设置响应内容类型
		      response.setContentType("text/html;charset=utf-8");
		    
		      PrintWriter out = response.getWriter();

		      try{
		         // 创建一个默认的 MimeMessage 对象
		         MimeMessage message = new MimeMessage(session);
		         // 设置 From: header field of the header.
		         message.setFrom(new InternetAddress(from));
		         // 设置 To: header field of the header.
		         message.addRecipient(Message.RecipientType.TO,
		                                  new InternetAddress(to));
		         // 设置 Subject: header field
		         message.setSubject("java测试邮箱轰炸，恭喜您中了500万大奖，请找马化腾领奖");
		         // 现在设置实际消息
		         message.setText("相信我这是真的");
		         // 发送消息
		         Transport.send(message);
		         System.out.println(atomicInteger.getAndIncrement()-1);
		         String title = "发送电子邮件";
		         String res = "成功发送消息...";
		         String docType =
		         "<!doctype html public \"-//w3c//dtd html 4.0 " +          "transitional//en\">\n";
		         out.println(docType +
		         "<html>\n" +
		         "<head><title>" + title + "</title></head>\n" +
		         "<body bgcolor=\"#f0f0f0\">\n" +
		         "<h1 align=\"center\">" + title + "</h1>\n" +
		         "<p align=\"center\">" + res + "</p>\n" +
		         "</body></html>");
		      }catch (MessagingException mex) {
		         mex.printStackTrace();
		      }
		   }
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	           /* // 收件人电子邮箱

	            String to = "742556570@qq.com";

	 

	            // 发件人电子邮箱

	            String from = "1739452535@qq.com";

	 

	            // 指定发送邮件的主机为 smtp.qq.com

	            String host = "smtp.exmail.qq.com";  //QQ 邮件服务器

	 

	            // 获取系统属性

	            Properties properties = System.getProperties();
	           

	            properties.setProperty("mail.smtp.auth", "true");//开启认证

	            properties.setProperty("mail.debug", "true");//启用调试

	            properties.setProperty("mail.smtp.timeout", "1000");//设置链接超时

	            properties.setProperty("mail.smtp.port", "465");//设置端口

	            properties.setProperty("mail.smtp.socketFactory.port", "465");//设置ssl端口

	            properties.setProperty("mail.smtp.socketFactory.fallback", "false");

	            properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

	            // 设置邮件服务器

	            properties.setProperty("mail.smtp.host", host);

	 

	            properties.put("mail.smtp.auth", "true");

	          
				try {
					  MailSSLSocketFactory sf = new MailSSLSocketFactory();
					  sf.setTrustAllHosts(true);
					  properties.put("mail.smtp.ssl.socketFactory", sf);
				} catch (GeneralSecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	          

	            properties.put("mail.smtp.ssl.enable", "true");

	           

	            // 获取默认session对象

	            Session session = Session.getDefaultInstance(properties,new Authenticator(){

	                public PasswordAuthentication getPasswordAuthentication()

	                {

	                    return new PasswordAuthentication("1739452535@qq.com", "ihloufgpzsdcegfh"); //发件人邮件用户名、密码

	                }

	            });

	 

	            try{

	                // 创建默认的 MimeMessage 对象

	                MimeMessage message = new MimeMessage(session);

	 

	                // Set From: 头部头字段

	                message.setFrom(new InternetAddress(from));

	 

	                // Set To: 头部头字段

	                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	 

	                // Set Subject: 头部头字段

	                message.setSubject("有订单信息改为取消");

	 

	                // 设置消息体

	                message.setText("取消的订单ID为");

	 

	                // 发送消息

	                Transport.send(message);

	                System.out.println("Sent message successfully....from runoob.com");

	            }catch (MessagingException mex) {

	                mex.printStackTrace();

	            }

	        }
*/
	 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
