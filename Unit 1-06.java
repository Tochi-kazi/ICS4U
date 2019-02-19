/* Name: Tochi Iroakazi
 For: ICS4U
 Descriptions: makes the computer generate a random number from 1 to 10, and prints it out
 */

import java.util.Random;
import java.util.Scanner;
public class RollDie {
	public static void RollDie(int maxValue) {
		Random guess = new Random();
		int number = guess.nextInt(maxValue) + 1;
		System.out.println("The random number is: " + number);
	}
	public static void main(String[] args) {
		RollDie(10);
	}


}
