package com.jt.demo6_anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class User {
    @Qualifier("pig")
    @Autowired
    private Pet pet;
    public void hello(){
        pet.hello();
    }
}
