package a1p2;
/*
    Triangle using Point.java 
*/
public class Triangle{
    Point[] points = new Point[3]; //init 3 empty points

    //default constructor
    public Triangle(){
        points[0] = new Point();
        points[1] = new Point();
        points[2] = new Point();
    }
    //constructor using (x,y) coordinates
    public Triangle(double x1,double y1,double x2,double y2,double x3,double y3){
        points[0] = new Point(x1,y1);
        points[1] = new Point(x2,y2);
        points[2] = new Point(x3,y3);
    }
    //constructor to reference pre made Point classes
    public Triangle(Point a, Point b, Point c){
        points[0] = a;
        points[1] = b;
        points[2] = c;
    }
    //gets the length between 2 points using the distance formula
    //length = sqrt((x2-x1)^2 + (y2-y1)^2));
    //only used by getArea so its only accessible by the class functions
    private double getSideLength(int currPoint){
        int nextPoint = (currPoint + 1)%3; //this will act as the x2 and y2 of the distance formula (so if current point is 1(2,3) then next point is 2(3,4))
        double length = Math.sqrt(Math.pow(points[currPoint].getX() - points[nextPoint].getX(), 2) 
        + Math.pow(points[currPoint].getY() - points[nextPoint].getY(), 2));//distance formula
        return length;
    }
    //Heron's Formula
    //s = s1+s2+s3 where s(1,2,3) is the distance between the points
    //area = sqrt(s*(s-s1)*(s-s2)*(s-s3))
    public double getArea(){
        double s = (getSideLength(0) + getSideLength(1) + getSideLength(2))/2;
        double area = Math.sqrt(s*(s-getSideLength(0))*(s-getSideLength(1))*(s-getSideLength(2)));
        return area;
    }
};