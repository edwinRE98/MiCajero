package micajero;

import java.util.Scanner;

public class Deposito extends Cajero {

    @Override
    public void Operacion() {
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("\n----------------------------");
        System.out.print("Ingrese el valor del deposito: ");
        deposito = entradaTeclado.nextDouble();

        setSaldo(getSaldo() + deposito);

        System.out.println("\nHas depositado $" + deposito + " a tu cuenta.");
        System.out.println("Tu nuevo saldo es de $" + getSaldo());
        System.out.println("----------------------------");
    }
}
