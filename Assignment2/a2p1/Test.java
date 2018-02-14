
//package Assignment2.a2p1;
import java.util.Scanner;
public class Test {
    public final static Scanner sc = new Scanner(System.in);
    public Test() {
    }

    public static void main(String[] var0) {
        Account[] accArr = new Account[10];

        for(int i = 0; i < accArr.length; ++i) { //set all accounts to have the id = array index and balance = 100
            accArr[i] = new Account(i,100.0D);
        }

        while(true) {
            int choice;
            do {
                System.out.print("Enter an id: ");
                choice = sc.nextInt();
            } while(choice > accArr.length || choice < 0);
            accArr[choice].menu();
        }
        //not reachable because infinite loop up above, so only way to get out is to keyboard interupt
        //sc.close();
    }
}