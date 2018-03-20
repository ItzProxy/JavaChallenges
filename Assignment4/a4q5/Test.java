package q5;
import java.io.*;
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        int offset = 100;
        CreateItemRecord create = new CreateItemRecord();
        System.out.println("*****************CreateItemRecord*****************");
        create.createItemRecord(offset,10,"test.txt");

        System.out.println("*****************DisplayRecordSequentially*****************");
        DisplayRecordSequentially display = new DisplayRecordSequentially();
        display.displayRecordSequentially(offset,10,"test.txt");

        System.out.println("*****************AccessRecordRandomly*****************");
        AccessRecordRandomly access = new AccessRecordRandomly();
        access.accessRecordRandomly(offset,10,"test.txt");
    }
}