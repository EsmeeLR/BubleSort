import java.io.*;
import java.util.Scanner;

public class BubleSortTesting {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números:");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Lista original:");
        BubleSort.imprimirArreglo(numeros);

        // Ordenar con Bubble Sort
        BubleSort.bubbleSort(numeros);

        System.out.println("Lista ordenada:");
        BubleSort.imprimirArreglo(numeros);

        // Guardar salida en archivo txt
        BubleSort.guardarEnArchivo(numeros, "salida.txt");
        System.out.println("La lista ordenada se guardó en salida.txt");

        sc.close(); // cerramos Scanner
    }
}