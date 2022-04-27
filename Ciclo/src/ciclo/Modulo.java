package ciclo;


import java.util.ArrayList;
/**
 * Clase que alamcenara la información básica de cada modulo formativo
 * ademas de las calificacion de su tarea y su examen. Tambien tendrá una lista de 
 * profesores que lo imparten y alumnos matriculados
 * @author Carlos Reales
 */
public class Modulo {
    /**
     * Constructor de la clase Modulo
     */
    public Modulo(){
        
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
     * @return the contenidos
     */
    public String getContenidos() {
        return contenidos;
    }

    /**
     * @param contenidos the contenidos to set
     */
    public void setContenidos(String contenidos) {
        this.contenidos = contenidos;
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
     * @return the pruebaExamen
     */
    public Examen getPruebaExamen() {
        return pruebaExamen;
    }

    /**
     * @param pruebaExamen the pruebaExamen to set
     */
    public void setPruebaExamen(Examen pruebaExamen) {
        this.pruebaExamen = pruebaExamen;
    }

    /**
     * @return the pruebaTarea
     */
    public Tarea getPruebaTarea() {
        return pruebaTarea;
    }

    /**
     * @param pruebaTarea the pruebaTarea to set
     */
    public void setPruebaTarea(Tarea pruebaTarea) {
        this.pruebaTarea = pruebaTarea;
    }

    /**
     * @return the claustro
     */
    public ArrayList<Profesor> getClaustro() {
        return claustro;
    }

    /**
     * @param claustro the claustro to set
     */
    public void setClaustro(ArrayList<Profesor> claustro) {
        this.claustro = claustro;
    }

    /**
     * @return the alumnado
     */
    public ArrayList<Alumno> getAlumnado() {
        return alumnado;
    }

    /**
     * @param alumnado the alumnado to set
     */
    public void setAlumnado(ArrayList<Alumno> alumnado) {
        this.alumnado = alumnado;
    }

    private String nombre;

    private String contenidos;

    private int horas;

    private Examen pruebaExamen;

    private Tarea pruebaTarea;

    private ArrayList<Profesor> claustro;

    private ArrayList<Alumno> alumnado;
    /**
     * Se utulizará para añadir alumnos al modulo
     */
    public void matricularAlumno() {
    }
    /**
     * Se utulizará para añadir profesores al modulo
     */
    public void contratarProfesor() {
    }
    /**
     * Se evaluara a cada alumno segun su tarea y examen
     */
    public void evaluarAlumno() {
    }
}
