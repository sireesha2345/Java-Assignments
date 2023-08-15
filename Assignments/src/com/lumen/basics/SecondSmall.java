package com.lumen.basics;

import java.util.Arrays;

public class SecondSmall {

	public static void main(String[] args) {
		
		int [] array=new int[] {24,13,57,15,86};
	      Arrays.sort(array);
	      int Smallest=array[1];
	      System.out.println("SecondSmallest number:"+Smallest);

	}

}