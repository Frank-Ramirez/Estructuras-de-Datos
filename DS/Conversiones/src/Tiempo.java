import java.util.Scanner;
public class Tiempo {
        public void calcular_Tiempo(){

            Scanner t=new Scanner (System.in);
        System.out.println("Seleccione Segundos_a_Minutos,Minutos_a_Horas,Horas_a_Dias");
        String opcion=t.nextLine();
       if (opcion.equals("Segundos_a_Minutos")){
           Segundos_a_Minutos ejecutar_Segundos_a_Minutos=new Segundos_a_Minutos();
           ejecutar_Segundos_a_Minutos.calcular_Segundos_a_Minutos();
       }
       else if (opcion.equals("Minutos_a_Horas")){
           Minutos_a_Horas ejecutar_Minutos_a_Horas=new Minutos_a_Horas();
           ejecutar_Minutos_a_Horas.calcular_Minutos_a_Horas();
       }
       else if (opcion.equals("Horas_a_Dias")){
           Horas_a_Dias ejecutar_Horas_a_Dias=new Horas_a_Dias();
           ejecutar_Horas_a_Dias.calcular_Horas_a_Dias();
       }

}
}