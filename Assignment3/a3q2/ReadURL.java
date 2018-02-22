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

    public ReadURL(URL url){
        this.url = url;
        setData();
    }

    public URL getURL(){
        return url;
    }

    public void setURL(URL url){
        this.url = url;
        setData();
    }

    private void setData(){
        try{
            InputStream input = this.url.openStream();
            Scanner in = new Scanner(input);

            String inputLine;
            while (in.hasNext())
                data+=in.nextLine();
            in.close();
        }
        catch(IOException ex){
            System.out.println("Invalid input source");
        }
    }

    public String getData(){
        return this.data;
    }
}