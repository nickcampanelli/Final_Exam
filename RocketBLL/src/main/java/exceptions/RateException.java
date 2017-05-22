package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception
{

	private RateDomainModel rdm;
	
	public RateException(RateDomainModel ratedm)
	{
		this.rdm = ratedm;
		System.out.println("Credit score of " + ratedm.getiMinCreditScore() + " is too low to find an interest rate.");
	}
	
	public RateDomainModel getRdm() {
		return rdm;
	}
}