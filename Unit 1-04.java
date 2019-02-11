/**

 Produced by: Tochi Iroakazi

 Date: February 8, 2018

 Made for: Unit 1-04

 This program tells you what timer to set your soup, sub or pizza 

 */

import java.util.Scanner;

public class fooditems{

 public static void main(String[] args) {

  System.out.println("What food would you like to have (put them in by numbers) ? Sub = 1, Pizza = 2, Soup = 3");

  Scanner food = new Scanner(System.in);

  int fooditem = food.nextInt();

  switch(fooditem) {

     case 1:

      System.out.println("How much sub ? (1-3)");

      Scanner subamount = new Scanner(System.in);

      int subamounts = subamount.nextInt();

      if (subamounts == 1 ){

       System.out.println("Set the timer for 1 minute");

      }else if (subamounts == 2) {

       System.out.println("Set the timer for 1 minute 30 seconds");

      }else if (subamounts == 3 ) {

       System.out.println("Set the timer for Set the timer for 2 minutes");

      }else {

       System.out.println("Error");

      }

     break;

    case 2: 

      System.out.println("How much Pizza ? (1-3)");

   Scanner Pizza = new Scanner(System.in);

   int Pizzas = Pizza.nextInt();

   if (Pizzas == 1 ){

    System.out.println("Set the timer for 45 seconds");

    //System.out.println("Error");

   }else if (Pizzas == 2) {

    System.out.println("Set the timer for 1 minute 8 seconds");

   }else if (Pizzas == 3 ) {

    System.out.println("Set the timer for Set the timer for 1 minutes 30 seconds");

   }else {

    System.out.println("Error");

   }

      break; 

     case 3 : 

      System.out.println("Really, who chooses soup over pizza, but how much Soup ? (1-3)");

      Scanner Soup = new Scanner(System.in);

      int Soups = Soup.nextInt();

      if (Soups == 1 ){

       System.out.println("Set the timer for 1.75 minutes");

       }else if (Soups == 2) {

       System.out.println("Set the timer for 1 minute 8 seconds");

      }else if (Soups == 3 ) {

       System.out.println("Set the timer for Set the timer for 1 minutes 30 seconds");

      }else {

       System.out.println("oh C'mon you should know you can't do that");

       System.out.println("How much Soup ? (1-3)");

      }

     break;

 }

}

 

}
