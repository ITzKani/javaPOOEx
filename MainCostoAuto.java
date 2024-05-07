import java.util.Scanner;

class MainCostoAuto{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        System.out.print("Valor del vehiculo: $");
        double precio = fn.nextDouble();

        CostoAuto c1 = new CostoAuto(precio);

        c1.generarPrecio();
        c1.MostrarRes();
        System.out.println(c1.toString());
    }

}