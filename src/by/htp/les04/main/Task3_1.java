package by.htp.les04.main;

import java.util.*;

public class Task3_1 {

	public static void main(String[] args) {
		
		int k = 1;
		int sum = 0;
		int[] mas = new int[10];
		
		System.out.println("Массив натуральных чисел:");
		
		//Инициализация массива mas
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
		
		//Вывод массива mas на консоль
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		
		System.out.println("\n");
		System.out.print("Введите число К: ");
		
		//Инициализация числа k
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите число К: ");
		}
		k = sc.nextInt();
		
		System.out.println();
		System.out.println("Элементы массива кратные числу К:");
		
		//Расчёт суммы элементов массива mas кратных числу k
		for (int i = 0;i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum = sum + mas[i];
				System.out.print(mas[i] + " ");
			}else {
				System.out.print("_" + " ");
			}
		}
		
		//Вывод результата на консоль
		System.out.println("\n");
		System.out.println("Сумма элементов массива кратных числу " + k + " равна " + sum);
	}
}
