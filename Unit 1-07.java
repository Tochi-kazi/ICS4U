/**
 Name: Tochi Iroakazi
 For: Unit 1-07
 Description: This program tells you the height of a board foot when given the Length and Width
 */


import java.util.Scanner;
public class BoardFoot {
 public static void main(String[] args) {
  System.out.println("What should be the lenght of the board");
  Scanner length = new Scanner (System.in);
  Double boardlenght =  length.nextDouble();
  System.out.println("What should be the lenght of the board");
  Scanner width = new Scanner (System.in);
  Double boardwidth =  width.nextDouble();
  Double Area = 144.0;// the area of the board foot
  double height = Area / (boardlenght * boardwidth);
  //tells the program to print out the height of the board
  System.out.println("The height will be:" + height + "m");
 }
}

