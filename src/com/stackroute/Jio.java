package com.stackroute;

public class Jio implements Sim
{
   public Jio()
    {
        System.out.println("Jio constructor called");
    }
    @Override
    public void data() {
        System.out.println("Browsing internet using Jio Sim");
    }

    @Override
    public void calling() {
        System.out.println("Calling using Jio sim");
    }
}
