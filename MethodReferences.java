import java.util.function.BiFunction;

class Arithmetic {
    public static int add(int a, int b){
        return a+b;
    }
    public static float add(int a, float b){
        return a+b;
    }
    public static float add(float a, float b){  
        return a+b;  
        }  
}

interface Saying{

    public void say();
    
}

public class MethodReferences { 

    

    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  

    public void saySomething(){
        System.out.println("from non-static method");
    }

    public static void main(String[] args) {
        Thread t = new Thread(MethodReferences::ThreadStatus);
        t.start();
    
        BiFunction<Integer,Integer,Integer> adder1 = Arithmetic::add;
        BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
        BiFunction<Float, Float, Float> adder3 = Arithmetic::add;  
        int result1 = adder1.apply(10, 20);  
        float result2 = adder2.apply(10, 20.0f);  
        float result3 = adder3.apply(10.0f, 20.0f);  
        System.out.println(result1);  
        System.out.println(result2);  
        System.out.println(result3);

        MethodReferences methodReference = new MethodReferences(); // Creating object  
        // Referring non-static method using reference  
            Saying sayable = methodReference::saySomething;  
        // Calling interface method  
            sayable.say();  
            // Referring non-static method using anonymous object  
            Saying sayable2 = new MethodReferences()::saySomething; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say();

        Thread t2 = new Thread(new MethodReferences()::saySomething);
        t2.start();
    }
}