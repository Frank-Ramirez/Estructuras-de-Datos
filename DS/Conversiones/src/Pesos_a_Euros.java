
import java.util.Scanner;


public class Pesos_a_Euros {
        public void calcular_Pesos_a_Euros(){
        Scanner t=new Scanner (System.in);
        System.out.println("Ingrese los Pesos");
        double Pesos=t.nextDouble();
        double r=Pesos*0.0438578581;
        System.out.println("El resultado es: "+r);
                    }
}
