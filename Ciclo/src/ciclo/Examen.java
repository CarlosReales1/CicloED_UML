package ciclo;


import java.util.ArrayList;

/**
 * Almacenará las preguntas de cada examen, ademas de elegirlas y rodenarlas para cada examen
 * @author Carlos Reales
 */
public class Examen {
    /**
     * Constructor de la clase Examen
     */
    
    public Examen(){
        
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
     * @return the pregunta
     */
    public ArrayList<Preguntas> getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(ArrayList<Preguntas> pregunta) {
        this.pregunta = pregunta;
    }

    private String descripcion;

    private ArrayList<Preguntas> pregunta;

    /**
     * Se realizara la calificacion total del examen segun las preguntas acertadas
     */
    public void calificar() {
    }
    /**
     * Se elegiran las 30 preguntas de las que constará cada examen de manera 
     * aleatoria.
     */
    public void elegirPreguntas() {
    }
    /**
     * Se ordenaran las preguntas aleatoriamente
     */
    public void ordenarPreguntas() {
    }
}
