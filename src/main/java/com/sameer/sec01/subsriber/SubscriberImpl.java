/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sameer.sec01.subsriber;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author smutl
 */
public class SubscriberImpl implements Subscriber<String>{

    private static final Logger log = LoggerFactory.getLogger(SubscriberImpl.class);
    private Subscription subscription;

    public Subscription getSubscription() {
        return subscription;
    }
    
    
    @Override
    public void onSubscribe(Subscription s) {
        subscription = s;
    }
    @Override
    public void onNext(String email) {
        log.info("recieved: {}", email);
    }

    @Override
    public void onError(Throwable thrwbl) {
        log.error("error:", thrwbl);
    }

    @Override
    public void onComplete() {
        log.info("completed!");
    }
    
}
