public class CruiseShip extends Ship{
    int maxPassengers;

    public CruiseShip(){
        super();//calls Ship constructor
        maxPassengers = 0;
    }

    public CruiseShip(String _shipName, String _yearBuilt ,int _maxPassengers){
        super(_shipName, _yearBuilt); //calls ship Contructor
        this.maxPassengers = _maxPassengers;
    }

    public int getMaxPassengers(){ return maxPassengers; }
    public void setMaxPassengers(int _maxPassengers){ this.maxPassengers = _maxPassengers; }

    public String toString(){
        return "Name: "+this.getShipName()+" Year: " + getYearBuilt() + " Max Passengers: " + maxPassengers;
    }

} 