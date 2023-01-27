package com.lesson.bank;

import java.util.Scanner;

public class Bank {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 double somma;
		 double sottrazione;
		 //Utente 1
	
		
		 System.out.println(" Come ti chiami?");
		 String nomeRichiesta = scan.nextLine();
		 Conto conto1 = new Conto (nomeRichiesta);
		 System.out.println("Ciao :" + conto1.nomeUtente);
		 System.out.println("Il tuo numero conto :" + conto1.contoCasuale());
		 System.out.println("il tuo saldo : " + conto1.saldoUtente);
		 System.out.println("Prelievo, Versamento, esci");
		 String scelta = scan.nextLine();
		 if(scelta.equals("prelevare")) {
			 System.out.println("Quanto desideri prelevare?");
			 sottrazione = scan.nextDouble();
			System.out.println("Hai depositatoo" + sottrazione);
			
		 }else if(scelta.equals("versare")) {
			 System.out.println("Quanto desideri Versare?");
			 somma = scan.nextDouble();
			System.out.println("Hai depositatoo" + somma);
		 }else if (scelta.equals("uscire")) {
			 System.out.println("La sessione termina");
		 }
		
		 scan.close();
	 }
}
