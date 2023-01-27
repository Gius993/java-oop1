package com.lesson.bank;
import java.util.Random;
import java.util.Scanner; 

public class Conto {
	int numeroConto;
	String nomeUtente;
	double saldoUtente = 0;

	//Costruttori
	public Conto (String nomeUtente) {
		this.numeroConto = contoCasuale();
		this.nomeUtente = nomeUtente;
		this.saldoUtente = saldoUtente;
		
	}
	//Metodi
	
	// Metodo Nuovo utente saldo = 0

	//Metodo per versare somma
	void saldoVersato(double somma) {
		saldoUtente += somma;
	}
	
	//Metodo prelevare
	
	void saldoPrelevato(double sottrazione) {
		if(saldoUtente > sottrazione) {
			saldoUtente -= sottrazione;
		}	
	}
	
	int contoCasuale() {
		Random r = new Random();
		return r.nextInt(1000)+1;
		
	}
}
