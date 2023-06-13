package Assignment02;
import java.util.Scanner;
public class Exercise02 {
	static int[] array = {5,1,2,7,};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input an integer to see if in array");
		int value = scanner.nextInt();
		boolean exists = false;
		//sequential search array
		for(int i : array) {
			if(i == value)
				exists = true;
		}
		
		//print results
		if(exists)
			System.out.println("Integer found in array");
		else
			System.out.println("Integer not found in array");
		
	}

}
