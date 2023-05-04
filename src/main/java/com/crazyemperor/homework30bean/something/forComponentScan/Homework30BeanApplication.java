package com.crazyemperor.homework30bean.something.forComponentScan;

import com.crazyemperor.homework30bean.something.SomeService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ComponentScan(basePackages = "com.crazyemperor.homework30bean")
@ImportResource("classpath:conf.xml")
public class Homework30BeanApplication {

    public static void main(String[] args) {

        ApplicationContext appCon = (ApplicationContext) SpringApplication.run(Homework30BeanApplication.class, args);
        SomeService service = appCon.getBean(SomeService.class);

        System.out.println("Checking: ");
        System.out.println(service);
        System.out.println("------------------------------------------------");

//        service = (SomeService) appCon.getBean("example");
//
//        System.out.println(service);
//        System.out.println("------------------------------------------------");
//
//        service = (SomeService) appCon.getBean("someService");
//
//        System.out.println(service);
//        System.out.println("------------------------------------------------");
    }

//    @Bean
//    public SomeService newSomeService() {
//        return new SomeService();
//    }
}
