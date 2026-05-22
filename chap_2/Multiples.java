public class Multiples{
	public static void main(String[] args){
		int nu1 = 20;
		int nu2 = 100;
		
		System.out.println("");
		System.out.println("===================");
		
	    System.out.printf("VALUES ; %d, %d.",nu1,nu2);
		
		System.out.println("");
		System.out.println("===================");
		
		if(nu2 %nu1 == 0){
			System.out.printf("%d is a multiple of %d.",nu1,nu2);
		}
		else{
			System.out.printf("ERROR!");
		}
	}
}