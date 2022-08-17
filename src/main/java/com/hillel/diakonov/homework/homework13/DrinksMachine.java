package com.hillel.diakonov.homework.homework13;

public enum DrinksMachine {
    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    MINERAL("Mineral Water"),
    COCA_COLA("Coca Cola");

    private String title;

    DrinksMachine(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
