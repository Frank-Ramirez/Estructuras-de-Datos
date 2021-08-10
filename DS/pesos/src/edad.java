import java.util.Scanner;
public class edad {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
        int M=12, S=52, D=365, H=24;
        int r;
        System.out.println("ingresa tu edad:  ");
        int edad=t1.nextInt();
        System.out.println("los meses que as vivido son:  "+edad*M);
        
        System.out.println("las semanas que as vivido son:  "+edad*S);
        System.out.println("los dias que as vivido son:  "+edad*D);
        System.out.println("las horas que as vivido son:  "+edad*D*H);
    }
    
}
