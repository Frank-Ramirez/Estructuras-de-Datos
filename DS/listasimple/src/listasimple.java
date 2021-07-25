public class listasimple {
    nodo primero;
    nodo ultimo;
    nodo abterior;
    int p=0;
    public listasimple(){
    primero=null;
    ultimo=null;
    }
    public void ingresarnodo(int dato){
    nodo nuevonodo=new nodo();
    nuevonodo.dato=dato;
        if (primero==null) {
            primero=nuevonodo;
            primero.siguiente=null;
            ultimo=primero;
        }else{
        ultimo.siguiente = nuevonodo;
        nuevonodo.siguiente=null;
        ultimo=nuevonodo;
        }
    }
    public void verlista(){
    nodo actual=new nodo();
    actual=primero;
    while(actual!=null){
        p=p+1;
        System.out.println(p+" "+actual.dato);
    actual=actual.siguiente;
    }
    }
    public void eliminarnodo(int dato){
    nodo actual=new nodo();
    nodo anterior=new nodo();
    actual = primero;
   anterior=ultimo;
    while(actual!=null){
    actual=primero;
        if (actual.dato==dato) {
                if (actual==primero) {
                    primero=primero.siguiente;
                    
                    break;
                }
        }
        if (anterior.dato==dato) {
            actual=actual.siguiente;
        anterior=actual;
            if (anterior==ultimo) {
                ultimo=anterior;
                break;
            }
        }
        
    }
    }
    public void buscarnodo(int dato){
    nodo actual=new nodo();
    actual=primero;
    while(actual!=null){
        if (actual.dato==dato) {
            System.out.println("numero encontrado");
        }
    actual=actual.siguiente;
    }
    }
    
}
