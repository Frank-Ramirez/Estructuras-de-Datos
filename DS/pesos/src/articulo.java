import java.util.Scanner;
public class articulo {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
        double iva;
        double r;
        System.out.println("ingrese el monto de la compra:  ");
        double compra=t1.nextDouble();
        compra = compra - (compra*0.2);
        iva= compra*0.15;
        r=compra+iva;
        System.out.println("el costo con descuento es de:  "+compra);
        System.out.println("el costo final es de:  "+r);
    }
}
