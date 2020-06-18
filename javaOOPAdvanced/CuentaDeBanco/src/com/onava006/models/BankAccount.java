package com.onava006.models;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random; 

public class BankAccount {
	String accountNumber;
	double saldoCuentaCorriente;
	double saldoCuentaAhorros;

	static Integer numberOfAccounts = 0;
	static Integer totalmoneyStored = 0; 
	private Map<Character,Double> accounts = new HashMap<Character,Double>(); 	

	public BankAccount(){
		this.accountNumber = setaccountNumber();		
		numberOfAccounts = numberOfAccounts + 1;
		accounts.put('a', saldoCuentaCorriente);
		accounts.put('b', saldoCuentaAhorros);
	}	

	public double getSaldoCuentaCorriente() {
		return accounts.get('a');
	}

	public double getSaldoCuentaAhorros() {
		return accounts.get('b');
	}

	private String setaccountNumber() {

		Random rand = new Random(); 
		int data[] = new int[10];	

		for(int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(9);
		}
		
		String str = Arrays.toString(data);

		System.out.println("tu nueva cuenta de banco es: " + str);
		System.out.println("si no te gusta el número así, paga por la subscripción premium de tu cuenta");
		return str;		
	}

	public void depositMoney(Double deposit, Character destination) {

		try {
			accounts.containsKey(destination);
		} catch(Exception e) {			
			System.out.println("la cuenta de destino no existe");			
		}

		accounts.put(destination, deposit);		
		totalmoneyStored = totalmoneyStored + (int) Math.round(accounts.get(destination));			
	}

	public void retireMoney(Double retire, Character destination) {
		try {
			accounts.containsKey(destination);
		} catch(Exception e) {			
			System.out.println("la cuenta de destino no existe");			
		}

		if (accounts.get(destination) - retire < 0) {
			System.out.println("no tienes saldo suficiente");
		} else {

			accounts.put(destination, accounts.get(destination) - retire);		
			totalmoneyStored = (int) (totalmoneyStored - retire);

		}	
	}

	public void getBalance() {
		System.out.println("el balance de la cuenta de ahorro es: " + getSaldoCuentaCorriente());
		System.out.println();
		System.out.println("el balance de la cuenta corriente es: " + getSaldoCuentaAhorros());		
	}

}
