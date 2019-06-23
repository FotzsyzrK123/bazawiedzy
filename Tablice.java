public class Tablice {
	public static void main(String[] args) {
		int[] tablica = new int[9];

		for (int i = 0; i < 9; i++)
			tablica[i] = i + 1;

		int zmienna = tablica[5];

		for (int i = 0; i < 9; i++)
			System.out.println("Kolejna komórka to: " + tablica[i]);
	}
}