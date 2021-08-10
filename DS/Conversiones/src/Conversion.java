import java.util.Scanner;
public class Conversion {
    public static void main (String [] args){
    Scanner t=new Scanner (System.in);
    System.out.println("Seleccione Moneda,Tiempo,Longitud");
    String opcion=t.nextLine();
    
    
    
    
    
    if (opcion.equals("Longitud")){
        Longitud ejecutar_L=new Longitud();
        ejecutar_L.calcular_Longitud();
    }
    else if (opcion.equals("Moneda")){
        Moneda ejecutar_M=new Moneda();
        ejecutar_M.calcular_Moneda();
    }
        else if (opcion.equals("Tiempo")){
        Tiempo ejecutar_T=new Tiempo();
        ejecutar_T.calcular_Tiempo();
    }
    
    
}
}