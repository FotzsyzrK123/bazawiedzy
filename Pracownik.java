import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Pracownik {
	public static void main(String[] args)
	Scanner scan = new Scanner(System.in);
	private String imie;
	private String nazwisko;
	private double wyplata;
	public Pracownik(String imie, String nazwisko, double wyplata){
	this.imie = imie;
	this.nazwisko = nazwisko;
	this.wyplata = wyplata;
	}
	String getImie(){return imie;}
	String getNazwisko(){return nazwisko;}
	double getWyplata(){return wyplata;}
	
	public String toString(){
		return("Imie:" + imie + ", Nazwisko:" + nazwisko + ", Wyplata" + wyplata);
	}
	/*float[] tablica = new float[x];
	for(int i=0; i<tablica.length; i++){
		tablica[i] = scan.nextFloat();
	}
	float suma = 0;
	for(int i=0; i<tablica.length; i++){
	suma = suma + tablica[i];
	}
	System.out.println(suma); */
}