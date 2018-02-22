package q2;

import java.net.*;
public class Test{
    public static void main(String[] args){
        try{
            URL tempURL = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            ReadURL x = new ReadURL(tempURL);
            System.out.println("From the website: " + x.getURL().toString());
            System.out.println(x.getData());
        }catch(MalformedURLException ex){
            System.out.print(ex.getMessage());
        }
    }
}