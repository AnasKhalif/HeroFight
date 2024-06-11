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
    
    public Character(String name, int health){
        this.name = name;
        this.health = health;
    }
    
    public String getName(){
        return name;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void takeDamage(int damage){
        health -= damage;
        System.out.println(getName() + " menerima " + damage + " damage, kesehatan sekarang " + getHealth());
    }
    
    public void attack(String nama){
        System.out.println(this.name + " menyerang " + nama);
    }
    
    // method untuk mengecek apakah masih hidup
    public boolean isAlive() {
        return this.health > 0;
    }
}