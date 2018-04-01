import java.util.ArrayList;
public class GenericDemo {
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(14);
            list.add(24);
            list.add(4);
            list.add(42);
            list.add(5);
            ArrayList<Integer> nList = list; //copy

            System.out.println("Question(a) Generic max: " + maxGeneric(list));
            System.out.println("Question(b) Non-Generic max: " + maxNonGeneric(nList));
        }
    public static <E extends Comparable<E>> E maxGeneric(ArrayList<E> list){
        E max = list.get(0);
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i).compareTo(list.get(i+1)) > 0){
                max = list.get(i);
            }
        }
        return max;
    }
    public static Integer maxNonGeneric(ArrayList<Integer> list){
        Integer max = list.get(0);
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i).compareTo(list.get(i+1)) > 0){
                max = list.get(i);
            }
        }
        return max;
    }
}
