package es.upm.aled.ordenacion;

public class BubbleSort {

	private static void bubbleSort(int[] list) {
		for (int i = 0 ; i < list.length; i++) {
			for (int j = 0; j < list.length - 1 - i; j++) {
				// Si es mayor el segundo, los cambiamos
				if (list[j] > list[j+1]) {
					// Permutacion de dos números
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] list = { 31, 29, 27, 25, 23, 21, 19, 17, 15, 13, 11, 9, 7, 5, 3, 1 };
//		int[] listBazillion = new int[1000000];
//		for (int i = 0; i < listBazillion.length; i ++) {
//			listBazillion[i] = 1000000 - i;
//		}
//		long t1 = System.nanoTime();
//		bubbleSort(listBazillion);
//		long t2 = System.nanoTime();
//		System.out.println("Esto tarda: " + (t2-t1));
		System.out.println("Ordenado:");
		for (int v : list) {
			System.out.println(v);
		}
	}
}
