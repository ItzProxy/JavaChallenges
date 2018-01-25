package a1p2;
import java.util.Scanner;
public class A1P2{
    public static void main(String[] args){
        Point[] points = new Point[3]; //set array of Point 
        Scanner in = new Scanner(System.in); //set up to read entire input
        System.out.println("Enter three points for a triangle: ");
        for (int i = 0; i < points.length; i++) {
            System.out.printf("%d %d\n", i, points.length);
            points[i] = new Point(in.nextDouble(), in.nextDouble());
        }
        System.out.println();
        in.close();//close scanner
        Triangle aTriangle = new Triangle(points[0], points[1], points[2]);
        System.out.print("Area of this triange is: " + aTriangle.getArea());
    }
};

