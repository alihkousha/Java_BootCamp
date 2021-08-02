package Object_Orinated_Programming;


public class Human {

    String Name;
    int age;
    int hightInInches;
    String eyeColor;
    
    public Human(String Name,int age,int hightInInches,String eyeColor){
        super();
        this.Name = Name;
        this.age = age;
        this.hightInInches = hightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("Hello My name is " + Name);
        System.out.println("My age is " + age);
        System.out.println("My hight is " + hightInInches);
        System.out.println("My eyecolor is " + eyeColor);
    }

    public void eat(){
        System.out.println("eating..");
    }
    public void walk(){
        System.out.println("walking..");
    }
    public void work(){
        System.out.println("working..");
    }
}
