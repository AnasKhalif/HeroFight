/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herofight;

/**
 *
 * @author anaskhalifm
 */
public class HeroFight {

    public static void main(String[] args) {
        Hero arthur = new Hero("Arthur", 100, 20, 5);
        Hero lancelot = new Hero("Lancelot", 90, 25, 3);
        Monster goblin = new Monster("Goblin", 70, 15, 2, 4);
        Monster orc = new Monster("Orc", 80, 18, 3, 6);
        
        // Goblin enrage
        goblin.enreg();
        // Orc enrage
        orc.enreg();

        // Loop until only one character is alive
        while (true) {
            // Arthur attacks Lancelot
            if (arthur.isAlive() && lancelot.isAlive()) {
                arthur.attack(lancelot.getName());
                lancelot.takeDamage(arthur.getStrength());
            }

            // Lancelot attacks Goblin
            if (lancelot.isAlive() && goblin.isAlive()) {
                lancelot.attack(goblin.getName());
                goblin.takeDamage(lancelot.getStrength());
            }

            // Goblin attacks Orc
            if (goblin.isAlive() && orc.isAlive()) {
                goblin.attack(orc.getName());
                orc.takeDamage(goblin.getStrength());
            }

            // Orc attacks Arthur
            if (orc.isAlive() && arthur.isAlive()) {
                orc.attack(arthur.getName());
                arthur.takeDamage(orc.getStrength());
            }

            // Check the number of characters still alive
            int aliveCount = 0;
            Character lastAlive = null;

            if (arthur.isAlive()) {
                aliveCount++;
                lastAlive = arthur;
            }
            if (lancelot.isAlive()) {
                aliveCount++;
                lastAlive = lancelot;
            }
            if (goblin.isAlive()) {
                aliveCount++;
                lastAlive = goblin;
            }
            if (orc.isAlive()) {
                aliveCount++;
                lastAlive = orc;
            }

            // If only one character is alive, they are the winner
            if (aliveCount == 1) {
                System.out.println(lastAlive.getName() + " Menang!");
                break;
            }
        }
}
}
