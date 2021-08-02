package Object_Orinated_Programming;

public class Animal {
    
    int age;
    String gender;
    int WeightInIbs;

    public Animal(int age, String gender, int WeightInIbs){
        this.age = age;
        this.gender = gender;
        this.WeightInIbs = WeightInIbs;
    }

    public void eating(){
        System.out.println("eating...");
    }

    public void walking(){
        System.out.println("Walking...");
    }

    public void sleeping(){
        System.out.println("Sleeping...");
    }
}
