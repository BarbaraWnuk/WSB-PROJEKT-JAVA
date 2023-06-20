package com.example.test;

import com.example.package1.ClassA;
import com.example.package2.ClassB;

public class TestClass {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.methodA();

        ClassB classB = new ClassB();
        classB.methodB();
    }
}