package com.kodewala;


class Person {
    void showRole() { // Keep it default or explicitly declare as public
        System.out.println("This is my role");
    }
}

class Sonn extends Person { // Corrected class name
 
    void showRole() { 
        System.out.println("I am the son of my mother");
    }
}

class Boyfriend extends Person { // Corrected class name
 
    void showRole() {
        System.out.println("I am the boyfriend of my girl");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Person person = new Sonn(); // Object of Son class
        person.showRole(); // Calls Son's overridden method

        person = new Boyfriend(); // Object of Boyfriend class
        person.showRole(); // Calls Boyfriend's overridden method
    }
}
