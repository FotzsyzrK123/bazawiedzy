import java.util.Scanner;

class Fibonacci{
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Podaj liczbe:");
	long ilosc = scan.nextLong();
	long zmienna1 = 0, zmienna2 = 1;
		System.out.println("Pierwsze " + ilosc + " liczb w ciagu Fibonacciego:");
	for(long i=1; i<=ilosc; i++){
			if(i<=ilosc-1){
			System.out.println(zmienna1 + " + ");
			long suma = zmienna1 + zmienna2;
			zmienna1 = zmienna2;
			zmienna2 = suma;
			}
			else{
			System.out.println(zmienna1);	
			}
		}
}
}