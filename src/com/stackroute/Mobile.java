package com.stackroute;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile
{
    public static void main(String[] args) {
       /* Airtel airtel=new Airtel();
        airtel.calling();
        airtel.data();   -- here methods are called using Class reference*/

       /*Calling methods using interface reference*/

     /*   Sim sim=new Airtel();
        sim.calling();
        sim.data();*/
   ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("config loaded");
 Sim sim=applicationContext.getBean("sim",Sim.class);
 sim.calling();
 sim.data();
    }
}
