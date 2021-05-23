package com.example.bitsandpizzas;

public class Pizza {
    private String name;
    private int imageResourceId;

    private Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Funghi", R.drawable.funghi),
            new Pizza("Cheesey", R.drawable.cheese_pizza),
            new Pizza("Pepperoni", R.drawable.pepperoni)
    };

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
