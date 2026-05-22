import java.util.Scanner;

public class JavaAssignment1{
	public static void main (String[] args){
		System.out.println("Task 1");
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter your first value ;");
		short num1 = input.nextShort();
		
		System.out.printf("Enter your next value ;");
		short num2 = input.nextShort(); 
		
		System.out.printf("Enter your next value ;");
		short num3 = input.nextShort(); 
		
		System.out.printf("Enter your next value ;");
		short num4 = input.nextShort(); 
		
		System.out.printf("Enter your next value ;");
		short num5 = input.nextShort(); 
		
		System.out.println("");
		
		int addition = num1 + num2 + num3 + num4 + num5;
		int average = addition / 5;
		int product = num1 * num2 * num3 * num4 * num5;
		
		System.out.printf("Sum of Values %d, %d, %d, %d, %d = %d%n",num1,num2,num3,num4,num5,addition);
		System.out.printf("Average of  %d, %d, %d, %d, %d = %d%n",num1,num2,num3,num4,num5,average);
		System.out.printf("Product of  %d, %d, %d, %d, %d = %d%n",num1,num2,num3,num4,num5,product);
		
		System.out.println("");
		System.out.println("===========================================================================");
		
		System.out.println("Task 2");
		
		System.out.printf("Enter a value ;");
		int nu1 = input.nextShort();
		
		boolean isEven = (nu1) % 2 == 0;
		System.out.printf("%d is an Even number? %b",nu1,isEven);
		
		System.out.println("");
		System.out.println("===========================================================================");
		
		System.out.println("Task 3");
		
		System.out.println("Enter your Name :");
		String name = input.nextLine();
		
		System.out.println("Enter your Address :");
		String addy = input.nextLine();
		
		System.out.println("Enter your Age :");
		Byte age = input.nextByte();
		
		System.out.println("");
		System.out.printf("Info analysis on %s%n",name);
		
		System.out.println("===========================================================================");
		
		System.out.printf("%s is %d year old%n",name,age);
		System.out.printf("This individual stays at %s%n",addy);
		
  	}
}