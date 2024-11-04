package com.SpringFramework1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    @Value("22")
    private int value;
    @Autowired    //links the  cob to mobile obj bcz mobile is primary
                                 //@Qualifier("mobile")  or @Qualifier("pho1")
    private Cell cob;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Cell getCob() {
    return cob;
    }

    public void setCob(Cell cob) {
        this.cob = cob;
    }

    public Laptop()
    {
        System.out.println("Laptop object is created");
    }

    public Laptop(int value, Cell cob)
    {
        this.value= value;
        System.out.println("para const is called");
        this.cob=cob;
    }

    public void work()
    {
        System.out.println("Laptop working");
         cob.ring();

    }
}
