/*crear una clase hija que se llame empleado, va a heredar nombre y apell. 
crear otro campo numSS, méotod ImprimirEmpleado()*/
package dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Empleado extends Persona {
    private String numSS;
    private Double sueldo;

    public Empleado(String numSS) {
        this.numSS = numSS;
    }

    public Empleado(String numSS, Double sueldo,String nombre, String apellidos) {
        super(nombre, apellidos);
        this.numSS = numSS;
        this.sueldo= sueldo;
    }

    public String getNumSS() {
        return numSS;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{"+ super.toString() + "numSS=" + numSS + ", sueldo=" + sueldo + '}';
    }
    
    
    
    

}
