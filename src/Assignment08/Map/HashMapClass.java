package Assignment08.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    public void mapDisplay(){

        Map<String,Object> objectMap = new HashMap<>();

        objectMap.put("Name","Md. Mohai Minul Islam");
        objectMap.put("Address","Rajshahi");
        objectMap.put("Age",28);
        objectMap.put("Weight",62);
        objectMap.put("Height",5.7);

        System.out.println(objectMap);
        System.out.println("-----------------------");


        for(String keys : objectMap.keySet()){

            System.out.println(objectMap.get(keys));

        }

    }
}
