package com.greatlearning.lab;
import java.util.Scanner;
public class Min_Notes {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//get the number of denominations
		System.out.println("Enter the number of denominations:");
		int size= sc.nextInt();
		
		//allocate an array called as "notes" to hold denomations
		int[] notes=new int[size];
		int[] numNotes = new int[size];
		//get the denominations in the loop - 100, 500, 2000
		System.out.println("Enter the denominations:");
		for(int i=0;i<size;i++) {
			notes[i] = sc.nextInt();
		}
		
		MergeSortImplementation ms=new MergeSortImplementation();
		ms.sort(notes, 0, notes.length-1);
		
		//check for sorting
		for(int j=0;j<notes.length;j++) {
			System.out.println(notes[j]);
		}
		
		//what is the amount to pay
		System.out.println("What is the amount to pay");
		int amount = sc.nextInt();
		
		// to get notes 
		try {
			for(int i=0; i<notes.length;i++) {
				// to find out how many notes need to select
				int rem=(int)amount/notes[i];
				numNotes[i]=rem;
				amount=amount-(notes[i]*rem);
			
				if(i == notes.length-1 && amount !=0) {
					System.out.println("Not possible to pay the amount");
				}else if(i ==notes.length-1 && amount ==0) {
					for(int j=0;j<numNotes.length; j++) {
						System.out.println(notes[j]+ " : "+ numNotes[j]);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Entered 0 as the denominations");
//			e.printStackTrace();
		}
	}
}
