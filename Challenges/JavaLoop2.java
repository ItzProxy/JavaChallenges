//https://www.hackerrank.com/challenges/java-loops/problem
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        String[] aStrings = new String[t];
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0; j<n; j++){
                int sum = a;
                for(int k=0;k<j;k++){
                    sum += ((k+1)*b);
                }
                aStrings[i] = aStrings[i] + Integer.toString(sum) + " ";
            }
        }
        in.close();
    }
}
