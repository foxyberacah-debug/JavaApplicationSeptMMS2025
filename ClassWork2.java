import java.util.Scanner;

public class ClassWork2{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		
		int num;
		  
	    System.out.print("Enter a number: ");
		num = input.nextInt();
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
		
		if(num == 0){
			System.out.printf("INVALID NUMBER!!");
		}
		else{
			if(num == 1){
				System.out.printf("Inputed number: %d%n The day of the week is Monday",num);
			}
			
			else if(num == 2){
				System.out.printf("Inputed number: %d%n The day of the week is Tuesday",num);
			}
			
			else if(num == 3){
				System.out.printf("Inputed number: %d%n The day of the week is Wednesday",num);
			}
			
			else if(num == 4){
				System.out.printf("Inputed number: %d%n The day of the week is Thursday",num);
			}
			
			else if(num == 5){
				System.out.printf("Inputed number: %d%n The day of the week is Friday",num);
			}
			
			else if(num == 6){
				System.out.printf("Inputed number: %d%n The day of the week is Saturday",num);
			}
			
			else if(num == 7){
				System.out.printf("Inputed number: %d%n The day of the week is Sunday",num);
			}
		}
	}
}