import java.util.function.Predicate;

public class PredicateInterfaceExample {

    static Boolean checkAge(int age){  
        if(age>17)  
            return true;  
        else return false;  
    }  
    public static void main(String[] args) {  
        Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
        System.out.println(pr.test(10));    // Calling Predicate method    
     // Using Predicate interface  
     Predicate<Integer> predicate =  PredicateInterfaceExample::checkAge;  
     // Calling Predicate method  
     boolean result = predicate.test(25);  
     System.out.println(result);  
    }  

}