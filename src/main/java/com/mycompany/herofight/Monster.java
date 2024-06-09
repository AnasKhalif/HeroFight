/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herofight;

/**
 *
 * @author anaskhalifm
 */
public class Monster extends Character {
    private int level;
    private int rageBonus;

    public Monster(String name, int health, int strength, int level, int rageBonus) {
        super(name, health, strength);
        this.level = level;
        this.rageBonus = rageBonus;
    }

    public void enrage() {
        System.out.println(getName() + " mengamuk dan mendapatkan " + this.rageBonus + " kekuatan!");
        setStrength(getStrength() + this.rageBonus);
    }
}