public class Main{
	public static void main(String args[])
	{
		  
        Customer c1 = new Customer("Murali", LoyaltyCard.GOLD);

      
        Beverage b1 = new Beverage("Cola", 3.00, Size.MEDIUM, true);
        Beverage b2 = new Beverage("sprite", 2.50, Size.SMALL, false);
        Pastry p1 = new Pastry("Chocklate", 2.00, false, true);
        Pastry p2 = new Pastry("egg", 2.50, true, false);

        
        Order order = new Order(c1);
        order.addItem(b1,2);
        order.addItem(b2,1);
        order.addItem(p1,3);
        order.addItem(p2,2);

     
        order.printRecipt();
    }
	
}