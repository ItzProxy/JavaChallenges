import java.io.*;
import java.util.Random;
class Test{
    public static void main(String[] args) throws IOException{
        DataInputStream dataIn = null;
        DataOutputStream dataOut = null;
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;
        int numRand = 10;
        Random rnd = new Random();
        try{
            //Create file called randInt.dat with numRand Random Integers
            fileOut = new FileOutputStream("randInt.dat");
            dataOut = new DataOutputStream(fileOut);

            for(int i=0;i<numRand;i++){
                dataOut.writeInt(rnd.nextInt(100));//belongs to the natural numbers
            }

            dataOut.flush(); //flush out data

            //finally read the file that was just created
            fileIn = new FileInputStream("randInt.dat");
            dataIn = new DataInputStream(fileIn);

            while(dataIn.available()>0){
                int k = dataIn.readInt();
                System.out.print(k + " ");
            }
        }
        catch(Exception e){ //catch all
            e.printStackTrace();
        }
        finally{
            if(dataIn!=null){
                dataIn.close();
            }
            if(dataOut!=null){
                dataOut.close();
            }
            if(fileIn!=null){
                fileIn.close();
            }
            if(fileOut!=null){
                fileOut.close();
            }
        }
    }
}