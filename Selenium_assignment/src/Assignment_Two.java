
public class Assignment_Two {

	public static void main(String[] args) 
	{
		
		Assignment_Two a = new Assignment_Two();
		a.demo("LakshmiNair");
		
	}
	public void demo(String word) 
	{
		
		System.out.println("The Length of given string is : " +word.length());
		System.out.println("The Uppercase of the given string is : " +word.toUpperCase());
		System.out.println("The Lowercase of the given string is : " +word.toLowerCase());
		String reverse = new StringBuffer(word).reverse().toString();
		
		System.out.println("The Reverse of the given string is : " + reverse);
	}
		
			
			
		
			
				
			
			
		}
		
		



