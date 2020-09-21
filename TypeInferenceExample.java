import java.util.*;

class GenericClass<X> {  
    X name;  
  public void setName(X name){  
      this.name = name;  
    }  
  public X getName(){  
      return name;  
    }  
  public String genericMethod(GenericClass<String> x){  
      x.setName("John");  
      return x.name;  
    }  
} 

public class TypeInferenceExample {

    public static void showList(List<Integer>list){  
        if(!list.isEmpty()){  
            list.forEach(System.out::println);  
        }else System.out.println("list is empty");  
    }  
    public static void main(String[] args) {  
        // An old approach(prior to Java 7) to create a list  
        List<Integer> list1 = new ArrayList<Integer>();  
        list1.add(11);  
        showList(list1);  
        // Java 7    
        List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type  
        list2.add(12);  
        showList(list2);  
        // Compiler infers type of ArrayList, in Java 8  
        showList(new ArrayList<>());  

        GenericClass<String> genericClass = new GenericClass<String>();  
        genericClass.setName("Peter");  
        System.out.println(genericClass.getName());  
          
        GenericClass<String> genericClass2 = new GenericClass<>();  
        genericClass2.setName("peter");  
        System.out.println(genericClass2.getName());  
      
        // New improved type inference  
        System.out.println(genericClass2.genericMethod(new GenericClass<>()));  
    }  
}