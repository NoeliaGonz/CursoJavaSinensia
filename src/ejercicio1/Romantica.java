package ejercicio1;

public final class Romantica extends Libro implements AptoLeer{
    private String nivelEmocion;

    public Romantica(String nombreAutor, String titulo, int anio, String nivelEmocion,Editorial editorial) {
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

    @Override
    public boolean esApto(Publico publico) {
        return Publico.JOVENES.equals(publico);
    }
}
