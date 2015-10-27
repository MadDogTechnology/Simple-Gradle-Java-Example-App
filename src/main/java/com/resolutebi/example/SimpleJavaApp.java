package com.resolutebi.example;

import com.resolutebi.example.messagegenerator.HelloWorldMessageGenerator;

public class SimpleJavaApp {

    private static final HelloWorldMessageGenerator messageGenerator = new HelloWorldMessageGenerator();

    public static void main(String[] vars) {
        System.out.println(generateMessage());
    }

    static String generateMessage() {
        return messageGenerator.generateMessage();
    }

}
