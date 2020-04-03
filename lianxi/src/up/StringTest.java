package up;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringTest {

	public static void main(String[] args) throws FileNotFoundException {

	String  str="dhgsGGhfsg";
	/*char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		System.out.println(ch[i]);
		
	}
	*/
	String str1=str.toUpperCase();
	System.out.println(str1);
	String str2=str.toLowerCase();
	System.out.println(str2);
	System.out.println(str.indexOf('g',4));
    String  str3="asddsffdhgggg";
   int  number=str3.indexOf("ds");
	System.out.println(number);
	String   str4=",1,2,3,4,4,,5,,";
	String [] str5=str4.split(",",3); //  >0  就是分几段
	for( String a:str5)
	{
		System.out.println(a);
		
	}
	  File     file =new  File ("1444.txt");
	  FileInputStream    fis=new  FileInputStream("D:\\test.txt");
	  byte []  by=new  byte[1024];
	  int  num=0;
	  FileOutputStream  fos =new  FileOutputStream(file);
	  try {
		while((num=fis.read(by))!=-1)
		  {
			  fos.write(by, 0, num);
			  
		  }
		fos.close();
		fis.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}


}