package com.resolutebi.example;

import com.resolutebi.example.messagegenerator.HelloWorldMessageGenerator;

public class SimpleJavaApp {

    private final HelloWorldMessageGenerator messageGenerator = new HelloWorldMessageGenerator();

    final void main(String[] vars) {
        System.out.println(generateMessage());
    }

    String generateMessage() {
        return messageGenerator.generateMessage();
    }

}
