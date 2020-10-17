package by.htp.les04.main;

import java.util.*;

public class Task3_9 {

	public static void main(String[] args) {

		int n;
		int cZero = 0;
		int cPlus = 0;
		int cMinus = 0;
		
		
		System.out.print("Введите размерность массива N: ");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите размерность массива N: ");
		}
		n = sc.nextInt();
		
		int[]mas = new int[n];
		Init(mas);
		
		System.out.println();
		System.out.println("Массив действительных чисел размерностью N = " + n + ": ");
		Print(mas);
		
		for(int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				cMinus++;
			}else {
				if(mas[i] > 0) {
					cPlus++;
				}else {
					cZero++;
				}
			}
		}
		
		System.out.println("\n");
		System.out.println("Массив содержит: ");
		System.out.println(" - отрицательных значений \t-\t" + cMinus);
		System.out.println(" - положительных значений \t-\t" + cPlus);
		System.out.println(" - значений равных нулю \t-\t" + cZero);
	}

	
	
	
	// Метод инициализации массива
	public static void Init(int[] ar) {
		Random rand = new Random();
		int a = -5;
		int b = 5;
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
