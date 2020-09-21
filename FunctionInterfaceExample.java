import java.util.function.Function;

public class FunctionInterfaceExample {

    static String show(String msg){
        return "Hello : "+msg;
    }

    public static void main(String[] args) {
        
        Function<String,String> fun = FunctionInterfaceExample::show;
        System.out.println(fun.apply("String"));
    }
}