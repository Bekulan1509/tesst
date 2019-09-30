package com.company;

import java.util.Scanner;
import java.util.Random;





public class Main {

    public static void main(String[] args) {
        Random a = new Random();
        int f = 1 + a.nextInt(107 - 1);
        int t = 21;



        switch (t) {
            case 21:
                String name2 = "Bekulan";
                int age2 = a.nextInt();
                int temperature2 = 15;

                if (age2 > 20 && age2 < 45 && temperature2 < 25 && temperature2 > 0) {
                    System.out.println(" На улице 15 градусов, " + name2 + " может погулять на улице,пусть только наденет теплую одежду😎");
                }


                break;
            case 46:
                String name3 = "Josoph";
                int age3 = a.nextInt();
                int temperature3 = 23;
                if (age3 > 45 && temperature3 > 0 && temperature3 < 25) {
                    System.out.println("На улице 23 градусов " + name3 + " может погулять на улице");
                }


                break;

            case 25:
                String name = "Brian";
                int age = a.nextInt();
                int temperature = 27;
                if (age < 20 && temperature < 30 && temperature > -20) {

                    System.out.println("На улице 27 градусов " + name + " может погулять на улице");
                }

                break;
        }
    }




    }



