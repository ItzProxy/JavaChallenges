package q3;
public class Rectangle implements Drawable{
  private double width;
  private double height;

  public Rectangle() {
  }

  public Rectangle(
      double width, double height) {
    this.width = width;
    this.height = height;
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  /** Return area */
  //@Override
  public double getArea() {
    return width * height;
  }

  /** Return perimeter */
  //@Override
  public double getPerimeter() {
    return 2 * (width + height);
  }

  //implements draw() from Drawable
  public void draw(){
    for(int i=0;i<width;i++){
      for(int j=0;j<height;i++)
        System.out.print("*");
      System.out.println()
    }
  }

  //@Override
  public String toString(){
    return "Rectangle Object";
  }
//print the information of this object
  public void printInfo(){
    System.out.println("The area is " + getArea());
    System.out.println("The width is " + getWidth());
    System.out.println("The height is " + getHeight());
    System.out.println("The perimeter is " + getPerimeter());
  }
}
