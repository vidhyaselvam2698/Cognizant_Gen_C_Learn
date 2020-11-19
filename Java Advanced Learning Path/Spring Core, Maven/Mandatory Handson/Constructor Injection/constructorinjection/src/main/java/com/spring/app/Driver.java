package com.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MemberShip memberShip = (MemberShip) context.getBean("memeberShipObj");
        System.out.println(memberShip);
    }
}
