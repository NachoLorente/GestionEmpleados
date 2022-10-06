/*
 */
package dominio;

public class Gerente extends Empleado{
    private String departamento;
    private String estudios;

    public Gerente(String departamento, String estudios, String numSS) {
        super(numSS);
        this.departamento = departamento;
        this.estudios = estudios;
    }

    public Gerente(String departamento, String estudios, String numSS, Double sueldo, String nombre, String apellidos) {
        super(numSS, sueldo, nombre, apellidos);
        this.departamento = departamento;
        this.estudios = estudios;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    @Override
    public String toString() {
        return "Gerente{" + super.toString()+ "departamento=" + departamento + ", estudios=" + estudios + '}';
    }
    
        
}
