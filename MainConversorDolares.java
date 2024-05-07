import java.util.Scanner;
class MainConversorDolares{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.print("Ingresa tu dinero en pesos: $");
        double pesos = fn.nextDouble();

        ConversorDolares cd = new ConversorDolares(pesos);

        System.out.println("-----------------------------");
        cd.conversor();
        cd.mostrarRes();
        System.out.println("-----------------------------");

        System.out.println(cd.toString());
    }
}