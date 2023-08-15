package com.lumen.basics;

import java.util.Arrays;

public class SecondLarge {

	public static void main(String[] args) {
		
		int [] array=new int[] {39,45,13,49,13,79,43};
	      Arrays.sort(array);
	      int Largest=array[array.length-2];
	      System.out.println("Secondlargest number:"+Largest);


	}

}
