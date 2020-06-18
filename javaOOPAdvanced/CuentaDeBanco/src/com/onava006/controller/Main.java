package com.onava006.controller;

import com.onava006.models.*;

public class Main {

	public static void main(String[] args) {
		
		BankAccount brayan = new BankAccount();
		brayan.depositMoney(20000.0, 'a');
		
		brayan.getSaldoCuentaAhorros();
		brayan.depositMoney(7000.0, 'b');
		
		brayan.getBalance();
		
		brayan.retireMoney(25000.0, 'b');
	}

}
