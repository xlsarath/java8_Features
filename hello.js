var hello = function(){  
    print("Hello Nashorn");  
};  
hello();  

var hello1 = function(msg){  
    print("Hello ${msg}");  
};  
hello1("Nashron"); 


print("Hello "+name);  

print(java.lang.Math.sqrt(4));  


var importFile = new JavaImporter(java.util);  
var a = new importFile.ArrayList();  
a.add(12);  
a.add(20);  
print(a);  
print(a.getClass());

var importIt = new JavaImporter(java.lang.String,java.util,java.io);  
with (importIt) {  
  var linkedHS = new LinkedHashSet();  
  linkedHS.add(new File("abc"));  
  linkedHS.add(new File("hello.js"));  
  linkedHS.add("india".toUpperCase());  
}  
print(linkedHS);  

