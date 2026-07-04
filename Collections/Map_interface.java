import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
public class Map_interface {
    public static void main(String[] args){
       Map<String, String> mapping=new HashMap<>(); 

       //insertion
       mapping.put("in","India");
       mapping.put("us","United States");
       mapping.put("en","England");
       mapping.put("in","Indonesia"); //it will replace the value of key "in"
       System.out.println(mapping); //it will not allow duplicate keys in the map
       Map<String, String> table=new HashMap<>();
       table.put("br","brazil");
       System.out.println("Before: "+ table);
       table.putAll(mapping);
       System.out.println("After: "+ table);


       //DELETION
       table.remove("en"); //it will remove the key-value pair of key "en"
       System.out.println("After removing: "+ table);

       System.out.println(table.size());
       table.clear(); //it will remove all the key-value pairs from the map
         System.out.println("After clearing: "+ table);

         //replace
         mapping.replace("us","USA");
         System.out.println("After replacement: "+ mapping);

         //get all entries from the map
         Set<Map.Entry<String,String>> entry=mapping.entrySet();
         for(Map.Entry<String,String> e:entry){
            System.out.println(e.getKey()+" : "+ e.getValue());
         }

         //get all keys from the map
         Set<String> keys=mapping.keySet();
            for(String key:keys){
                System.out.println(key);
            }

        //get all values from the map
        for(String value:mapping.values()){
            System.out.println(value);
        }



        //Treemap
        TreeMap<String,Integer> tmap=new TreeMap<String,Integer>();
        tmap.put("A", 10);
        tmap.put("B", 2);
        System.out.println(tmap);


        
    }
}
