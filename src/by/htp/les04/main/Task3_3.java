package by.htp.les04.main;

import java.util.*;

public class Task3_3 {

	public static void main(String[] args) {

		int size = 5;
		int[] mas = new int[size];
		int count = 0;

		System.out.println("Массив(ы) действительных чисел: ");
		while (count != (size - 1)) {

			Init(mas);
			Print(mas);
			System.out.println();

			for (int i = 1; i < mas.length; i++) {
				if (mas[i] >= mas[i - 1]) {
					count++;
				} else {
					count = 0;
					break;
				}
			}
		}
		System.out.println("Ура! Последняя последовательность чисел возрастающая.");
	}

	
	
	// Метод вывода массива на консоль
	public static void Print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%5d", ar[i]);
		}
	}

	// Метод инициализации массива
	public static void Init(int[] ar) {
		Random rand = new Random();
		int a = -100;
		int b = 100;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = a + rand.nextInt(b - a + 1);
		}
	}
}
