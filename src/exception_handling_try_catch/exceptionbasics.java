package exception_handling_try_catch;

public class exceptionbasics {
	public static void main(String[] args) {
		System.out.println("Start");
		String s = "apple";
     try{
    	 for (int i = 0; i <= s.length(); i++) {
 			System.out.println(s.charAt(i));
 		}
     }
     catch(IndexOutOfBoundsException e){
    	 System.out.println("String value excedded"+e);
     }
 //when we use try/catch exception occurs but our code/application will not stopped   
		System.out.println("END");
	}
}
