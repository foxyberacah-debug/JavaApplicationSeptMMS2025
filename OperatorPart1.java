public class OperatorPart1{
	public static void main(String[] args){
	//Assignment Operator(=)
	int num = 200;
	System.out.printf("The value of the num is %d%n",num);
	System.out.println("");
	System.out.println("===========================");
	
	//Arithmetic Operator(+,-,/,*,%)
	int num1 = 80;
	int num2 = 100;
	
	int addition = num1 + num2;
	int subraction = num1 - num2;
	double division = (double) num1/num2;
	int multiplication = num1 * num2;
	int remainder = num1 % num2;
	
	System.out.printf("%d + = %d%n",num1,num2,addition);
	System.out.printf("%d - = %d%n",num1,num2,subtraction);
	System.out.printf("%d / = %.1f%n",num1,num2,division);
	System.out.printf("%d x = %n",num1,num2,multiplication); 
	System.out.printf("%d %% = %d%n",num1,num2,remainder); 
	System.out.println("");
	System.out.println("===========================");
	
	//Compound assignment operator(+=,-=,*=/=,%=)\ 
	
	num1 += num2;
	System.out.printf("The value if num1 has been updated to %d%n",num1);
	
	num1 -= num2; 
	System.out.printf("The value if num1 has been updated to %d%n",num1); 
	
	num1 /= num2;   
	System.out.printf("The value if num1 has been updated to %d%n",num1);
	
	num1 *= num2; 
	System.out.printf("The value if num1 has been updated to %d%n",num1);
	
	num1 %= num2; 
	System.out.printf("The value if num1 has been updated to %d%n",num1);
		
		
	}
	
	
	
	
}