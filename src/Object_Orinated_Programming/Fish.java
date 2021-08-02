package Object_Orinated_Programming;

public class Fish extends Animal {
    
    String breed;

    public Fish(int age,String gender , int WeightInIbs,String breed){
        super(age,gender,WeightInIbs);
        this.breed = breed;
    }

    public void swim(){
        System.out.println("Swimming....");
    }
}
