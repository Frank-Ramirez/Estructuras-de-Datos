
import java.util.Scanner;


public class ejercicio15 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int modelo, talla;
        double N_pantalones,CostoTela, Ganancia, ManoObra, MetroTela, MetrosDeTela;
        System.out.print("Ingrese el numero de pantalones: ");
        N_pantalones = sc.nextDouble();
        System.out.print("Ingrese el precio del metro de la tela: ");
        
        MetroTela = sc.nextDouble();
        System.out.println("Seleccione el modelo.");
        System.out.println("1.- A");
        System.out.println("2.- B");
        System.out.print(": ");
        
        do {
            modelo = sc.nextInt();
        
            if (modelo<1||modelo>2)
                System.out.print("Valor incorrecto intentelo  nuevamente. ");
            
        } while (modelo<1||modelo>2);
        System.out.println("Seleccione el valor de talla.");
        System.out.println("1.- 30,  2.- 32,  3.- 36");
        
        do {
            talla = sc.nextInt();
        
            if (talla<1||talla>3)
                System.out.print("valor erroneo intentelo  nuevamente.: ");
        
        } while (talla<1||talla>3);
        MetrosDeTela=modelo==1?1.5*N_pantalones:1.8*N_pantalones;
        
        CostoTela=MetrosDeTela*MetroTela;
        ManoObra=modelo==1?CostoTela*0.8:CostoTela*0.95;
        
        Ganancia=CostoTela-ManoObra;
        System.out.println("El precio de la tela  " + CostoTela);
        System.out.println("El costo de la mano de obra  " + ManoObra);
        System.out.println("El costo por metro  " + MetrosDeTela);
        System.out.println("La ganancia "+Ganancia);
    }

}

