package by.htp.les04.main;

import java.util.*;

public class Task3_10 {

	public static void main(String[] args) {

		int n;
		int max;
		int iMas;
		int jMas;

		
		System.out.print("Введите число N, соответствующее размеру массива 2N: ");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите число N, соответствующее размеру массива 2N: ");
		}
		n = sc.nextInt();

		int[] mas = new int[2 * n];
		Init(mas);

		System.out.println();
		System.out.println("Массив действительных чисел размерностью 2N = " + (2 * n) + ": ");
		Print(mas);
		
		System.out.println("\n");
		max = mas[0] + mas[(2 * n) - 1];
		iMas = 0;
		jMas = (2 * n) - 1;
		for(int i = 0, j = (2 * n) - 1; i < n; i++, j--) {
			System.out.println("a[" + i + "] + [" + j + "] = " + mas[i] + " + " + mas[j] + " = " + (mas[i] + mas[j]));
			if((mas[i] + mas[j]) > max) {
				max = mas[i] + mas[j];
				iMas = i;
				jMas = j;
			}
		}
		
		System.out.println();
		System.out.println("Наибольшая сумма элементов max(a[1] + a[2n], a[2] + a[2n-1], ... , a[n] + a[n+1]): ");
		System.out.println("max = a[" + iMas + "] + [" + jMas + "] = " + mas[iMas] + " + " + mas[jMas] + " = " + max);
	}

	
	
	// Метод инициализации массива
	public static void Init(int[] ar) {
		Random rand = new Random();
		int a = -10;
		int b = 10;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = a + rand.nextInt(b - a + 1);
		}
	}

	// Метод вывода массива на консоль
	public static void Print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%2d  ", ar[i]);
		}
	}
}
