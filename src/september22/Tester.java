package september22;

public class Tester {

	public static void main(String[] args) {
		

		BankAccount account1 = new BankAccount();
		
		System.out.println(account1.getInfo());
		
		System.out.println("-----------------------");
		
		
		BankAccount account2 = new BankAccount("Fuad");
		
		System.out.println(account2.getInfo());
		
		
		System.out.println("-----------------------");
		
		
		BankAccount account3 = new BankAccount("Furkan", "123 main st", "12345678", "213654321");
		
		System.out.println(account3.getInfo());
		
		
		System.out.println("-----------------------");
		
		
		BankAccount account4 = new BankAccount("Nastya", "123 main st", "12345678", "213654321",
				
									326116476L, 54+9685353, 200);
		
		System.out.println(account4.getInfo());
		
		
		System.out.println("-----------------------");
		
		
		account4.deposit(200150);
		
		System.out.println(account4.getBalance());
		
		System.out.println("-----------------------");
		
		account4.withdraw(200350);
		
		System.out.println(account4.getInfo());
		
		System.out.println("-----------------------");
		
		account4.withdraw(100000);
		
		System.out.println(account4.getBalance());
		
		

	}

}
