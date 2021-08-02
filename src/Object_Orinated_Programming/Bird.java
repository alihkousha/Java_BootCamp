package Object_Orinated_Programming;

// Bird is child class of animal with extends method
public class Bird extends Animal{

    String breed;

    public Bird(int age, String gender, int WeightInIbs, String breed){
        super(age,gender,WeightInIbs);
        this.breed = breed;
    }
}
