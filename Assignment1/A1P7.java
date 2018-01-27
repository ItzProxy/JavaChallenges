//Assignment 1 Question 7
import java.util.Scanner;

public class A1P7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] incomeRangeContainer = new int[9];
        System.out.println("Enter gross sales, to terminate enter a negative number(or a non number)");
            while(in.hasNextDouble()){ //checks if there is a double in queue of the scanner 
                double val = in.nextDouble(); //gets the double from scanner
                if(val < 0){ //if negative number
                    break; //exit out of loop
                }
                else{
                    int newVal = (int)((val*0.08) + 200);
                    if(newVal >= 1000){ //if greater than or equal to 1000
                        incomeRangeContainer[8]++; //hardcoded array index for 1000 or more
                    }
                    else{
                        int index = (newVal-200)/100; //every other case
                        incomeRangeContainer[index]++;
                    }
                }
            }
        System.out.print("Income Ranges\tNumber\n\n");
        for (int i=0;i<incomeRangeContainer.length; i++) {
            if(i ==incomeRangeContainer.length-1){ //if at end of array(index 8) then print out 1000 or more version
                System.out.printf("$%d or more\t%d\n",1000,incomeRangeContainer[i]);
            }
            else{
                System.out.printf("$%d-%d\t%d\n",i*100+200,i*100+299,incomeRangeContainer[i]);//formats "$x-$x+99\t"
            }
        }
    }
}
