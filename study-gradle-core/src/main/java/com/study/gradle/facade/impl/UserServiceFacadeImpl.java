package com.study.gradle.facade.impl;

import com.study.gradle.facade.UserServiceFacade;
import org.springframework.stereotype.Service;

@Service
public class UserServiceFacadeImpl implements UserServiceFacade {

    @Override
    public void test() {
        System.out.println("test");
    }
}
