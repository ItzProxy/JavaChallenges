package q3;

import java.util.*;
//Throws to ExceptionA
public class ExceptionB extends ExceptionA{
    public ExceptionB(String msg){
        super(msg + " In Exception B ");
    }
}