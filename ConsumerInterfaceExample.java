import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerInterfaceExample {
    static void printMessage(String name){  
        System.out.println("Hello "+name);  
    }  
    static void printValue(int val){  
        System.out.println(val);  
    }  
    static void addList(List<Integer> list){  
        // Return sum of list values  
        int result = list.stream()
                   .mapToInt(Integer::intValue)
                   .sum();  
        System.out.println("Sum of list values: "+result);  
    }  
    static Integer addLs(List<Integer> list){  
        // Return sum of list values  
        return list.stream()
                   .mapToInt(Integer::intValue)
                   .sum();  
        
    }  
    public static void main(String[] args) {  
         // Referring method to String type Consumer interface   
         Consumer<String> consumer1 = ConsumerInterfaceExample::printMessage;  
         consumer1.accept("John");   // Calling Consumer method  
         // Referring method to Integer type Consumer interface  
         Consumer<Integer> consumer2 = ConsumerInterfaceExample::printValue;  
         consumer2.accept(12);   // Calling Consumer method  
        // Creating a list and adding values  
                List<Integer> list = new ArrayList<Integer>();  
                list.add(10);  
                list.add(20);  
                list.add(30);  
                list.add(40);  
        // Referring method to String type Consumer interface   
        Consumer<List<Integer>> consumer = ConsumerInterfaceExample::addList;  
        consumer.accept(list);  // Calling Consumer method  
          
        // Referring addLs() method  
        Function<List<Integer> ,Integer> fun = ConsumerInterfaceExample::addLs;
        // Calling Function interface method  
        int rs = fun.apply(list);
        System.out.println("functional interface "+rs);
    }  
}