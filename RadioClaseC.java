// Clase RadioClaseC extendiendo de Radio
public class RadioClaseC extends Radio implements IRadioReproduccion, IRadioTelefono, IRadioProductividad {

    // Constructor de RadioClaseC
    public RadioClaseC() {
        super();
    }

    // Métodos de IRadioReproduccion
    @Override
    public void seleccionarLista(String lista) {
        if (!isEncendido()) {
            System.out.println("El radio está apagado. Enciéndelo primero.");
            return;
        }
        System.out.println("Lista de reproducción seleccionada: " + lista);
    }

    @Override
    public void siguienteCancion() {
        if (!isEncendido()) {
            System.out.println("El radio está apagado. Enciéndelo primero.");
            return;
        }
        System.out.println("Reproduciendo la siguiente canción.");
    }

    @Override
    public void anteriorCancion() {
        if (!isEncendido()) {
            System.out.println("El radio está apagado. Enciéndelo primero.");
            return;
        }
        System.out.println("Reproduciendo la canción anterior.");
    }

    @Override
    public void escucharCancion() {
        if (!isEncendido()) {
            System.out.println("El radio está apagado. Enciéndelo primero.");
            return;
        }
        System.out.println("Reproduciendo la canción actual: Nombre: 'Imagine', Autor: 'John Lennon', Género: 'Rock', Duración: 3:45.");
    }

    // Métodos de IRadioTelefono
    @Override
    public void conectarTelefono() {
        if (!isEncendido()) {
            System.out.println("El radio está apagado. Enciéndelo primero.");
            return;
        }
        System.out.println("Teléfono conectado.");
    }

    @Override
    public void desconectarTelefono() {
        if (!isEncendido()) {
            System.out.println("El radio está apagado. Enciéndelo primero.");
            return;
        }
        System.out.println("Teléfono desconectado.");
    }

    @Override
    public void mostrarContactos() {
        if (!isEncendido()) {
            System.out.println("El radio está apagado. Enciéndelo primero.");
            return;
        }
        System.out.println("Contactos: 1. John Doe, 2. Jane Smith, 3. Alice Johnson.");
    }

    @Override
    public void llamarContacto(String contacto) {
        if (!isEncendido()) {
            System.out.println("El radio está apagado. Enciéndelo primero.");
            return;
        }
        System.out.println("Llamando al contacto: " + contacto);
    }

    @Override
    public void finalizarLlamada() {
        if (!isEncendido()) {
            System.out.println("El radio está apagado. Enciéndelo primero.");
            return;
        }
        System.out.println("Llamada finalizada.");
    }

    // Cambiar a llamada en espera (específico de RadioClaseC)
    public void cambiarALlamadaEnEspera() {
        if (!isEncendido()) {
            System.out.println("El radio está apagado. Enciéndelo primero.");
            return;
        }
        System.out.println("La llamada actual se ha puesto en espera.");
    }

    // Métodos de IRadioProductividad
    @Override
    public void accionProductividad() {
        if (!isEncendido()) {
            System.out.println("El radio está apagado. Enciéndelo primero.");
            return;
        }
        System.out.println("Mostrando el pronóstico del tiempo: Soleado, 25°C.");
    }

    // Método para mostrar el estado completo del radio
    @Override
    public String mostrarEstado() {
        String estado = isEncendido() ? "Encendido" : "Apagado";
        return String.format("Estado del RadioClaseC: %s, Volumen: %d", estado, getVolumen());
    }
}