import java.util.ArrayList;
import java.util.List;
public class Manager extends Person {
    List<Person> manageList;
    String name;
    public Manager(String _name){
        super(300);
        name = _name;
        manageList = new ArrayList<Person>();
    }

    public void addWorker(Person newWorker){
        this.manageList.add(newWorker);
        System.out.print("New Worker Added to this manager: %s");
    }

    @Override
    public String toString(){
        return "Manager: " + name;
    }
}