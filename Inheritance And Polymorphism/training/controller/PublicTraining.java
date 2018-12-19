package com.training.controller;

import com.training.exception.InvalidNumberException;

public class PublicTraining extends Training {

	private int participants;
	
	public PublicTraining(String subject, double fees, int participants) {
		super(subject, fees);
		this.participants=participants;
	}

	
	@Override
	public double getOrderValue() throws Exception {
		if(participants>0){
			return super.getFees()*participants;
		}else{
			double aa= super.getFees()*participants;
			throw new InvalidNumberException("Invalid Number"); 
		}
	}

}
