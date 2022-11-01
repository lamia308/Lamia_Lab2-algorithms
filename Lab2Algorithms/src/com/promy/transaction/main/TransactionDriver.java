package com.promy.transaction.main;

import java.util.Scanner;

import com.promy.transaction.service.TransactionService;

public class TransactionDriver {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of transaction arry:");
		int size= sc.nextInt();
		int arr[]= new int[size];
		System.out.println("enter the values of array:");
		for (int i=0; i<size; i++)
			arr[i]= sc.nextInt();
		System.out.println("enter the total number of targets that needs to be achieved:");
		int targetNo= sc.nextInt();
		//for (int i=1; i<=targetNo; i++)
		//{
		//System.out.println("enter the value of target");
		
		//}
		TransactionService transactionservice= new TransactionService();
		transactionservice.checkTransaction(arr, targetNo);
	}
	

}
