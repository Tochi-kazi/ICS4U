/**
 Made by: Tochi iroakazi
 Date: february 6, 2018
Made for: Unit1-02
 This program gives you the amount of of logs that can go in a truck when given the size of one maple log
 */

import java.util.Scanner;
public class loglenght {
 public static void main(String[] args) {
  System.out.println("What is the lenght of your maple log (m)?");
  Scanner length =new Scanner (System.in);
  double lenghtoflog = length.nextDouble();
  double weightforcompany = 20 * lenghtoflog;
  double logremains = 1100/ weightforcompany;
  System.out.println(logremains + " logs could go in the truck ;)"); 
 }
}
