import java.util.Scanner;

public class ComparingIntegers {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	    int num1, num2;
	
	    System.out.print("Enter a number");
	    num1 = input.nextInt();
	
	    System.out.print("Enter next number");
    	num2 = input.nextInt();

	
	    System.out.println("");
        System.out.println("================================");
	    System.out.println("");
		
	
	    if (num1 > num2){
		    System.out.printf("%d is larger%n", num1);
	    }
        else if (num2 > num1){
		    System.out.printf("%d is larger%n", num2);
	    }
         else if (num1 == num2){
		    System.out.println("These numbers are equal");
        }
		else{
			System.out.printf("ERROR");
		}

	}
}