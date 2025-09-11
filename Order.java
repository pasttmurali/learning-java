import java.util.List;
import java.util.ArrayList;
public class Order{
	private Customer customer;
	private List<OrderItem> items;
	
	public Order (Customer customer){
		this.customer=customer;
		this.items=new ArrayList<>();
	}
	
	public void addItem(Product p,int numberofproduct){
		items.add(new OrderItem(p,numberofproduct));
	}
	
	public double subtotal(){
		double sum=0;
		for(OrderItem item:items){
			sum+=item.lineTotal();
		}
		return sum;
	}
	
	public double discount(){
		return subtotal()*customer.getCard().getDiscountRate();
	}
	
	public double total(){
		return subtotal()-discount();
	}
	
	public void printRecipt(){
		System.out.println("Customer: "+customer.getName()+"("+customer.getCard()+")");
		System.out.println("-------------------------------------------------");
		
		for(OrderItem item:items){
			Product p=item.getProduct();
			System.out.printf("%-25s x%d   %.2f\n", p.getName(), item.getQuantity(), item.lineTotal());
			
		}
		
		System.out.println("-------------------------------------------------");
        System.out.printf("Subtotal: %.2f\n", subtotal());
        System.out.printf("Discount: %.2f\n", discount());
        System.out.printf("Total:    %.2f\n", total());

        System.out.println("\n--- Kitchen Prep List ---");
        for (OrderItem item : items) {
            System.out.println(item.getQuantity() + " x " + item.getProduct().prepNote());
        }
	}
} 