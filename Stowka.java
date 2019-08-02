import java.util.Random;
import java.util.Scanner;
public class Stowka {
	public static void main(String[] args){
		czysc();
		int kasa = 100;
		int zycie = 10;
		int potrzebnaEnergiaDoPracy = -2;
		int dostarczonaEnergiaZJedzeniem = 3;
		int pieniadzeZaPrace = 20;
		int kosztyJedzenia = -20;
		String coRobi;
		Scanner scan = new Scanner(System.in);
		Random generator = new Random(); 
		System.out.println("Witaj, jak Ci na imie?");
		String nazwaGracza = scan.nextLine();
	while(kasa>0 && zycie>0){
		System.out.println("Witaj, graczu" + " "  + nazwaGracza + ". " + "W tej chwili masz " + kasa + " zl. Co chcesz zrobic?" + "(" + "Masz rowniez " + zycie + " hp)");
		System.out.println("Pracuj " + "(" + "+20 zl" + ")");
		System.out.println("Jedz " + "(" + "-20 zl" + ")");
	System.out.println("Kasyno" + "?");
		coRobi = scan.nextLine();
		if(coRobi.compareTo("Pracuj")==0){
		kasa = kasa + pieniadzeZaPrace;
		zycie = zycie + potrzebnaEnergiaDoPracy; 
		}
		else if(coRobi.compareTo("Jedz")==0){
		kasa = kasa + kosztyJedzenia;
		zycie = zycie + dostarczonaEnergiaZJedzeniem;
		}
	else if(coRobi.compareTo("Kasyno")==0){
		double losowa = generator.nextDouble();	
			if(losowa>0.7)
				kasa = kasa * 2;
			else
				kasa = kasa / 2;
			}
	}
	if (kasa <= 0){
		System.out.println("Nie masz pieniedzy na zycie :( Przegrywasz");
		}	
	else if(zycie <= 0){
		System.out.println("Nie masz zycia na zycie :( Przegrywasz");
		}
	}
	public static void czysc(){
		try {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch(Exception e){}
	}
	
}