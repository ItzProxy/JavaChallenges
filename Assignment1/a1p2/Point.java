package a1p2;
/*
Utilized in any coordinate plane usage
@var x is the x axis of a coordinate plane
@var y is the y axis of a coordinate plane
*/
public class Point{
    double x;
    double y;
    //constructors
    public Point(){
        x = 0.0;
        y = 0.0;
    }
    //constructor with var
    public Point(double xPoint, double yPoint){
        x = xPoint; 
        y = yPoint;
    }
    //getters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
};