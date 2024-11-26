package ejercicio1;

public class Negra extends Libro{
    private boolean esMisterio;

    public Negra(String nombreAutor, String titulo, int anio, boolean esMisterio) {
        super(nombreAutor, titulo, anio);
        this.esMisterio= esMisterio;
    }

    @Override
    public void mostrarInformacion() {

    }
}
