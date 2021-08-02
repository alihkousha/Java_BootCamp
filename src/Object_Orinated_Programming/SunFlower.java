package Object_Orinated_Programming;

public class SunFlower extends Plant{

    int Color;
    int Height;

    public SunFlower(int Height,int Color){
        this.Height = Height;
        this.Color = Color;
    }
    
    public void grow() {
        System.out.println("Growing....");
        
    }


    public void dieing() {
        System.out.println("Dieing...");
        
    }


    public void watering() {
        System.out.println("Watering...");
        
    }
    
}
