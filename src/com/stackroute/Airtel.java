package com.stackroute;

public class Airtel implements Sim
{
   public Airtel()
    {
        System.out.println("Airel constructor called");
    }
    @Override
    public void data() {
        System.out.println("Browsing internet using Airtel Sim");
    }

    @Override
    public void calling() {
        System.out.println("Calling using Airtel sim");
    }
}
