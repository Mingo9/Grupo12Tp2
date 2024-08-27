
package grupo12tp2;

import java.time.LocalDate;
import java.util.Scanner;


public class Reloj {
    
    private String dia;
    private String hora;
    private String modelo;
    private long numSerie;

    public Reloj(String dia, String hora, String modelo, long numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }
    
    public void incrementarDia (long dias){
        LocalDate fechaHoy = LocalDate.now();
        System.out.println("ingrese dias a incrementar ");
        Scanner leer = new Scanner(System.in);
        dias = leer.nextInt();
        System.out.println("La fecha con el incremento es: "+fechaHoy.plusDays(numSerie));
    }
    
    
    
}
