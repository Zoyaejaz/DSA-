import java.util.HashSet;
import java.util.Set;
public class Set_Interface {
    public static void main
    (String[] args){
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);    
        set.add(20);
        set.add(10);
        System.out.println(set); //it will not allow duplicate values in the set
        //set does not maintain the insertion order of the elements. If we want to maintain the insertion order of the elements then we can use LinkedHashSet instead of HashSet.
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(10);
        set1.add(20);
        set1.add(3);
        System.out.println("Before retainAll: "+ set);
        set.retainAll(set1); //it will retain the common elements of both the sets
        System.out.println("After retainAll: "+ set);

    }
    
}
