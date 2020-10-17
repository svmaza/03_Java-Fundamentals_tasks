package by.htp.les04.main;

import java.util.*;

public class Task3_6 {

	public static void main(String[] args) {

		int z = 0;
		int count = 0;
		int mas[] = new int[20];

		System.out.println("Массив действительных чисел: ");
		Init(mas);
		Print(mas);

		System.out.println("\n");
		System.out.print("Введите число Z: ");

		// Инициализация числа Z
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите число Z: ");
		}
		z = sc.nextInt();

		System.out.println();
		System.out.println("Замена элементов превышающих число Z на число Z: ");
		Print(mas);
		
		System.out.println();
		for(int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				count++;
				System.out.printf("[%2d]  ", mas[i]);
			}else {
				System.out.printf("%4d  ", mas[i]);
			}
		}
		System.out.println("\n");
		System.out.println("Количество замен = " + count);
		
	}

	// Метод вывода массива на консоль
	public static void Print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d  ", ar[i]);
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
