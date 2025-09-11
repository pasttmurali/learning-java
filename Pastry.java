public class Pastry extends Product{
	private boolean gluntenFree;
	private boolean warmed;

	
	public Pastry(String name,double basePrice,boolean gluntenFree,boolean warmed)
	{
		super(name,basePrice);
		this.gluntenFree=gluntenFree;
		this.warmed=warmed;
	}
	
	public double price(){
		
		double fprice=super.getBasePrice();
		
		if(gluntenFree)
		{
			fprice=fprice+0.5;
		}
		
		if(warmed)
		{
			fprice=fprice+0.2;
		}
		
		return fprice;
	}
	
	public String isGluntenFree(){	
		return gluntenFree? "GluntenFree": "is not GluntenFree";	
	}
	
	public String isWarmed(){
		
			return warmed? "warmed": "is not warmed";
	}
	
	public String prepNote(){
		return "Pastry["+getName()+" "+this.isWarmed()+" "+this.isGluntenFree()+"]";
	}
	 
}