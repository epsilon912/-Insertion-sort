package main;

//Главный класс программы
public class Main {
	
	/**
	 * Метод сортировки массива вставками
	 * @param arr
	 */
	static void sortArray(double[] arr) {
		for(int i=1;i < arr.length; i++) {  
			for(int j=i; j > 0 && arr[j-1] > arr[j]; j--)
			{
				double a = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = a;
			}
		}
	}
	
	/**
	 * Вывод массива в консоль
	 * @param arr
	 */
	static void printArr(double[] arr) {
		for (double i : arr)
			System.out.print(i+" ; ");
		System.out.println("");
	}
	
	/**
	 * Метод юнит-теста алгоритма сортировки
	 * @param arr
	 */
	static void test(double[] arr) {
		try { //Пытаемся обработать массив
			if (arr.length > 0) //Проверяем массив на пустоту
			{
				System.out.println("Before sort:");
				printArr(arr);
				sortArray(arr);
				System.out.println("After sort:");
				printArr(arr);
			} else
				System.out.println("Empty array");
		} catch (NullPointerException e) { //Обрабатываем исключение на null
			System.out.println("Error: null array");
		}
	}
	
	/**
	 * Метод запуска программы
	 * @param args
	 */
	public static void main(String[] args) {
		double[] a = {3, 2, 6, 5};
		test(a);
		test(null);
		double[] b = {5, 8, 2, 4, 1, 2};
		test(b);
		double[] c = {};
		test(c);
	}

}
