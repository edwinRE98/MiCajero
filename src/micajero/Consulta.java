package micajero;

public class Consulta extends Cajero {

    @Override
    public void Operacion() {
        System.out.println("\n------------------------------");
        System.out.println("Tu salo actual es: $" + getSaldo());
        System.out.println("------------------------------");
    }
}
