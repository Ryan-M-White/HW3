/**
 * Purpose:     This program prompts the user to enter information
 * 				about a vehicle(s) they'd like to order<br>
 *                                                    <br>
 * Caveats:     Entering blatantly invalid information 
 * 				to some of the prompts may break the program.<br>
 * Date:        October 12th, 2017
 * @author      Ryan White   
 * @version     1.0
 */

/* Note: a lot of my comments are pseudocode for code
		I haven't had the chance to write yet. Other than that
		the program should work fine. */
import java.util.*;
public class Orders {
	public static void main(String[] args) {
		//declarations
		boolean orderingInProcess = true;
		List<Vehicle> orderList = new ArrayList<Vehicle>();		
      //program
		System.out.println("Ryan White's Ordering System");
		System.out.println("");		
		while(orderingInProcess){
			Scanner sc = new Scanner(System.in);
			System.out.println("Do you want to order a Truck (T/t) or Car (C/c)?");
			while (!sc.hasNext("[tTcC]")) {
				System.out.println("That's not an option! Please Try again.");
				System.out.println("Do you want to order a Truck (T/t) or Car (C/c)?");
				sc.next();
			}
			String option = sc.next();

			if(option.equals("c") || option.equals("C")){
				//for now we'll just call the Car constructor. Setters will be called later.
				Car car = new Car();
				//Entering Car Order:
				System.out.print("Model: ");
				String model = sc.next();
				car.setModel(model);
				System.out.print("Color: ");
				String color = sc.next();
				car.setColor(color);
				System.out.print("Cost: ");				
				while (!sc.hasNextDouble()) {
					System.out.println("That's not a number! Please Try again.");
					System.out.print("Cost: ");
					sc.next();
				}
				Double cost = sc.nextDouble();
				car.setCost(cost);
				
				// System.out.println("What type of Car is this?");
				//choices
				//set type

				// System.out.println("Does this car have a towing package?");
				//if statement for yes/no. inside statement, set hasTowingPackage

				//save this order into an array
				orderList.add(car);
				//Ask if they want to make another order
				System.out.println("");
				System.out.println("Do you want to order another vehicle?");
				while (!sc.hasNext("[yYnN]")) {
					System.out.println("That's not an option! Please Try again.");
					System.out.println("Do you want to order another vehicle?");
					sc.next();
				}
				String answer = sc.next();
				if(answer.equals("y") || answer.equals("Y")){
					//do nothing, the while loop should run again
				} else if(answer.equals("n") || answer.equals("N")){
					orderingInProcess = false;
					sc.close();
					//while loop is broken, ordering is finished. Order collection will be printed.
				} else {
					System.out.println("You've officially broken my program. Please restart and only type 'y', 'Y, 'n', or 'N' this time");
					sc.close();
					System.exit(0);
				}
			} else if(option.equals("t") || option.equals("T")){
				//for now we'll just call the Truck constructor. Setters will be called later.
				Truck truck = new Truck();
				//Entering Truck Order:
				//truck.setModel();
				//truck.setColor();
				//truck.setCost();
				
				// System.out.println("What size Truck is this?");
				//choices
				//set type

				// System.out.println("What is the engine size of the Truck?");
				//choices
				//set type

				//save this order into an array
				orderList.add(truck);
				//Ask if they want to make another order
				System.out.println("");		
				System.out.println("Do you want to order another vehicle?");
				while (!sc.hasNext("[yYnN]")) {
					System.out.println("That's not an option! Please Try again.");
					System.out.println("Do you want to order another vehicle?");
					sc.next();
				}
				String answer = sc.next();
				if(answer.equals("y") || answer.equals("Y")){
					//do nothing, the while loop should run again
				} else if(answer.equals("n") || answer.equals("N")){
					orderingInProcess = false;
					sc.close();
					//while loop is broken, ordering is finished. Order collection will be printed.
				} else {
					System.out.println("You've officially broken my program. Please restart and only type 'y', 'Y, 'n', or 'N' this time");
					sc.close();
					System.exit(0);
				}
			} else {
				System.out.println("You've officially broken my program. Please restart and only type 'c', 'C, 't', or 'T' this time");
				sc.close();
				System.exit(0);
			}
		}

		//For loop that iterates through the orders and prints their contents
		
		for(Vehicle vehicle : orderList) {
			if(vehicle instanceof Car){
				Car myCar = (Car) vehicle;
				System.out.println(myCar.getModel());
				System.out.println(myCar.getColor());
				System.out.println(myCar.getCost());
			}
			else if(vehicle instanceof Truck){
				Truck myTruck = (Truck) vehicle;
				System.out.println(myTruck.getModel());
				System.out.println(myTruck.getColor());
				System.out.println(myTruck.getCost());
			} else{
				System.out.println("Error: Object is neither a car nor a truck...");
			}
		}
		System.out.println("");
		System.out.println("");		
		System.out.println("Thank you for using Ryan White's Ordering System");

	}
}