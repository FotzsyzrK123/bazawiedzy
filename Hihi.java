class Hihi {
public static void main(String[] args){
	if(args[0].compareTo("Krzys")==0){
	System.out.println(args[0] + " jest super!");
	}
	else if(args[0].compareTo("Tomek")==0 || args[0].compareTo("Tomasz")==0){
	System.out.println("Na tapczanie siedzi " + args[0] + "!");
	}
	else if(args[0].compareTo("Justyna")==0 || args[0].compareTo("Justynka")==0){
	System.out.println(args[0] + " jest po prawie! :D");
	}
}
}	