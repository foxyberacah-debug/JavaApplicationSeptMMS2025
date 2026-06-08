public class LocalVariable{
	public static void main (String[] args){
		int age= 60;
		
		if(age >= 18){
		    String name= "John Doe";
            System.out.printf("Your name is %s and you are %d yrs of age%n",name,age);
		}
		System.out.printf("I'm printing the age %d here%n",age);
	}
}