
package grupo12tp2;


public class Grupo12Tp2 {

   
    public static void main(String[] args) {
       RelojFit reloj1 = new RelojFit(); //Creamos un objeto de tipo RelojFit
       Persona persona1 = new Persona("Emanuel", reloj1); //Creamos una persona asociada con el reloj fit 
       
       
       //Usamos los metodos de RelojFit
        RelojFit relojFit = (RelojFit) persona1.getReloj();
        relojFit.cuentaPasos(5, 10);
        System.out.println("--------------------------------------------------------");
        System.out.println("Pasos contados: " + relojFit.getPasos());
        System.out.println("Frecuencia aleatoria: " + relojFit.frecuenciaAleatoria());
        System.out.println(persona1); 
        System.out.println("--------------------------------------------------------");
        
       
    }
    
}
