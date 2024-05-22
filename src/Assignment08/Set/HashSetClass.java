package Assignment08.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {

    public void display(){
        Set<String> set = new HashSet<>();
        set.add("Mohai");
        set.add("Minul");
        set.add("Islam");
        set.add("Mohai"); //Duplicate value not allowed in Set

        Set<String> set1 = new HashSet<>();
        set1.add("Nayeem");
        set1.add("Jack");

        set.addAll(set1);

        for(String value_of_set : set){
            System.out.println(value_of_set);
        }
    }
}
