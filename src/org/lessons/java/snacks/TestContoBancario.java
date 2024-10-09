package org.lessons.java.snacks;

import java.util.Scanner;

public class TestContoBancario {
	
	public static void main(String[] args) {
		
		ContoBancario num1 = new ContoBancario(1234567891);
		ContoBancario num2 = new ContoBancario(354634663);
		ContoBancario num3 = new ContoBancario(346465656);
		
		System.out.println("Ciao! Se possiedi un conto bancario presso la "
				+ "nostra banca, inserisci il suo numero");
		
		int [] numbers = {1234567891, 354634663, 346465656, 985985706, 498762824};
		
		Scanner scan = new Scanner(System.in);
		int userNum = scan.nextInt();
		

		if (userNum == numbers[0]) {
			System.out.println("Ciao! Cosa vuoi fare?");
			num1.getOptions();
			
			scan = new Scanner(System.in);
			int userOpt = scan.nextInt();
			
			if (userOpt == 1) {
				System.out.println("Digita l'importo da ricaricare, con due "
						+ "cifre decimali");
				num1.getRecharge();
				
			} else if (userOpt == 2) {
				System.out.println("Digita l'importo da prelevare, con due "
						+ "cifre decimali");
				num1.getWithdrawal();
				
			} else if (userOpt == 3) {
				System.out.println("SALDO ATTUALE: " + num1.balance);
			}
		}
		
		if (userNum == numbers[1]) {
			System.out.println("Ciao! Cosa vuoi fare?");
			num1.getOptions();
			
			scan = new Scanner(System.in);
			int userOpt = scan.nextInt();
			
			if (userOpt == 1) {
				System.out.println("Digita l'importo da ricaricare, con due "
						+ "cifre decimali");
				num1.getRecharge();
				
			} else if (userOpt == 2) {
				System.out.println("Digita l'importo da prelevare, con due "
						+ "cifre decimali");
				num1.getWithdrawal();
				
			} else if (userOpt == 3) {
				System.out.println("SALDO ATTUALE: " + num1.balance);
			}
		}
		
		if (userNum == numbers[2]) {
			System.out.println("Ciao! Cosa vuoi fare?");
			num1.getOptions();
			
			scan = new Scanner(System.in);
			int userOpt = scan.nextInt();
			
			if (userOpt == 1) {
				System.out.println("Digita l'importo da ricaricare, con due "
						+ "cifre decimali");
				num1.getRecharge();
				
			} else if (userOpt == 2) {
				System.out.println("Digita l'importo da prelevare, con due "
						+ "cifre decimali");
				num1.getWithdrawal();
				
			} else if (userOpt == 3) {
				System.out.println("SALDO ATTUALE: " + num1.balance);
			}
		}
	}

}
