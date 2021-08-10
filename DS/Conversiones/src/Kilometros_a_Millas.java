import java.util.Scanner;
public class Kilometros_a_Millas {
    public void calcular_Kilometros_a_Millas(){
        Scanner t=new Scanner (System.in);
        System.out.println("Ingrese los Kilometros");
        double Kilometros=t.nextDouble();
        double r=Kilometros*0.621371;
        System.out.println("El resultado es: "+r);
    }
}
