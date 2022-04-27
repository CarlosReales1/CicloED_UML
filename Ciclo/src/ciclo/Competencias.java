package ciclo;

/**
 * Almacenara las competencias necesarias de cada ciclo
 * @author Rea
 */
public class Competencias {
    /**
     * Cosntructor de la clase Competencias
     */
    public Competencias(){
        
    }
    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String descripcion;

    private String nombre;
}
