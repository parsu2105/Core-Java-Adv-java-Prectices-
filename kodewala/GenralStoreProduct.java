package com.kodewala;



class GenralStoreProduct {
    String name;
    int id;

    public GenralStoreProduct(String name, int id) {
        this.name = name;
        this.id = id;
    }

  
    public String toString() {
        return "Name Of The Product: " + name + ", Id Of The Product: " + id;
    }
}
