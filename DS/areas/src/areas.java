import java.util.Scanner;
public class areas {
    public static void main (String[] args){
        String figura="null";
        Scanner t1=new Scanner(System.in);
        System.out.printf("elige una figura, triangulo, cuadrado, circulo, rectangulo, paralelo gramo  ");
        figura=t1.nextLine();
        if (figura.equals("triangulo")){
            double base=0, altura=0;
            
            System.out.printf("ingresa la base...  ");
            base=t1.nextDouble();
            System.out.printf("ingresa la altura...  ");
            altura=t1.nextDouble();
             double area=(base*altura)/2;
             System.out.println("el area es...  ");
        }else
        if (figura.equals("circulo")){
            double R=0;
            R=t1.nextDouble();
            double area=3.1416*Math.pow(R,2);
            System.out.printf("el resultado es  "+area);
        }else
            if (figura.equals("cuadrado")){
                double L=0;
                System.out.printf("ingresa el lado  ");
                L=t1.nextDouble();
                double area=Math.pow(L,2);
                System.out.printf("El area es  "+area);
            }else
                if (figura.equals("rectangulo")){
                    double base=0, altura=0;
                    System.out.printf("ingresa la base  ");
                    base=t1.nextDouble();
                    System.out.printf("ingresa la altura  ");
                    altura=t1.nextDouble();
                    if(base==altura){
                        System.out.println("esto es un cuadrado, no un rectangulo"); 
                    }                  
                
        double resultado=(base*altura);
                    System.out.println("elegiste un cuadrado  ");
                    
                }else
                    if (figura.equals("paralelo gramo")){
                        double base=0, altura=0;
                        System.out.printf("ingresa la base  ");
                        base=t1.nextDouble();
                        System.out.printf("ingresa la altura");
                        altura=t1.nextDouble();
                        double area=base*altura;
                        System.out.printf("el area es  "+area);
                }else{
                        System.out.println("no existe esta figura si "+figura);
            }
        }
            
            
            
        }
    
    

