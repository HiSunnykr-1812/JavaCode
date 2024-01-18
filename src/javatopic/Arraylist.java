package javatopic;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name= {"sunny","Ashutosh","Bharat","Hindu"};
		System.out.println(name.length);
	
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("sunny");
		a.add("KUMAR");
		a.add("DDDD");
		a.add("sufdff");
		System.out.println(a.get(0));
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		System.out.println("*************************");
		
			for(String val:a)
			
			{
		System.out.println(val);
			}
		
			String[] name1= {"sunny","Ashutosh","INdia","Hindu"};
			List<String> name1ArrayList=Arrays.asList(name1);
			name1ArrayList.contains("dfdfdf");
		
		}
		
	}


