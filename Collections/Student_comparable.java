import java.util.*;
public class Student_comparable implements Comparable<Student_comparable>{
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
    @Override
    public int compareTo(Student_comparable s){
        if(this.age != s.age){
            return this.age - s.age; // sort ascending by age
        }
        return this.name.compareTo(s.name); // if ages equal, sort by name
    }
}

class Comparable_02 {
    public static void main(String[] args){
        List<Student_comparable> list=new ArrayList<>();
        list.add(new Student_comparable(20,"John",70));
        list.add(new Student_comparable(18,"Alice",60));
        list.add(new Student_comparable(22,"Bob",80));
        System.out.println("Before sorting: ");
        for(Student_comparable s:list){
            System.out.println(s.getName()+" "+s.getAge()+" "+s.getWeight());
        }
        Collections.sort(list);
        System.out.println("After sorting:");
        for(Student_comparable s:list){
            System.out.println(s.getName()+" "+s.getAge()+" "+s.getWeight());
        }
    }
}
