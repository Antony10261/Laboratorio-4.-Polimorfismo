/**
 * Interfaz para las funcionalidades del modo teléfono.
 */
public interface IRadioTelefono {
    /**
     * Conecta un teléfono al radio.
     */
    void conectarTelefono();

    /**
     * Desconecta el teléfono del radio.
     */
    void desconectarTelefono();

    /**
     * Muestra los contactos disponibles.
     * @return Lista de contactos.
     */
    String mostrarContactos();

    /**
     * Realiza una llamada a un contacto.
     * @param contacto Nombre del contacto.
     */
    void llamarContacto(String contacto);

    /**
     * Finaliza la llamada actual.
     */
    void finalizarLlamada();
}