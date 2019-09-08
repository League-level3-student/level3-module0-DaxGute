package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] arrayy = {"a", "b", "c", "d", "e"};
		//2. print the third element in the array
		System.out.println(arrayy[2]);
		//3. set the third element to a different value
		arrayy[3] = "c2";
		//4. print the third element again
		System.out.println(arrayy[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < arrayy.length; i++) {
			arrayy[i] = "default";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < arrayy.length; i++) {
			System.out.println(arrayy[i]);
		}
		//7. make an array of 50 integers
		int [] arrayy2 = new int [50];
		//8. use a for loop to make every value of the integer array a random number
		Random Random = new Random();
		for (int i = 0; i < arrayy2.length; i++) {
			arrayy2[i] = Random.nextInt();
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = arrayy2[0];
		for (int i = 0; i < arrayy2.length; i++) {
			if(arrayy2[i] < smallest) {
				smallest = arrayy2[i];
			}
		}
		System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < arrayy2.length; i++) {
			System.out.println(arrayy2[i]);
		}
		//11. print the largest number in the array.
		int largest = arrayy2[0];
		for (int i = 0; i < arrayy2.length; i++) {
			if(arrayy2[i] > largest) {
				largest = arrayy2[i];
			}
		}
		System.out.println(largest);
		//12. print only the last element in the array
		System.out.println(arrayy2[arrayy2.length - 1]);
	}
}
