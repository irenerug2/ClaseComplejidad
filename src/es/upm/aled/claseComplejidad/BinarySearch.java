package es.upm.aled.claseComplejidad;

public class BinarySearch {
	
//	private static int binarySearch(int[] list, int lo, int hi, int value) {
//		// DEBERES: ¿Implementarlo con recursividad?
//		//Mirar explicación hecha en el ipad, en la carpeta de explicaciones
//		do {
//			int me = (int) Math.floor(lo + (hi-lo)/2);
//			int v = list[me]; // O(1)
//			if (v == value) {
//				return me;
//			}
//			else if (v > value) {
//				hi = me;
	//			}
	//			else {
	//			lo = me +1;
	//		}
	//		} while (lo<hi);
	//		return -1;
	//	}
	
	//deberes
	private static int binarySearch(int[] list, int lo, int hi, int value) {
	    // Caso base: si ya no hay elementos
	    if (lo >= hi) return -1;

	    int mid = lo + (hi - lo) / 2;  // índice del centro
	    int v = list[mid];

	    if (v == value) {
	        return mid;                // encontrado
	    } else if (v > value) {
	        return binarySearch(list, lo, mid, value);     // busca en mitad izquierda
	    } else {
	        return binarySearch(list, mid + 1, hi, value); // busca en mitad derecha
	    }
	}
	// Método facade
	public static int binarySearch(int[] list, int value) {
		return binarySearch(list, 0, list.length, value);
	}
	
	public static void main(String[] args) {
		// Array ORDENADO
		int[] list = { 1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31 };
		int value = 25; //Poner num que queremos encontrar
		int posicion = binarySearch(list, value);
		System.out.println("Posición: " + posicion);
	}
	
	
	
	
	
	
	
}

