public class Car {
//attributes
    private String model;
    private String color;
    private double cost;
    private String carType;
    private Boolean hasTowingPackage;


//constructors
public Car(){
    model = "Chevrolet";
    color = "Red";
    cost = 17000.00;
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