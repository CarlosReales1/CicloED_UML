
import java.util.ArrayList;
/**
 * Clase que almacenará lod datos básicos de cada ciclo formativo
 * @author Carlos Reales
 */
public class Ciclo  {
    /**
     * Cosntructor de la clase Ciclo
     */
    public Ciclo(){
        
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
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the anyo
     */
    public int getAnyo() {
        return anyo;
    }

    /**
     * @param anyo the anyo to set
     */
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    /**
     * @return the competencia
     */
    public ArrayList<Competencias> getCompetencia() {
        return competencia;
    }

    /**
     * @param competencia the competencia to set
     */
    public void setCompetencia(ArrayList<Competencias> competencia) {
        this.competencia = competencia;
    }

    private String nombre;

    private String descripcion;

    private int horas;

    private int anyo;

    private ArrayList<Competencias> competencia;
}
