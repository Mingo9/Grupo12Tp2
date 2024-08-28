package grupo12tp2;
import java.util.Random; //Para generar numeros aleatorios

public class RelojFit extends Reloj {
    //Atributo
    private int pasos;

    //Constructor
    public RelojFit() {
        super(); //llamado al constructor Padre
        this.pasos = 0;
    }
    
    //Metodo getter
    public int getPasos() {
        return pasos;
    }
    
    //Metodo Setter
    public void setPasos(int pasos) {
        this.pasos = pasos;
    }
    
    
    
    
    public void cuentaPasos(int x, int y) {
        //Incrementamos los pasos basado en las coordenadas x, y
        this.pasos += Math.abs(x) + Math.abs(y);
    }
    
    
    public int frecuenciaAleatoria() {
        Random random = new Random();
        return random.nextInt(200); // Frecuencia aleatoria entre 0 y 199
  
    }

    @Override
    public String toString() {
        return "RelojFit{" +
                "fecha= " + getFecha() +
                ", pasos= " + pasos +
                '}';
    }
    
    
}//cierre clase.