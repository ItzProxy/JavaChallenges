package q5;
import java.io.*;
import java.util.Scanner;

public class AccessRecordRandomly{
    public void accessRecordRandomly(int offset,int size, String filename){
        Scanner scan = MyScanner.getInstance();
        try{
            RandomAccessFile fileStore = new RandomAccessFile(filename, "rw"); //RandomAccess
            for(int i = 0;i<size;i++){
                fileStore.seek(i*offset);
                System.out.println(""+fileStore.readFloat());
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        finally{
            //scan.close();
        }
    }
}