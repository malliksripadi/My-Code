package com.SpringFramework1;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("pho1")
@Scope("prototype") //obj is created only when called and new obj is created every time called
                                              //@Primary we can use this if we want to make it primary when conflict b/w two classes
public class Phone  implements Cell {

    public Phone()
    {
        System.out.println("Phone object created");
    }
    public void ring() {
        System.out.println("Phone rings");
    }
}
