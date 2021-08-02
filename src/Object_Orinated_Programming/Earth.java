package Object_Orinated_Programming;

public class Earth {
    public static void main(String[] args) {
        
        Human Tom = new Human("Tom", 23, 90 , "Brown");
        Animal Tiger = new Animal(10, "Male", 250);
        Fish fish = new Fish(3,"male",5,"Oscar");
        Bird bird = new Bird(1,"Female",3,"toca");

        Tom.speak();
        System.out.println(Tiger.WeightInIbs);
        System.out.println(fish.breed);
        System.out.println(bird.gender);
    }
}
