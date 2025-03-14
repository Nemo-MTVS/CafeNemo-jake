package com;

/*
//메뉴 컨스트럭터 만들기
컨스트럭터 이용하여 메뉴 생성 4가지 - 아메리카노, 카페라떼, 에스프레소, 카푸치노
가격 알려주는 기능 만들기.
금액과 비교 기능
지불 금액이 메뉴 가격보다 많으면 차액 표시 및 '주문 메뉴가 나왔습니다' 안내 - Test
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
        System.out.println("americano :\n" + americano.menuName + " / " + americano.Price + "\n");
    }

    public static void showMenu(menu) {
        System.out.println("americano :\n" + menu.menuName + " / " + menu.Price + "\n");
    };

}
