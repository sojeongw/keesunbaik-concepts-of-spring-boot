package me.whiteship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    KeesunProperties keesunProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("keesunProperties.name = " + keesunProperties.name);
        System.out.println("keesunProperties.age = " + keesunProperties.age);
        System.out.println("keesunProperties.fullName = " + keesunProperties.fullName);
        System.out.println("keesunProperties.getSessionTimeout = " + keesunProperties.getSessionTimeout());
    }
}
