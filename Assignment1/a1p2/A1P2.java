/*
Assignment 1 Question 2
Assumes user will only use doubles, this will not look for invalid triangles created such as (3 points on the same line)
Gets input from user, 6 inputs which correspond to points1,2,3
Outputs the area based on those 3 points given
*/
package a1p2;
import java.util.Scanner;
public class A1P2{
    public static void main(String[] args){
        Point[] points = new Point[3]; //set array of Point 
        Scanner in = new Scanner(System.in); //set up to read entire input
        System.out.println("Enter three points for a triangle: ");
        for (int i = 0; i < points.length; i++) {
            System.out.printf("%d %d\n", i, points.length);
            points[i] = new Point(in.nextDouble(), in.nextDouble()); //gets the next 2 doubles and creates a new Point class using constructor
        }
        System.out.println();
        in.close();//close scanner
        Triangle aTriangle = new Triangle(points[0], points[1], points[2]); //creates Triangle using given points from input
        System.out.print("Area of this triange is: " + aTriangle.getArea()); //outputs the area of the triangle 
    }
};

