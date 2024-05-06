import java.util.Scanner;
class MainGasolinera{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        System.out.print("Registra la gasolina en galones: ");
        double gasGal = fn.nextDouble();

        Gasolinera g1 = new Gasolinera();

        g1.gasGal = gasGal;
        g1.conversionGaLit();
        g1.mostrarRes();

        System.out.println(g1.toString());
    }
}