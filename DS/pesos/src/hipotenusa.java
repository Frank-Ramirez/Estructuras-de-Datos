import java.util.Scanner;
public class hipotenusa {
    public static void main(String[] args) {
        double r;

        Scanner t1=new Scanner(System.in);
        System.out.println("ingrese el co:  ");
        double co=t1.nextDouble();
        System.out.println("ingrese el ca:  ");
        double ca=t1.nextDouble();
        r=co*co+ca*ca;
        r=Math.sqrt(r);
        System.out.println("la hipotenusa es:  "+r);
    }
    
}
