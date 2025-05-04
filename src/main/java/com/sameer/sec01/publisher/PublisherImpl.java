/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sameer.sec01.publisher;

import com.sameer.sec01.subsriber.SubscriberImpl;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author smutl
 */
public class PublisherImpl implements Publisher<String>{

    private static final Logger log = LoggerFactory.getLogger(PublisherImpl.class);
    
    @Override
    public void subscribe(Subscriber<? super String> s) {
        var subscription = new SubscriptionImpl(s);
        s.onSubscribe(subscription);
    }
    
}
