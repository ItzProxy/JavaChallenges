
/*
CruiseShip Class
Extends ship base class

Variables:
int maxPassengers
*/
public class CruiseShip extends Ship{
    int maxPassengers;

    //Default constructor
    //redundantly class the super class - Ship just to make sure its made
    public CruiseShip(){
        super();//calls Ship constructor
        maxPassengers = 0;
    }
    /*
        Calls superclass (Ship) and sets the ship's name and year built
        sets max passenger
    */
    public CruiseShip(String _shipName, String _yearBuilt ,int _maxPassengers){
        super(_shipName, _yearBuilt); //calls ship Contructor
        this.maxPassengers = _maxPassengers;
    }
    //getter
    public int getMaxPassengers(){ return maxPassengers; }
    //setter
    public void setMaxPassengers(int _maxPassengers){ this.maxPassengers = _maxPassengers; }

    /*
        Overrides the toString function of the Super Class (Ship)
        returns: String
        ex: Name: Hello Year: 1990 Max Passengers: 190
    */
    public String toString(){
        return "Name: "+this.getShipName()+" Year: " + getYearBuilt() + " Max Passengers: " + maxPassengers;
    }

} 