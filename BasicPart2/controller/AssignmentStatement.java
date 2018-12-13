package com.assignment.controller;

/**
 * @author ugawari
 *
 */
public class AssignmentStatement {

	/**
	 * program for Java assignment statement to calculate a 35% discount on an item’s value stored in the variable newItem,
		store the discount amount in a variable called discount. Then calculate the new price for the item subtracting off the discount,
		storing the new price in a variable called newItemPrice
	 * @param newItem
	 * 			input parameter
	 * @return newItemPrice
	 * 			output
	 */
	public double calculateNewPrice(double newItem) {
		double discount, newItemPrice=0;
		if(newItem>0){
			discount=newItem*35/100;
			newItemPrice=newItem-discount;
		}
		return newItemPrice;
	}

}
