package com.ensa.gi4.listeners;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationEventListener<T extends Materiel> implements ApplicationListener<MyEvent<T>> {
    @Override
    public void onApplicationEvent(MyEvent<T> event) {

        if(event.getEventType().toString().equals("ADD"))
        {
            if(event.getSource() instanceof Livre)
            {
                System.out.println("ADD a Livre");
            }
            else if(event.getSource() instanceof Chaise)
            {
                System.out.println("ADD a Chaise");
            }
        }
        if(event.getEventType().toString().equals("UPDATE"))
        {
            if(event.getSource() instanceof Livre)
            {
                System.out.println("UPDATE a Livre");
            }
            else if(event.getSource() instanceof Chaise)
            {
                System.out.println("UPDATE a Chaise");
            }
        }
        if(event.getEventType().toString().equals("REMOVE"))
        {
            if(event.getSource() instanceof Livre)
            {
                System.out.println("REMOVE a Livre");
            }
            else if(event.getSource() instanceof Chaise)
            {
                System.out.println("REMOVE a Chaise");
            }
        }

        /*
        System.out.println("Event triggered");
        System.out.println("event.getEventType() = " + event.getEventType());//ADD
        System.out.println("event.getSource() = " + event.getSource());//com.ensa.gi4.modele.Livre@4d9e68d0
         */
    }
}
