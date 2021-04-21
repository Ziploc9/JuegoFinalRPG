package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        start();

    }

    public static void start(){
        Scanner scan = new Scanner(System.in);
        int option = 0;

        while (option!=27) {
            System.out.println("¿Que elijes?: ");
            option = scan.nextInt();
            switch (option) {

                case 1:
                    break;

                case 2:
                    break;

                default:
                    System.out.println("Oye ¿Acaso no sabes leer?\n");
                    break;
            }
        }
    }
}
