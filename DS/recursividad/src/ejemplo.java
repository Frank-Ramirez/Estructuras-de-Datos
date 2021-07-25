
public class ejemplo {
    public static void main(String[] args) {
        int n=1;
        int resultado= Factorialrecursivo(n);
        System.out.println(resultado);
    }
    public static int Factorialrecursivo(int numero){
    int res;
        if (numero==5) {
            return 5;
        }else{
            res=numero+Factorialrecursivo(numero+1);
            return res;
        }
        
    }
}
