public class Beverage extends Product{
	private boolean iced;
	private Size size;
	
	
	public Beverage(String name,double basePrice,Size size,boolean iced)
	{
		super(name,basePrice);
		this.size=size;
		this.iced=iced;
	}
	
	public double price(){
		
		double fprice=super.getBasePrice()*size.getMultiplier();
		
		if(iced)
		{
			fprice=fprice+0.30;
		}
		
		return fprice;
	}
	
	public String isIced()
	{
		return iced? "Iced": "Hot";
	}
	
	public String prepNote(){
		return "Beverage["+getName()+" "+" Size"+" "+this.size+" It is "+this.isIced();
	}
	 
}

