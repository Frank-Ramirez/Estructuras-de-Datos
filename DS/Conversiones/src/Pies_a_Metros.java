import java.util.Scanner;
public class Pies_a_Metros {
        public void calcular_Pies_a_Metros(){
        Scanner t=new Scanner (System.in);
        System.out.println("Ingrese los Pies");
        double Pies=t.nextDouble();
        double r=Pies*0.3048;
        System.out.println("El resultado es: "+r);
}
}