package com.study.gradle.controller;

import com.study.gradle.facade.UserServiceFacade;
import com.study.gradle.facade.impl.UserServiceFacadeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class UserServiceController {

    @Autowired
    private UserServiceFacade userServiceFacade;

    public void test(){
        userServiceFacade.test();
    }


}
