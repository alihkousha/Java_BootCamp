package JAVA_BootCamp;

public class ControlFlow {
    
    public static void main(String[] args) {
        
        boolean Hungry = true;

        if (Hungry==false){
            System.out.println("you are good to go");
        }
        else{
            System.out.println("Eat Somthing");
        }

        if (0 < 2) {
            System.out.println("you are wrong!!!...");
        }
        //else{
            //System.out.println("Yes");
        //}

        int count  = 1;

        if (count == 1 ) {
            System.out.println("the value is 1");    
        }
        else{
            System.out.println("The value is not 1");
        }

        int HungryRating = 5;
        // ! this sign means the follownig statenment --not-- true.
        if (!(HungryRating < 6)) {
            System.out.println("You're not Hungry");
        } else {
            System.out.println("You're Hungry");
        }

        int FavoriteTemp = 75;
        int CurrentTemp = 60;
        String Opinion;

        if(CurrentTemp < FavoriteTemp - 30){
            Opinion = "Temp is to low!!";
        }else if(CurrentTemp < FavoriteTemp - 20){
            Opinion = "Its better";
        }else{
            Opinion = "Its Beautiful Day!!!";
        }

        System.out.println(Opinion);

        //nested if-else
        if (FavoriteTemp == CurrentTemp) {
            if(CurrentTemp < FavoriteTemp - 30){
                Opinion = "Temp is to low!!";
            }else if(CurrentTemp < FavoriteTemp - 20){
                Opinion = "Its better";
            }else{
                Opinion = "Its Beautiful Day!!!";
            }    
        } else {
            Opinion = "Unkown";
        }

        System.out.println(Opinion);

        int month = 6;
        String monthString;

        switch (month) {
            case 1: monthString = "Jan";                 
                break;
            case 2: monthString = "Feb";                 
                break;
            case 3: monthString = "Mar";                 
                break;
            case 4: monthString = "April";                 
                break;
            case 5: monthString = "May";                 
                break;
            case 6: monthString = "June";                 
                break;        
            default: monthString = null;
                break;
        }
        System.out.println(monthString);
    }
}
