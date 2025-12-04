package com.example.demo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class UserTest {

    @Test
    public void test(){
        User tesClass = new User();
        tesClass.setName("fdsfds");
        assertEquals("fdsfds", tesClass.getName());
    }
}