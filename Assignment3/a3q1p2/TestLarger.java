package p2;
import java.util.*;
import p2.DifferentTypeException;
public class TestLarger{
    public static void main(String[] args){
        //same Circle test case
        Circle sameCirc1 = new Circle(3.0);
        Circle sameCirc2 = new Circle(3.0);
        System.out.println("Testing 2 circles of same radius:");
        TestObject(sameCirc1,sameCirc2);
        //different Circle test case
        Circle diffCircle1 = new Circle(2.8);
        System.out.println("Testing 2 circles of different radius:");
        TestObject(diffCircle1,sameCirc1);
        //different Rectangle test case
        Rectangle diffRect1 = new Rectangle(3.0,3.0);
        Rectangle diffRect2 = new Rectangle(2.0,2.0);
        System.out.println("Testing 2 rectangles of different sizes:");
        TestObject(diffRect1,diffRect2);
        //different Triangle test case
        Triangle diffTri1 = new Triangle(2.00,3.00,2.30);
        Triangle diffTri2 = new Triangle(2.0,2.0,2.0);
        System.out.println("Testing 2 triangles of different sizes:");
        TestObject(diffTri1,diffTri2);
        //different object
        System.out.println("Two objects are of different type:");
        TestObject(diffTri1,sameCirc1);
    }

    public static void TestObject(GeometricObject g1, GeometricObject g2){
        try{
            GeometricObject obj = larger(g1,g2);
            if(obj != null){
                System.out.println("\nThe returned larger object is " + obj);
                obj.printInfo();
                System.out.println();
            }
        }
        catch(DifferentTypeException x){ //throw to DifferentTypeException
            System.out.println("The object is different");
        }
    }


    static GeometricObject larger(GeometricObject g1, GeometricObject g2) throws DifferentTypeException{
        if(!g1.toString().equals(g2.toString())){ //check if the returned String object are equal in value because g1.equal(g2) will always return different object
            throw new DifferentTypeException(g1,g2);
        }
        if(g1.getArea() == g2.getArea()){ //check if the returned area value are equal (because primitive values are returned == is possible)
            System.out.println("Area is the same");
            return null;
        }
        return (g1.getArea() > g2.getArea()) ? g1 : g2; //return which ever area is larger
    }
}
