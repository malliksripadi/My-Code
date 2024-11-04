package com.SpringFramework1;
//import com.SpringFramework1.Config.AppConfig;


import com.SpringFramework1.Config.AppConfigAnnotate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfigAnnotate.class);
        Laptop lap= context.getBean(Laptop.class);
        System.out.println(lap.getValue());
        lap.work();

        Mobile mob= context.getBean(Mobile.class);
        //mobile is the name of the method.even if we don't mention it wll check for the type of object class.
        mob.ring();
//        Mobile mob1= context.getBean("mobile",Mobile.class);
//        mob1.ring();   //prototype scope






//        ApplicationContext con= new ClassPathXmlApplicationContext("spring.xml");
//
//        //here above we created a spring container and all the objects in "Spring.xml" file.
//
//
//        Laptop lap=  (Laptop) con.getBean("Laptop");
//        //the .getBean() automatically returns an object of type "Object" we need to typecast it to our
//        //specified class by using (Laptop)
//        //lap.setValue(12);
//        System.out.println(lap.getValue());
//
//        lap.work();





        //        Laptop lap1=  (Laptop) con.getBean("Laptop");
//        lap1.work();
    }
}
