package org.lesson.java.shop;

import java.util.Random;

public class Prodotto {
	//Attributi prodotto
	
	 int codice;
	 String nome;
	 String descrizione;
	 double prezzo;
	 double iva;
	 // Metodo
	 
	 	// per codice
	 	int codiceCasuale() {
	 		Random r = new Random();
	 		return r.nextInt(500);
	 	}
	 	// per prezzo con iva
	 	double prezzoIva() {
	 		
	 		return (prezzo + iva);
	 	}
	 	//per nome esteso
	 	String nomeEsteso() {
	 		return nome + " il codice prodotto:  " + codice;
	 	}
	 	
	 
	//Costruttori
	 
	 public Prodotto (String nome, String descrizione, double prezzo, double iva) {
		 
		 this.nome = nome;
		 this.descrizione = descrizione;
		 this.prezzo = prezzo;
		 this.iva = iva;
		 this.codice = codiceCasuale();
	 }

}
