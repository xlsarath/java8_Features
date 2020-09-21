import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Products {
    int id;  
    String name;  
    float price;  
    public Products(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  

    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}  

public class JavaStreamExample {
    public static void main(String[] args) {  
        List<Products> productsList = new ArrayList<Products>();  
        //Adding Products  
        productsList.add(new Products(1,"HP Laptop",25000f));  
        productsList.add(new Products(2,"Dell Laptop",30000f));  
        productsList.add(new Products(3,"Lenevo Laptop",28000f));  
        productsList.add(new Products(4,"Sony Laptop",28000f));  
        productsList.add(new Products(5,"Apple Laptop",90000f));  
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);  


        // This is more compact approach for filtering data  
        productsList.stream()  
                             .filter(product -> product.price == 30000)  
                             .forEach(product -> System.out.println(product.name));   


        Stream.iterate(1, element->element+1)  
        .filter(element->element%5==0)  
        .limit(5)  
        .forEach(System.out::println);  

        // This is more compact approach for filtering data  
        Float totalPrice = productsList.stream()  
                    .map(product->product.price)  
                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
        System.out.println(totalPrice);  

        float totalPrice2 = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
        System.out.println(totalPrice2);  

                // Using Collectors's method to sum the prices.  

        double totalPrice3 = productsList.stream()
                                .collect(Collectors.summingDouble(product -> product.price));
        System.out.println(totalPrice3);

        // max() method to get max Product price   

        Products pr = productsList.stream()
                        .max((a,b) -> 
                        a.price > b.price ? 1 : -1).get();
        System.out.println(pr.price);

         // min() method to get min Product price  
         Products productB = productsList.stream()  
                                         .max((product1, product2)->   
                                            (product1.price < product2.price ? 1: -1)).get();  
            System.out.println(productB.price);  

        // count number of products based on the filter  
        long count = productsList.stream()  
                    .filter(product->product.price<30000)  
                    .count();  
        System.out.println(count); 
        
         // Converting product List into Set  
         Set<Float> productPriceList =   
         productsList.stream()  
         .filter(product->product.price < 30000)   // filter product on the base of price  
         .map(product->product.price)  
         .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
     System.out.println(productPriceList);  

     //Converting product List into Map

     Map<Integer,String> map = productsList.stream()
                                .collect(Collectors.toMap(p-> p.id, p -> p.name));
    
    System.out.println(map);


    List<Float> productpriceList = productsList.stream()
                                    .filter(p -> p.price > 30000)
                                    .map(Products::getPrice)
                                    .collect(Collectors.toList());
    System.out.println(productpriceList);


    //for each in streams

    productsList.stream().filter(p -> p.price < 30000).map(p -> p.price).forEach(System.out::println);
    }  
}