package com.study.gradle;

import com.study.gradle.config.Config;
import com.study.gradle.controller.UserServiceController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        UserServiceController  userServiceController = applicationContext.getBean(UserServiceController.class);
        userServiceController.test();
    }
}
