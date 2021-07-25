
import java.util.Scanner;

public class ListaDoble {

    protected nododoble inicio, fin;

    public ListaDoble() {
        inicio = fin = null;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void llenar_inicio(int dat) {
        if (!vacia()) {
            fin = new nododoble(dat, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new nododoble(dat);
        }
    }

    public void llenar_final(int dat) {
        if (!vacia()) {
            inicio = new nododoble(dat, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new nododoble(dat);
        }
    }

    public void Mostrar_inicio() {
        if (!vacia()) {
            String datos = "<=>";
            nododoble aux = fin;
            while (aux != null) {
                System.out.printf(datos + "[" + aux.dato + "]");
                aux = aux.anterior;
            }

        }
    }

    public void Mostrar_fin() {
        if (!vacia()) {
            String datos = "<=>";
            nododoble aux = inicio;
            while (aux != null) {
                System.out.printf(datos + "[" + aux.dato + "]");
                aux = aux.siguiente;
            }

        }
    }

    public int eliminar_fin() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return elemento;
    }

    public int eliminar_inicio() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }

    public void dele_fin() {
        fin.siguiente = fin.anterior;
    }

    public static void main(String[] args) {
        Scanner t1 = new Scanner(System.in);
        ListaDoble eje = new ListaDoble();
        int opc = 0, r1 = 0, r2 = 0, r3 = 0;
        do {
            System.out.println("1.-agregar inicio  "
                    + "2.-agregar fin "
                    + "3.-mostrar inicio  "
                    + "4.-mostrar fin"
                    + "5.- Eliminar Inicio"
                    + "6.-Eliminar fin");
            opc = t1.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("ingrese un numero al inicio");
                    r1 = t1.nextInt();
                    eje.llenar_inicio(r1);
                    break;
                case 2:
                    System.out.println("ingrese un numero al inicio");
                    r2 = t1.nextInt();
                    eje.llenar_final(r2);
                    break;
                case 3:
                    eje.Mostrar_inicio();
                    break;
                case 4:
                    eje.Mostrar_fin();
                    break;
                case 5:
                    eje.dele_fin();
                    break;
            }
        } while (opc != 5);
    }
}
