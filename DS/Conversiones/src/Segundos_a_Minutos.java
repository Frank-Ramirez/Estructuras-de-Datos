
import java.util.Scanner;


public class Segundos_a_Minutos {
                        public void calcular_Segundos_a_Minutos(){
        Scanner t=new Scanner (System.in);
        System.out.println("Ingrese los Segundos");
        double Segundos=t.nextDouble();
        double r=Segundos*0.0166667;
        System.out.println("El resultado es: "+r);
                    }
}
