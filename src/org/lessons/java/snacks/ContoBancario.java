package org.lessons.java.snacks;

import java.util.Scanner;

/*
 * Crea una classe ContoBancario con attributi per 
 * numero di conto 
 * saldo
 * Implementa un costruttore che accetta il numero di 
 * conto e inizializza il saldo a zero. 
 * Aggiungi metodi pubblici per depositare denaro sul 
 * conto, prelevare denaro dal conto e ottenere il saldo 
 * corrente.
 */

public class ContoBancario {
	
	int number;
	double balance;
	
	ContoBancario(int number) {
		this.number = number;
		balance = 0;
	}
	
	private double setRecharge() {
		Scanner scan = new Scanner(System.in);
		double recharge = scan.nextDouble();
		double newBalance = balance + recharge;
		String rounded = String.format("%.2f", null);
		System.out.println("NUOVO SALDO: " + newBalance);
		return newBalance;
	}
	
	public double getRecharge() {
		return setRecharge();
		
	}
	
	public void getOptions() {
		System.out.println("Digita 1 se vuoi depositare");
		System.out.println("Digita 2 se vuoi prelevare");
		System.out.println("Digita 3 se vuoi sapere il tuo saldo attuale");
	}

	private double setWithdrawal() {
		Scanner scan = new Scanner(System.in);
		double withdrawal = scan.nextDouble();
		double newBalance = balance - withdrawal;
		String rounded = String.format("%.2f", null);
		System.out.println("NUOVO SALDO: €" + newBalance);
		return newBalance;
	}
	
	public double getWithdrawal() {
		return setWithdrawal();
	}
	
}
