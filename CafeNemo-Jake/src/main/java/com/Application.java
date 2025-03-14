package com;

import java.util.Scanner;


public class Application {
    public static void main(String[] args) {

        Menu americano = new Menu("Americano", 3000);
        Menu caffeLatte = new Menu("Cafe Latte", 4000);
        Menu espresso = new Menu("Espresso", 4000);
        Menu cappuccino = new Menu("Cappuccino", 5000);

        showMenu(americano);
        showMenu(caffeLatte);
        showMenu(espresso);
        showMenu(cappuccino);

        //Get seleted menu from user
        String orderedMenu = "";
        System.out.println("Please enter your menu option : ");
        Scanner scanner = new Scanner(System.in);
        orderedMenu = scanner.nextLine();


        //Figure out price from given input
        int price = 0;
        if (orderedMenu.equals("Americano")) {
            price = 3000;
        } else if (orderedMenu.equals("Cafe Latte")) {
            price = 4000;
        } else if (orderedMenu.equals("Espresso")) {
            price = 5000;
        } else if (orderedMenu.equals("Cappuccino")) {
            price = 6000;
        } else {
            System.out.println("Invalid selection");
            System.exit(0);
        }

        int paidAmount = 0;
        System.out.println("Please enter payment : ");
        Scanner scanner1 = new Scanner(System.in);
        paidAmount = scanner1.nextInt();

        //Get Difference from painAmount - Price
        int difference =  paidAmount - price;

        coffeeServing serveCoffee = new coffeeServing();
        serveCoffee.serveMenu(orderedMenu, difference);
    }

    public static void showMenu(Menu menu) {
        System.out.println(menu.menuName + " / " + menu.Price + "\n");
    };
}


