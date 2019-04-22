package by.epam.javabasics.homework04;

import java.util.Random;
import java.util.Scanner;

public class WithArray { 
	 
	 public static void main(String[] args) {   
		 int[] mas = new int[10];   
		 enterArrayWithRandom(mas);   
		 printArray(mas);   
		 findMaxElementAndIndex(mas);   
		 sortArray(mas);   
		 printArray(mas); 
	 
	 } 
	 
	 public static void enterArrayFromConsole(int[] mas) {   
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);   
		 for (int i = 0; i < mas.length; i++) {    
			 System.out.print("ar[" + i + "]=>");    
			 mas[i] = sc.nextInt();   
			 }  
		 } 
	 
	 
	 public static void enterArrayWithRandom(int[] mas) {   
		 Random rand = new Random();   
		 for (int i = 0; i < mas.length; i++) {    
			 mas[i] = rand.nextInt(300);   
			 }  
		 } 
	 
	 public static void printArray(int[] mas) {   
		 System.out.println("--------------------------------------------"); 
	 
	  for (int i = 0; i < mas.length; i++) {    
		  System.out.print("mas[" + i + "]=" + mas[i] + "; ");   
		  }   
	  System.out.println();   
	  System.out.println("--------------------------------------------"); 
	 
	 } 
	 
	 public static void findMaxElementAndIndex(int[] mas) {   
		 if (mas.length == 0) {    
			 return;   
			 } 
	 
	  int max;   
	  int index; 
	 
	  max = mas[0];   
	  index = 0;   
	  for (int i = 1; i < mas.length; i++) {    
		  if (max < mas[i]) {     
			  max = mas[i];     
			  index = i;    
			  } 

	 
	 
	  } 
	 
	  System.out.println("Максимальный элемент " + max + " расположен на позиции " + index + ".");  } 
	 
	 public static void sortArray(int[] mas) {   
		 int minValueIndex = 0; 
	 
	  for (int i = 0; i < mas.length; i++) {    
		  minValueIndex = i; 
	 
	   for (int j = i + 1; j < mas.length; j++) {     
		   if (mas[j] < mas[minValueIndex]) {      
			   minValueIndex = j;     
			   }    
		   } 
	 
	   int temp = mas[i];    
	   mas[i] = mas[minValueIndex];    
	   mas[minValueIndex] = temp;   
	   } 
	 
	 } 
	}
