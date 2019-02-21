/* Name: Tochi Iroakazi
 For: ICS4U
 Descriptions: generates 10 random numbers from 1-99 and shows the max and min number
 */

import java.util.Random;
public class MinandMax {
  public static void main(String[] args) {
  int counter = 0;
  int[] arr = new int[10];
  do  {
   Random generatenumber = new Random();
   int randnumber = generatenumber.nextInt(99) + 1;
   // assign each random number to an index position in an array
   arr[counter++] = randnumber;
  }while(counter < 10);
  //prints out every value in the array.
  for (int x: arr) {
   System.out.println(x);
  }
  Maximum(arr);
  Minimum(arr);
  }
  public static void Maximum(int arrmax[]) {
   int maxnumber = arrmax[0];
   int numbers = 0;
   do {
    //for every number in the array that greater the first number. set the number to the max number.
    if (arrmax[numbers] > maxnumber ) {
     maxnumber = arrmax[numbers];
    }
    
    numbers++;
   }while (numbers < 10);
   System.out.println("The maximum number is: " + maxnumber);  
  }
  public static void Minimum(int arrmin[]) {
   int minnumber = arrmin[0];
   int numbers = 0;
   do {
    //for every number in the array that greater the first number. set the number to the max number.
    if (arrmin[numbers] < minnumber ) {
     minnumber = arrmin[numbers];
    }
    
    numbers++;
   }while (numbers < 10);
   System.out.println("The maximum number is: " + minnumber);  
  }
}



