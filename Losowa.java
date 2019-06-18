import java.util.Scanner;
import java.util.Random;
public class Losowa {
	public static void main(String[] args){
		Random random = new Random();
		int x = random.nextInt(50); 
		Scanner scan = new Scanner(System.in);
		int liczba;
		int proby = 10;
		
		
			do{
				System.out.println("Jaka liczbe wybralem?");
				liczba = scan.nextInt();
				if(liczba==x){		
					System.out.println("Gratulacje! Zgadles! A szczesliwym numerkiem jest: " + x);
				}
				else{ 
					if(liczba>(2*x)){	
						System.out.println("Podana liczba " + "(" + liczba + ")" + " jest ponad 2 razy za wysoka");
					}
					else if(liczba>x){
						System.out.println("Podana liczba " + "(" + liczba + ")" + " jest za wysoka");
					}
					else if(liczba<(x/2)){	
						System.out.println("Podana liczba " + "(" + liczba + ")" + " jest ponad 2 razy za mala");
					}
					else if(liczba<x){	
						System.out.println("Podana liczba " + "(" + liczba + ")" + " jest za mala");
					}
					proby = proby - 1;
					System.out.println("Zostalo Ci prob " + proby);
					}
			}while(liczba!=x && proby > 0);
		if(proby<=0){
			System.out.println("Skonczyly Ci sie proby... leszczuuu");
		}
	
	}
}