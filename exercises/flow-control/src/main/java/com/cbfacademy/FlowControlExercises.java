package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    private List<String> list;

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> intNumbers = new ArrayList<>();
     // - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        List<Integer> number = List.of(1, 3, 5, 15, 16, 18, 20, 30);
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        If(numbers  % 3 == 0); numbers.add("Fizz");
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        if(numbers % 5 == 0); numbers.add("Buzz");
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        if(numbers % 3  == 0 && numbers % 5 == 0); numbers.add("FizzBuzz");
        //  - it adds the element to the list in any other case
        if(numbers % 3 != 0 && numbers % 5 != 0); numbers.add(null);
        //  - it returns the constructed list
        return list;
    }

    public String whichMonth(Integer number) {
        //  - Implement this method such that
        String[] months = {"January", "February", "March", "April", "May", "June", 
                       "July", "August", "September", "October", "November", "December"};
      //  - it returns the month corresponding to the input ${number}
      if (number != null && number >= 1 && number <= 12) {
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        return months[number - 1];
    } else {
        // Return invalid message if the number is not valid)
        return Invalid month number;
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
