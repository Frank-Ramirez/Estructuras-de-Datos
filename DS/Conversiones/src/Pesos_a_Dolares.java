
import java.util.Scanner;


public class Pesos_a_Dolares {
            public void calcular_Pesos_a_Dolares(){
        Scanner t=new Scanner (System.in);
        System.out.println("Ingrese los Pesos");
        double Pesos=t.nextDouble();
        double r=Pesos*0.0537 ;
        System.out.println("El resultado es: "+r);
                    }
}
