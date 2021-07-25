
public class FIGURAL {
    private double lado;
    public FIGURAL(double L){
    lado=L;
    }
    public void setlado(double L){
    lado=L;
    }
    public double getlado(){
    return lado;
    }
    public double area(){
    return lado*lado;
    }
    public double calcularperimetro(){
    return lado*4;
    }
    public double calcularvolumen(){
    return lado*lado*lado;
    }
}
