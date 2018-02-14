//import java.util.*;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args){
        ArrayList<Ship> shipPort = new ArrayList<Ship>(); //list of Ship
        shipPort.add(new CargoShip("Hello","1990",20)); //adds CargoShip 
        shipPort.add(new CruiseShip("MxYao", "1998", 30)); //add Cruise ship
        shipPort.add(new Ship("BDO", "Not a year but there is no check so it doesn't matter")); //add normal ship with string year
        
        for(Ship x : shipPort) { //iterate through the array
        	System.out.println(x.toString());
        }
    }
}