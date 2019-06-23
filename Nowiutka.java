import java.util.Scanner;
class Nowiutka{
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int y = 100;
	int x = 1;
	System.out.println(x);
	x = x + 3;
	System.out.println(x);
	x = scan.nextInt();
	if(x>10){
	System.out.println(x + 3);
	}
	else if(x<10){
	System.out.println(x - 3);
	}
	y = x;
	System.out.println(x + " " + " " + y);
	y = 200;
	System.out.println(x + " " + " " + y);
	for(; x<1000; x++){
	}
	System.out.println(x + " " + " " + y);
}
}