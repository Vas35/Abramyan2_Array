package ua.univer.HomeWork;

public class MyLib {
	
	// Task1	
	public static void masPow2 (int[]mass) {
		int temp = 1;
	for (int i = 0; i < mass.length; i++) {
		temp = temp*2;
		mass[i] = temp;
		System.out.println(mass[i]);
	}
}
	// Task2
	public static void averageArr(int[]mass) {
		int a = mass[0];
		int length = mass.length;
		int count = 0;
		for (int i = 0; i < mass.length; i++) {
			mass[i] = a + count*(mass[length-1]-a )/(length-1);
			count ++;
			System.out.print(mass[i]+", ");
		}
	}
	
	// Task3
	public static void segmentArr(int[]mass) {
		int length = mass.length;
		int temp = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[0]<mass[i] && mass[i]<mass[length -1]) {
				temp = i;
				System.out.println("arrA["+i+"] = "+mass[i]);
			}  else {
				System.out.println("0");
			}
			
		}
	}
	
	// Task4
	public static void sumArrKL(int[]mass) {
		int length = mass.length;
		int temp = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[0]<=mass[i] && mass[i]<=mass[length -1]) {
				temp += mass[i];
				System.out.println("sum from k to l = "+ mass[i]);
			}  
			
		}
		}
	
	// Task5
	/*Даны массивы A и B одинакового размера N. Поменять местами их со-держимое и вывести вначале элементы преобразованного массива A, а за-тем — элементы преобразованного массива B.*/
	public static void switchMas(int[]mass, int []arr) {
		int j = 0;
		for (int i = 0;  i < mass.length; i++) {
			j = mass[i];
			mass[i] = arr[i];
			arr[i] = j;
		}
	}
	
	
	
	
	
}
