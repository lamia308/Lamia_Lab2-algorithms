package com.promy.notecount.main;

import java.util.Scanner;

import com.promy.notecount.service.MergeSortImplementation;
import com.promy.notecount.service.NotesCount;

public class NotesCountDriver {

	public static void main(String[] args) {
		
		MergeSortImplementation mergesortimplementation= new MergeSortImplementation();
		NotesCount notescount= new NotesCount();
		System.out.println("enter the size of currency denominations:");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		int[] notes= new int [size];
		System.out.println(" enter the currency denominations value:");
		 for (int i=0; i<size; i++)
		 {
			 notes[i]=sc.nextInt();
		 }
		 System.out.println("enter the amount you want to pay:");
		 int amount= sc.nextInt();
		 
		 mergesortimplementation.sort(notes, 0 , notes.length-1);
		 notescount.notesCountImplementation(notes, amount);
	}

}
