package ru.butorin.animal;

public class Puma implements Meowing {
    private final String name;

    public Puma(String name) {
        this.name = name;
    }

    public String toString() {
        return "пума: " + name;
    }

    public void meow() {
        System.out.println(name + ": мяу!");
    }
}
