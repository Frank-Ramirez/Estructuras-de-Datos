import java.util.Scanner;
public class triangulo {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
        double S;
        double A;
        System.out.println("ingrese el lado a:  ");
        double a=t1.nextDouble();
        System.out.println("ingrese el lado b:  ");
        double b=t1.nextDouble();
        System.out.println("ingrese ellado c:  ");
        double c=t1.nextDouble();
        S= (a+b+c)/2;
        A= ((S)*(S-a)*(S-b)*(S-c));
        A= Math.sqrt(A);
        System.out.println("El are es:  "+A);
    }
}
