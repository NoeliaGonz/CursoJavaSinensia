package ejercicio1;
/**
 * Interfaz que define el contrato para los libros que determinan si son aptos para un público específico.
 * Las clases que implementan esta interfaz deben proporcionar una implementación del método {@link #esApto(Publico)}.
 *
 * @author [Tu Nombre]
 * @version 1.0
 */
public interface AptoLeer {
    boolean esApto(Publico publico);
}
