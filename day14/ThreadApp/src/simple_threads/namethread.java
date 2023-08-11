package simple_threads;

import java.util.Scanner;

public class namethread extends Thread{
	public String name;
	public String email; 
	public void run() { 
		Scanner scanner = new Scanner(System.in); 
		System.out.print("name: "); 
		name = scanner.nextLine(); 
		System.out.print("email: "); 
		email = scanner.nextLine();
		System.out.println("Name = " + name + ", Email = " + email); 
		} 
	}


