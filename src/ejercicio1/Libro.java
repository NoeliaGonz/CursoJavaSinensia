package ejercicio1;

public abstract class Libro {
    private String nombreAutor;
    private String titulo;
    private int anio;
    private Editorial editorial;

    public Libro(String nombreAutor, String titulo, int anio) {
        this.nombreAutor = nombreAutor;
        this.titulo = titulo;
        this.anio = anio;
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

    public abstract void mostrarInformacion();
}
