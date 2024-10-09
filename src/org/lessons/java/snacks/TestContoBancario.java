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
			num1.getOptions();
			
			scan = new Scanner(System.in);
			int userOpt = scan.nextInt();
			
			if (userOpt == 1) {
				num1.getRecharge();
				
			} else if (userOpt == 2) {
				num1.getWithdrawal();
				
			} else if (userOpt == 3) {
				num1.getBalance();
			}
		}
		
		if (userNum == numbers[1]) {
			num1.getOptions();
			
			scan = new Scanner(System.in);
			int userOpt = scan.nextInt();
			
			if (userOpt == 1) {
				num2.getRecharge();
				
			} else if (userOpt == 2) {
				num2.getWithdrawal();
				
			} else if (userOpt == 3) {
				num2.getBalance();
			}
		}
		
		if (userNum == numbers[2]) {
			num1.getOptions();
			
			scan = new Scanner(System.in);
			int userOpt = scan.nextInt();
			
			if (userOpt == 1) {
				num3.getRecharge();
				
			} else if (userOpt == 2) {
				num3.getWithdrawal();
				
			} else if (userOpt == 3) {
				num3.getBalance();
			}
		}
		
		
	}

}
