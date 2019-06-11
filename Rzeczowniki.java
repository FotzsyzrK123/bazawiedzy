class Rzeczowniki {
public static void main(String[] args){
	int max = args.length;
	for(int i=0; i<max; i++){ 
	if(i<max-1){
		System.out.print(args[i] + " lub ");
	}
	else{
		System.out.print(args[i]);
	}
	}
}
}	