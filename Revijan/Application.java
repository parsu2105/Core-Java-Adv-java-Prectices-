package com.Revijan;

public class Application {
    void turnOn() {
        System.out.println("TURN ON");
    }

    public static void main(String[] args) {
        Fan fan = new Fan();  // Create Fan object
        fan.turnOn();  // Call Fan's specific turnOn method

        Ac ac = new Ac();  // Create AC object
        ac.turnOn();  // Call AC's specific turnOn method
    }
}

class Fan extends Application {
    @Override
    void turnOn() {
        System.out.println("TURN ON FAN");
    }
}

class Ac extends Application {
    @Override
    void turnOn() {
        System.out.println("TURN ON AC");
    }
}
