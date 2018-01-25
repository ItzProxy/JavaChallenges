package a1p2;
public class Point{
    double x;
    double y;
    //constructors
    public Point(){
        x = 0.0;
        y = 0.0;
    }
    
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