
import java.util.Random;
import java.util.Scanner;

public class arreglo {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
        System.out.println("Ingresar valores x ");
        int x=t1.nextInt();
        System.out.println("ingrese el valor de y ");
        int y=t1.nextInt();
        int arreglo[][] = new int[x][y];
        
        Random rd = new Random();
        int acumu = 0;
        int R=x*y;
        int a[] = new int[R];
        for (int j = 0; j < arreglo.length; j++) {
            for (int i = 0; i < arreglo.length; i++) {
                a[acumu] = arreglo[i][j] = rd.nextInt(100);
                acumu++;

            }
        }
        for (int j = 0; j < arreglo.length; j++) {
            for (int i = 0; i < arreglo.length; i++) {
                System.out.printf(arreglo[i][j] + "\t");

            }

            System.out.println("");
        }
        int aux = 0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }

        }
        acumu=0;

        for (int j = 0; j < arreglo.length; j++) {
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i][j] = a[acumu];
                acumu++;

            }
        }
        System.out.println(" ORDENADOS \n");
        for (int j = 0; j < arreglo.length; j++) {
            for (int i = 0; i < arreglo.length; i++) {
                System.out.printf(arreglo[i][j] + "\t");

            }

            System.out.println("");
        }
    }
}