package com;

import java.util.Scanner;

/*
//메뉴 컨스트럭터 만들기
컨스트럭터 이용하여 메뉴 생성 4가지 - 아메리카노, 카페라떼, 에스프레소, 카푸치노
가격 알려주는 기능 만들기.
금액과 비교 기능
지불 금액이 메뉴 가격보다 많으면 차액 표시 및 '주문 메뉴가 나왔습니다' 안내 - Test
차액 구하는 기능 만들기. payment - price = difference
지불 금액이 메뉴 가격과 일치하면 '주문 메뉴가 나왔습니다'만 표시 - Test
지불 금액이 부족시 부족 금액을 안내하며 추가 지불 요청. - Test
캡슐화 진행.

*/
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

        int paidAmount = 0;
        System.out.println("Please enter payment : ");
        Scanner scanner1 = new Scanner(System.in);
        paidAmount = scanner1.nextInt();

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

        }


        //Get Difference from painAmount - Price
        int difference =  paidAmount - price;


        coffeeServing serveCoffee = new coffeeServing();
        serveCoffee.serveMenu(orderedMenu, difference);

    }

    public static void showMenu(Menu menu) {
        System.out.println(menu.menuName + " / " + menu.Price + "\n");
    };

}


