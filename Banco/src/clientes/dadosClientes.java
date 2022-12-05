package clientes;

import java.util.Locale;
import java.util.Scanner;

import entidades.LogicaClientes;
public class dadosClientes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		LogicaClientes dadosClientes;
		
		//Inserir dados do cliente
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposito (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			dadosClientes = new LogicaClientes(number, name, initialDeposit);
		}
		else {
			dadosClientes = new LogicaClientes(number, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(dadosClientes);
		
		//Depositar
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		dadosClientes.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(dadosClientes);
		
		//Sacar
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		dadosClientes.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(dadosClientes);
		
		sc.close();
	}

	
}
