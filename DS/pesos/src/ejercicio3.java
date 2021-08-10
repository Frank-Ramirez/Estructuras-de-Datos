
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        double descuento;
        double obsequio;
        System.out.println("ingresa cuantas docenas compro");
         int docenas=t.nextInt();
        System.out.println("ingresa precio");
        double precio=t.nextInt(); 
        double compra=docenas*precio;
         if( docenas > 3 ){
        descuento= 0.15*compra;
        obsequio = docenas-3;
    }
           else{
      descuento= 0.10*compra;
        obsequio = 0;
    }
        
     double pago=compra-descuento;
        System.out.println("compra:"+compra+" descuento:"+descuento+" pago:"+pago+ "obsequio:"+ obsequio);
        
         
 
        
        
        
        
        
    }
}
