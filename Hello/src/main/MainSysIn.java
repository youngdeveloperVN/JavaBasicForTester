package main;

import java.util.Scanner;

public class MainSysIn {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println("Hello " + line);
		
		scanner.close();
		
	}
	
}