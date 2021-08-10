
import java.util.Scanner;


public class Dolares_a_Euros {
        public void calcular_Dolares_a_Euros(){
        Scanner t=new Scanner (System.in);
        System.out.println("Ingrese los Dolares");
        double Dolares=t.nextDouble();
        double r=Dolares*0.81671989;
        System.out.println("El resultado es: "+r);
                    }
}
