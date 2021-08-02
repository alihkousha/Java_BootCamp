package JAVA_BootCamp;

public class StringPractice {
    public static void main(String[] args) {
        

        String a = "hello";
        String b = "there";

        if (a == "hello"){
            //dont do this cause it is a trap
        }

        if (a.equals("hello")){
            //use this!!
        }

        if(b.equalsIgnoreCase("tHeRe")){
            System.out.println("Printed there");
        }

        System.out.println(a.charAt(3));
        System.out.println(a.indexOf("l"));
    }
}
