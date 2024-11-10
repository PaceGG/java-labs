package ru.butorin.main;

import ru.butorin.weapon.*;

public class Shooter {
    private String name;
    private Weapon weapon;

    public Shooter(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public Weapon getWeapon(){
        return weapon;
    }

    public void shoot(){
        if (weapon != null){
            weapon.shoot();
        } else {
            System.out.println("не могу участвовать в перестрелке");
        }
    }
}
