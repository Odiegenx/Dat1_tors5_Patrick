package Task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    //// 1.c
    static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
        //// 1.c
       customers.add(new Customer("Frodo","Reckless"));
       customers.add(new Customer("Sam","Follower"));
       customers.add(new Customer("Patrick","Odiegenx"));
       customers.add(new Customer("Adrian","Sej"));
       customers.add(new Customer("Baruuk","Shadow"));
       customers.add(new Customer("Zoey","Woof"));
       //// 1.d
        printCustomers();

    }
    /////1.d
    static void printCustomers(){
        for(Customer c: customers){
            c.toString();
        }
    }
}