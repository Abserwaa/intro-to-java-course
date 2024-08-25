package com.cbfacademy;

import java.net.http.WebSocket.Listener;
import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        //  create an empty linked list
        LinkedList<Integer> integers = new LinkedList<>();
        //  - add 4 as the first element of the list
        integers.add(4);
        //  - then add 5, 6, 8, 2, 9 to the list
       integers.add(5);
       integers.add(6);
       integers.add(8);
       integers.add(2);
       integers.add(9); 
        //  - add another 2 as the last element of the list
       integers.addLast(2);
       //  - add 4 as the 3rd element of the list
       integers.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
         System.out.print(integers.element());
         //  - return the list
        return integers;
        
    }

    public Stack<Integer> useStack() {
        //  create an empty stack
           Stack<Integer> stackedIntegers = new Stack<>();
         //  - add 5, 6, 8, 9 to the stack
            stackedIntegers.add(5);
            stackedIntegers.add(6);
            stackedIntegers.add(8);
            stackedIntegers.add(9);
         //  - print the first element of the stack on the screen
        System.out.print(stackedIntegers.firstElement());
        //  - print the last element of the stack on the screen
        System.out.print(stackedIntegers.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(stackedIntegers.pop());
        //  - invoke the push(4) method on the stack
        stackedIntegers.push(4);
        //  - return the stack
        return stackedIntegers;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        //  create an empty arrayDeque
        ArrayDeque<Integer> dArrayDeque = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the queue
        dArrayDeque.add(5);
        dArrayDeque.add(6);
        dArrayDeque.add(8);
        dArrayDeque.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(dArrayDeque.getFirst());
        //  - print the last element of the queue on the screen
        System.out.print(dArrayDeque.getLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(dArrayDeque.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(dArrayDeque.element());
        //  - return the queue
        return dArrayDeque;
    }

    public HashMap<Integer, String> useHashMap() {
        //  create an empty hash map
        HashMap<Integer, String> hash = new HashMap<>();
         //  - add {1, TypeScript} entry to the map
        hash.put(1,"TypeScript");
         //  - add {2, Kotlin} entry to the map
        hash.put(2,"Kotlin");
        //  - add {3, Python} entry to the map
        hash.put(3, "Python");
        //  - add {4, Java} entry to the map
        hash.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        hash.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        hash.put(6,"Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(hash.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.print(hash.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
       System.out.print(hash.containsValue("English"));
        //  - return the map
        return hash;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
