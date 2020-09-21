import java.util.*;

@FunctionalInterface
interface Addable{
    int add(int a, int b);
}

interface Sayable{
    String say(String message);
}



public class LambdaExpressionExample {

    public static void main(String[] args) {
        int width = 10;

        Drawable draw = new Drawable(){
        
            @Override
            public void draw() {
                System.out.println(" Draw : "+width);
                
            }
        };

        draw.draw();
    
    
    //In Java 8
    //A lambda expression can have zero or any number of arguments. Let's see the examples:

    Drawable d = ()->{
        System.out.println("Draw lambda Exp "+width);
    };
    d.draw();


    Addable addable = (a,b) -> (a+b);
    System.out.println(addable.add(10, 20));

    // Multiple parameters with data type in lambda expression  
    Addable ad2=(int a,int b)->(a+b);  
    System.out.println(ad2.add(100,200));  

     // Lambda expression with return keyword.    
     Addable ad3=(int a,int b)->{  
        return (a+b);   
        };  
    System.out.println(ad3.add(100,200));  


    List<String> list=new ArrayList<String>();  
    list.add("ankit");  
    list.add("mayank");  
    list.add("irfan");  
    list.add("jai");  

        list.forEach((n)->System.out.println(n));
    
    // You can pass multiple statements in lambda expression  
    Sayable person = (message)-> {  
        String str1 = "I would like to say, ";  
        String str2 = str1 + message;   
        return str2;  
    };  
        System.out.println(person.say("time is precious."));  
    

    }

}