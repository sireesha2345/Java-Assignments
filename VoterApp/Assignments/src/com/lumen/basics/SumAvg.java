package com.lumen.basics;

public class SumAvg {

	public static void main(String[] args) {
		
		int num[] = {12,42,41,64,32,1};
		int sum = 0;
		 
		for(int i = 0; i<num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("Sum of elements are:"+sum);
		float avg = (sum/num.length);
		System.out.println("Average of elements are:"+avg);

	}

}
