import java.util.Scanner;

public class SentinelRepetition{
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("Enter -1 to end programme");
		
		
		while(true){
			System.out.print("Enter a number: ");
			num = scan.nextInt();
			// nextIntcollects an integer and stores inside num
			// sentinel value will not be introduced by the user
			//if the conditions isn't  met, it skips; not terminates
			
			if(num == -1){
				break;
			}
			sum += num;
		}
		System.out.printf("The total sum of number is %d%n",sum);
	}
}