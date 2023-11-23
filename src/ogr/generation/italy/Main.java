package ogr.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Automobili auto1 = new Automobili();
		Automobili auto2 = new Automobili();
		Automobili autoCorrente=auto1;
		String risposta;
		
		auto1.velocita=0;
		auto1.carburante=30;
		auto1.consumoMedio=20;
		auto1.totkmpercorsi=0;
		
		
		auto2.velocita=0;
		auto2.carburante=50;
		auto2.consumoMedio=23;
		auto2.totkmpercorsi=0;
		
		do {
		
		System.out.println("\n auto1: ");
		auto1.visualizzaDati();
		
		System.out.println(" \n auto2: ");
		auto2.visualizzaDati();
		
		
		System.out.println("quale auto vuoi guidare? 1/2 o nessuna ");
		risposta=sc.nextLine();
		
		if (risposta.equals("1"))
			autoCorrente=auto1;
		else if (risposta.equals("2"))
			autoCorrente=auto2;
		else if (risposta.equals("nessuna"));
		else 
			System.out.println("risposta non valida");
		
		if(risposta.equals("1") || risposta.equals("2")){
		System.out.println("vuoi accelerare o decelerare o continaure?");
		risposta=sc.nextLine();
		
		if (risposta.equals("accelerare"))
			autoCorrente.accelera();
		else if(risposta.equals("decelerare"))
			autoCorrente.decelera();
		else if (risposta.equals("continuare"))
			System.out.println("nessuna variaizone");
		
			
		}
		auto1.aggiorna();
		auto2.aggiorna();
	
		System.out.println("vuoi continuare s/n");
		risposta=sc.nextLine();
		
		
		}while(risposta.equals("s"));
		
		
	
	
	
	
	
	
	}

}
