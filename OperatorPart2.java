public class OperatorPart2{
	public static void main (String[] args){
		//Logical operators(&&,||,!)
		int num1 = 15;
		int num2 = 30;
        int num3 = 18;
		
		boolean andOperator = (num1 > num2) && (num1 > num3);
		System.out.printf("Is (%d> %d) && (%d > %d): %b%n",num1,num2,num3,andOperator);
		
		boolean orOperator = (num1 > num2) || (num1 > num3);
		System.out.printf("Is (%d> %d) && (%d > %d): %b%n",num1,num2,num3,andOperator);
		
		boolean notOperator = ! (num1 > num2) || (num1 > num3);
		System.out.printf("Is !(%d> %d) && (%d > %d): %b%n",num1,num2,num3,andOperator);
		
		//Unary Operator(++,--)
		int x = 5;
		int y = 10;
		
		System.out.printf("The Value of X is %d%n",++x);
		}
}