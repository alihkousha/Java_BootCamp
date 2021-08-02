package ProcessingFiles;

import java.util.ArrayList;


public class ListArray {
    
    public static void main(String[] args) {
        // be aware that classes in any list between these <> should be Capitalized(first Charector)
        ArrayList<String> FirstArray = new ArrayList<String>();
        FirstArray.add("Hello");
        FirstArray.add("this");
        FirstArray.add("is");
        FirstArray.add("my first");
        FirstArray.add("normal :') array");
        int x = 0;
        while(x < FirstArray.size()){
            //for changing cell value use set method.
            //for accessing value use get method
            FirstArray.set(x, FirstArray.get(x)+"| passed");
            System.out.println(FirstArray.get(x));
            x +=1;
            // for removing a cell and value use remove method. example: FirstArray.remove(index)
        }
        for (String i : FirstArray){
            System.out.println(i+" |for loop");
        }
        ArrayList<Vehicles> vehicel = new ArrayList<Vehicles>();
        for (int i=0;i<10;i++){
            vehicel.add(new Vehicles("Porsche", "Taycan",80000,"SUV","Gasoline",6311));
        }
        for(int i=0;i<10;i++){
            System.out.println(vehicel.get(i).toString());
        }
    }
}
