package Assignment02;
import java.util.Arrays;
import java.util.Scanner;
//Ramesh has been assigned a task to write a program in Java. The program shall be able to take input for
//names of 5 persons randomly and store them into a single variable. The names must be sorted in the
//ascending order. As a friend help him in writing the solution.

import java.io.InputStream;

public class Exercise01 {

	static String[] string_array = new String[5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InputStream console = new System.in;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the names of 5 persons");
		for(int i = 0; i< string_array.length; i++) {
			string_array[i] = scanner.nextLine();
			System.out.println((4-i) + " names left");
			
		}
		System.out.println("Sorting array");
		Arrays.sort(string_array);
		System.out.println("Printing sorted array...");
		for(String s: string_array) {
			System.out.println(s);
		}
		
		
		
		
	}

}
