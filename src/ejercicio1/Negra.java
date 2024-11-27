package ejercicio1;

public final class Negra extends Libro implements AptoLeer{
    private boolean esMisterio;

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

    @Override
    public boolean esApto(Publico publico) {
        return Publico.ADULTOS.equals(publico);
    }
}
