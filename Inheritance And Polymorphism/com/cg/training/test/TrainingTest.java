/**
 * 
 */
package com.cg.training.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cg.training.controller.CorporateTraining;
import com.cg.training.controller.PublicTraining;
import com.cg.training.controller.Training;

/**
 * @author ugawari
 *
 */
public class TrainingTest {

	private Training publicTraining, corporateTraining;
	
	@Before
	public void setUp(){
		publicTraining=new PublicTraining("Java", 660, 50);
		corporateTraining=new CorporateTraining("Big Data", 700, 30);
	}

	
	//Test For public
	
	@Test
	public void testForPossitiveParticipant(){
			Assert.assertEquals(33000, publicTraining.getOrderValue(), 10);
	}
	
	@Test
	public void testForIfParticipantIsNegative() {
			publicTraining=new PublicTraining("Java", -660, 50);
			Assert.assertEquals(0, publicTraining.getOrderValue(), 10);
	}

	//Test For corporate
	
	@Test
	public void testForPossitiveDays(){
			Assert.assertEquals(21000, corporateTraining.getOrderValue(), 10);
	}
	
	@Test
	public void testForIfDaysIsNegative() {
			corporateTraining=new PublicTraining("Java", -660, 50);
			Assert.assertEquals(0, corporateTraining.getOrderValue(), 10);
	}
}
