//import java.util.*;
import java.util.ArrayList;
public class A2p3 {
    public static void main(String[] args){
        ArrayList<Ship> shipPort = new ArrayList<Ship>();
        shipPort.add(new CargoShip("Hello","1990",20)); //adds CargoShip 
        shipPort.add(new CruiseShip("MxYao", "1998", 30));
        shipPort.add(new Ship("BDO", "Not a year but there is no check so it doesn't matter"));
        
        for(Ship x : shipPort) {
        	System.out.println(x.toString());
        }
    }
}