import java.util.Scanner;
public class Krzyzyk{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	czysc();
	String wybor1;
	String wybor2;
	String[][] plansza = new String[3][3];
	plansza[0][0] = "1";
	plansza[0][1] = "2";
	plansza[0][2] = "3";
	plansza[1][0] = "4";
	plansza[1][1] = "5";
	plansza[1][2] = "6";
	plansza[2][0] = "7";
	plansza[2][1] = "8";
	plansza[2][2] = "9";
	pokazWartosci(plansza);
	System.out.println("Gdzie sie chcesz ustawic graczu 1?");
	wybor1 = scan.nextLine();
	if(wybor1.compareTo("0")==0){
		System.out.println("Poddajesz sie");
		String poddanie = scan.nextLine();
		if(poddanie.compareTo("tak")==0){
			System.out.println("Ok, to nara leszczu xD");
		}
		else{
		System.out.println("Gramy dalej");
		}
	}
	else{
		switch(wybor1){
		case "1":
		plansza[0][0] = "x";
		case "2":
		plansza[0][1] = "x"; 
		}
	}
	}
	public static void pokazWartosci(String[][] tablica){
	
		System.out.print("|_" + tablica[0][0] + "_|");
		System.out.print("_" + tablica[0][1] + "_|");
		System.out.println("_" + tablica[0][2] + "_|");
		System.out.print("|_" + tablica[1][0] + "_|");
		System.out.print("_" + tablica[1][1] + "_|");
		System.out.println("_" + tablica[1][2] + "_|");
		System.out.print("|_" + tablica[2][0] + "_|");
		System.out.print("_" + tablica[2][1] + "_|");
		System.out.println("_" + tablica[2][2] + "_|");
		}
	public static void czysc(){
		try {
		 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch(Exception e){}
		}	
}