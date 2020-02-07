package com.qa.adventure_game.adventure;

import java.io.Console;
import java.util.Scanner;

public class Tester {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		Console c = System.console();
		System.out.println ("You Awaken to find yourself in a infinite grey swamp. do you want to explore Yes or No?"); 

			boolean learntolook = false;
		
			do	{
				String test= scanner.nextLine();

				if (test.equals("Yes")) {
					learntolook = true; 
				}
				else {
					System.out.println ("No");
				}
				} while (learntolook ==  false);
			

				System.out.println ("All you see around you is a thick dark fog as you stand in the middle of a freezing cold swamp that seems to extend forever.");
				System.out.println("You reach to your pocket and pull out a compass. It's trying to show to something. You goal is at '0,0'. ");
				System.out.println("Do you want to go North, South, East or West? type pos to know your position");



			int EastWestCoordinate = 10;
			int NorthSouthCoordinate = -10;

			do {

			String input = scanner.nextLine();
			if (input.equals("pos")) {
				System.out.println("East/West: " + EastWestCoordinate + ", " + "North/South: " + NorthSouthCoordinate + " ");
			}
	
			else if (input.equals("West")) {
					System.out.println("You walked west for a bit");
					EastWestCoordinate++;
				}
				else if (input.equals("East")) {
					System.out.println("You walked east for a bit");
					EastWestCoordinate--;
				}
				else if (input.equals("North")) {
					System.out.println("You walked north for a bit");
					NorthSouthCoordinate++;
				}
				else if (input.equals("South")) {
					System.out.println("You walked south for a bit");
					NorthSouthCoordinate--;
				}
			} while (!(EastWestCoordinate == 0 && NorthSouthCoordinate == 0));
		
			System.out.println("You find a small box, with a ribbon on it");
			System.out.println("Do you want to open the box?");
			boolean action = false;
			
			do {
				String input2 = scanner.nextLine();
					if (input2.equals ("y") || input2.equals ("yes")) {
					System.out.println("You open the box, and see a portal. You wake up and realise it was all a dream");
					action = true;
					}
					else {
					System.out.println("Are you sure?. Try Again!");
					}
		
			} while (action == false);

			System.out.println("The End!");
		}


	}


