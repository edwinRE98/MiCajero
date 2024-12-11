package micajero;

import java.util.Scanner;

public abstract class Cajero {

    /*La variable "saldo" es privada, ya que aquí estará el dinero total del
    usuario, también es una variable estática, ya que solo queremos que invoque
    desde esta clase y no desde otros métodos, y que su valor se mantenga
    independientemente del número de objetos instanciados.*/
    private static double saldo = 1000000;
    
    //estas variables solo pueden ser llamadas desde el mismo paquete.
    protected double retiro, deposito;

    public void MostrarMenu() {
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("\n    Cajero automático\n");
        System.out.println("*1 Consulta saldo.");
        System.out.println("*2 Retirar.");
        System.out.println("*3 Depositar.");
        System.out.println("*4 Salir.");
        System.out.print("\nIngrese el número de la opción: ");
        int opc = entradaTeclado.nextInt();

        switch (opc) {
            case 1:
                Cajero miConsulta = new Consulta();
                miConsulta.Operacion();
                break;
            case 2:
                Cajero miRetiro = new Retiro();
                miRetiro.Operacion();
                break;
            case 3:
                Cajero miDeposito = new Deposito();
                miDeposito.Operacion();
                break;
            default:
                System.out.println("Error, la opción ingresada no existe");
        }
    }

    //El método "Operacion" cambia dependiendo de la instancia (polimorfismo)
    public abstract void Operacion();

    //consulta de saldo
    public static double getSaldo() {
        return saldo;
    }
    
    public static void setSaldo(double saldo){
        Cajero.saldo = saldo;
    }  
}
