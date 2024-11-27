package ejercicio1;

public final class Ficcion extends Libro implements AptoLeer{
   private String mundoFiccion;

    public Ficcion(String nombreAutor, String titulo, int anio, String mundoFiccion,Editorial editorial) {
        super(nombreAutor, titulo, anio,editorial);
        this.mundoFiccion=mundoFiccion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título del libro: " + getTitulo()
                            + "Autor del libro: " + getNombreAutor()
                            + "Anio publicación " + getAnio()
                            + " El mundo en el que está es: " + mundoFiccion
                            + getEditorial())
                            ;
    }

    @Override
    public boolean esApto(Publico publico) {
        return Publico.TODOS_PUBLICOS.equals(publico);
    }
}
