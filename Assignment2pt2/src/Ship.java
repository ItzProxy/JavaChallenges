public class Ship{
    String shipName;
    String yearBuilt;

    public Ship(){
        this.shipName = "";
        this.yearBuilt = "0000";
    }
    
    public Ship(String _shipName, String _yearBuilt){
        this.shipName = _shipName;
        this.yearBuilt = _yearBuilt;
    }

    public String getShipName(){
        return shipName;
    }
    public String getYearBuilt(){
        return yearBuilt;
    }

    public void setShipName(String _shipName){
        this.shipName = _shipName;
    }
    public void setYearBuilt(String _yearBuilt){
        this.yearBuilt = _yearBuilt;
    }

    public String toString(){
        return "Name: "+shipName+" Year: "+yearBuilt;
    }
}