/**
 * Clase que almacenará el enunciado y las posibles respuestas de cada pregunta
 * además de cual de dichas respuesta es la correcta
 * @author Carlos Reales
 */
public class Preguntas {
    /**
     * Constructor de la clase Preguntas
     */
    public Preguntas(){
        
    }
    /**
     * @return the enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     * @return the respuestas
     */
    public String[] getRespuestas() {
        return respuestas;
    }

    /**
     * @param respuestas the respuestas to set
     */
    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    /**
     * @return the respuestaValida
     */
    public int getRespuestaValida() {
        return respuestaValida;
    }

    /**
     * @param respuestaValida the respuestaValida to set
     */
    public void setRespuestaValida(int respuestaValida) {
        this.respuestaValida = respuestaValida;
    }

    private String enunciado;

    private String[] respuestas;

    private int respuestaValida;
}
