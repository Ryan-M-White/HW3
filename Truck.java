public class Truck extends Vehicle {
//attributes
    private String model;
    private String color;
    private double cost;
    private String truckSize;
    private String engineSize;

//constructors
/** 
* Default Constructor for Truck initializes the object with arbitrary values.
*/
public Truck(){
    model = "Ford";
    color = "Black";
    cost = 25000.50;
    truckSize = "Half-ton";
    engineSize = "1500";
}

//methods
    //setters
    public void setModel(String _model){
        model = _model;
    }

    public void setColor(String _color){
        color = _color;
    }

    public void setCost(Double _cost){
        cost = _cost;
    }

    public void setTruckSize(String _truckSize){
        truckSize = _truckSize;
    }

    public void setEngineSize(String _engineSize){
        engineSize = _engineSize;
    }

    //getters
    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public Double getCost(){
        return cost;
    }

    public String getTruckSize(){
        return truckSize;
    }

    public String getEngineSize(){
        return engineSize;
    }

}