
public class Lista {
    private nodo inicio; // Puntero
    private int tamanio;//tamaño
    //Constructor por defecto
    public void Lista(){
        inicio = null;
        tamanio = 0;
    }
    ///////////////lista vacia///////////
    public boolean esVacia(){
        return inicio == null;
    }
    //////////agregar valor3
    public void agregarAlFinal(int valor){
        nodo nuevo = new nodo();//////creacion de un nodo
        nuevo.setvalor(valor);//////////agregar valor al nodo
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
        // Caso contrario recorre la lista hasta llegar al ultimo nodo
        //y agrega el nuevo.
        } else{
            // Crea ua copia de la lista.
            nodo aux = inicio;
            // Recorre la lista hasta llegar al ultimo nodo.
            while(aux.getsiguiente() != null){
                aux = aux.getsiguiente();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setsiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
        tamanio++;
    }
    public int getTamanio(){
        return tamanio;
    }
    public void listar(){
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            nodo aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while(aux != null){
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + aux.getvalor() + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getsiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
    }
}

/**/