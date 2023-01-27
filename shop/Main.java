package org.lesson.java.shop;

public class Main {
 public static void main(String[] args) {
	 // Prodotto 1
	 Prodotto prodotto1 = new Prodotto ("microfono", "ottimo microfono", 50,  10.20);
	 
	 System.out.println("Nome: " + prodotto1.nome);
	 System.out.println("Descrizione: " + prodotto1.descrizione);
	 System.out.println("Prezzo: " + prodotto1.prezzo);
	 System.out.println("Iva: " + prodotto1.iva);
	 // metodi
	 System.out.println("Codice: " + prodotto1.codiceCasuale());
	 System.out.println("Nome esteso: " + prodotto1.nomeEsteso());
	 System.out.println("Prezzo con iva: " + prodotto1.prezzoIva());
	 
	 // Prodotto 2
	 
 Prodotto prodotto2 = new Prodotto ("Cellulare", "ottimo cellulare", 190.10,  30.20);
	 
	 System.out.println("Nome: " + prodotto2.nome);
	 System.out.println("Descrizione: " + prodotto2.descrizione);
	 System.out.println("Prezzo: " + prodotto2.prezzo);
	 System.out.println("Iva: " + prodotto2.iva);
	 // metodi
	 System.out.println("Codice: " + prodotto2.codiceCasuale());
	 System.out.println("Nome esteso: " + prodotto2.nomeEsteso());
	 System.out.println("Prezzo con iva: " + prodotto2.prezzoIva());
 }
}
