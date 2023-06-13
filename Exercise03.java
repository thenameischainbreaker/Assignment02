package Assignment02;
import java.util.ArrayList;

//Lata has been assigned a task to write a program in Java to maintain the details of a student such as
//roll, name, address and email. The implementation methodology shall be object oriented. Each student
//shall be initialized through the constructor. There should be a common method that will print the
//details of each student on the screen. As a friend help her in writing the solution of program.
public class Exercise03 {
private String roll;
private String name;
private String address;
private String email;
public static ArrayList<Exercise03> array = new ArrayList<>();
	public static void main(String[] args) {
		// create 5 students
		new Exercise03("1", "Alice", "123 Main St", "alice@example.com");
        new Exercise03("2", "Bob", "456 High St", "bob@example.com");
        new Exercise03("3", "Charlie", "789 Park St", "charlie@example.com");
        new Exercise03("4", "Dave", "101 North St", "dave@example.com");
        new Exercise03("5", "Eva", "102 South St", "eva@example.com");
        
        //Print stduents
        System.out.println("Printing students...");
        for(Exercise03 student : array) {
        	System.out.println(student);
        }
	}
	public Exercise03(String roll, String name, String address, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.email = email;
		
		array.add(this);
		 
	}
	@Override
	public String toString() {
		return "Exercise03 [roll=" + roll + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}

	public static void printStudents() {
		for(Exercise03 student: array) {
			System.out.println(student);
		}
		
	}
	

}
