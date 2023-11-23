package ogr.generation.italy;

public class Automobili {
	
	
	int velocita;
	float consumoMedio, carburante, totkmpercorsi;
	
	public void accelera() {
		
		if (velocita<=190 && carburante>0)
			velocita+=10;   // mi incrementa la velocita
		
		else 
			System.out.println("velocita massima raggiunta");
		}
	public void decelera ()	{
		if(velocita>=10)
			velocita-=10;
		else 
			System.out.println("piu piano di cosi ti si ferma la macchina");
	}
		
		
	public void visualizzaDati () {
			System.out.println("velocita attuale" + velocita);
			System.out.println("carburante " + carburante + "l");
			System.out.println("consumo medio: " + consumoMedio + "km/l");
			System.out.println("kilometri percorsi " + totkmpercorsi);
	}
		
	public void aggiorna() {
		int kmpercorsi1h= velocita;
		
		totkmpercorsi += kmpercorsi1h;
		carburante -= kmpercorsi1h/consumoMedio;
	
		if (carburante<=0)
			velocita=0;
			
	
	
	}
		
	
	
	
	
}
