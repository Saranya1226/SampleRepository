package org.sample;

public class Sample {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum=0;
		for(int i=0; i<=a.length;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
