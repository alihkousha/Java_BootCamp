package Car_Dealership;

public class Customers {
    private double CashOnHand;
    private String Address;
    private String Name;
    private double debt;
    
    public String getName() {
        return Name;
    }
    public double getDebt() {
        return debt;
    }
    public void setDebt(double debt) {
        this.debt = debt;
    }
    public double getCashOnHand() {
        return CashOnHand;
    }
    public void setCashOnHand(double cashOnHand) {
        this.CashOnHand = cashOnHand;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        this.Address = address;
    }
    public void setName(String name) {
        this.Name = name;
    }
    
    public void purchaseCar(Vehicels vehicel,Employess emp,boolean finance){
        emp.setName("emp");
        emp.handleCustomer(this, finance, vehicel);
    }
}
