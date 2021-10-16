package Mypack;
class Super{
	// Example of static methods
	public static void superStaticMethod() {
		System.out.println("Super class stataic method");
	}
	public void superNonStaticMethod() {
		System.out.println("Super class with non static method");
	}
}
class Base extends Super{
	public static void superStaticMethod(){
		System.out.println("Sub class method is overriding super static method???");
	}
	public void superNonStaticMethod(){
		System.out.println("Sub class with non static method");
		
	}
}
class ServiceB{
	public static void main(String[] args){
		Super b = new Base();
		b.superStaticMethod();
		b.superNonStaticMethod();
	}
	
}










//
//package Mypack;
//import java.time.format.DateTimeFormatter;
//import java.time.LocalDateTime;
//import java.util.*;
//
////public class ATMMachine{
////	public static void main(String...arg) {
////		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd");
////		System.out.println(dtf.format(LocalDateTime.now()));
////		
////	}
////}
//public class ATMMachine{
//
//	static float balance = 0; // initial balance to 0 for everyone
//	static int anotherTransaction;
//	static ArrayList<String> transactions = new ArrayList<String>();
//
//	public static void main(String args[]){
//		Scanner	in = new Scanner(System.in);
//		// call our transaction method here
//		transaction();
//
//	}
//	private static void transaction(){
//		// here is where most of the work is
//		int choice;
//		System.out.println("Please select an option");
//		System.out.println("1. Withdraw");
//		System.out.println("2. Deposit");
//		System.out.println("3. Balance");
//		System.out.println("4. View Transactions");
//
//		Scanner in = new Scanner(System.in);
//		choice = in.nextInt();
//		switch(choice){
//		case 1:
//			float amount;
//			System.out.println("Please enter amount to withdraw: ");
//			amount = in.nextFloat();
//			if(amount > balance || amount == 0){
//				System.out.println("You have insufficient funds\n\n");
//				anotherTransaction(); // ask if they want another transaction
//				
//			} else {
//				// they have some cash
//				// update balance
//				balance = balance - amount;
//				System.out.println("You have withdrawn "+amount+" and your new balance is "+balance+"\n");
//				transactions.add("You have withdrawn "+amount+" and your new balance is "+balance);
//				anotherTransaction();
//				
//			}
//			break;
//		case 2:
//			// option number 2 is depositing
//			float deposit;
//			System.out.println("Please enter amount you would wish to deposit: ");
//			deposit = in.nextFloat();
//			// update balance
//			balance = deposit + balance;
//			System.out.println("You have deposited "+deposit+" new balance is "+balance+"\n");
//			transactions.add("You have deposited "+deposit+" new balance is "+balance);
//			anotherTransaction();
//			break;
//		case 3:
//			// this option is to check balance
//			System.out.println("Your balance is "+balance+"\n");
//			transactions.add("Your balance is "+balance+"\n");
//			anotherTransaction();
//	
//			break;
//
//		case 4:
//			System.out.println("~~~~~~~~~~~~~");
//			System.out.println("          transactions");
//			System.out.println("~~~~~~~~~~~~~");
//			Iterator<String> it = transactions.iterator();
//			while(it.hasNext()) {
//				System.out.println(it.next());
//				showDate();
//				
//			}
//			anotherTransaction();
//			
//
//			break;
//			
//		default:
//			System.out.println("Invalid option:\n\n");
//			anotherTransaction();
//			break;
//
//		}
//	}
//	private static void showDate() {
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd");
//		System.out.println("Your Transaction Date is - " + dtf.format(LocalDateTime.now()));
//		
//		
//	}
//	private static void anotherTransaction(){
//		System.out.println("Do you want another transaction?\n\nPress 1 for another transaction\n2 To exit");
//		Scanner in = new Scanner(System.in);
//		anotherTransaction = in.nextInt();
//		if(anotherTransaction == 1){
//			transaction(); // call transaction method
//		} else if(anotherTransaction == 2){
//			System.out.println("Thanks for choosing us. Good Bye!");
//		} else {
//			System.out.println("Invalid choice\n\n");
//			anotherTransaction();
//		}
//	}
//}
//

