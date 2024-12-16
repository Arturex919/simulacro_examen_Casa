import java.util.Scanner;

public class Arra1 {

        public static void matriz(int[][] matriz) {
            // Mostrar la matriz
            System.out.println("La matriz ingresada es:");

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " "); // Espacio entre elementos para mejor visualización
                }
                System.out.println(); // Salto de línea al final de cada fila
            }
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a, b;

            // Solicitar tamaño de la matriz
            System.out.println("Ingresa el número de filas (a):");
            a = in.nextInt();
            System.out.println("Ingresa el número de columnas (b):");
            b = in.nextInt();

            // Crear la matriz
            int[][] matriz = new int[a][b];

            // Llenar la matriz con valores ingresados por el usuario
            System.out.println("Ingresa los valores de la matriz:");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = in.nextInt();
                }
            }

            // Llamar al método para mostrar la matriz
            matriz(matriz);
        }
    }