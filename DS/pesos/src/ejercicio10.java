
import java.util.Scanner;


public class ejercicio10 {
        public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
            System.out.println("ingrese el monto de compñra");
            double montocomp=t.nextDouble();
            System.out.println(" ingrese valor de pago");
            double pago=t.nextDouble();
            System.out.println(" ingrese valor de pago anterior");
            double pagoant=t.nextDouble();
        System.out.println(" ingrese valor de saldo anterior");
            double saldant=t.nextDouble();
            double saldoactual=montocomp-saldant-pagoant;
            if(saldoactual>0);
double pago1=saldoactual*0.15;
double interes=saldoactual*0.85;
if(pago>interes);
    double intereces=saldoactual*0.12+200;
    
    
            System.out.println("valor de interes"  +intereces);
   System.out.println("pago minimo"   +pago1);
            System.out.println("sin intereces"   +interes);   
            System.out.println("saldo actual"  +saldoactual);       
                
                
        }
}
