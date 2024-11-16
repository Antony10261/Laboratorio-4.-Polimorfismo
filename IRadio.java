/**
 * Interfaz básica para las funcionalidades generales del radio.
 */
public interface IRadio {
    /**
     * Enciende el radio.
     */
    void encender();

    /**
     * Apaga el radio.
     */
    void apagar();

    /**
     * Ajusta el volumen del radio.
     * @param cambio Cambio en el volumen (positivo o negativo).
     */
    void ajustarVolumen(int cambio);

    /**
     * Muestra el estado actual del radio.
     * @return Cadena con la información del estado.
     */
    String mostrarEstado();
}