import java.util.Scanner;
public class maquina_expendedora {
    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
        String [][] productos = {{"PEPSI","COCA","AGUA"},
            {"MANZANITA","LECHE_CHOCOLATE","LECHE-VAINILLA"},
            {"CAFE","VIVE100","MOSTER"}};

        int precios [][]={{10,15,8},
            {10,10,8},
            {8,10,20}};
        
    String [][] codigos = {{"P-234","C-678","A-564"},
            {"MZ-45","M-347","LV-45"},
            {"CF-34","V-100","LC-580"}};
        int R=0;
    int opc=0;
    String opc1="";
    int m1=0,m2=0,m3=0,m4=0,cambio=0;
     do{
        System.out.println("*****mostrando productos**********");
            for (int j= 0; j <productos.length; j++) {
                for (int i = 0; i < productos[j].length; i++) {
                    System.out.printf(codigos[i][j]+ "   "+productos[i][j]+"     "
                            +precios[i][j]+"\t");
                }
                System.out.println("");
            }
            
     
            System.out.println(" 1.¿Que golosina quieres? ");
            opc1=t.nextLine();
            System.out.println("su producto es "+opc1);
            
                        System.out.println("cuantas monedas de 10");
                        m1=t.nextInt();
                        System.out.println("cuantas monedas de 5");
                        m2=t.nextInt();
                        System.out.println("cuantas monedas de 2");
                        m3=t.nextInt();
                        System.out.println("cuantas monedas de 1");
                        m4=t.nextInt();
                        m1=m1*10; m2=m2*5; m3=m3*2; m4=m4*1;
                        cambio=m1+m2+m3+m4;
                 
            
            if(opc1.equals("P-234")){
                System.out.println("usted elijio pepsi");
                       if (cambio>10) {
                            cambio=cambio-10;
                            System.out.println("su cambio es de "+cambio);
                        }else{
                            System.out.println("su pago esta exacto\n tome su producto");
                        }

                    }
            
            if(opc1.equals("C-678")){
                System.out.println("usted elijio coca");
   
                        if (cambio>15) {
                            cambio=cambio-15;
                            System.out.println("su cambio es de "+cambio);
                        }else{
                            System.out.println("su pago esta exacto\n tome su producto");
                        }
                    }
            
              if(opc1.equals("A-564")){
                System.out.println("usted elijio agua");
    
                        if (cambio>8) {
                            cambio=cambio-8;
                            System.out.println("su cambio es de "+cambio);
                        }else{
                            System.out.println("su pago esta exacto\n tome su producto");
                        }
                    }
             
                 if(opc1.equals("MZ-45")){
                System.out.println("usted elijio mazanita");

                   
                        if (cambio>10) {
                            cambio=cambio-10;
                            System.out.println("su cambio es de "+cambio);
                        }else{
                            System.out.println("su pago esta exacto\n tome su producto");
                        }
                    }

     if(opc1.equals("M-347")){
                System.out.println("usted elijio leche-chocolate");
     
                        
                        if (cambio>10) {
                            cambio=cambio-10;
                            System.out.println("su cambio es de "+cambio);
                        }else{
                            System.out.println("su pago esta exacto\n tome su producto");
                        }
                    }

     if(opc1.equals("LV-45")){
                System.out.println("usted elijio leche-vainilla");
    
                      
                        if (cambio>8) {
                            cambio=cambio-8;
                            System.out.println("su cambio es de "+cambio);
                        }else{
                            System.out.println("su pago esta exacto\n tome su producto");
                        }
                    }

               if(opc1.equals("CF-34")){
                System.out.println("usted elijio cafe");
  
                        if (cambio>8) {
                            cambio=cambio-8;
                            System.out.println("su cambio es de "+cambio);
                        }else{
                            System.out.println("su pago esta exacto\n tome su producto");
                        }
                    }
     if(opc1.equals("V-100")){
                System.out.println("usted elijio vive100");

                        if (cambio>10) {
                            cambio=cambio-10;
                            System.out.println("su cambio es de "+cambio);
                        }else{
                            System.out.println("su pago esta exacto\n tome su producto");
                        }
                    }

     if(opc1.equals("LC-580")){
                System.out.println("usted elijio leche-vainilla");
     
                        if (cambio>20) {
                            cambio=cambio-20;
                            System.out.println("su cambio es de "+cambio);
                        }else{
                            System.out.println("su pago esta exacto\n tome su producto");
                        }
                    }
            
     
       System.out.println("QUIERE COMPRAR ALGO MAS 1.SI 2.NO");
                    R=t.nextInt();
                }while(R==1);
            
            
            }
           

            }

   

    

