class Kalkulator {
public static void main(String[] args){
	float pierwszaLiczba;
	pierwszaLiczba = Float.parseFloat(args[0]);
	String znak = args[1]; 
	float drugaLiczba;
	drugaLiczba = Float.parseFloat(args[2]);
	
		if(args[1].compareTo("+")==0){
			System.out.println(pierwszaLiczba + " + " + drugaLiczba + " = " + (pierwszaLiczba+drugaLiczba));
		}
		else if(args[1].compareTo("-")==0){
			System.out.println(pierwszaLiczba + " - " + drugaLiczba + " = " + (pierwszaLiczba-drugaLiczba));
		}
		else if(args[1].compareTo("x")==0){
			System.out.println(pierwszaLiczba + " * " + drugaLiczba + " = " + (pierwszaLiczba*drugaLiczba));
		}
		else if(args[1].compareTo("/")==0){
			if(drugaLiczba!=0){
			System.out.println(pierwszaLiczba + " / " + drugaLiczba + " = " + (pierwszaLiczba/drugaLiczba));
			}
			else{
			System.out.println("Ty cholero, nigdy nie dziel przez zero!");		
			}
		}
		else if(args[1].compareTo("xx")==0){
			float wynik;
			wynik = 1;
			for(int i=1; i<=drugaLiczba; i++){
			wynik = wynik * pierwszaLiczba;
			}
		System.out.println(pierwszaLiczba + " do potegi " + drugaLiczba + " = " + wynik);
		}
	}	
}
