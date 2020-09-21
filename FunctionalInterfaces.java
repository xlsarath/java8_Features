interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
} 

@FunctionalInterface
interface example extends Doable{
    void say(String msg); //abstract method
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj); 
}

public class FunctionalInterfaces implements example {

    public void say(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaces functionalInterfaces = new FunctionalInterfaces();
        functionalInterfaces.say("Hello");
        functionalInterfaces.doIt();
    }


}