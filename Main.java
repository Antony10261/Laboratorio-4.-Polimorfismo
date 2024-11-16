/**
 * Clase principal que simula el funcionamiento del radio.
 */
public class Main {
    public static void main(String[] args) {
        // Seleccionar clase de vehículo
        IRadio radio = new RadioClaseA();

        // Encender y ajustar volumen
        radio.encender();
        radio.ajustarVolumen(5);

        // Interacción específica con RadioClaseA
        if (radio instanceof RadioClaseA) {
            RadioClaseA radioA = (RadioClaseA) radio;
            radioA.seleccionarLista("Rock Clásico");
            System.out.println(radioA.escucharCancion());
        }

        // Mostrar estado del radio
        System.out.println(radio.mostrarEstado());
    }
}