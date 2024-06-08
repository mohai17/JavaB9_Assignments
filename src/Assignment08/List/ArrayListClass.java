package Assignment08.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListClass {
    public void listDisplay(){

        List<Number> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(2,950);
        list.remove(1);

        List<Number> list1 = Arrays.asList(55,56,57);
        list.addAll(list1);

        for(Number value_of_list : list){
            System.out.println(value_of_list);
        }

    }
}
