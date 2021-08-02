package Car_Dealership;

public class Vehicels {
    private double Price;
    private String Model;
    private String Color;
    private double discount;
    
    public double getPrice() {
        return Price;
    }
    public double getDiscount() {
        return (discount/100)*this.Price;
    }
    public void setDiscount(double discount) {
        this.Price = this.Price - ((discount/100)*this.Price);
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        this.Color = color;
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        this.Model = model;
    }
    public void setPrice(double price) {
        this.Price = price;
    }
}
