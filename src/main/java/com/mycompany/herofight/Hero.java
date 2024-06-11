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
    private int strength;
    private int shield;
    
    public Hero(String name, int health, int strength, int shield){
        super(name, health);
        this.strength = strength;
        this.shield = shield;
    }
    
    public int getStrength(){
        return strength;
    }
    
    @Override
    public void takeDamage(int damage){
        super.takeDamage(damage - this.shield);
    }
}