public class IntegersRange{
	public static void main(String[] args){
		int num1 = 11;
		int num2 = 30;
		int num3 = 545;
		int num4 = 3;
		int num5 = 90;
		
		System.out.println("");
		System.out.println("=========================================");
		System.out.println("");
		
		System.out.printf("VALUES :  %d, %d, %d, %d, %d.",num1,num2,num3,num4,num5);
		
		System.out.println("");
		System.out.println("=========================================");
		System.out.println("");
		
		System.out.printf("Compiling...");
		System.out.println("");
		

        int largest = num1;
        int smallest = num1;

        if (num2 > largest)
            largest = num2;

        if (num3 > largest)
            largest = num3;

        if (num4 > largest)
            largest = num4;

        if (num5 > largest)
            largest = num5;

        if (num2 < smallest)
            smallest = num2;

        if (num3 < smallest)
            smallest = num3;

        if (num4 < smallest)
            smallest = num4;

        if (num5 < smallest)
            smallest = num5;

        System.out.printf("Largest number is: %d%n", largest);
        System.out.printf("Smallest number is: %d", smallest);
    }
}