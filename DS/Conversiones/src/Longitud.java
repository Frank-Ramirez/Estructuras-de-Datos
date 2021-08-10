import java.util.Scanner;
public class Longitud {
    public void calcular_Longitud(){
        Scanner t=new Scanner (System.in);
        System.out.println("Seleccione Centimetros_a_Pulgadas,Pies_a_Metros,Kilometros_a_Millas");
        String opcion=t.nextLine();
        if (opcion.equals("Centimetros_a_Pulgadas")){
            Centimetros_a_Pulgadas ejecutar_Centimetros_a_Pulgadas=new Centimetros_a_Pulgadas();
            ejecutar_Centimetros_a_Pulgadas.calcular_Centimetros_a_Pulgadas();
        }
        else if (opcion.equals("Pies_a_Metros")){
            Pies_a_Metros ejecutar_Pies_a_Metros=new Pies_a_Metros();
            ejecutar_Pies_a_Metros.calcular_Pies_a_Metros();
        }
        else if (opcion.equals("Kilometros_a_Millas")){
            Kilometros_a_Millas ejecutar_Kilometros_a_Millas=new Kilometros_a_Millas();
            ejecutar_Kilometros_a_Millas.calcular_Kilometros_a_Millas();
        }
    }
    
}
