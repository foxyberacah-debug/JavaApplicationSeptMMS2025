public class DemoTwo{
	public static void main(String[] args){
		int sum = DemoStaticMethod.add(40,80,200);
		
		System.out.printf("The Sum is %d.%n",sum);
		
		DemoStaticMethod.details(27,"Nathan Jean");
	}
}