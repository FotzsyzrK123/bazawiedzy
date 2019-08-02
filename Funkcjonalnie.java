import java.util.Scanner;
public class Funkcjonalnie {
	public static void main(String[] args){
		czysc();
		Scanner scan = new Scanner(System.in);
		int wybor;
		wybor = 1;
		while(wybor!=0){
			wypiszMenu();
			wybor = scan.nextInt();
			coRobi(wybor);	
			
		}
	}
	public static void wypiszMenu(){
	System.out.println("Co mowi: ");	
		System.out.println("1 - Krowa");
		System.out.println("2 - Pies");
		System.out.println("3 - Owca");
		System.out.println("4 - Lis");
		System.out.println("0 - Wyjscie");
		System.out.println("Jakie zwierze wybierasz?");
	}
	public static void coRobi(int w){
	switch(w){
				case 1: 
				System.out.println("Krowa robi muuuuuu");
				break;
				case 2: 
				System.out.println("Dzien dobry. Prawo jazdy, dowod rejestracyjny, co dzis Pan zazywal? xD");
				break;
				case 3:
				System.out.println("Owca robi meee");
				break;
				case 4:
				System.out.println("Lis robi ring-ding-ding-ding-ding-ding-ding");
				break;
				case 0:
				System.out.println("Do widzenia :D");
				break;
				default:
				System.out.println("Takiej liczby nie ma w menu. Wybierz inna");
			}
	}
	public static void czysc(){
	try {
	 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	} catch(Exception e){}
	}
}