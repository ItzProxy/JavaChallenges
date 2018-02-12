import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Split{
    public static void main(String[] args){
        String test = "a?b???gh#e?2qwe";
        String re = "[?#]";
        for(String x: split(test,re)){
            System.out.print(x+", ");
        }
    }

    public static String[] split(String s, String regex){
        ArrayList<String> x = new ArrayList<String>(); //container for split list
        int pos = 0; //keep track of the current range 
        Pattern pattern = Pattern.compile(regex); //compile the regex
        Matcher match = pattern.matcher(s); //match it to the entire string
        while(match.find()){ //get the next occurance of the regex being triggered
            if(!s.substring(pos,match.end()-1).isEmpty() && s.substring(pos,match.end()-1) !=null){ //check if the substring between pos and the regex is not empty/null
                x.add(s.substring(pos,match.end()-1)); //add the substring before the regex trigger
            }
                //used for debugging purposes
                //System.out.print(match.group().toString() + " at (" + match.start() + "," + (match.end()-1) + ") - ");
                //System.out.println(s.substring(pos, match.end()-1));
            x.add(s.substring(match.start(),match.end())); //add
            pos = match.end(); //update position to be on the regex
        }
        if(pos < s.length()) { 
            x.add(s.substring(pos)); //add the rest string because everything here is the end of the string
        }
        return x.toArray(new String[x.size()]); //returns a converted dyanmic array container into an array
    }
}