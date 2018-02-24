package q5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class RenameFile{
    public static void main(String[] args){
        if(args.length != 1){
            System.err.println("Program requires one argument to be supplied\nUsage: 'java q5.RenameFile <file path>'");
            System.exit(0);
        }
        RenameWithDate(args[0]);
        //Test();
    }
    //Thu Aug 29 13_54_11 EDT 2013
    private static void Test(){
        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd H_m_s z yyyy");
        System.out.println(formatter.format(currentDate.getTime()));
    }
    private static void RenameWithDate(String filePath){
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException("Original file does not exist");
            }
            Calendar currentDate = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd H_m_s z yyyy");
            File newFile = new File(filePath+formatter.format(currentDate.getTime()).toString());
            if(newFile.exists()){
                throw new FileAlreadyExistsException("Rename File already exists");
            }
            boolean success = file.renameTo(newFile);
            if(success){
                System.out.println("Success - " + file + " renamed to " + newFile);
            }
        }
        catch(FileNotFoundException ex){
            System.err.println("Failed. Original file not found");
        }
        catch(FileAlreadyExistsException ex){
            System.err.println("Failed. File being renamed to already exists");
        }
    }
}