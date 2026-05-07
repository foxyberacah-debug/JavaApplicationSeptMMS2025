public class PrimitiveDataType{
	public static void main(String[] args){
		byte myAge = 30;
		System.out.printf("Miss Mercy is %d%n",myAge);
		
		short quantity = 20000;
		System.out.printf("The quantity of phones ordered is %,d%n", quantity);
		int nigeriaPopulation = 294848848;
		System.out.printf("The population of Nigeria is %,d%n", nigeriaPopulation);
		
		long worldPopulation = 484848488484848484L;
		System.out.printf("The world Population is %d%n",worldPopulation);
		
		float price = 577858F;
		System.out.printf("The price of Iphone per unit is in %,.2f",price);
		
		double mybalance = 348934839539984.90803;
		System.out.printf("My account balance is %c%.2f",'$',mybalance);
		
		char symbol = '%';
		System.out.printf("There is an increment in the world's population by 20.5%c%n",symbol);
} 
}