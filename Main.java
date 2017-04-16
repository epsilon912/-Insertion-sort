package main;

//������� ����� ���������
public class Main {
	
	/**
	 * ����� ���������� ������� ���������
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
	 * ����� ������� � �������
	 * @param arr
	 */
	static void printArr(double[] arr) {
		for (double i : arr)
			System.out.print(i+" ; ");
		System.out.println("");
	}
	
	/**
	 * ����� ����-����� ��������� ����������
	 * @param arr
	 */
	static void test(double[] arr) {
		try { //�������� ���������� ������
			if (arr.length > 0) //��������� ������ �� �������
			{
				System.out.println("Before sort:");
				printArr(arr);
				sortArray(arr);
				System.out.println("After sort:");
				printArr(arr);
			} else
				System.out.println("Empty array");
		} catch (NullPointerException e) { //������������ ���������� �� null
			System.out.println("Error: null array");
		}
	}
	
	/**
	 * ����� ������� ���������
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
