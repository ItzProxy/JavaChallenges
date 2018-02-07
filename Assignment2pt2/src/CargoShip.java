/*
CargoShip
Extends Ship 

Variables:
    int cargoCapacityWeight
 */
public class CargoShip extends Ship{
    int cargoCapacityWeight;
    
    //default constructor
    public CargoShip(){
        super();
        this.cargoCapacityWeight = 0;
    }
    /*
        constructor
        calls super class (Ship) and sets shipName and yearBuilt
        sets cargoCapacityWeight
    */
    public CargoShip(String _shipName, String _yearBuilt, int _cargoCapacityWeight){
        super(_shipName, _yearBuilt);
        this.cargoCapacityWeight = _cargoCapacityWeight;
    }
    //getter
    public int getCargoCapacityWeight(){ return this.cargoCapacityWeight; }
    //setter
    public void setCargoCapacityWeight(int _cargoCapacityWeight){ this.cargoCapacityWeight = _cargoCapacityWeight;}

    /*
        Overrides super class toString()
        ex: Name: Hello Year: 1990 Max Weight: 1902
    */
    public String toString(){
        return "Name: "+this.getShipName()+" Year: " + this.getYearBuilt() + " Max Weight: " + this.cargoCapacityWeight;
    }
}