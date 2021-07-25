
public class sueldo {
   double sueldos;
   double retardos;
   double faltas;
   int bono;
   public sueldo(double suel,double re, double fal){
   sueldos=suel;
       faltas=fal;
       retardos=re;
   }
   
   
    public void setsueldos(double suel,double re, double fal){
   sueldos=suel;
       faltas=fal;
       retardos=re;
       
 }
 
 public double getsueldos(){
     return sueldos;
  
 }
  
 
   public double calre(){
     
       if (retardos>0) {
          return sueldos*retardos*.02;
       }
   return retardos;
   }
   public double calcularsfaltas(){
      
       if (faltas>0) {
           
         return sueldos*faltas*.05;
       }
   return faltas;
   }
   
   public double bono1(){
       
       if (faltas==0 && retardos==0) {
          return sueldos*.10;
       }
       else{
           System.out.println("no hay bono");
       }
     
   return bono;
   }
}
