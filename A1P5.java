import java.util.Scanner;
public class A1P5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        //looks if next input is an int, if not then it will exit
        while(in.hasNextInt()){
            sum += in.nextInt();
        }
        System.out.println(sum);
        in.close();
    }
}