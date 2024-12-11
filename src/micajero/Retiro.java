package micajero;

import java.util.Scanner;

public class Retiro extends Cajero {

    @Override
    public void Operacion() {
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("\n----------------------------");
        System.out.print("Ingrese el valor a retirar: ");
        retiro = entradaTeclado.nextDouble();

        /*Si lo que está en el método "getSalario" es mayor o igual al
        retiro entonces se resta la variable "retiro" menos el valor del
        método "getSalario"*/
        
        if (getSaldo() > retiro) {
            setSaldo(getSaldo() - retiro);
            System.out.println("\nHas retirado $" + retiro + " de tu cuenta.");
            System.out.println("Tu nuevo saldo es de $" + getSaldo());
        } else{
            System.out.println("\nFondos insuficientes para realizar el retiro.");
        }
        System.out.println("----------------------------");
    }
}
