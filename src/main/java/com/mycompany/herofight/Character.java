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
    private String nama;
    private int health;
    private int strength;

    public Character(String name, int health, int strength) {
        this.nama = name;
        this.health = health;
        this.strength = strength;
    }

    public String getName() {
        return nama;
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
    
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
        System.out.println(getName() + " menerima " + damage + " damage, kesehatan sekarang " + getHealth());
    }

    public void attack(Character target) {
        System.out.println(this.nama + " menyerang " + target.getName());
        target.takeDamage(this.strength);
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}