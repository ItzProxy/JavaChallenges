package p2;
//custom Exception
public class DifferentTypeException extends Exception{
    String exStr;
    DifferentTypeException(Object x, Object y){
        exStr = "Issue with " + x.toString() + " and " + y.toString();
    }
    public String toString(){
        return ("DifferentTypeException Occured: " + exStr);
    }
}