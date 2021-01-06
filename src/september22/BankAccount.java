package september22;

public class BankAccount {
	
	
	String name;
	
	String address;
	
	String ssn;
	
	String phoneNo;
	
	long accountNo;
	
	int routingNo;
	
	double balance;
	
	
	public BankAccount() {
		

		name = "John Doe";
		
		address = "123 main st";
		
		ssn = "1234567890";
		
		phoneNo = "123-345-3456";
		
		accountNo = 123456789123L;
		
		routingNo = 123456789;
		
		balance = 100;
		
	}
	
	public BankAccount (String newName) {
		
		name = newName;
		
	}
	
	public BankAccount (String newName, String newAddress, String newSsn, String newPhoneNo) {
		
		name = newName;
		
		address = newAddress;
		
		ssn = newSsn;
		
		phoneNo = newPhoneNo;
		
	}
	
	public BankAccount (String newName, String newAddress, String newSsn, 
			String newPhoneNo, long newAccountNo, int newRoutingNo, double newBalance) {
	
		name = newName;
		
		address = newAddress;
		
		ssn = newSsn;
		
		phoneNo = newPhoneNo;
		
		accountNo = newAccountNo;
		
		routingNo = newRoutingNo;
		
		balance = newBalance;
		
	}
	
	public String getInfo() {
		
		return ("Name: " + name + "\n" + 
		"Address : " + address + "\n" + 
		"SSN: " + ssn + "\n" + 
		"Phone No: " + phoneNo + "\n" +
		"Account no : " + accountNo + "\n" + 
		"Routing no : " + routingNo + "\n" +
		"Balance : " + balance);
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	public void deposit(double increasingAmount) {
		
		balance += increasingAmount;
		
	}
	
	public void withdraw(double decreasingAmount) {
		
		if(decreasingAmount <= balance) {
			
			balance -= decreasingAmount;
			
		}else {
			
			System.out.println("Insufficient funds. You are trying to withdraw " + decreasingAmount + ". Your balance is " + balance);
		}
	
		
	}
	
}
