package DataPullWeb;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class Data {
    public static void main(String args[]) throws IOException {
        //Instantiating the URL class
        URL url = new URL("http://www.tennisexpress.com/");
        //Retrieving the contents of the specified page
        Scanner sc = new Scanner(url.openStream());
        //Instantiating the StringBuffer class to hold the result
        StringBuffer sb = new StringBuffer();
        while(sc.hasNext()) {
            sb.append(sc.next());
            //System.out.println(sc.next());
        }
        //Retrieving the String from the String Buffer object
        String result = sb.toString();
        System.out.println(result);
        //Removing the HTML tags
        result = result.replaceAll("<[^>]*>", "");
        System.out.println("Contents of the web page: "+result);
    }
}




//import java.io.IOException;
//import org.jsoup.Connection;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//public class JsoupExample {
//   public static void main(String args[]) throws IOException {
//      String page = "http://www.something.com/";
//      //Connecting to the web page
//      Connection conn = Jsoup.connect(page);
//      //executing the get request
//      Document doc = conn.get();
//      //Retrieving the contents (body) of the web page
//      String result = doc.body().text();
//      System.out.println(result);
//   }
//}
