package grupo12tp2;
import java.time.LocalDate;
import java.util.Scanner;

   public class Reloj {
     //Atributo   
     private LocalDate fecha;

     //Constructor
     public Reloj() {
        this.fecha = LocalDate.now();
     }

     //Metodo get
     public LocalDate getFecha() {
        return fecha;
     }

     //Metodo set
     public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
     }

     //Sobre Escribimos je
     @Override
     public String toString() {
        return "Reloj{" +
                    "fecha= " + fecha +
                    '}';
     }

 }
    
    

