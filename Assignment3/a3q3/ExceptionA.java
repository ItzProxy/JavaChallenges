package q3;

import java.util.*;
//throws to Exception base class
public class ExceptionA extends Exception{
    public ExceptionA(String msg){
        super(msg + " In Exception A ");
    }
}