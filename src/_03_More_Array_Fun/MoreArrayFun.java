package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String letters [] = {"a", "b", "c", "d", "e"};
		printer(letters);
		printerReverse(letters);
		printerSkip(letters);
		printerRandom(letters);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printer (String a []) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void printerReverse (String a []) {
		for (int i = a.length - 1; i > -1; i--) {
			System.out.println(a[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printerSkip (String a []) {
		for (int i = 0; i < a.length; i += 2) {
			System.out.println(a[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void printerRandom (String a []) {
		ArrayList <String> b = new ArrayList <String>();
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			b.add(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			int index = random.nextInt(a.length - i);
			System.out.println(b.get(index));
			b.remove(index);
		}
		
		
	}
	
	
}
