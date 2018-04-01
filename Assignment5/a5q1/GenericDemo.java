import java.util.ArrayList;
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);
        ArrayList<Integer> nList = list;
        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println("Question(a) Generic remove duplicates: " + newList);
        System.out.println("Question(b) Non-Generic remove duplicates: " + removeDuplicate(nList));
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        //bruteforce method: Check each entry with another, delete use list.remove(x) where x is the index of the duplicate
        for(int i = 0; i < list.size(); i++){
            for(int j = i; j < list.size(); j++){
                if(list.get(i).equals(list.get(j)) && i != j){
                    list.remove(j);
                }
            }
        }
        return list;
    }
    public static ArrayList removeDuplicate(ArrayList list){
        //bruteforce method: Check each entry with another, delete use list.remove(x) where x is the index of the duplicate
        for(int i = 0; i < list.size(); i++){
            for(int j = i; j < list.size(); j++){
                if(list.get(i).equals(list.get(j)) && i != j){
                    list.remove(j);
                }
            }
        }
        return list;
    }
}
