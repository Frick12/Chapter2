package inchesToFeet;


import java.util.Scanner;
public class InchesToFeet
{
	
	public static void main(String[] args)
	{
		int inches;
		int feet;
		int remainder;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many inches? >> ");
		inches = input.nextInt();
		
		feet = inches/12;
		
		remainder = inches%12;
		
		System.out.println(inches + " inches equals " + feet + " feet " + remainder + " inches.");

	}

}