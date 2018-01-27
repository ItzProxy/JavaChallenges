import java.util.Scanner;
public class A1P5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); //instance scanner class
        int sum = 0;//init var
        //looks if next input is an int, if not then it will exit
        while(in.hasNextInt()){
            sum += in.nextInt(); //add to sum
        }
        System.out.println(sum); //print sum
        in.close(); //close Scanner instance
    }
}