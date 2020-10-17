package by.htp.les04.main;

import java.util.*;

public class Task3_8 {

	public static void main(String[] args) {

		int[] mas = new int[10];

		
		System.out.println("Массив действительных чисел - mas: ");
		Init(mas);
		Print(mas);
		
		System.out.println("\n");
		System.out.println("Массив элементов со значениями больше величины своих индексов mas[i] > [i]: ");
		for (int i = 0; i < mas.length; i++) {
			if(mas[i] > i) {
				System.out.printf("%3d[%d]", mas[i], i);
			}
		}	
	}

	
	// Метод инициализации массива
	public static void Init(int[] ar) {
		Random rand = new Random();
		int a = 0;
		int b = 10;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = a + rand.nextInt(b - a + 1);
		}
	}

	// Метод вывода массива на консоль
	public static void Print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d  ", ar[i]);
		}
	}
}
