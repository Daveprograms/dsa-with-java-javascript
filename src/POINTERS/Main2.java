package POINTERS;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        HashMap< String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2=   new HashMap<>();
        HashMap<String, Integer> map3= new HashMap<>();

        map1.put("Value", 11);
        map3 .put("Value",59);
        map1=map3;

        map2=map3;


        
        //That is because map2 is point to map1, which means as long as  in the hash map no matter the valuse u change for map 1 , map2 will pick it up


        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);

    }



}
