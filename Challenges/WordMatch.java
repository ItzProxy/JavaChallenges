import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class WordMatch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        Pattern pattern = Pattern.compile("[^A-Za-z!,?._'@]");
        Matcher match = pattern.matcher(s);
        //System.out.println(match.end());
        while(match.find()){
            System.out.println(match.group());
        }
        scan.close();
    }
}
