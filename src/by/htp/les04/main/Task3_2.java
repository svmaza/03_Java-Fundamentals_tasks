package by.htp.les04.main;

import java.util.*;

public class Task3_2 {

	public static void main(String[] args) {
		
		int n = 0;
		int j = 0;
		int[] mas = new int[20];

		System.out.println("Массив натуральных чисел - mas:");

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(3);
			if (mas[i] == 0) {
				n++;
			}
		}
		
		Print(mas);
		
		//Создание динамического массива 
		int[] mas0 = new int[n];
		// Инициализация динамического массива
		for (int i = 0; i < mas.length;i++) {
			if (mas[i] == 0) {
				mas0[j] = i;
				j++;
			}
		}
		
		System.out.println("\n");
		System.out.println("Массив индексов нулевых элементов массива mas: ");
		Print(mas0);
	}
	
	
	
	
	
	// Метод вывода массива на консоль
	public static void Print(int[]ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}
