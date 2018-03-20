package q5;
import java.io.*;
import java.util.Scanner;

public class CreateItemRecord{
    public static void createItemRecord(int offset,int size, String filename){
        Scanner scan = MyScanner.getInstance();
        try{
            RandomAccessFile fileStore = new RandomAccessFile(filename, "rw"); //RandomAccess
            //float[] store = new float[size];
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
                fileStore.seek(itemNum*offset);
                System.out.println("Enter a price to be associated with item number (" + itemNum +"):");
                float price = scan.nextFloat();
                while(price < 0){ //if price is negative, ask user for new input    
                    price = scan.nextFloat();
                }
                //store the item into store
                fileStore.writeFloat(price);
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        finally{
            //scan.close();//close
        }
    }
}