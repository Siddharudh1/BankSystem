import java.util.Scanner;


public class Test {

	public static void main(String[] args) throws Exception {
		Scanner sc1  = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter user name");
		String username = sc1.nextLine();
		
		System.out.println("Create Pin");
		String pin = sc1.nextLine();
		
		System.out.println("Customer username : "+username+" and "+pin+" generaeted  successfully.....");
		
		CustomerAccount CA  = new CustomerAccount(pin);
		ATM obj = new ATM();
		
		
		
		int ch = 0;
		while(ch != 4) {
			System.out.println("*******BANK OPERATION************");
			System.out.println("Enter 1 to add money to account");
			System.out.println("Enter 2 to withdraw amount");
			System.out.println("Enter 3 to go to ATM operation");
			System.out.println("Enter 4 to close Accunt");
			ch = sc1.nextInt();
			
			switch(ch) {
			case 1 :System.out.println("Enter the amount to add money");
					Double amount = sc2.nextDouble();	
					CA.addMoney(amount);
					
					break;
					
			case 2 :System.out.println("Enter the Withdraw amount");
					Double WithDrawAmount = sc2.nextDouble();
					CA.withdrawMoney(WithDrawAmount);
					
					break;
					
			case 3 :int ch1 =0;
					Scanner sc3 = new Scanner(System.in);
					Scanner sc4 = new Scanner(System.in);
					while(ch1 !=3) {
						System.out.println("**********ATM OPERATION************");
						System.out.println("Enter 1 to view balance");
						System.out.println("Enter 2 to withdraw money from ATM");
						System.out.println("Enter 3 to go back to BANK OPERATION");
						ch1 = sc1.nextInt();
						switch(ch1) {
						case 1 :System.out.println("Enter the username ");
								String username1 = sc3.nextLine();
								System.out.println("Enter pin");
								String pin1 = sc3.nextLine();
								obj.viewBalance(username1, pin1);
								
								break;
								
						case 2 :System.out.println("Enter username");
								String username2 = sc3.nextLine();	
								System.out.println("Enter Pin");
								String pin2 = sc3.nextLine();
								System.out.println("Enter amount to withdraw from ATM");
								Double amount1 = sc4.nextDouble();
								obj.withdrawMoney(username2, pin2, amount1);
								
								break;
								
						case 3:System.out.println();
								break;
								
						default :System.out.println("INVALID INPUT");
								break;
						}
					}
				
					break;
					
			case 4 :CA.closeAccount();
		
					break;
					
			default:System.out.println("INVALID INPUT");
			}
		}
		/*CustomerAccount CA = new CustomerAccount("Siddu","123");
		CA.addMoney(10000.00);
		CA.withdrawMoney(2000.00);
		ATM obj1 = new ATM();
		obj1.viewBalance("Siddu","123");
		obj1.withdrawMoney("Siddu","123",5000.00);
		CA.closeAccount();
		CA.addMoney(1000.00);*/
	}

}
