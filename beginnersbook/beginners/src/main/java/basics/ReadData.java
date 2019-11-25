package basics;

import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		int a = 0;
		System.out.print("hello world");
		System.out.println("  Training ");
		System.out.println("Java" + a);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String userName = sc.nextLine(); 
		System.out.println("Name is : " + userName);

	}

}