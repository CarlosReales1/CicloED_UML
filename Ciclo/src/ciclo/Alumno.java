package ciclo;


import java.util.ArrayList;
/**
 * Clase que hereda los atributos de Persona y almacena aquellos datos
 * propios del Alumno del ciclo
 * @author Carlos Reales
 */

public class Alumno extends Persona {

    /**
     * @return the notaMedia
     */
    public float getNotaMedia() {
        return notaMedia;
    }

    /**
     * @param notaMedia the notaMedia to set
     */
    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    /**
     * @return the modulos
     */
    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    /**
     * @param modulos the modulos to set
     */
    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    private float notaMedia;

    private ArrayList<Modulo> modulos;
/**
 * Constructor del objeto
 */
   
    public Alumno() {
    }
    /**
     * Este metodo se utilizara para emitir el certificado,
     * si ha sueprado el ciclo, con las competencias adquiridas 
     */
    public void EmitirCertificado() {
    }
    /**
     * Calcualra la nota media del alumno 
     * @return Devuelve la nota media 
     */
    public float calcularNotaMedia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
/**
 * Agrega al alumno en los modulos correspondientes
 */
    public void matricularEnModulo() {
    }
}
