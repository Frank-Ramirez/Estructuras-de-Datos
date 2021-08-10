import java.util.Scanner;
public class maquina {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
        int d=0,m1=0,cambio=0;
        int continuar=0,p=0;
        int n1=4,n2=4,n3=4,n4=4,n5=4,n6=4,n7=4,n8=4;
        int stock1[]=new int[n1];  int stock2[]=new int[n2];  int stock3[]=new int [n3];
        int stock4[]=new int[n4];  int stock5[]=new int[n5];  int stock6[]=new int[n6];
        int stock7[]=new int[n7];  int stock8[]=new int [n8];
        int pila1[]=new int [4];       int pila2[]=new int[4];
              pila1[0]=15;                  pila2[0]=5;
              pila1[1]=10;                  pila2[1]=7;
              pila1[2]=10;                  pila2[2]=2;
              pila1[3]=9;                   pila2[3]=13;
                do{
                System.out.println(" ---------------------------------------------------------- ");
                System.out.println("| 1 refresco $15  2 leche $10   3 galletas $10 4 dulces $9 |");
                System.out.println("| 5 agua $5       6 chetos $7   7 chicles $2   8 pan $13   |");
                System.out.println(" ---------------------------------------------------------- ");
                System.out.println("seleccione la fila donde este el producto que quiere  ");
                d=t1.nextInt();
                    if (d==1) {
                        System.out.println("que producto quiere");
                        p=t1.nextInt();
                        if (p==1) {
                            n1=n1-1;
                            cambio=0;
                            do{
                        System.out.println("ingrese una moneda");
                                m1=t1.nextInt();
                                    if (m1==10 || m1==5 || m1==2 || m1==1) {
                                        cambio=cambio+m1;
                                }else{System.out.println("esa moneda no existe");
                                    m1--;}
                                    if (cambio>=pila1[0]) {
                                    break;
                                }
                            }while(cambio<=pila1[0]);
                            if ( n1==0) {
                                n1=0;
                                System.out.println("ya n hay refrescos");
                                System.out.println("tome su dinero "+cambio);
                            }
                            if (cambio>pila1[0] && n1>0) {
                            cambio=cambio-pila1[0];
                            System.out.println("su cambio es de "+cambio);
                        }
                          if (n1==1) {
                              System.out.println("tiene el ultimo producto");
                        }else{stock1[n1]=n1;}
                        }
                        if (p==2) {
                            n2=n2-1;
                            cambio=0;
                            do{
                        System.out.println("ingrese una moneda");
                                m1=t1.nextInt();
                                    if (m1==10 || m1==5 || m1==2 || m1==1) {
                                        cambio=cambio+m1;
                                }else{System.out.println("esa moneda no existe");
                                    m1--;}
                                    if (cambio>=pila1[1]) {
                                    break;
                                }
                            }while(cambio<=pila1[1]);
                             if (n2==0) {
                            n2=0;
                            System.out.println("ya no hay leche");
                            System.out.println("tome su dinero"+cambio);
                        }
                        if (cambio>pila1[1]) {
                            cambio=cambio-pila1[1];
                            System.out.println("su cambio es de "+cambio);
                        }
                            if (n2==1) {
                                System.out.println("tiene la ultima leche");
                            }else{stock2[n2]=n2;}
                    }
                        if (p==3) {
                            cambio=0;
                            n3=n3-1;
                            do{
                        System.out.println("ingrese una moneda");
                                m1=t1.nextInt();
                                    if (m1==10 || m1==5 || m1==2 || m1==1) {
                                        cambio=cambio+m1;
                                }else{System.out.println("esa moneda no existe");
                                    m1--;}
                                    if (cambio>=pila1[2]) {
                                    break;
                                }
                            }while(cambio<=pila1[2]);
                            if (n3==0) {
                            n3=0;
                            System.out.println("ya no hay gelltas");
                            System.out.println("tome su dinero "+cambio);
                        }
                        if (cambio>pila1[2]) {
                            cambio=cambio-pila1[2];
                            System.out.println("su cambio es de "+cambio);
                        }
                            if (n3==1) {
                                System.out.println("tiene las ltimas galletas");
                            } else{stock3[n3]=n3;}
                    }
                        if (p==4) {
                            cambio=0;
                            n4=n4-1;
                            do{
                        System.out.println("ingrese una moneda");
                                m1=t1.nextInt();
                                    if (m1==10 || m1==5 || m1==2 || m1==1) {
                                        cambio=cambio+m1;
                                }else{System.out.println("esa moneda no existe");
                                    m1--;}
                                    if (cambio>=pila1[3]) {
                                    break;
                                }
                            }while(cambio<=pila1[3]);
                            if (n4==0) {
                            n4=0;
                            System.out.println("ya no hay mas dulces");
                            System.out.println("tome su dinero "+cambio);
                        }
                        if (cambio>pila1[3]) {
                            cambio=cambio-pila1[3];
                            System.out.println("su cambio es de "+cambio);
                        }
                            if (n4==1) {
                                System.out.println("tiene los ultimos dulces");
                            }
                            else{stock4[n4]=n4;}
                    }
                    }
                    if (d==2) {
                        System.out.println("que producto quiere");
                        p=t1.nextInt();
                        if (p==5) {
                            cambio=0;
                            n5=n5-1;
                            do{
                        System.out.println("ingrese una moneda");
                                m1=t1.nextInt();
                                    if (m1==10 || m1==5 || m1==2 || m1==1) {
                                        cambio=cambio+m1;
                                }else{System.out.println("esa moneda no existe");
                                    m1--;}
                                    if (cambio>=pila2[0]) {
                                    break;
                                }
                            }while(cambio<=pila2[0]);
                            if (n5==0) {
                            n5=0;
                                System.out.println("ya no hay agua");
                            System.out.println("tome su dinero "+cambio);
                        }
                        if (cambio>pila2[0]) {
                            cambio=cambio-pila2[0];
                            System.out.println("su cambio es de "+cambio);
                        }
                            if (n5==1) {
                                System.out.println("tiene la ultima agua");
                            }
                            else{stock5[n5]=n5;}
                    }
                    if (p==6) {
                        cambio=0;
                        n6=n6-1;
                        do{
                        System.out.println("ingrese una moneda");
                                m1=t1.nextInt();
                                    if (m1==10 || m1==5 || m1==2 || m1==1) {
                                        cambio=cambio+m1;
                                }else{System.out.println("esa moneda no existe");
                                    m1--;}
                                    if (cambio>=pila2[1]) {
                                    break;
                                }
                            }while(cambio<=pila2[1]);
                        if (n6==0) {
                            n6=0;
                                System.out.println("ya no hay chetos");
                            System.out.println("tome su dinero "+cambio);
                        }
                        if (cambio>pila2[1]) {
                            cambio=cambio-pila2[1];
                            System.out.println("su cambio es de "+cambio);
                        }
                        if (n6==1) {
                            System.out.println("tiene los ultimos chetos");
                        }else{stock6[n6]=n6;}
                    }
                    if (p==7) {
                        cambio=0;
                        n7=n7-1;
                        do{
                        System.out.println("ingrese una moneda");
                                m1=t1.nextInt();
                                    if (m1==10 || m1==5 || m1==2 || m1==1) {
                                        cambio=cambio+m1;
                                }else{System.out.println("esa moneda no existe");
                                    m1--;}
                                    if (cambio>=pila2[2]) {
                                    break;
                                }
                            }while(cambio<=pila2[2]);
                        if (n7==0) {
                            n7=0;
                                System.out.println("ya no hay mas chicles");
                            System.out.println("tome su dinero "+cambio);
                        }
                        if (cambio>pila2[2]) {
                            cambio=cambio-pila2[2];
                            System.out.println("su cambio es de "+cambio);
                        }
                        if (n7==1) {
                            System.out.println("tiene los ultimos chicles");
                        }else{stock7[n7]=n7;}
                    }
                    if (p==8) {
                        cambio=0;
                        n8=n8-1;
                        do{
                        System.out.println("ingrese una moneda");
                                m1=t1.nextInt();
                                    if (m1==10 || m1==5 || m1==2 || m1==1) {
                                        cambio=cambio+m1;
                                }else{System.out.println("esa moneda no existe");
                                    m1--;}
                                    if (cambio>=pila2[3]) {
                                    break;
                                }
                            }while(cambio<=pila2[3]);
                        if (n8==0) {
                            n8=0;
                                System.out.println("ya no hay mas pan");
                            System.out.println("tome su dinero "+cambio);
  /*//////*/                      }
                        if (cambio>pila2[3]) {
                            cambio=cambio-pila2[3];
                            System.out.println("su cambio es de "+cambio);
                        }
                        if (n8==1) {
                            System.out.println("tiene el ultimo pan");
                        }else{stock8[n8]=n8;}
                    }
                    }
                        System.out.println("quieres comprar algo mas");
                    continuar=t1.nextInt();
                }while(continuar==1);
    }
}