/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sameer.jpr03;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author smutl
 */
public class JPR03 {

//    https://codefinity.com/courses/v2/190d2568-3d25-44d0-832f-da03468004c9/c0bcd017-ff39-46ec-bc93-acd569f3497d/d56d7f54-9992-491a-a50f-64ceee652f04
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = numbers.stream().map( b -> b*b).toList();
        System.out.println(result);
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        Integer res = names.stream().map( p -> p.length()).max((x, y) -> Integer.compare(x, y)).get();
        System.out.println(res);
    }
}
