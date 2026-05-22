public class TypeCasting{
	public static void main(String[] args){
		int num1= 50;
		int num2= 200;
		
		double division= num1/num2;
		System.out.printf("The division is%f%n",division);
		
		double price= 7658;
		System.out.printf("The Price of the laptop is%f%n",price);
		
		double balance= 5693.875;
		int convertedBalance = (int) balance;
		System.out.printf("The converted balance is%f%n",convertedBalance);
		
		char symbols='?';
		int convertedSymbol = (int)symbols;
		System.out.printf("The converted symbol is%f%n",convertedSymbol);
	}
}