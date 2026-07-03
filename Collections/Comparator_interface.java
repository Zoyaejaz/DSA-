import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Student_comparable {
    public int age;
    public String name;
    public int weight;
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
    public Student_comparable(int age,String name,int weight){
        this.age=age;
        this.name=name;
        this.weight=weight;
    }
}

public class Comparator_interface {
   public static void main(String[] args){
     List<Student_comparable> list=new ArrayList<>();
        list.add(new Student_comparable(20,"John",70));
        list.add(new Student_comparable(18,"Alice",60));
        list.add(new Student_comparable(22,"Bob",80));
        list.add(new Student_comparable(20,"Dave",65));

        System.out.println("Before sorting:");
        for(Student_comparable s: list){
            System.out.println(s.name+" "+s.age+" "+s.weight);
        }

        // Sort using a Comparator: first by age ascending, then by weight ascending
        Collections.sort(list, new Comparator<Student_comparable>(){
            @Override
            public int compare(Student_comparable o1, Student_comparable o2){
                if(o1.age != o2.age){
                    return o1.age - o2.age;
                }
                return o1.weight - o2.weight;
            }
        });

        System.out.println("After sorting:");
        for(Student_comparable s: list){
            System.out.println(s.name+" "+s.age+" "+s.weight);
        }
   }
}
