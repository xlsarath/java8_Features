import java.util.*;

abstract class AbstractClass {

    public AbstractClass(){
        System.out.println(" u r inside abstract class constructor");
    }

    abstract int add(int a, int b);

    int sub (int a, int b){
        return a-b;
    }

    static int multiply(int a, int b){
        return a * b;
    }

}


public class AbstractTest extends AbstractClass{

    @Override
    int add(int a, int b) {
        // TODO Auto-generated method stub
        return a + b;
    }

    public static void main(String[] args) {
        AbstractTest a = new AbstractTest();    
        int result1 = a.add(20, 10);    // calling abstract method    
        int result2 = a.sub(20, 10);    // calling non-abstract method    
        int result3 = AbstractClass.multiply(20, 10); // calling static method    
        System.out.println("Addition: "+result1);    
        System.out.println("Substraction: "+result2);    
        System.out.println("Multiplication: "+result3);  
        
        
        List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        System.out.println("------------Iterating by passing lambda expression---------------");  
        gamesList.stream().forEachOrdered(games -> System.out.println(games));  
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList.stream().forEachOrdered(System.out::println);  
    }

}