import java.util.Scanner;

public class Moneda {
            public void calcular_Moneda(){
            Scanner t=new Scanner (System.in);
            System.out.println("Seleccione Pesos_a_Dolares,Pesos_a_Euros,Dolares_a_Euros");
            String opcion=t.nextLine();
                   if (opcion.equals("Pesos_a_Dolares")){
                       Pesos_a_Dolares ejecutar_Pesos_a_Dolares=new Pesos_a_Dolares();
                       ejecutar_Pesos_a_Dolares.calcular_Pesos_a_Dolares();
                   }
                   else if (opcion.equals("Pesos_a_Euros")){
                       Pesos_a_Euros ejecutar_Pesos_a_Euros=new Pesos_a_Euros();
                       ejecutar_Pesos_a_Euros.calcular_Pesos_a_Euros();
                   }
                   else if (opcion.equals("Dolares_a_Euros")){
                       Dolares_a_Euros ejecutar_Dolares_a_Euros=new Dolares_a_Euros();
                       ejecutar_Dolares_a_Euros.calcular_Dolares_a_Euros();
                   }



            }

}
