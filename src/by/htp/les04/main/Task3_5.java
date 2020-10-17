package by.htp.les04.main;

import java.util.*;

public class Task3_5 {

	public static void main(String[] args) {

		int mas[] = new int[10];
		int min;
		int max;

		Random rand = new Random();
		int a = -100;
		int b = 100;
		min = b;
		max = a;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = a + rand.nextInt(b - a + 1);
			if (mas[i] < min) {
				min = mas[i];
			}
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		System.out.println("Массив действительных чисел: ");
		Print(mas);
		
		System.out.println("\n");
		System.out.println("Минимальное значение массива = " + min);
		System.out.println("Максимальное значение массива = " + max);
		System.out.println("Наименьшая длина числовой оси, содержащей все числа массива = " + (max - min));
	}

	
	// Метод вывода массива на консоль
	public static void Print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

}
