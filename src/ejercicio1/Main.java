package ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Editorial ed1= new Editorial("Planeta", "Espania");
        Editorial ed2 = new Editorial("Penguin", "Estados Unidos");

        Romantica libro1= new Romantica("Maria Dueñas ", "El tiempo entre costuras ", 2012, " Alto", ed1);
        Ficcion libro2 = new Ficcion("Brandon Sanderson ", "Mistborn ", 2006, "Fantástica-apocaliptica ", ed2);
        Negra libro3 = new Negra("Juan Gomez Jurado ","Todo muere ", 2024, true, ed1);


        ArrayList<Libro> lLibros= new ArrayList<>();
        lLibros.add(libro1);
        lLibros.add(libro2);
        lLibros.add(libro3);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
        libro3.confirmarMisterio();

        System.out.println("................................................................................................................................................");
       /*
       //Primera forma que pensé para probar mi interfaz
        System.out.println("¿Son estos libros aptos para diferentes publicos?");
        System.out.println("Es apto para todas las edades el libro " + libro2.getTitulo() + ":" + libro2.esApto(Publico.valueOf(String.valueOf(Publico.TODOS_PUBLICOS))));
        System.out.println("¿Es apto para niños? El libro  " + libro1.getTitulo()+ " :" + libro1.esApto(Publico.valueOf(String.valueOf(Publico.JOVENES))));
        System.out.println("¿Es apto para jóvenes? El libro: " + libro3.getTitulo() + " :" + libro3.esApto(Publico.valueOf(String.valueOf(Publico.NINIOS))));
        */
        System.out.println("¿Son aptos todos los libros para ese grupo de edad?");
        for (Libro l: lLibros){
            if(l instanceof AptoLeer){
                AptoLeer aptoLeer= (AptoLeer) l;
                System.out.println("Libro: " + l.getTitulo() + aptoLeer.esApto(Publico.NINIOS));
            }
        }
        System.out.println("................................................................................................................................................");


        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
