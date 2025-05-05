/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sameer.common;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author smutl
 * @param <T>
 */
public class DefaultSubscriber<T> implements Subscriber<T>{

    private static final Logger log = LoggerFactory.getLogger(DefaultSubscriber.class);
    private final String name;
//    private Subscription subscription;
//
//    public Subscription getSubscription() {
//        return subscription;
//    }

    public DefaultSubscriber(String name) {
        this.name = name;
    }
    
    @Override
    public void onSubscribe(Subscription s) {
        s.request(Long.MAX_VALUE);
    }
    @Override
    public void onNext(T item) {
        log.info("{} recieved: {}", this.name, item);
    }

    @Override
    public void onError(Throwable thrwbl) {
        log.error("{} error:", this.name, thrwbl);
    }

    @Override
    public void onComplete() {
        log.info("{} completed!", this.name);
    }
    
}
