/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (Give a brief description for each Class)
 * Due: 9/13/2021
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Okeoghene Excel Omorobe
*/

import java.util.Scanner;

public class WiFiDiagnosis {
	
	public void troubleShootWiFi()
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	  
	System.out.println("First step: reboot your computer");
	System.out.print("Are you able to connect with the internet? (yes or no): ");
	String choice = scanner.nextLine().trim();
	while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
	{
		
	System.out.println("Please enter yes or no!\n");
	System.out.print("Are you able to connect with the internet? (yes or no): ");
	choice = scanner.nextLine().trim();
	
	}
	
	if(choice.equalsIgnoreCase("yes"))
	{
		
	System.out.println("Rebooting your computer seemed to work");
	return;
	
	}
	
	System.out.println("Second step: reboot your router");
	System.out.print("Now are you able to connect with the internet? (yes or no): ");
	choice = scanner.nextLine().trim();
	while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
		
	{
		
	System.out.println("Please enter yes or no!\n");
	System.out.print("Now are you able to connect with the internet? (yes or no): ");
	choice = scanner.nextLine().trim();
	
	}
	
	if(choice.equalsIgnoreCase("yes"))
		
	{
		
	System.out.println("Rebooting your router seemed to work");
	return;
	
	}
	  
	System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
	System.out.print("Now are you able to connect with the internet? (yes or no): ");
	choice = scanner.nextLine().trim();
	while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
	{
		
	System.out.println("Please enter yes or no!\n");
	System.out.print("Now are you able to connect with the internet? (yes or no): ");
	choice = scanner.nextLine().trim();
	
	}
	
	if(choice.equalsIgnoreCase("yes"))
		
	{
		
	System.out.println("Checking the router's cables seemed to work");
	return;
	
	}
	  
	System.out.println("Fourth step: move your computer closer to your router");
	System.out.print("Now are you able to connect with the internet? (yes or no): ");
	choice = scanner.nextLine().trim();
	while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
		
	{
		
	System.out.println("Please enter yes or no!\n");
	System.out.print("Now are you able to connect with the internet? (yes or no): ");
	choice = scanner.nextLine().trim();
	
	}
	
	if(choice.equalsIgnoreCase("yes"))
		
	{
		
	System.out.println("Moving your computer closer to the router seemed to work");
	return;
	
	}
	  
	System.out.println("Fifth step: contact your ISP\n"
	+ "Make sure your ISP is hooked up to your router.");
	}
	{
	System.out.println("Programmer Name: Okeoghene Excel Omorobe");
	}
}
