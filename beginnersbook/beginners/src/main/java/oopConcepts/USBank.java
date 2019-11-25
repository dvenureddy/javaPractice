package oopConcepts;

public interface USBank {
	
	int MIN_BAL = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	// Only method declaration
	// No method body -- Only method prototype
	// In Interface we can declare the variables - Variables are by default Static in nature 
	// Variable value will not be changed, its final / constant in nature
	// No static method in Interface
	// No main method in Interface
	// We cannot create the Object of Interface
	// Interface is abstract in nature
	
	
}