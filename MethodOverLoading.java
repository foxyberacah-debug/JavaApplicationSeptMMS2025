import java.util.Scanner;

public class MethodOverLoading{
	public static void main(String[] agrs){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========Calculation of Shape Perimeters==========");
		System.out.println("");
		
		System.out.println("Enter 1. for Square");
		System.out.println("Enter 2. for Rectangle");
		System.out.println("Enter 3. for Triangle");
		System.out.println("Enter 4. to quit");
		System.out.println("");
		
		System.out.println("Enter your Choice!");
		int choice = scan.nextInt();
		
		switch(choice){
			case 1:
			System.out.print("Enter the length of the sqaure: ");
			int sqrlenth = scan.nextInt();
			
			perimeter(sqrlenth);
			break;
		}
		
		switch(choice){
			case 2:
			System.out.print("Enter the length of Rectangles length: ");
			int reclenth= scan.nextInt();
			
			System.out.print("Enter the length of Rectangles Width: ");
			int recwidth= scan.nextInt();
			
			perimeter(reclenth,recwidth);
			break;
		}
		
		switch(choice){
			case 3:
			System.out.print("Enter first side: ");
			int sideA = scan.nextInt();
			
			System.out.print("Enter second side: ");
			int sideB = scan.nextInt();
			
			System.out.print("Enter third side: ");
			int sideC = scan.nextInt();
			
			
			perimeter(sideA,sideB,sideC);
			break;
			default:
			    System.out.println("Program terminated....");
		}
		
	}
	
	public static void perimeter(int sqrlenth){
		int PerimeterOfSquare = 4 * sqrlenth;
		
		System.out.printf("Perimeter of the Square ; %d.%n",PerimeterOfSquare);
	}
	public static void perimeter(int reclenth, int recwidth){
		int perimeterOfRec = 2 * (reclenth + recwidth);
		
		System.out.printf("Perimeter of the Rectangle ; %d.%n",perimeterOfRec);
	}
	public static void perimeter(int sideA, int sideB, int sideC){
		int perimeterOfTri = sideA + sideB + sideC;
		
		System.out.printf("Perimeter of the Triangle ; %d.%n",perimeterOfTri);
	}
	
}