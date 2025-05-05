/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sameer.common;

import org.reactivestreams.Subscriber;
import reactor.core.publisher.Mono;

/**
 *
 * @author smutl
 */
public class Util {
    public static <T> Subscriber<T> subscriber(){
        return new DefaultSubscriber<>("");
    }
    public static <T> Subscriber<T> subscriber(String name){
        return new DefaultSubscriber<>(name);
    }
    
    public static void main(String[] args){
        var mono = Mono.just(1);
        
        mono.subscribe(subscriber("sub1"));
        mono.subscribe(subscriber("sub2"));
    }
}
