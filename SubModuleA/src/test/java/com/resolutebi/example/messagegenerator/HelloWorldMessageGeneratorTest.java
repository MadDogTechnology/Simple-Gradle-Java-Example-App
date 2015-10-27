package com.resolutebi.example.messagegenerator;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldMessageGeneratorTest {

    @Test
    public void generates_hello_world_message() throws Exception {
        HelloWorldMessageGenerator helloWorldGenerator = new HelloWorldMessageGenerator();
        assertEquals("Hello, world!", helloWorldGenerator.generateMessage());
    }
}