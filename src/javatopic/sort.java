package javatopic;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[]{8,1,6,9,77,100};
		
		Arrays.sort(array);
		
		for(int i=0;i<=array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
