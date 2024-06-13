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
        
        // Membuat objek karakter
        Hero arthur = new Hero("Arthur", 100, 20, 5);
        Hero lancelot = new Hero("Lancelot", 90, 25, 3);
        Monster goblin = new Monster("Goblin", 70, 15, 2, 4);
        Monster orc = new Monster("Orc", 80, 18, 3, 6);
        
        // Goblin mengaktifkan enrage
        goblin.enreg();
        // Orc mengaktifkan enrage
        orc.enreg();

        // Loop hingga hanya satu karakter yang masih hidup
        while (true) {
            // Memilih dua karakter secara acak
            double random = Math.random();

            if (random < 0.25) {
                // Arthur menyerang Lancelot
                if (arthur.isAlive() && lancelot.isAlive()) {
                    arthur.attack(lancelot.getName());
                    lancelot.takeDamage(arthur.getStrength());
                }
            } else if (random < 0.5) {
                // Lancelot menyerang Goblin
                if (lancelot.isAlive() && goblin.isAlive()) {
                    lancelot.attack(goblin.getName());
                    goblin.takeDamage(lancelot.getStrength());
                }
            } else if (random < 0.75) {
                // Goblin menyerang Orc
                if (goblin.isAlive() && orc.isAlive()) {
                    goblin.attack(orc.getName());
                    orc.takeDamage(goblin.getStrength());
                }
            } else {
                // Orc menyerang Arthur
                if (orc.isAlive() && arthur.isAlive()) {
                    orc.attack(arthur.getName());
                    arthur.takeDamage(orc.getStrength());
                }
            }

            // Memeriksa jumlah karakter yang masih hidup
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

            // Jika hanya satu karakter yang masih hidup, dia adalah pemenangnya
            if (aliveCount == 1) {
                System.out.println(lastAlive.getName() + " Menang!");
                break;
            }
        }
    }
}
