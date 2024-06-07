/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herofight;

/**
 *
 * @author anaskhalifm
 */
public class Hero extends Character {
    private int shield;

    public Hero(String name, int health, int strength, int shield) {
        super(name, health, strength);
        this.shield = shield;
    }

    @Override
    public void receiveDamage(int damage) {
        int reducedDamage = damage - this.shield;
        if (reducedDamage < 0) {
            reducedDamage = 0;
        }
        setHealth(getHealth() - reducedDamage);
        System.out.println(getName() + " menerima " + reducedDamage + " damage, kesehatan sekarang " + getHealth());
    }
}