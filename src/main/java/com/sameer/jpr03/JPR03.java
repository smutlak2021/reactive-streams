/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sameer.jpr03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author smutl
 */

interface MyMathOperation {
    int operate(int a, int b);
}

public class JPR03 {

//https://codefinity.com/courses/v2/190d2568-3d25-44d0-832f-da03468004c9/c0bcd017-ff39-46ec-bc93-acd569f3497d/d56d7f54-9992-491a-a50f-64ceee652f04    
//    https://codefinity.com/courses/v2/190d2568-3d25-44d0-832f-da03468004c9/c0bcd017-ff39-46ec-bc93-acd569f3497d/d56d7f54-9992-491a-a50f-64ceee652f04
    public static void main(String[] args) {
        
        MyMathOperation addition = (a, b) -> a + b;
        System.out.println("Sum: " + addition.operate(5, 3));
        
        System.out.println("Hello World!");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = numbers.stream().map( b -> b*b).toList();
        System.out.println(result);
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        Integer res = names.stream().map( p -> p.length()).max((x, y) -> Integer.compare(x, y)).get();
        System.out.println(res);
        
        List<String> sentences = Arrays.asList(
                "Java Stream API provides a fluent interface for processing sequences of elements.",
                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
                "In this exercise, you need to count the total number of words in all sentences."
        );
        List<String> words1 = sentences.stream().flatMap(p-> Stream.of(p.split(" +"))).distinct().toList();
        System.out.println(words1);
        System.out.println(words1.size());
        
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        System.out.println(words.stream().filter(b -> b.length() % 2 ==0)
                .limit(2)
                .collect(Collectors.joining()));
        
         List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         System.out.println(numbers1.stream().filter(b-> b % 2 ==0).mapToInt(b -> b*b).sum());
         
    }
    
     
}
