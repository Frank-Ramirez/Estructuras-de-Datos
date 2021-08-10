import java.util.Scanner;
public class conagua {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
        
        double r;
        System.out.println("ingrese los metros cubicos de agua:  ");
        double agua=t1.nextDouble();
        System.out.println("ingrese el costo por metro cubico:  ");
        double metros=t1.nextDouble();
        r= agua*metros;
        System.out.println("debe pagara:  "+r);
    }
}
