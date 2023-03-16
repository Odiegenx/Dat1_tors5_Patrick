package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
    //// 2.g and 2.h
    Cafe cafe = new Cafe();

    cafe.loadMenuData();

    System.out.println(cafe.coffeMenu);
        for(String c: cafe.coffeMenu){
            System.out.println(c);
        }

    }

}
