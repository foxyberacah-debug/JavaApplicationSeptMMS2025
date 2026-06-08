public class InstanceMethodInJava{
	public int add(int num1, int num2, int num3){
		int sum = num1 + num2 + num3;
		return sum;
	}
	public  static void main(String[] args){
		InstanceMethodInJava InstanceMethod = new InstanceMethodInJava();
		
		int sum = InstanceMethod	.add(70,50,80);
			
		System.out.printf("The Sum of all the number is %d%n",sum);
		
		InstanceMethod.details(21,"Kate Henry");
	}
	public void details(int age, String name){
		System.out.printf("Your name is %s.%n",name);
		System.out.printf("Your name is %d.%n",age);
	}
}