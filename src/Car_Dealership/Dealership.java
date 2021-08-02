package Car_Dealership;

public class Dealership {
    public static void main(String[] args) {
        Customers cust1 = new Customers();
        Employess emp;
        Vehicels vehicel;

        emp = new Employess();
        vehicel = new Vehicels();
        vehicel.setColor("Red");
        vehicel.setModel("Land Crouser");
        cust1.setCashOnHand(50000);
        cust1.setName("Peterman");        
        vehicel.setPrice(70000);

        cust1.purchaseCar(vehicel, emp, false);
    }
}
