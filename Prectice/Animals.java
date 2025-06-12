//package com.Prectice;
//
//interface Species {
// void sound();
// void ear();
// void leg();
//}
//class Frog implements Species {
//	public void sound() {
//		System.out.println("woof! woof!");
//	}
//	public void ear() {
//		System.out.println("2 Year");
//	}
//	public void leg() {
//		System.out.println("4 leg");
//	}
//}
// class Animal{
//	public static void main(String[] args) {
//		Frog d1=new Frog();
//		d1.sound();
//		d1.ear();
//		d1.leg();
//	}
//}

package com.Prectice; // Corrected package name spelling

interface Species { // Corrected interface name spelling
    void sound();
    void ear();
    void leg();
}

class Frog implements Species { // Corrected interface name spelling
    public void sound() {
        System.out.println("Ribbit! Ribbit!"); // Changed to frog's actual sound
    }
    
    public void ear() {
        System.out.println("2 ears"); // Corrected "Year" to "ears"
    }
    
    public void leg() {
        System.out.println("4 legs"); // Corrected "leg" to "legs"
    }
}

class Animals {
    public static void main(String[] args) {
        Frog d1 = new Frog();
        d1.sound();
        d1.ear();
        d1.leg();
    }
}

