package ProcessingFiles;

public class Vehicles {
    
    String make;
    String model;
    int price;
    String BodyDesign;
    String FuelType;
    int HorsePower;
    public Vehicles(String make, String model, int price, String bodyDesign, String fuelType, int horsePower) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.BodyDesign = bodyDesign;
        this.FuelType = fuelType;
        this.HorsePower = horsePower;
    }
    @Override
    public String toString(){
        return "vehicle [make="+make +", modle=" +model + ", price="+price+", BodyDesign="+ BodyDesign + ", FuelType=" + FuelType +", horsepwer="+HorsePower+"]";
    }
}
