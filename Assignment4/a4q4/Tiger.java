package q4;
public class Tiger extends Animal{
  @Override
  public String sound() {
    return "Tiger: RROOAARR";
  }
  @Override
  public Tiger clone(){// throws CloneNotSupportedException{
    return this;
  }
  @Override
  public int compareTo(final Animal obj){
    if(obj.getWeight() > this.getWeight()){
      return -1;
    }
    else if(obj.getWeight() == this.getWeight()){
      return 0;
    }
    else{
      return 1;
    }
  }
}