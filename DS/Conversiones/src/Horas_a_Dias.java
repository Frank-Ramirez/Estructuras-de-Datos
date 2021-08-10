
import java.util.Scanner;


public class Horas_a_Dias {
                public void calcular_Horas_a_Dias(){
        Scanner t=new Scanner (System.in);
        System.out.println("Ingrese las Horas");
        double Horas=t.nextDouble();
        double r=Horas*0.0416667;
        System.out.println("El resultado es: "+r);
        }
    
}
