import java.util.Scanner;
import java.util.Random;
public class Zagadka {
	public static void main(String[] args) {
	Random random = new Random(); 
	Scanner scan = new Scanner(System.in);
	
	float[][] tablica = new float[2][2];
	tablica[0][0] = Math.round(2 + random.nextFloat()*8);
	tablica[0][1] = Math.round(2 + random.nextFloat()*8);
	tablica[1][1] = Math.round(2 + random.nextFloat()*8);
	System.out.println(tablica[0][0]);
	System.out.println(tablica[0][1]);
	System.out.println(tablica[1][1]);
	/*int ktora = random.nextInt(3);
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
	*/
	}
}