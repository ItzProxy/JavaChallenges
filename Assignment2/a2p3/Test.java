import java.util.regex.*;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
public class Test{
    public static void split(String s, String regex){
        
        ConcurrentLinkedQueue<String> match = new ConcurrentLinkedQueue<String>();
        Matcher m = Pattern.compile(regex).matcher(s);
        while(m.find()){ //this
            match.add(m.group());
        }
        String[] t = s.trim().split(regex);
        List<String> newStr = new ArrayList<String>();
        int currIterator = 0;
        while(!match.isEmpty() && currIterator < t.length)
        {
            if(t[currIterator].equals("")){
                newStr.add(match.remove());
            }
            else{
                newStr.add(t[currIterator]);
            }
            System.out.println(currIterator++);
        }
        for(String x : t){
            System.out.printf("'%s', ",x);
        }

        //return match.toArray(new String[0]);
    }
    public static void main(String[] arg){
        String s = "?a?b#?gh#c";
        String re = "([?#])";
        split(s,re);
    }
}