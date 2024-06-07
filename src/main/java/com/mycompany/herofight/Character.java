/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herofight;

/**
 *
 * @author anaskhalifm
 */
public class Character {
    private String name;
    private int health;
    private int strength;

    public Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void receiveDamage(int damage) {
        setHealth(getHealth() - damage);
        System.out.println(getName() + " menerima " + damage + " damage, kesehatan sekarang " + getHealth());
    }

    public void attack(Character target) {
        System.out.println(this.name + " menyerang " + target.getName());
        target.receiveDamage(this.strength);
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}