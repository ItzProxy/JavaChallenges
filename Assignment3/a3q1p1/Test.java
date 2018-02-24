package p1;
import java.util.*;

import p1.Triangle;
public class Test{
    public static void main(String[] args){

        runTest();
    }

    public static void runTest(){
        Scanner in = new Scanner(System.in);
        //get 3 sides
        System.out.print("Enter three(3) sides: ");
        double[] side = new double[3];
        int counter = 0;
        while(counter < 3){
            try{
                side[counter] = in.nextDouble();
            }
            catch(InputMismatchException x){
                System.out.println("Try again");
                in.next();
                counter--;
            }
            counter++;
        }
        Triangle x = new Triangle(side[0],side[1],side[2]);
        //get color
        System.out.print("Enter the color: ");
        x.setColor(in.next());
        //boolean value for filled
        System.out.print("Enter a boolean value for filled: ");
        x.setFilled(in.nextBoolean());
        //Area
        System.out.println("The area is " + x.getArea());
        //perimeter
        System.out.println("The perimeter is " + x.getPerimeter());
        //toString()
        System.out.println("Triangle: " + x.toString());
        //isFilled
        System.out.println("The triangle is Filled: " + String.valueOf(x.isFilled()));
    }
}
