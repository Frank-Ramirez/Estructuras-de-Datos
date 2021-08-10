import java.util.Scanner;
public class Centimetros_a_Pulgadas {
            public void calcular_Centimetros_a_Pulgadas(){
        Scanner t=new Scanner (System.in);
        System.out.println("Ingrese los Centimetros");
        double Centimetros=t.nextDouble();
        double r=Centimetros*0.393701;
        System.out.println("El resultado es: "+r);
}
}
