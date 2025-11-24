import java.io.*;

public class BubleSort {

    // Método principal de Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    intercambio = true;
                }
            }
            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!intercambio) break;
        }
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Guardar arreglo en archivo
    public static void guardarEnArchivo(int[] arr, String nombreArchivo) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
        for (int num : arr) {
            bw.write(num + " ");
        }
        bw.close();
    }
}