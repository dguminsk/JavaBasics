package by.epam.javabasics.homework02;
import java.util.Scanner;

import by.epam.javabasics.homework04.WithArray;

public class Test {

	public static void main(String[] args) {

		int[] a = new int[4];
		int[] b = a;
		int[] c = {1,2,3};
		a[0] = 1;
		System.out.print(b[0]);
		

	}

}