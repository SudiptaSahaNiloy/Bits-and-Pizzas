package com.example.bitsandpizzas;

public class Pasta {
    private String name;
    private int imageResourceId;

    private Pasta(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public static final Pasta[] pastas = {
            new Pasta("Spaghetti Bolognese", R.drawable.spag_bol),
            new Pasta("Lasagne", R.drawable.lasagne)
    };

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
