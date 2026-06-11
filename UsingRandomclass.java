import java.util.Random;

public class UsingRandomClass{
	public static void main(String[] args){
		Random rand = new Random();
		
		int generatedInt = Random.nextInt();
		
		System.out.printf("Generated number is %d%n",Math.abs(generatedInt));
		
	    int rangeNumber = Random.nextInt(100) + 1;
		System.out.printf("The number generated is %d%n",rangeNumber);
		
		boolean isJava = Random.nextBoolean();
		System.out.printf("Do you love Java? %b%n",isJava);
		
		double decimalNo = Random.nextDouble();
		System.out.printf("The float point value is %f%n",decimalNo);
	}
}