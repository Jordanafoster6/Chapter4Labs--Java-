import java.util.Scanner;

public class shippingChargesDemo {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		shippingCharges shipment1 = new shippingCharges();
		
		System.out.print("How much does your package weigh?(in Kg)");
		shipment1.setWeight(keyboard.nextDouble());
		
		System.out.print("How many miles does it need to be shipped?");
		shipment1.setMiles(keyboard.nextInt());
		
		System.out.println("----------------------------");
		System.out.printf("Package Weight in (Kg): %.0f \n", shipment1.getWeight());
		System.out.printf("Shipping Miles: %d \n", shipment1.getMiles());
		System.out.println("----------------------------");
		System.out.printf("Total Cost: $%.2f \n", shipment1.getTotal());
		System.out.println("----------------------------");
		keyboard.close();
	}
	
}
