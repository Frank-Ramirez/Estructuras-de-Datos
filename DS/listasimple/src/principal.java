import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
        int opc=0;
        int p=0;
        listasimple l=new listasimple();
        do{
            System.out.println("ingresar\t"
                    + "buscar\t"
                    + "\nmodificar\t"
                    + "eliminar"
                    + "\nmostrar");
            System.out.println("escoja una opcion");
            opc=t1.nextInt();
            switch(opc){
                case 1:
                    System.out.println("***********ingresar********");
                    System.out.println("ingrese un dato");
                    int d=t1.nextInt();
                    l.ingresarnodo(d);
                    break;
                case 2:
                    System.out.println("**********buscar************");
                    System.out.println("buscar nodo");
                    d=t1.nextInt();
                    l.buscarnodo(d);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("**********eliminar**********");
                    System.out.println("ingrese un dato a eliminar");
                    d=t1.nextInt();
                    l.eliminarnodo(d);
                    break;
                case 5:
                    System.out.println("****lista****");
                    l.verlista();
                    break;
            
            }
        }while(opc<6);
    }
    
}
