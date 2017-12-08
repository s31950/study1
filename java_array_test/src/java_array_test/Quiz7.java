package java_array_test;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		int[] a=new int[7];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			System.out.print((i+1)+"번째 숫자 : ");
			a[i]=Integer.parseInt(scan.nextLine());
		}
		
		Arrays.sort(a);


		System.out.println("max =" +a[a.length -1]);
		System.out.println("min= " + a[0]);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
