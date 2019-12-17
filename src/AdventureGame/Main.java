package AdventureGame;


import Player.Mage;

import java.util.Scanner;

    public class Main {
        private static int Choice;

        Scanner MyScanner;

        public static void main(String[] args) {
            Scanner MyScanner = new Scanner(System.in);

            System.out.println("Welcome to the Adventure game");
            System.out.println("1 Start game");
            System.out.println("2 Rules");
            System.out.println("3 Exit");

            Choice = MyScanner.nextInt();

            if (Choice==1) {
                System.out.println("Let's start the Game");

                System.out.println("Now you can choose either Mage or Warrior as your character");
                System.out.println("Enter 1 for Mage or 2 for Warrior");

                int hero = MyScanner.nextInt();


                if (hero==2) {
                    System.out.println("You have selected Warrior as your Character");
                }
                if (hero==1) {
                    System.out.println("You have selected Mage as your Character");
                }

            }
            if (Choice==2) {
                System.out.println("This Adventure game is about you playing a hero either warrior och mage, you will walk into a house with different rooms with challenges and hopefully you will find your partner who has disappeard");
            }
            if (Choice==3) {
                System.out.println("The game is ending");
            }
        }
    }

