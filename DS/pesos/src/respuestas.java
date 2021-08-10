import java.util.Scanner;
public class respuestas {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
        
        int r;
        System.out.println("respuesta correcta:  ");
        int correcta=t1.nextInt();
        System.out.println("respuesta incorrecta:  ");
        int incorrecta=t1.nextInt();
        System.out.println("respuesta en blanco:  ");
        int blanco=t1.nextInt();
        r= correcta*4-incorrecta;
        System.out.println("el puntaje es:  "+r);
    }
}
