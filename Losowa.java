public class Losowa {
	public static void main(String[] args){
	int liczba;
	liczba = Integer.parseInt(args[0]);
	int x;
	x = 69;
	if(liczba==x){		
	System.out.println("Gratulacje! Zgadles! A szczesliwym numerkiem jest: " + x);
	}
	else if(liczba>(2*x)){	
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
	
}
}