package oopConcepts;

// We are multiple inheritance 
// Is-a relationship
public class HSBCBank implements USBank, BrazilBank {

	// If a class is implementing any interface, then it is mandatory to
	// define/implement all the methods of Interface.
	
	//Overriding USBank
	public void credit() {
		System.out.println("HSBC Credit Card");
	}
	
	//Overriding USBank
	public void debit() {
		System.out.println("HSBC Debit Card");
	}

	//Overriding USBank
	public void transferMoney() {
		System.out.println("HSBC Transfer Money");
	}

	//HSBC Bank Methods
	public void eductaionLoan() {
		System.out.println("HSBC Education Loan");
	}

	//HSBC Bank Methods
	public void carLoan() {
		System.out.println("HSBC Car Loan");
	}

	// Brazil Bank
	public void mutualFunnd() {
		System.out.println("HSBC Mutual Fund");
	}
}
