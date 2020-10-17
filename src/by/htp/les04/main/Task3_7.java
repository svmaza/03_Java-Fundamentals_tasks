package by.htp.les04.main;

import java.util.*;

public class Task3_7 {
	
	public static void main(String[] args) {
		
		int[]mas = new int[10];
		int min;
		int max;
		int iMin = 0;
		int iMax = 0;

		Random rand = new Random();
		int a = -100;
		int b = 100;
		min = b;
		max = a;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = a + rand.nextInt(b - a + 1);
			if (mas[i] < min) {
				min = mas[i];
				iMin = i;
			}
			if (mas[i] > max) {
				max = mas[i];
				iMax = i;
			}
		}
		
		System.out.println("Массив действительных чисел: ");
		Print(mas);
		
		System.out.println("\n");
		System.out.println("Наименьший элемент: mas[" + iMin + "] = " + mas[iMin]);
		System.out.println("Наибольший элемент: mas[" + iMax + "] = " + mas[iMax]);
		System.out.println();
		System.out.println("Замена наибольшего и наименьшего элементов местами: ");
		Print(mas);
		
		mas[iMin] = max;
		mas[iMax] = min;
		
		System.out.println();
		Print(mas);
	}
	
	
	// Метод вывода массива на консоль
		public static void Print(int[] ar) {
			for (int i = 0; i < ar.length; i++) {
				System.out.printf("%4d  ", ar[i]);
			}
		}
}
