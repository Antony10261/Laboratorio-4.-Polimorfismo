import java.util.ArrayList;
import java.util.List;

/**
 * Clase base abstracta que implementa las funcionalidades generales del radio.
 */
public abstract class Radio implements IRadio {
    protected boolean encendido = false;
    protected int volumen = 10;

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Radio encendido.");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Radio apagado.");
    }

    @Override
    public void ajustarVolumen(int cambio) {
        if (!encendido) {
            System.out.println("El radio está apagado.");
            return;
        }
        volumen = Math.max(0, Math.min(volumen + cambio, 100));
        System.out.println("Volumen ajustado a: " + volumen);
    }

    @Override
    public String mostrarEstado() {
        return encendido ? "Radio encendido. Volumen: " + volumen : "Radio apagado.";
    }
}