public enum LoyaltyCard{
	NONE(0.00),
	SILVER(0.05),
	GOLD(0.10);
	
	private final double discountRate;
	
	LoyaltyCard(double discountRate){
		this.discountRate=discountRate;
	}
	
	public double getDiscountRate()
	{
		return discountRate;
	}
}