/**
 * 
 */
package com.training.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.training.controller.CorporateTraining;
import com.training.controller.PublicTraining;
import com.training.controller.Training;

/**
 * @author ugawari
 *
 */
public class TrainingTest {

	private Training publicTraining, corporateTraining;
	
	@Before
	public void setUp(){
		publicTraining=new PublicTraining("Java", 660, 50);
		corporateTraining=new CorporateTraining("Big Data", 70000, 30);
	}

	@Test
	public void test() {
		/*System.out.println(publicTraining.getTrainingId());
		System.out.println(corporateTraining.getTrainingId());*/
	}
	
	//Test For public
	
	@Test
	public void testForPossitiveParticipant() throws Exception {
		Assert.assertEquals(33000, publicTraining.getOrderValue(), 10);
	}
	
	@Test
	public void testForIfParticipantIsNegative() {
		try {
			publicTraining=new PublicTraining("Java", -660, 50);
			Assert.assertEquals(33000, publicTraining.getOrderValue(), 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
