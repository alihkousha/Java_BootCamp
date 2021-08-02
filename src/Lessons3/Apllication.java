package Lessons3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Generics
public class Apllication {
    
    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        mylist.add("Generics");
        mylist.add(100);
        mylist.add(true);

        String myvar = (String) mylist.get(0);
        int myvar_2 = (Integer) mylist.get(1);
        boolean myvar_3 = (Boolean) mylist.get(2);
        System.out.println(myvar);
        System.out.println(myvar_2);
        System.out.println(myvar_3);

        Container container = new Container(12, "Hello");

        Object container_value1 = container.getItem1();
        Object container_value2 = container.getItem2();
        System.out.println(container_value1);
        System.out.println(container_value2);

        //two term of determining Object Variable can be used 1.use Object Class or Datatype for variable and (Datatype) for calling them
        //but with Generics
        
        Container2<Integer,String> container2 = new Container2<Integer,String>(12, "Hello");
        
        int val1 = container2.getItem1();
        String val2 = container2.getItem2();
        System.out.println(val1);
        System.out.println(val2);

        Set<String> mySet = new HashSet<>();
        mySet.add("first");
        mySet.add("second");
        mySet.add("whatever");
        
        Set<String> mySet2 = new HashSet<>();
        mySet2.add("first");
        mySet2.add("second");
        mySet2.add("Compter");

        Set<String> ResualtSet = union(mySet,mySet2); 
        Iterator<String> itr = ResualtSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static <E> Set<E> union(Set<E> set1,Set<E> set2){
        Set<E> result = new HashSet<E>(set1);
        result.addAll(set2);
        return result;
    }
}
