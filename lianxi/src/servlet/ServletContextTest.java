package servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextTest
 */
@WebServlet("/ServletContextTest")
public class ServletContextTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext   servletContext=request.getServletContext();
	    String  str=	servletContext.getContextPath();   ///返回项目的名字 lianxi
		ServletContext   str1=servletContext.getContext("/lianxi/index.jsp");
		Set<String>  ss=servletContext.getResourcePaths("/");
				for(String s : ss)
				{
					System.out.println(s);
					
				}
			
		String  str2=servletContext.getRealPath("WEB-INF/2.html");
		System.out.println(str2);   //  D:\Tomcat2\apache-tomcat-8.0.30\webapps\lianxi\WEB-INF\2.html   // 真实路径
		URL  str3=servletContext.getResource("1.html");   // 返回 file:/D:/Tomcat2/apache-tomcat-8.0.30/webapps/lianxi/1.html	
		System.out.println(str3);
		File file=new  File("1.txt");
		System.out.println(file.getAbsoluteFile());
		InputStream  str4=servletContext.getResourceAsStream("1.html");
		byte[]  by=new  byte[1024];
		int   number =0;
	    FileOutputStream  fileOutputStream=new  FileOutputStream(servletContext.getRealPath("WEB-INF/2.html"));
		while((number=str4.read(by))!=-1)
		{
			fileOutputStream.write(by, 0, number);
			
		}
	       
		response.getWriter().write(str+str1.toString()+str2);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
