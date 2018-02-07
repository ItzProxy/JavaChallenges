public class CargoShip extends Ship{
    int cargoCapacityWeight;
    
    public CargoShip(){
        super();
        this.cargoCapacityWeight = 0;
    }
    public CargoShip(String _shipName, String _yearBuilt, int _cargoCapacityWeight){
        super(_shipName, _yearBuilt);
        this.cargoCapacityWeight = _cargoCapacityWeight;
    }

    public int getCargoCapacityWeight(){ return this.cargoCapacityWeight; }
    public void setCargoCapacityWeight(int _cargoCapacityWeight){ this.cargoCapacityWeight = _cargoCapacityWeight;}

    public String toString(){
        return "Name: "+this.getShipName()+" Year: " + this.getYearBuilt() + " Max Weight: " + this.cargoCapacityWeight;
    }
}