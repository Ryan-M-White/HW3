public class Car extends Vehicle {
//attributes
    private String model;
    private String color;
    private double cost;
    private String carType;
    private Boolean hasTowingPackage;


//constructors
/** 
* Default Constructor for Car initializes the object with arbitrary values.
*/
public Car(){
    model = "Chevrolet";
    color = "Red";
    cost = 17000.25;
    carType = "Muscle";
    hasTowingPackage = true;
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

    public void setCarType(String _carType){
        carType = _carType;
    }

    public void setHasTowingPackage(Boolean _hasTowingPackage){
        hasTowingPackage = _hasTowingPackage;
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

    public String getCarType(){
        return carType;
    }

    public Boolean getTowingPackage(){
        return hasTowingPackage;
    }

}