package com.SpringFramework1.Config;

import com.SpringFramework1.Laptop;
import com.SpringFramework1.Mobile;
import com.SpringFramework1.Cell;
import com.SpringFramework1.Phone;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Laptop laptop( Cell cob)        //(@Qualifier("mob") Cell cob) or (@Qualifier("phone") Cell cob)
    {
        Laptop lap= new Laptop();
        lap.setValue(25);
        lap.setCob(cob);
        return lap;
    }


    @Bean(name="mob")
//    @Primary
//    @Scope("prototype")  means new obj is created every time it is called.

    public Mobile mobile()
    {

        return new Mobile();
    }


    @Bean
    @Primary
    public Phone phone()
    {
        return new Phone();
    }

}
