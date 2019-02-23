/*** 
 Name: Tochi Iroakazi
 For: ICS4U
 Descriptions: generates 10 random numbers from 1-99 and shows the max and min number
 **/

import java.util.Random;
public class marksarray {
 public static void main(String[] args) {
 
  int[][] arrays  = new int[4][6];
   Random generatenumber = new Random();
   int studentname = 0;
   int classTotal = 0;
   for (int i = 0; i < 4; i++) {
    int studentTotal = 0;
    for (int j=0; j < 6; j++) {
     //gives number between 0-100
       int randnumber1 = generatenumber.nextInt(101);
       int randnumber2 = generatenumber.nextInt(101);
       //System.out.println(" 1 is " + randnumber1);
       //System.out.println("2 is " + randnumber2);
       //makes randnumber1 equal randnumber2 if randnumber2 is greater
       if (randnumber1 < randnumber2) {
        randnumber1 = randnumber2;
       }
       arrays[i][j] = randnumber1;
       studentTotal += randnumber1;
       System.out.println(arrays[i][j]);  
    }
    studentname++;
    System.out.println(" The " +  studentname + " student's total " + studentTotal);
    // adds up all the totals for the students marks 
    classTotal += studentTotal;
   }
  int average = (classTotal) / 4 ;
  System.out.println("The total student's average is: " + average);
 }
}
