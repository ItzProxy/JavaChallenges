import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateItemRecord{
    static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        
    }

    public static void setItemFromUser(int size) throws IOException{
        float[] store = new float[size];
        //init
        int itemNum = 0;
        while(true){
            System.out.println("Enter an item number between 1 and " + size + " (enter -999 to exit and store items to file): ");
            itemNum = scan.nextInt();
            while(itemNum > size || (itemNum < 1 && itemNum != -999)){ //if not in range(1,size) or -999 ask for new input
                System.out.println("Input was not between 1 and " + size + " or -999, try again: ");
                itemNum = scan.nextInt();
            }
            if(itemNum == -999){
                break; //get out of loot
            }
            System.out.println("Enter a price to be associated with item number (" + itemNum +"):");
            float price = scan.nextFloat();
            while(price < 0){ //if price is negative, ask user for new input
                System.out.println("Input is a negative number"); 
                price = scan.nextFloat();
            }
            //store the item into store
            store[itemNum] = price;
        }
    }
}