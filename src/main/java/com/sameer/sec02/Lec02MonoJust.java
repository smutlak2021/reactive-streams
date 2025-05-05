/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sameer.sec02;

import com.sameer.sec01.publisher.PublisherImpl;
import com.sameer.sec01.subsriber.SubscriberImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

/**
 *
 * @author smutl
 */
public class Lec02MonoJust {
    private static final Logger log = LoggerFactory.getLogger(PublisherImpl.class);
    public static void main(String[] args){
        Mono<String> mono = Mono.just("vins");
        var subscriber = new SubscriberImpl();
        mono.subscribe(subscriber);
        
        subscriber.getSubscription().request(10);
        
                
    }
}
