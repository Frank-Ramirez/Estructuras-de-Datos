import java.util.Scanner;
public class ahorro_por_mes {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
        double r;
        System.out.println("ingrese el salario:  ");
        double salario=t1.nextDouble();
        salario = salario - (salario*0.15);
        r=salario*48;
        System.out.println("tus ahorros son de:  "+r);
    }
}
