package com.test.exercise;

public class Ex04_10 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		while(num>0){
			sum+= num% 10;
			num= num / 10;
		}
		
		
		
		
		System.out.println("sum="+sum);
	}

}
