package videos_curtos;

public class Main {

	public static void main(String[] args) {
		
		int parOuImpar = 7;
		boolean par = false;
		
		par = ( (parOuImpar % 2) == 0 ? true : false);
		
		System.out.println(par);
		
		boolean impar = false;
		
		impar = ( (parOuImpar % 2) > 0 ? true : false);
		
		System.out.println(impar);
		

	}

}
