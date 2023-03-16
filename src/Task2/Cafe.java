package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    //// 2.c
    ArrayList<String> coffeMenu = new ArrayList<>();

     Cafe(){

     }
     public void loadMenuData(){
         File file = new File("coffees.txt");
         ///// 2.d and 2.e
         try {
             Scanner scan = new Scanner(file);
             while(scan.hasNextLine()){
                 coffeMenu.add(scan.nextLine());
             }
         }catch (FileNotFoundException e){
             System.out.println("File not found");
         }
     }
}
