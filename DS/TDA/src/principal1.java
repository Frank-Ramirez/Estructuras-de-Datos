import java.util.Scanner;
public class principal1 {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
        sueldo e=new sueldo(2000,2,2);
        double acu=e.calcularsfaltas()+e.calre();
        double acu1=e.getsueldos()-acu;
        double sueldo3=e.getsueldos()+e.bono1();
        
        
        
        System.out.println("sueldo"+e.sueldos);
        System.out.println("sueldo con retardos"+e.calre());
        System.out.println("sueldo con faltas"+e.calcularsfaltas());
        System.out.println("sueldo con bono"+e.bono1());

        if(e.faltas==0 && e.retardos==0){
          System.out.println("sueldo final "+sueldo3);
        }
        else{
            System.out.println("sueldo final "+acu1);
        }
        
        
    }
}
