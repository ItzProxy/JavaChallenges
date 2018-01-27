public class A1P4{
    public static void main(String[] args){
        int sum = 0; //init sum
        //loop through all of the elements in args
        for(String x : args){
            sum+= Integer.parseInt(x);
        }
        System.out.println(sum); //print sum after going through args
    }
}