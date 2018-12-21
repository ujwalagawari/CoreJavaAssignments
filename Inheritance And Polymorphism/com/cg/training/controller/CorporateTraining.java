/**
 * 
 */
package com.cg.training.controller;

/**
 * @author ugawari
 *
 */
public class CorporateTraining extends Training {
	
	private int days;

	public CorporateTraining(String subject, double fees, int days) {
		super(subject, fees);
		this.days=days;
	}

	/**
	 * Training Charges are applied on the basis of training types. If it’s a
	 * corporate company, charges are applied on the basis of per day(fees *days).
	 */
	@Override
	public double getOrderValue() {
		if(super.getFees()>0 &&  days>0){
			return super.getFees()*days;
		}
		return 0;
	}

}
