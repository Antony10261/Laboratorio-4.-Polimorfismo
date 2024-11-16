/**
 * Interfaz para las funcionalidades del modo de reproducción.
 */
public interface IRadioReproduccion {
    /**
     * Selecciona una lista de reproducción.
     * @param lista Nombre de la lista de reproducción.
     */
    void seleccionarLista(String lista);

    /**
     * Cambia a la siguiente canción en la lista.
     */
    void siguienteCancion();

    /**
     * Cambia a la canción anterior en la lista.
     */
    void anteriorCancion();

    /**
     * Muestra información de la canción actual.
     * @return Información de la canción.
     */
    String escucharCancion();
}