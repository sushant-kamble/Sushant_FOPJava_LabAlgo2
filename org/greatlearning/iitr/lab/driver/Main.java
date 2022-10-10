package org.greatlearning.iitr.lab.driver;

import org.greatlearning.iitr.lab.services.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MergeSortImplementation mergerSortImplementation = new MergeSortImplementation();
		NoteCount noteCount = new NoteCount();
		
		System.out.println("enter the size of currency denominations ");
		Scanner sc=new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] notes = new int[size];
		
		System.out.println("enter the currency denominations value");
		for(int i=0; i<size; i++) {
			notes[i] = sc.nextInt();
		}
		
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		
		mergerSortImplementation.sort(notes, 0, notes.length - 1);
		noteCount.notesCount(notes, amount);
		
		sc.close();
	}

}
