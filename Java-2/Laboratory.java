package Lab3;
	import java.util.*;  
	public class Main
	{
		public static void main(String[] args) {
			
			 (//taking inputs like name, price from the user
			Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter your name: ");  
				String user_name = sc.nextLine(); 
				
				System.out.print("Enter the item's weight in ounces: ");  
				float items_weight= sc.nextInt();  
				
				System.out.print("Enter the price per pound: ");  
				float price = sc.nextFloat();
				
				//calculating weight_in_pound
				float weight_in_pound = items_weight/16;
				
				//calculating total_price
				float total_amt = price*weight_in_pound;
				
				//replacing spaces in names with dot .
				user_name = user_name.replace(" ", ".");
				
				//generating random confirmation code
				Random random = new Random();
				int random_num = random.nextInt(90) + 10;


				
				//printing the results
				System.out.println("\n\n\\\\\\"+"Welcome "+user_name+"///");
				System.out.println("=================================");
				System.out.println("Unit price:     "+String.format("%.2f",price)+" per pound");
				System.out.println("Weight:         "+String.format("%.2f",weight_in_pound)+" pounds");
				System.out.println("=================================");
				System.out.println("Total:         "+String.format("%.2f",total_amt));
				System.out.println("\n\nconfirmation code: "+random_num);
			}
	}

}
