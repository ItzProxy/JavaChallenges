package p1;
import java.util.*;

import p1.Triangle;
public class Test{
    public static void main(String[] args){
        runTest();
    }

    public static void runTest(){
        try{
            System.out.println("Working Triangle");
            Triangle x = new Triangle(3,4,5);
            System.out.println(x.toString());
            System.out.println("Illegal Triangle");
            Triangle e = new Triangle(3,4,8);
            System.out.println(e.toString());
        }catch(IllegalTriangleException ex){
        }
    }
}
