package com.resolutebi.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleJavaAppTest {

    @Test
    public void the_message_it_generates_is_hello_world() {
        SimpleJavaApp app = new SimpleJavaApp();
        assertEquals("Hello, world!", app.generateMessage());
    }
}