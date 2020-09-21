import java.util.Base64;

public class EncodeAndDecode {

    public static void main(String[] args) {
          // Getting encoder  
          Base64.Encoder encoder = Base64.getEncoder();  
          // Creating byte array  
          byte byteArr[] = {1,2};  
          // encoding byte array  
          byte byteArr2[] = encoder.encode(byteArr);  
          System.out.println("Encoded byte array: "+byteArr2);  
          byte byteArr3[] = new byte[5];                // Make sure it has enough size to store copied bytes  
          int x = encoder.encode(byteArr,byteArr3);    // Returns number of bytes written  
          System.out.println("Encoded byte array written to another array: "+byteArr3);  
          System.out.println("Number of bytes written: "+x);  
        
          // Encoding string  
          String str = encoder.encodeToString("JavaTpoint".getBytes());  
          System.out.println("Encoded string: "+str);  

          // Getting decoder  
          Base64.Decoder decoder = Base64.getDecoder();  
          // Decoding string  
          String dStr = new String(decoder.decode(str));  
          System.out.println("Decoded string: "+dStr);  

           // Encoding URL  
        encoder = Base64.getUrlEncoder();  
        String eStr = encoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());  
        System.out.println("Encoded URL: "+eStr);  
        // Getting decoder  
        decoder = Base64.getUrlDecoder();  
        // Decoding URl  
        String dStrr = new String(decoder.decode(eStr));  
        System.out.println("Decoded URL: "+dStrr);  


        // Getting MIME encoder  
        encoder = Base64.getMimeEncoder();  
        String message = "Hello, \nYou are informed regarding your inconsistency of work";  
        String eStrMIME = encoder.encodeToString(message.getBytes());  
        System.out.println("Encoded MIME message: "+eStrMIME);  
          
        // Getting MIME decoder  
        decoder = Base64.getMimeDecoder();  
        // Decoding MIME encoded message  
        String dStrMIME = new String(decoder.decode(eStrMIME));  
        System.out.println("Decoded message: "+dStrMIME);  

    }

}