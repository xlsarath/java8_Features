
interface Messageble{
    ReferenceToConstructor message(String msg);
}

public class ReferenceToConstructor {

    ReferenceToConstructor (String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        
        Messageble hello = ReferenceToConstructor::new;
        hello.message("hello");
    }

}