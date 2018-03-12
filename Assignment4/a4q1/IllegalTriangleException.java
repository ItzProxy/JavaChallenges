package p1;
import java.lang.Exception;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException() {super();}
    public IllegalTriangleException(String message) { super(message); }
    public IllegalTriangleException(String message, Throwable cause) { super(message, cause); }
    public IllegalTriangleException(Throwable cause) {super(cause);}
    public IllegalTriangleException(double side1, double side2, double side3, String msg){
        System.err.println("side1: " + side1 + " side2: " + side2 + " side1: " + side3 + "\n" + msg);
    }
}