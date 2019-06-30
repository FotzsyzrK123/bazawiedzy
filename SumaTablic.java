import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class SumaTablic {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("No ile wierszy ma miec tablica? No ile? xD");
	int x = scan.nextInt();
	System.out.println("No jaka liczbe wybierasz? No jaka? xD");
	float[] tablica = new float[x];
	for(int i=0; i<tablica.length; i++){
		tablica[i] = scan.nextFloat();
	}
	float suma = 0;
	for(int i=0; i<tablica.length; i++){
	suma = suma + tablica[i];
	}
	System.out.println(suma);
}
}