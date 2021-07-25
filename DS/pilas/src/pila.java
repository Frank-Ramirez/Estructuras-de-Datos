import java.util.Random;
import java.util.Scanner;
public class pila {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
        System.out.println("ingrese el tamaño");
        int lugares=t1.nextInt();
    int arreglo[]=new int [lugares];
        int n=0;
         int opc=0; 
         int v=0;
        do{
            System.out.printf("desea insertar, eliminar o mostrar");
            opc=t1.nextInt();
           //insertar
            if (opc==1 ) {
                if (arreglo[lugares-1]==0) {
                    System.out.println("ingrese un numero");
                    arreglo[n]=t1.nextInt();
                    n=n+1;
         
                if(arreglo[lugares-1]==arreglo[n-1]){
                        System.out.println("pila llena");
                }else{
                System.out.println("hay espacio");
                }
            }
            }
             ///eliminar
            if (opc==2) {
                 if(arreglo[0]==0){
                     System.out.println("pila vacia, no puede seguir eliminando");
                 }else {
                n=n-1;
                arreglo[n]=0;
            }
            }
            //////////mostrar
            if (opc==3) {
                for (int i = 0; i < n; i++) {
                    System.out.println(arreglo[i]);
                }
            }
            System.out.println("quiere seguir");
            v=t1.nextInt();
            }while (v==1);
    }
}
/*
pila[0]=1;
        pila[1]=2;
        pila[2]=3;
        pila[3]=4;
        if (pila[3]!=0) {
            pila[3]=0;
        }
*/

/*
llenado 1
int p=ObtenerValor();
    int dato;
    public int ObtenerValor(){
        Random al= new Random();
    dato=al.nextInt(10);
    return dato;
    }
    */