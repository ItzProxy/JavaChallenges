package q3;

import java.util.*;
//throws to ExceptionB
public class ExceptionC extends ExceptionB{
    public ExceptionC(String msg){
        super(msg + " In Exception C ");
    }
}