import java.util.Scanner;

class Skaner {
public static void main(String[] args){
	int liczbaArgumentow = args.length;
	float pierwszaLiczba;
	pierwszaLiczba = 0;
	float drugaLiczba;
	drugaLiczba = 0;
	String znak = "+";
	Scanner scan = new Scanner(System.in);
		if(liczbaArgumentow==0){
		
		System.out.println("Podaj pierwsza liczbe:");
        pierwszaLiczba = scan.nextFloat();
        System.out.println("Podaj druga liczbe:");
        drugaLiczba = scan.nextFloat();
        System.out.println(pierwszaLiczba + ", " + drugaLiczba + " Co chcesz zrobic z tymi liczbami?");
		scan.nextLine();
		znak = scan.nextLine(); 
		}
		else{
		pierwszaLiczba = Float.parseFloat(args[0]);
		znak = args[1];
		drugaLiczba = Float.parseFloat(args[2]);			
		}
	
		if(znak.compareTo("+")==0){
			System.out.println(pierwszaLiczba + " + " + drugaLiczba + " = " + (pierwszaLiczba+drugaLiczba));
		}
		else if(znak.compareTo("-")==0){
			System.out.println(pierwszaLiczba + " - " + drugaLiczba + " = " + (pierwszaLiczba-drugaLiczba));
		}
		else if(znak.compareTo("x")==0){
			System.out.println(pierwszaLiczba + " * " + drugaLiczba + " = " + (pierwszaLiczba*drugaLiczba));
		}
		else if(znak.compareTo("/")==0){
			if(drugaLiczba!=0){
			System.out.println(pierwszaLiczba + " / " + drugaLiczba + " = " + (pierwszaLiczba/drugaLiczba));
			}
			else{
			System.out.println("Ty cholero, nigdy nie dziel przez zero!");		
			}
		}
		else if(znak.compareTo("xx")==0){
			float wynik;
			wynik = 1;
			for(int i=1; i<=drugaLiczba; i++){
			wynik = wynik * pierwszaLiczba;
			}
		System.out.println(pierwszaLiczba + " do potegi " + drugaLiczba + " = " + wynik);
		}
		
	}	
}
