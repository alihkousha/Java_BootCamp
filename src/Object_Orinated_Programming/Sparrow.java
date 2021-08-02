package Object_Orinated_Programming;

public class Sparrow extends Bird implements Flyable{

    int color;

    public Sparrow(int age, String gender, int WeightInIbs, String breed,int Color) {
        super(age, gender, WeightInIbs, breed);
        this.color = Color;
    }

    @Override
    public void fly() {
        System.out.println("Flying....");
        
    }
 
}
