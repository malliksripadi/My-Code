package com.SpringFramework1;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //   or @Component("any_name")
@Primary
public class Mobile implements Cell{
    public  Mobile()
    {
        System.out.println("Mobile object is created");
    }
    public void ring()
    {
        System.out.println("Mobile rings");
    }
    public void laptopPhone()
    {

        System.out.println("phone method is called with para constructor");
    }
}
