public class App {
    public static void main (String[] args) throws Exception {

        Groceryitem item1 = new Groceryitem();
        System.out.println("======================");
        item1.name = "Red horse";
        item1.showitemname();
        System.out.println("======================");

        Groceryitem item2 = new Toothbrush();
        item2.name = "Colgate";
        item2.price = 65;
        item2.showitemname();
        item2.showPrice();
    
        System.out.println("======================");
       
        Groceryitem item3 = new Toothpaste();
        item3.name = "Pepsodent";
        item3.price = 8;
        item3.showitemname();
        item3.showPrice();

        System.out.println("<<======================>>");
        System.out.println("<<======================>>");
        Cashier c1 = new Cashier();
        c1.checkOut(item2);
        c1.showPrice(item2);
        System.out.println("======================");
        c1.checkOut(item3);
        c1.showPrice(item3);
        System.out.println("======================");


        Groceryitem[] itemArray = new Groceryitem[2];
        itemArray[0] = item2;
        itemArray[1] = item3;
        for (int i = 0; i < itemArray.length; i++){
            itemArray[i].showitemname();
            System.out.println("======================");


        }
        Dog myDog = new Dog();
        myDog.eat();
        System.out.println("======================");

        Lion myLion = new Lion();
        myLion.walk();
        myLion.run();
    }
 }
