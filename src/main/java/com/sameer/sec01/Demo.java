/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sameer.sec01;

import com.sameer.sec01.publisher.PublisherImpl;
import com.sameer.sec01.subsriber.SubscriberImpl;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author smutl
 */
public class Demo {
    public static void main(String[] args){
        demo3();
    }
    
    private static void demo1(){
        var publisher = new PublisherImpl();
        var subscriber = new SubscriberImpl();
        publisher.subscribe(subscriber);
    }
    
    private static void demo2(){
        var publisher = new PublisherImpl();
        var subscriber = new SubscriberImpl();
        publisher.subscribe(subscriber);
        
        try {
            subscriber.getSubscription().request(3);
            Thread.sleep(Duration.ofSeconds(2));
            subscriber.getSubscription().request(3);
            Thread.sleep(Duration.ofSeconds(2));
            subscriber.getSubscription().request(3);
            Thread.sleep(Duration.ofSeconds(2));
            subscriber.getSubscription().request(3);
            Thread.sleep(Duration.ofSeconds(2));
            subscriber.getSubscription().request(3);
            Thread.sleep(Duration.ofSeconds(2));
            subscriber.getSubscription().request(3);
            Thread.sleep(Duration.ofSeconds(2));
            subscriber.getSubscription().request(3);
            Thread.sleep(Duration.ofSeconds(2));
            subscriber.getSubscription().request(3);
        } catch (InterruptedException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    private static void demo3(){
        var publisher = new PublisherImpl();
        var subscriber = new SubscriberImpl();
        publisher.subscribe(subscriber);
        
        try {
            subscriber.getSubscription().request(3);
            Thread.sleep(Duration.ofSeconds(2));
            subscriber.getSubscription().cancel();
            subscriber.getSubscription().request(3);
            Thread.sleep(Duration.ofSeconds(2));
        } catch (InterruptedException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
