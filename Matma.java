import static java.lang.Math.*;

class Matma{
	public static void main(String[] args){
	int num1;
	num1 = Integer.parseInt(args[0]);
	double sqrt = sqrt(num1);
	double wynik = pow(num1, 2);
	double wynik1 = pow(num1, 3);
	System.out.println("Pierwiastek liczby " + num1 + " wynosi: " + sqrt);
	System.out.println("Kwadratem liczby " + num1 +  " jest: " + wynik);
	System.out.println("Potega trzeciego stopnia liczby " + num1 + " jest: " + wynik1);
	System.out.println("Potega trzeciego stopnia liczby " + num1 + " podzielona przez pierwiastek tej liczby wynosi: " + (wynik1/sqrt));
	System.out.println("Potega trzeciego stopnia liczby " + num1 + " podzielona przez pierwiastek + 4 tej liczby wynosi: " + (wynik1/(sqrt+4)));
	System.out.println("Potega trzeciego stopnia liczby " + num1 + " podzielona przez pierwiastek + 4 tej liczby wynosi: " + (wynik1/sqrt)/2));
	
	}
}