public class Truck {
//attributes
    private String model;
    private String color;
    private double cost;
    private String truckSize;
    private int engineSize;

//constructors
public Truck(){
    model = "Ford";
    color = "Black";
    cost = 25000.00;
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