/*
Singleton class to pass scanner across multiple classes
*/
package q5;
import java.util.Scanner;
public class MyScanner{
    private static Scanner instance = new Scanner(System.in);
    protected MyScanner(){
        //thwart instantiation 
    }
    public static Scanner getInstance(){
        return instance;
    }
}