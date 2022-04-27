/**
 * Clase heredada de Persona que añade a los atributos de esta los propios de 
 * un profesor
 * @author Carlos Reales
 */
public class Profesor extends Persona {

    /**
     * @return the NRP
     */
    public String getNRP() {
        return NRP;
    }

    /**
     * @param NRP the NRP to set
     */
    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    /**
     * @return the docencia
     */
    public Modulo[] getDocencia() {
        return docencia;
    }

    /**
     * @param docencia the docencia to set
     */
    public void setDocencia(Modulo[] docencia) {
        this.docencia = docencia;
    }

    private String NRP;

    private Modulo[] docencia;
    /**
     * Constructor de la clase profesor
     */
    public Profesor() {
    }
    /**
     * Modulos que imparte cada profesor
     */
    public void impartirModulo() {
    }
    /**
     * Alamcena el Numero de Registro Personal de cada profesor
     */
    public void setNRP() {
    }
}
