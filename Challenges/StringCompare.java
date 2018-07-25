import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringCompare {
  
    public static String getSmallestAndLargest(String s, int k) {
        if(k >= s.length())
            return s + "\n" + s;
        String smallest = s.substring(0,k); //init
        String largest = smallest;
        String temp = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substrnilge of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=1; i+k <= s.length(); i++){
            temp = s.substring(i,i+k);
            if(temp.compareTo(smallest) <= 0){
                smallest = temp;
            }
            if(temp.compareTo(largest) >= 0){
                largest = temp;
            }
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
