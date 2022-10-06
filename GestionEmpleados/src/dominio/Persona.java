
package dominio;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellidos;
    private int idPersona;
    
    //Nuestro contador de persona
    private static int contadorPersona;

    //Constructores:
    public Persona() {
        this.idPersona=++Persona.contadorPersona;
    }

    public Persona(String nombre, String apellidos) {
        this();//llama al constructor vacío para generar un id auto
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    //GET & SET:
    //no me interesan los setters del id ni del contador
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public final void Imrpimir(){
        System.out.println("Imprimiendo desde la clase padre...");
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre);
        sb.append(' ');
        sb.append(apellidos);
        sb.append(' ');
        sb.append(", id: ").append(idPersona);
        
        return sb.toString();
    }
    
    
}