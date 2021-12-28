package com.greatlearning.lab;
import java.util.Scanner;
public class Transactions {

	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//get the size
		System.out.println("Enter the number of transactions:");
		int size=sc.nextInt();
		
		// allocate array
		int[] arr=new int[size];
		//iterate through the loop
		System.out.println("Enter the transaction values:");
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		//get the no of targets
		System.out.println("Enter number of targets:");
		int numtargets = sc.nextInt();
		
		//loop as many items as we get the no of targets
		for(int i=0;i<numtargets;i++) {
			//get the target
			System.out.println("Enter the target");
			int target = sc.nextInt();			
			// again start a loop to calculate the sum
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum>=target) {
					System.out.println("target is reached after "+(j+1)+ " transactions");
					break;
				}
				if(j == arr.length-1 && sum<target) {
					System.out.println("Target is not achieved");
				}
			}
		}
	}
} 
