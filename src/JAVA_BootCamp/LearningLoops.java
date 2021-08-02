package JAVA_BootCamp;


public class LearningLoops {
    public static void main(String[] args) {
        
        int i = 0;
        while(i <= 100){
            System.out.println("the value of i is: " + i);
            i +=1;
            if(i == 57){
                break;
            }
        }

        String name = "hgdhgdjgakwhdkahwdugwdfvjdwgdwgdjadgja";
        for (int j=0;j<name.length();j++){
            System.out.println("Charector: "+name.charAt(j));
        }

        int z;
        for (z=100;z>=0;z--){
            System.out.println("z: "+z);
        }

        int d;
        for(d=0;d<100;d+=2){
            System.out.println("d: "+d);
        }

        int y;
        for(y=0;y<=100;y++){
            if (Even(y)){
                System.out.println(y);
            }
        }
    }
    //important Tip dont ever modify a method in main method
    public static boolean Even(int num){
        if (num % 2 == 0){
            return false;
        }else{
            return true;
        }
    }
}
