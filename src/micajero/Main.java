/*
    Esta es una aplicación de consola muy básica que simula las tres aplicaciones básicas
    bancarias, consultar, retirar y depositar, todo esto a través de un simple sistema de
    opciones numeradas, las cuales deberá ingresar el usuario y
    así ejecutar el caso seleccionado.
 */
package micajero;

/**
 *
 * @author Edwin Ropain Espinosa
 */
public class Main {

    public static void main(String[] args) {
        Cajero miCajero = new Consulta();
        
        miCajero.MostrarMenu();
    }
    
}
