/*
Ship Class
Provides a base class for ships

Variables:
String shipName
String yearBuilt
*/
public class Ship{
    String shipName;
    String yearBuilt;
    //default constructor
    public Ship(){
        this.shipName = "";
        this.yearBuilt = "0000";
    }
    //constructor
    //@requires: String, String
    public Ship(String _shipName, String _yearBuilt){
        this.shipName = _shipName;
        this.yearBuilt = _yearBuilt;
    }
    //getter: Ship Name
    public String getShipName(){
        return shipName;
    }
    //getter: Year Built
    public String getYearBuilt(){
        return yearBuilt;
    }
    //setter: Ship Name
    public void setShipName(String _shipName){
        this.shipName = _shipName;
    }
    //setter: Year Built
    public void setYearBuilt(String _yearBuilt){
        this.yearBuilt = _yearBuilt;
    }
    //Overrides toString() to display shipName and YearBuild
    //ex Name: Hello Year: 1990
    public String toString(){
        return "Name: "+shipName+" Year: "+yearBuilt;
    }
}