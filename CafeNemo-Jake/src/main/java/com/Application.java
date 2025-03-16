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
            price = americano.price;
        } else if (orderedMenu.equals("Cafe Latte")) {
            price = caffeLatte.price;
        } else if (orderedMenu.equals("Espresso")) {
            price = espresso.price;
        } else if (orderedMenu.equals("Cappuccino")) {
            price = cappuccino.price;
        } else {
            System.out.println("Invalid selection");
            System.exit(0);
        }

        int paidAmount = 0;
        System.out.println("Please enter payment : ");
        // Scanner scanner1 = new Scanner(System.in);
        paidAmount = scanner.nextInt();

        //Get Difference from painAmount - Price
        int difference =  paidAmount - price;

        CoffeeServing serveCoffee = new CoffeeServing();
        serveCoffee.serveMenu(orderedMenu, difference);
        scanner.close();
    } 

    public static void showMenu(Menu menu) {
        System.out.println(menu.menuName + " / " + menu.price + "\n");
    };
}


