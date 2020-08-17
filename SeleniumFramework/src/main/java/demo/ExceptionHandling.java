package demo;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			System.out.println("Hello World");
			int i = 1/0;
			
			System.out.println("Completed");
			
		}catch(Exception exp) {
			System.out.println("i am inside catch block");
			System.out.println(exp.getMessage());
			
		} finally {
			System.out.println("Hello World");
		}

	}

}
