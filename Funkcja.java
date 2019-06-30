
public class Funkcja {
	public static void main(String[] args) {
	int a = 7;
	String rzecz = "Banan";
	
	System.out.println(rzecz);
	System.out.println(krzycz(rzecz));
	System.out.println(rzecz);
	powitaj();
	powitaj();
	powitaj();
	powitaj();
	powitaj();
	powitaj();
	powitaj();
	String wykrzyczane = "Krzyk";
	
	wykrzyczane = krzycz(wykrzyczane);
	System.out.println(wykrzyczane);
	wykrzyczane = krzycz(wykrzyczane);
	System.out.println(wykrzyczane);
	
	
	System.out.println(krzycz(krzycz(krzycz(rzecz))));
	
	
	
	
	
	System.out.println(a);
	System.out.println(mojaFunkcja(a));
	System.out.println(dodaj(a,6));
	}
	public static int mojaFunkcja(int x){
	return x+2;
	
	}
	public static int dodaj(int x, int y){
	return x + y;
	}
	public static String krzycz(String slowo){
	slowo = slowo + "!!!";
	return slowo;
	}
	public static void powitaj(){
	System.out.println("Witaj");
	}
}