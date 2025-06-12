package com.Prectice;
//
abstract class Animal1 {
    Animal1() {
        System.out.println("Animal constructor called");
    }
    abstract void sound();
}

class Dog1 extends Animal1 {
    Dog1() {
        System.out.println("Dog constructor called");
    }

    void sound() {
        System.out.println("Bark");
    }
}

public class MainMethodOverride {
    public static void main(String[] args) {
        Animal1 a = new Dog1();
        a.sound();
    }
}
