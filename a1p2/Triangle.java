package a1p2;
public class Triangle{
    Point[] points = new Point[3];

    //default constructor
    public Triangle(){
        points[0] = new Point();
        points[1] = new Point();
        points[2] = new Point();
    }
    //constructor
    public Triangle(double x1,double y1,double x2,double y2,double x3,double y3){
        points[0] = new Point(x1,y1);
        points[1] = new Point(x2,y2);
        points[2] = new Point(x3,y3);
    }
    public Triangle(Point a, Point b, Point c){
        points[0] = a;
        points[1] = b;
        points[2] = c;
    }
    //gets the length between 2 points
    private double getSideLength(int currPoint){
        int nextPoint = (currPoint + 1)%3;
        double length = Math.sqrt(Math.pow(points[currPoint].getX() - points[nextPoint].getX(), 2) 
        + Math.pow(points[currPoint].getY() - points[nextPoint].getY(), 2));
        return length;
    }
    //Heron's Formula
    public double getArea(){
        double s = (getSideLength(0) + getSideLength(1) + getSideLength(2))/2;
        double area = Math.sqrt(s*(s-getSideLength(0))*(s-getSideLength(1))*(s-getSideLength(2)));
        return area;
    }
};