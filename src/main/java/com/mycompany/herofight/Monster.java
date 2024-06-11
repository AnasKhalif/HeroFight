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
    private int strength;
    private int level;
    private int rageBonus;
    
    public Monster(String name, int health, int strength, int level, int rageBonus){
        super(name, health);
        this.strength = strength;
        this.level = level;
        this.rageBonus = rageBonus;
    }
    
    public int getStrength(){
        return strength;
    }
    
    public void enreg() {
        System.out.println(getName() + " mengamuk dan mendapatkan " + this.rageBonus + " kekuatan!");
        strength += this.rageBonus;
    }
    
    @Override
    public void takeDamage(int damage){
        super.takeDamage(damage);
    }
  
}