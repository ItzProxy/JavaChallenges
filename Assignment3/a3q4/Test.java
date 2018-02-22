package q3;

import java.util.Random;

public class Test{
    public static void main(String[] args){
        Random rand = new Random();
        while(true){
            int i = rand.nextInt()%3;
                try{
                    throwDevice(i);
                }
                catch(Exception e){
                    System.out.println(e.getMessage()); //gets the message from the exception chain
                }
            }
        }
    

    /*
        Throws Exception A, B, or C depending on input from main 
    */
    public static void throwDevice(int i)
    throws ExceptionA, ExceptionB, ExceptionC{
        if(i == 0){
            throw new ExceptionA("Exception A Test\n");
        }
        if(i == 1){
            throw new ExceptionB("Exception B Test\n");
        }
        if(i == 2){
            throw new ExceptionC("Exception C Test\n");
        }
    }
}