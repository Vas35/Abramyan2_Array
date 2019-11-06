package ua.univer.HomeWork;

public class Task {

	

	public static void main(String[] args) {
// Task1
		/*
		 * Дано целое число N (> 0). Сформировать и вывести целочисленный массив размера
		 * N, содержащий степени двойки от первой до N-й: 2, 4, 8, 16, … .
		 */
		int n = 20;
		int[] masN = new int[n];
		MyLib.masPow2(masN);

//Task2
/*Дано целое число N (> 1), а также первый член A и разность D арифме-тической прогрессии. Сформировать и вывести массив размера N, содер-жащий N первых членов данной прогрессии:
A, A + D, A + 2·D, A + 3·D, … .*/
	int m = 10;
	int [] arrN = new int [m];
	MyLib.masPow2(arrN);
	MyLib.averageArr(arrN);
	
//Task3
	/*Дан целочисленный массив A размера 10. Вывести порядковый номер последнего из тех его элементов AK, которые удовлетворяют двойному не-равенству A1 < AK < A10. Если таких элементов нет, то вывести 0.*/
	int a = 10;
	int [] arrA = new int [a];
	MyLib.masPow2(arrA);
    MyLib.segmentArr(arrA);

 //Task4
/*Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N). Найти сум-му элементов массива с номерами от K до L включительно.*/
int w = 30;
int [] arrKL = new int[w];
MyLib.masPow2(arrKL);
MyLib.sumArrKL(arrKL);
	
//Task5
/*Даны массивы A и B одинакового размера N. Поменять местами их со-держимое и вывести вначале элементы преобразованного массива A, а за-тем — элементы преобразованного массива B.*/
	int [] masX = {2,6,2,8,7};
	int [] masY = {-3,-5,-6,-8,-5};
    MyLib.switchMas(masX,masY);
	for (int i = 0; i < masX.length; i++) {
		System.out.print("arr1 ="+masX[i]+",");
		System.out.print("arr2 ="+masY[i]+",");
	}
		
		
		
		
		
		
		
		
		
	}

}
