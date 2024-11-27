package ejercicio1;

public sealed abstract class Libro permits Ficcion, Romantica, Negra {
    private String nombreAutor;
    private String titulo;
    private int anio;
    private Editorial editorial;

    public Libro(String nombreAutor, String titulo, int anio, Editorial editorial) {
        this.nombreAutor = nombreAutor;
        this.titulo = titulo;
        this.anio = anio;
        this.editorial= editorial;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public abstract void mostrarInformacion();
}
