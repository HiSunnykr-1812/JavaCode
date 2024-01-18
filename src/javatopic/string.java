package javatopic;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Ashutosh Ranjan";
		String[] splitedstring =s.split(" ");
		System.out.println(splitedstring[0]);
		System.out.println(splitedstring[1]);
		
		System.out.println("**********************************************************************************");
		
		String s1="Ashutosh Ranjan learning Selenium+JAVA";
		String[] splitedstring1 =s1.split("Ranjan");
		System.out.println(splitedstring1[0]);
		System.out.println(splitedstring1[1].trim());
		
		/*
		 * for(int i=0;i<s1.length();i++) { System.out.println(s1.charAt(i)); }
		 */
		System.out.println("**********************************************************************************");
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			
			System.out.println(s1.charAt(i));
		}

	}

}
