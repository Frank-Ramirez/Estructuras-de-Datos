import java.util.Scanner;
public class dolares {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
       double r;
     
        System.out.println("ingrese los pesos: ");
        double pesos=t1.nextDouble();
        System.out.println("ingrese el costo del dolar: ");
        double dolar=t1.nextInt();
        r=pesos*dolar;
        System.out.println("los dolares son:  "+r);
    }
}
