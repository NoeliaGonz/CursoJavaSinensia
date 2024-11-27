package ejercicio1;
/**
 * Representa un libro de ficción. Esta clase extiende de {@link Libro} e implementa la interfaz {@link AptoLeer}.
 * Un libro de ficción tiene un mundo ficticio asociado.
 *
 * @author Noelia
 *
 */
public final class Ficcion extends Libro implements AptoLeer{
   private String mundoFiccion;
    /**
     * Constructor que crea un libro de ficción con los detalles proporcionados.
     *
     * @param nombreAutor El nombre del autor del libro.
     * @param titulo El título del libro.
     * @param anio El año de publicación del libro.
     * @param mundoFiccion El mundo ficticio en el que se desarrolla la historia.
     * @param editorial La editorial que publicó el libro.
     */
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
    /**
     * Verifica si el libro es apto para un público determinado.
     * En este caso, los libros de ficción son aptos para todos los públicos.
     *
     * @param publico El público al que se dirige el libro.
     * @return {@code true} si el libro es apto para el público, {@code false} de lo contrario.
     */
    @Override
    public boolean esApto(Publico publico) {
        return Publico.TODOS_PUBLICOS.equals(publico);
    }
}
