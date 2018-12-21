package com.cg.training.controller;


public class PublicTraining extends Training {

	private int participants;
	
	public PublicTraining(String subject, double fees, int participants) {
		super(subject, fees);
		this.participants=participants;
	}

	/**
	 * Training Charges are applied on the basis of training types. if it is a
	 * public program, charges are applied on the basis of, no. of participants
	 * (fees * participants).
	 */
	@Override
	public double getOrderValue(){
		if(participants>0 && super.getFees()>0){
			return super.getFees()*participants;
		}
		return 0;
	}

}
