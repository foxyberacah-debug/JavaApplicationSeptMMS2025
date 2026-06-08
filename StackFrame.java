public class StackFrame{
	public static void main(String[] args){
		readMe("The story begins with a little girl in the Park, wandering too far from the sight of her aunt....");
	}
	public static void readMe (String story){
		System.out.println("========Story Time========");
		System.out.printf("%s%n",story);
		
		CheckAge(20);
	}
	public static void CheckAge (int age){
	    if(age >= 18){
			System.out.printf("Your age is %d, you're an adult!",age);
		}
		else{
			System.out.printf("Your age is %d, you're a minor!",age);
		}
	}
}