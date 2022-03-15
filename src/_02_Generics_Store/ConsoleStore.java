package _02_Generics_Store;

import java.util.Scanner;

public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

    public static void main(String[] args) {
    	int money = 50;
    	Cart userCart = new Cart();
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Welcome to the console store! "
    			+ "You have $50 to buy whatever you want. We have cereal($10), clothing($15), candy($5), and toys($17)");
    	String again;
    	do {
    		System.out.println("What do you want to buy.");
    		String userItem = scan.nextLine();
    		if (userItem.equals("cereal")) {
				if (money >= 10) {
					
				} else {

				}
			}else if (userItem.equals("clothing")) {
				
			}else if (userItem.equals("candy")) {
				
			} else if (userItem.equals("toys")) {

			}
            System.out.print("Would you like to buy something (y/n)? ");
        	again = scan.next();
		} while (again.equals("y") );  
    	
    	
    }

}
