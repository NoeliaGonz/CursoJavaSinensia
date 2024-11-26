package ejercicio1;

public class Romantica extends Libro{
    private String nivelEmocion;

    public Romantica(String nombreAutor, String titulo, int anio, String nivelEmocion) {
        super(nombreAutor, titulo, anio);
        this.nivelEmocion=nivelEmocion;
    }

    @Override
    public void mostrarInformacion() {

    }
}
