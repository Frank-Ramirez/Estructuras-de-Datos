import java.util.Scanner;
public class ventas {
    
    public static void main (String[] args){
        
        double venta1=0, venta2=0;
        Scanner teclado=new Scanner(System.in);
        System.out.printf("luis vendio: ");
        venta1=teclado.nextDouble();
        System.out.printf("cesar vendio: ");
        venta2=teclado.nextDouble();
        if(venta1>venta2)
        System.out.printf("luis vendio mas "+venta1+"cesar vendio mas "+venta2);
        else
        System.out.printf("luis vendio menos "+venta1+" cesar vendio mas "+venta2);
        
        
    }
    
}
