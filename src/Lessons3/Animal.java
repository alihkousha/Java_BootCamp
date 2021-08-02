package Lessons3;



public class Animal {
    String Breed;
    int Age;
    public Animal(String Breed, int Age) {
        this.Breed = Breed;
        this.Age = Age;
    }

    @Override
    public String toString(){
        return "Animal [Breed=" +Breed +", Age=" + Age +"]";
    }
}
