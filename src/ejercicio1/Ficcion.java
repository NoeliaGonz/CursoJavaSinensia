package ejercicio1;

public class Ficcion extends Libro{
   private String mundoFiccion;

    public Ficcion(String nombreAutor, String titulo, int anio, String mundoFiccion) {
        super(nombreAutor, titulo, anio);
        this.mundoFiccion=mundoFiccion;
    }

    @Override
    public void mostrarInformacion() {

    }
}
