package q2;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class ReadURL{
    private URL url;
    private String data;

    public ReadURL(){
        try{
            this.url = new URL("https://www.google.ca/");
        }
        catch(MalformedURLException ex){
            this.url = null;
        }
        this.data = "";
    }

 
    public URL getURL(){
        return url;
    }

    public void setURL(URL url){
        this.url = url;
        setData();
    }

    //setter
    public ReadURL(URL url){
        this.url = url;
        setData();
    }
    /*
        Takes the URL set by the class
        Sets data to the data stream returned by the openStream function
        Otherwise, if the source is an invalid URL then an exception will be caught by the setter because it is a private method
    */
    private void setData(){
        try{
            InputStream input = this.url.openStream(); //opens URL
            Scanner in = new Scanner(input); //sets up scanner with the InputStream as the paramater

            while (in.hasNext())
                data+=in.nextLine(); //sets data to what ever is returned from the input
            in.close();
        }
        catch(IOException ex){
            System.out.println("Invalid input source");
        }
    }

    public String getData(){
        return this.data;
    }

    private void emptyData(){
        data = "";
    }
}