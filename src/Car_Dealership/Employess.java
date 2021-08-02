package Car_Dealership;

public class Employess {
    
    private String name;
    private int Emp_id;
    private int sallery;
    
    public String getName() {
        return name;
    }
    public int getSallery() {
        return sallery;
    }
    public void setSallery(int sallery) {
        this.sallery = sallery;
    }
    public int getEmp_id() {
        return Emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.Emp_id = emp_id;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void handleCustomer(Customers cust,boolean finance,Vehicels vehicel){
        if(finance == true){
            runCreditHistory(cust,vehicel.getPrice()-cust.getCashOnHand());
            System.out.println(vehicel.getColor() +" "+vehicel.getModel() + " was sold to: Mr/Mrs." + cust.getName() + " with Credits.");
        }else if(vehicel.getPrice() <= cust.getCashOnHand()){
            processTransaction(cust, vehicel);
        }else{
            System.out.println("Bring More Money.");
        }
    }

    public void runCreditHistory(Customers cust,double doubleAmount){
        cust.setDebt(doubleAmount);
    }
    public void processTransaction(Customers cust,Vehicels vehicel){
        cust.setCashOnHand(cust.getCashOnHand()-vehicel.getPrice());
        System.out.println(vehicel.getColor() +" "+vehicel.getModel() + " was sold to: Mr/Mrs." + cust.getName());
    }
}
