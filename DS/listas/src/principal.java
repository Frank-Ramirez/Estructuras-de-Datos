
import java.util.Scanner;


public class principal {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
        int r=0,r1=0;
        Lista Lista=new Lista();
        do{
            System.out.println("quiere agregar o eliminar");
            r1=t1.nextInt();
            if (r1==1) {
                System.out.println("ingrese un numero");
        r=t1.nextInt();
         Lista.agregarAlFinal(r);
         System.out.println("<<-- Lista -->>");
        Lista.listar();
        System.out.println("\n\n<<-- Tamaño -->");
        System.out.println(Lista.getTamanio());
            }
            
        
        
        }while(true);
        
        // Agregar al final de la lista
       
       
        
        
    }
    
}
