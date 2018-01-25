public class A1P4{
    public static void main(String[] args){
        int sum = 0;
        for(String x : args){
            sum+= Integer.parseInt(x);
        }
        System.out.println(sum);
    }
}