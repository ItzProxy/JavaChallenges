public class Person{
    int cost;

    public Person(int _cost){
        cost = _cost;
    }

    public int getCost(){
        return cost;
    }

    protected void setCost(int _cost){
        cost = _cost;
    }
}