package q4;
abstract class Animal implements Comparable<Animal>,Cloneable{
  protected double weight;
  /** Return animal sound */
  public abstract String sound();
  /** Animal clone */
  public abstract Animal clone();//throws CloneNotSupportedException
  /** Animal compareTo */
  public abstract int compareTo(final Animal obj);

  /** Getter and setters for wieght */
  public double getWeight(){
    return this.weight;
  }
  public void setWeight(double _weight){
    this.weight = _weight;
  }
}





