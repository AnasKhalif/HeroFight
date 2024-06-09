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
        // Penambahan karakter ke dalam hutan
        Hero arthur = new Hero("Arthur", 100, 20, 5);
        Hero lancelot = new Hero("Lancelot", 90, 25, 3);
        Monster goblin = new Monster("Goblin", 70, 15, 2, 4);
        Monster orc = new Monster("Orc", 80, 18, 3, 6);

        // Karakter yang terlibat dalam pertarungan
        Character attacker = arthur;
        Character target = lancelot;

        int counter = 0;
        while (true) {
            // Pilih penyerang dan target berdasarkan counter
            switch (counter % 4) {
                case 0:
                    attacker = arthur;
                    target = lancelot;
                    break;
                case 1:
                    attacker = lancelot;
                    target = goblin;
                    break;
                case 2:
                    attacker = goblin;
                    target = orc;
                    break;
                case 3:
                    attacker = orc;
                    target = arthur;
                    break;
            }

            // Lakukan serangan
            if (attacker.isAlive() && target.isAlive()) {
                attacker.attack(target);
                if (!target.isAlive()) {
                    System.out.println(target.getName() + " telah dikalahkan!");
                }
            }

            // Periksa siapa yang masih hidup
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

            // Hentikan pertarungan jika hanya satu karakter yang tersisa
            if (aliveCount == 1) {
                System.out.println(lastAlive.getName() + " adalah karakter terakhir yang berdiri!");
                break;
            }

            // Naikkan counter untuk rotasi berikutnya
            counter++;
        }
    }
}
