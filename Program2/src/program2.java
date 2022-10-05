// Application:	Program 2
// Name:		Jalen M
// GitHub User: Dorwits
// Date:		Sep 20
// Version:		1.0
// Description:	Switch statements 

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
		
		//Collect input from user
		System.out.println("What is your favorite number 1-50?");
		int favnumber = keyboard.nextInt();
		System.out.println("What is your birth month? (1-12)");
		int bmonth = keyboard.nextInt();
		System.out.println("How old were you in 2015?");
		int year = keyboard.nextInt();

		//Display Menu Options
		System.out.println("Menu Choices");
		System.out.println("1. Add - (Birth month + favorite)");
		System.out.println("2. Subtract - (Age in 2015 - birth month");
		System.out.println("3. Multiply - (Favorite number x age in 2015");
		System.out.println("4. Divide - (Birth month / favorite number)");
		System.out.println("What can I do for ya?!");
		
		//User Input
		int choice = keyboard.nextInt();
		switch (choice) {
		case 1:
			//add
			if (choice==1) {
				System.out.println( bmonth + favnumber);
				System.out.println("You have added your birth month and favorite number. Want to try again?");
			}
			//Show results + nice message
			if (bmonth+favnumber>year) {
				System.out.println(bmonth+favnumber + " is greater than " + year);
				System.out.println("This is your glow season");
			} else {
				System.out.println(bmonth+favnumber + " is less than " + year);
				System.out.println("Not your time of year");
			}
		break;
		
		case 2:
			//subtract
			if (choice==2) {
				System.out.println( year - bmonth);
				System.out.println("Enough to get a happy meal!!");
			}
			//Output answers and kindness
			if (year-bmonth>favnumber) {
				System.out.println(year-bmonth + " is greater than " + favnumber);
				System.out.println("A new leaf is in store");
			} else {
				System.out.println(year-bmonth + " is less than " + favnumber);
				System.out.println("Brace for the storm ahead");
			}
		break;
		
		case 3:
			//multiply
			if (choice==3) {
				System.out.println( favnumber * year);
				System.out.println("BIG BANK$$");
			}
			//Display values and kind message
			if (favnumber*year>bmonth) {
				System.out.println(favnumber*year + " is greater than " + bmonth);
				System.out.println("Enjoy the day. You earned it");
			} else {
				System.out.println(favnumber*year + " is less than " + bmonth);
				System.out.println("Keep ya head up");
			}
		break;
		
		case 4:
			//divide
			if (choice==4) {
				System.out.println( bmonth / favnumber);
				System.out.println("This what taxes feel like :(");
			}
			//Output values and positive phrase 
			if (bmonth/favnumber>year) {
				System.out.println(bmonth/favnumber + " is greater than " + year);
				System.out.println("Today is your day");
			} else {
				System.out.println(bmonth/favnumber + " is less than " + year);
				System.out.println("Stay patient. Things take time");
			}
		break;
		
		}
		
	
	}

}
