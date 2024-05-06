import java.util.Scanner;

class MainAreaTriangulo{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        System.out.print("Ingresa el valor de la base de tu triangulo: ");
        double base = fn.nextDouble();

        System.out.print("Ingresa el valor de la altura de tu triangulo: ");
        double altura = fn.nextDouble();

        AreaTriangulo a1 = new AreaTriangulo();

        a1.setBase(base);
        a1.setAltura(altura);
        a1.sacarArea();
        a1.mostrarRes();
        System.out.println(a1.toString());
       }
}