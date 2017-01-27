package arithmeticOperators;
import java.util.Scanner;
public class arithmeticDemoThree 
{

	public static void main(String[] args) 
	{
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		double average;
		
		Scanner tacos = new Scanner(System.in);
		
		System.out.print("Please enter an integer >> ");
		firstNumber = tacos.nextInt();
		
		System.out.print("Please enter another integer >> ");
		secondNumber = tacos.nextInt();
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = sum / 2.0;
		
		System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
		System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
	}

}