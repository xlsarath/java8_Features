import javax.script.*;  
import java.io.*;  
public class NashornExample {  
    public static void main(String[] args) throws Exception{  
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
       ee.eval(new FileReader("hello.js"));  

        ee.eval("print('Hello Nashorn');");


        //Binding script and Define scope of script  
        Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);  
        bind.put("name", "Nashorn sarath");  
        // Reading Nashorn file  
        ee.eval(new FileReader("hello.js"));  
/** 
        ee = new ScriptEngineManager().getEngineByName("Nashorn");  

        ee.eval(new FileReader("hello2.js"));

        Invocable invocable = (Invocable)ee;  
        // calling a function  
        invocable.invokeFunction("functionDemo1");  
        // calling a function and passing variable as well.  
        invocable.invokeFunction("functionDemo2","Nashorn");       

        */
    }  
}  