import java.util.Scanner;
public class Zadanietrzy {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int wybor;
		System.out.println("Co mowi: ");
		System.out.println("1 - Krowa");
		System.out.println("2 - Pies");
		System.out.println("3 - Owca");
		System.out.println("4 - Lis");
		System.out.println("0 - Wyjscie");
		System.out.println("Jakie zwierze wybierasz?");
		wybor = 1;
		
		while(wybor!=0){
			wybor = scan.nextInt();
			
			switch(wybor){
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
	}

}