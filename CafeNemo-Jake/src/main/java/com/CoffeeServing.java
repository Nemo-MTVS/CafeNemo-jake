package com;

public class CoffeeServing {
    public String menuName;
    public int difference;

    public void serveMenu(String menuName, int difference) {
        if (difference == 0) {
            System.out.println(menuName + " is served\n");
        } else if (difference > 0) {
            System.out.println(menuName + " is served\n");
            System.out.println("and remaining difference is " + difference + "\n");
        } else {
            System.out.println("payment not sufficient please put " + difference + "\n");
        }
    }

}
