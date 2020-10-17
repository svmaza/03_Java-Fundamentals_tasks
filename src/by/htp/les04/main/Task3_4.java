package by.htp.les04.main;

import java.util.*;

public class Task3_4 {

	public static void main(String[] args) {

		int[] mas = new int[10];
		int n = 0;
		int j = 0;

		Random rand = new Random();
		int a = 1;
		int b = 100;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = a + rand.nextInt(b - a + 1);
			if (mas[i] % 2 == 0) {
				n++;
			}
		}
		System.out.println("Массив натуральных чисел - mas: ");
		Print(mas);
		System.out.println();
		
		
		// Создание динамического массива
		int[] masEven = new int[n];
		
		// Инициализация динамического массива
		for (int i = 0; i < mas.length; i++) {
			if(mas[i] % 2 == 0) {
				masEven[j] = mas[i];
				j++;
			}
		}
		System.out.println();
		System.out.println("Массив чётных чисел массива mas: ");
		Print(masEven);	
	}

	
	// Метод вывода массива на консоль
	public static void Print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%d ", ar[i]);
		}
	}
}
