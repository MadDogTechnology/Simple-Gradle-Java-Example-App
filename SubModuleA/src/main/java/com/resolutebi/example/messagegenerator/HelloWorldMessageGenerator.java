package com.resolutebi.example.messagegenerator;

public class HelloWorldMessageGenerator implements MessageGenerator {
    @Override
    public String generateMessage() {
        return "Hello, world!";
    }
}
