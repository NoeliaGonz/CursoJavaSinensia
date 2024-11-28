package ejercicio1;
/**
 * Representa un libro romántico. Esta clase extiende de {@link Libro} e implementa la interfaz {@link AptoLeer}.
 * Un libro romántico tiene un nivel de emoción asociado.
 *
 * @author [Tu Nombre]
 * @version 1.0
 */
public final class Romantica extends Libro implements AptoLeer{
    private Emocion nivelEmocion;
    /**
     * Constructor que crea un libro romántico con los detalles proporcionados.
     *
     * @param nombreAutor El nombre del autor del libro.
     * @param titulo El título del libro.
     * @param anio El año de publicación del libro.
     * @param nivelEmocion El nivel de emoción de la novela romántica.
     * @param editorial La editorial que publicó el libro.
     */
    public Romantica(String nombreAutor, String titulo, int anio, Emocion nivelEmocion,Editorial editorial) {
        super(nombreAutor, titulo, anio,editorial);
        this.nivelEmocion=nivelEmocion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título del libro: " + getTitulo()
                + "Autor del libro: " + getNombreAutor()
                + "Anio publicación " + getAnio()
                + " esta novela romántica tiene un nivel de emoción: " + nivelEmocion
                + getEditorial());
    }
    /**
     * Verifica si el libro es apto para un público determinado.
     * Los libros románticos en este caso son aptos para jóvenes.
     *
     * @param publico El público al que se dirige el libro.
     * @return {@code true} si el libro es apto para jóvenes, {@code false} de lo contrario.
     */
    @Override
    public boolean esApto(Publico publico) {
        return Publico.JOVENES.equals(publico);
    }
}
