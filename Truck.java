public class Truck extends Vehicle {
//attributes
    private String model;
    private String color;
    private double cost;
    private String truckSize;
    private int engineSize;

//constructors
/** 
* Default Constructor for Truck initializes the object with arbitrary values.
*/
public Truck(){
    model = "Ford";
    color = "Black";
    cost = 25000.50;
    truckSize = "Half-ton";
    engineSize = 1500;
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

}