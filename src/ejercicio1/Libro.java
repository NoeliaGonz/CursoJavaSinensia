package ejercicio1;

public class Libro {
    private String nombre;
    private String anio;

    public Libro(String nombre, String anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    public void leyendo(){
        System.out.println("Se está leyendo el libro");
    }
}
