/*Write a program that calculates and displays the conversion of an entered number
of dollars into currency denominations—20s, 10s, 5s, and 1s. Save the program as
Dollars.java.*/

import java.util.Scanner;

public class Dollars 
{
	public static void main (String [] args)
	{
			
		int dollars;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of dollars >> ");
		dollars = input.nextInt();
		
		int twentys = dollars/20;
		int tens = (dollars-twentys*20)/10;
		int fives = (dollars-(twentys*20+tens*10))/5;
		int ones = (dollars -(twentys*20+tens*10+fives*5))/1;
		
		System.out.println(dollars+ " converted into " +twentys+ " \'20s\', "
				+tens+ " \'10s\', " +fives+ " \'5s\', " +ones+ " \'1s\'.");
		
		
	}

}
