import java.net.*;
import java.io.*;
 
public class URLDemo
{
   public static void main(String [] args)
   {
      try
      {
         URL url = new URL("http://www.runoob.com/index.html?language=cn#j2se");
         System.out.println("URL:" + url.toString());
         System.out.println("protocol:" + url.getProtocol());
         System.out.println("Authority:" + url.getAuthority());
         System.out.println("File:" + url.getFile());
         System.out.println("Host:" + url.getHost());
         System.out.println("Path:" + url.getPath());
         System.out.println("Port:" + url.getPort());
         System.out.println("DefaultPort:" + url.getDefaultPort());
         System.out.println("query:" + url.getQuery());
         System.out.println("Ref:" + url.getRef());
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}