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
    private int perisai;

    public Hero(String name, int health, int strength, int perisai) {
        super(name, health, strength);
        this.perisai = perisai;
    }

    @Override
    public void takeDamage(int damage) {
        int reducedDamage = damage - this.perisai;
        if (reducedDamage < 0) {
            reducedDamage = 0;
        }
        setHealth(getHealth() - reducedDamage);
        System.out.println(super.getName() + " menerima " + reducedDamage + " damage, kesehatan sekarang " + getHealth());
    }
}