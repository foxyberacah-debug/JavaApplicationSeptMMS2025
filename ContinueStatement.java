public class ContinueStatement{
	public static void main(String[] agrs){
		for (int i = 1; i <= 20; i ++){
			if (i == 15){
				continue;
			}
			System.out.printf("%d%n",i);
		}
	}
}