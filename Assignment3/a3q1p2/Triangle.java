package p2;
import java.util.*;
public class Triangle extends GeometricObject{
    private double side1,side2,side3 = 1.0D;

    public Triangle(){
        super();
        side1 = side2 = side3 = 1.0D;
    }
    public Triangle(double s1, double s2, double s3){
        super();
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    //getters
    public double getSide1() {return this.side1;}
    public double getSide2() {return this.side2;}
    public double getSide3() {return this.side3;}

    //setters
    public void setSide1(double val) {val = this.side1;}
    public void setSide2(double val) {val = this.side2;}
    public void setSide3(double val) {val = this.side3;}


    //Heron's Formula for the area of a triangle
    //Perimeter/2 = p = (side1 + side2 + side3) /2
    //Area = (p*(p-side1)(p-side2)(p-side3))^0.5
    //@Override
    public double getArea(){
        double p = getPerimeter()/2.0;
        double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return area;
    }

    //@Override
    public double getPerimeter(){
        return (side1 + side2 + side3);
    }
    
    @Override
    public String toString(){
       // return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
       return "Triangle Object";
    }

    public void printInfo(){
        System.out.println("The area is " + getArea());
        System.out.println("The side1 is " + getSide1());
        System.out.println("The side2 is " + getSide2());
        System.out.println("The side3 is " + getSide3());
        System.out.println("The perimeter is " + getPerimeter());
    }
}