package entidades;

public class LogicaClientes {
	
	private int conta;
	private String name;
	private double balance;
	
	public LogicaClientes(int conta, String name) {
		this.conta = conta;
		this.name = name;
	}

	public LogicaClientes(int conta, String name, double initialDeposit) {
		this.conta = conta;
		this.name = name;
		deposit(initialDeposit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}


	public int getConta() {
		return conta;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account " + conta + ", Name: " + name + ", Balance: " + balance;
	}
	

}
