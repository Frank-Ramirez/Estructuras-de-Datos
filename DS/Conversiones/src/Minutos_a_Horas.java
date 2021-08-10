
import java.util.Scanner;


public class Minutos_a_Horas {
                    public void calcular_Minutos_a_Horas(){
        Scanner t=new Scanner (System.in);
        System.out.println("Ingrese los Minutos");
        double Minutos=t.nextDouble();
        double r=Minutos*0.0166667;
        System.out.println("El resultado es: "+r);
                    }
}
