
public class Main {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		
		Account account= new Account("Alper", "1234", 4000);
		
		atm.work(account);
		
		System.out.println("The program is terminating..");
	}

}
