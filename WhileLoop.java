import java.util.Scanner;

public class WhileLoop{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		
		int num, sum = 0, i = 01;
		while(i <= 10){
			System.out.printf("Enter a number%d :",i);
			num = scan.nextInt();
			
			sum += num;
			i++;
		}
		System.out.printf("Sum = %d%n",sum);
		if(sum %2 == 0){
			System.out.printf("%d is an Even number",sum);
		}
		else{
			System.out.printf("%d is an Odd number",sum);
		}
	}
}
	