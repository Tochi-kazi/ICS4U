/* Name: Tochi Iroakazi
 For: ICS4U
 Descriptions: makes you guess a number the computer guess from a rang you gave it.
 */


import java.util.Random;
import java.util.Scanner;
public class DiceGame {
 public static void main(String[] args) {
  System.out.println("What range of number do you want the computer to guess from ?");
  Scanner input = new Scanner(System.in);
  int range = input.nextInt();
  Random guess = new Random();
  double number = guess.nextInt(range) + 1;
  System.out.println("What number did the computer guess ?");
  Scanner userguess = new Scanner(System.in);
  int usersguess = userguess.nextInt();
  int numberofguess = 1;
  //double random = Math.random(number)+1;
  //Scanner input = new Scanner(System.in);
  while (usersguess != number) {
	  System.out.println("Wrong guess ?"); 
	  numberofguess++;
	  System.out.println("What number did the computer guess ?");
	  userguess = new Scanner(System.in);
	  usersguess = userguess.nextInt();
	  
  }
  System.out.println("The programs number is: "+ number);
  System.out.println("It took you "+ numberofguess + "trails to get it");
  
 
 }
}

