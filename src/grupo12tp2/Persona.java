
package grupo12tp2;


public class Persona {
    //Atributos
    protected String nombre;
    private Reloj reloj;
    
    
    //Constructor
    public Persona(String nombre, Reloj reloj) {
        this.nombre = nombre;
        this.reloj = reloj;
    }
    
    
    //Metodos getter
    public String getNombre() {
        return nombre;
    }

    public Reloj getReloj() {
        return reloj;
    }
    
    
    //Metodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }
    
    @Override
    public String toString() {
        return "Persona{" +
                "nombre=" + nombre +
                ", reloj=" + reloj +
                '}';
    }
    
    
}
