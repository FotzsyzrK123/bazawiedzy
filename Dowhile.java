public class Dowhile {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		System.out.println("Przed wykonaniem petli");
		do{
			if (x != 40){
			System.out.println(x);
			}
			else{
			System.out.println("Fatal Error");
			}
			x = x + 5;

		}
		while (x < 100);

		System.out.println("I juz po petli...");
		}
		
	}