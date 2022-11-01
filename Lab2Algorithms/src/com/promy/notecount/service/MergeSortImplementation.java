package com.promy.notecount.service;

public class MergeSortImplementation {

		public void sort(int[] notes, int left, int right) {
			
			if(left < right) {
				
				int mid = (left + right)/2;
				
				sort(notes, left, mid);
				sort(notes, mid+1, right); 
				 
				merge(notes, left,mid, right);	
			}
		}

		private void merge(int[] notes, int left, int mid, int right) {
			
			int n1 = mid-left +1 ; 
			int n2 = right - mid ;
			
			// create temp arrays
			int leftNotes[] = new int[n1];
			int rightNotes[] = new int[n2];
			
			//copy data to temp array
			for(int i = 0; i < n1; i++) {
				leftNotes[i] = notes[left+i];
			}
			for(int j=0; j <n2 ; j++) {
				rightNotes[j] = notes[mid + 1 + j];
			}
			
			

			int i = 0 , j = 0;
			int k = left;
			
			while( i < n1 && j < n2) {
				if(leftNotes[i] >= rightNotes[j]) {
					notes[k] = leftNotes[i];
					i++;
				}
				else
				{
					notes[k] = rightNotes[j];
					j++;
				}
				
				k++;	
			}
			
			while(i < n1) {
				notes[k] = leftNotes[i];
				i++;
				k++;
			}
			
			while(j < n2) {
				notes[k] = rightNotes[j];
				j++;
				k++;
			}
		}

	}


