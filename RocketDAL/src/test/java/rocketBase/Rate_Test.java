package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	@Test
	public void rate_test1(){
		ArrayList<RateDomainModel> test1 = RateDAL.getAllRates(); 
		assertTrue(test1.get(1).getiMinCreditScore()==600);
		test1.get(1).setiMinCreditScore(600);
		assertTrue(test1.get(1).getdInterestRate()==7);
		
	}

	@Test
	public void rate_test2(){
		
	}

}