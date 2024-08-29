package com.cbfacademy.strings;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

    public static void main( String[] args ) {
        System.out.println( "Hello World!" ); 
    
    }
    public static String concatenate(String word1, String word2, String word3) {
        // Write code that concatenates the input parameters and returns the result
      return word1 + word2 + word3;
    
    }

    public static Boolean areEqual(String word1, String word2) {
        //  Write code to determine whether the input parameters are equal strings
        return word1.equals(word2);

    }
    

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[price]. Quantity: [quantity]". The price should be formatted to two decimal places, e.g. 99.99
        String lineItem = format("Apple iPhone 15 Pro", 47, 1199.99);

        return String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
    }
}
}

        


    
    


