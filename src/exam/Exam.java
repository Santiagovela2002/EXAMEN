
package exam;

/**
 * @author Santiago Vela
 */
public class Exam {


    private String nombre;
    private String descripcion;
    private String habilidades;
    private Integer experiencia;
    private String nivel;

    public Exam(String nombre, String descripcion, String habilidades, Integer experiencia, String nivel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.habilidades = habilidades;
        this.experiencia = experiencia;
        this.nivel = nivel;
    }
    
    public int sueldo(){
        int salario = 0;
        if(nivel.equalsIgnoreCase("jr")){
            salario = 1000 * (1 + (experiencia / 10));
        } else if(nivel.equalsIgnoreCase("sr")){
            salario = 1500 * (1 + (experiencia / 10));
        } else if(nivel.equalsIgnoreCase("Leader")){
            salario = 2000 * (1 + (experiencia / 10));
        } else if(nivel.equalsIgnoreCase("boss")){
            salario = 2500 * (1 + (experiencia / 10));
        }
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Exam{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", habilidades=" + habilidades + ", experiencia=" + experiencia + ", nivel=" + nivel + '}';
    }
}
