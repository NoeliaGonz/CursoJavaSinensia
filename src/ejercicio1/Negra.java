package ejercicio1;
/**
 * Representa un libro de misterio (género negro). Esta clase extiende de {@link Libro} e implementa la interfaz {@link AptoLeer}.
 * Un libro negro tiene una propiedad que indica si es una novela misteriosa.
 *
 * @author Noelia
 *
 */
public final class Negra extends Libro implements AptoLeer{
    private boolean esMisterio;
    /**
     * Constructor que crea un libro de misterio con los detalles proporcionados.
     *
     * @param nombreAutor El nombre del autor del libro.
     * @param titulo El título del libro.
     * @param anio El año de publicación del libro.
     * @param esMisterio Si el libro es una novela de misterio.
     * @param editorial La editorial que publicó el libro.
     */
    public Negra(String nombreAutor, String titulo, int anio, boolean esMisterio,Editorial editorial) {
        super(nombreAutor, titulo, anio,editorial);
        this.esMisterio= esMisterio;
    }
    public void confirmarMisterio(){
        if (!esMisterio){
            System.out.println( getTitulo() + "Esta novela NO es misteriosa");
        }else{
            System.out.println(getTitulo() + "Es MUY de misterio");
        }

    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Título del libro: " + getTitulo()
                + "Autor del libro: " + getNombreAutor()
                + "Anio publicación " + getAnio()
                + getEditorial());
    }
    /**
     * Verifica si el libro es apto para un público determinado.
     * Los libros de misterio en este caso son aptos solo para adultos.
     *
     * @param publico El público al que se dirige el libro.
     * @return {@code true} si el libro es apto para adultos, {@code false} de lo contrario.
     */
    @Override
    public boolean esApto(Publico publico) {
        return Publico.ADULTOS.equals(publico);
    }
}
