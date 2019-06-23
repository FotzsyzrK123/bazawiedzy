import java.util.Scanner;
import java.util.Random;
public class Zagadka {
	public static void main(String[] args) {
	Random random = new Random(); 
	Scanner scan = new Scanner(System.in);
	String[] tablica = new String[3];
	tablica[0] = "pies";
	tablica[1] = "kot";
	tablica[2] = "ptak";
	int ktora = random.nextInt(3);
	String wybor;
		System.out.println("Jakie zwierze wybralem? :D");
		wybor = scan.nextLine();
		
		if(wybor.compareTo(tablica[ktora])==0){
			System.out.println("Gratulacje! Wygrales! :D");
		}
		else{
			System.out.println("Nie zgadles!" + " Wybralem " + tablica[ktora]);
		}	
	for(int i = 0; i<40; i++){	
		ktora = random.nextInt(3);
		System.out.println(ktora);	
	}
	}
}