import java.util.Scanner;

class MainAreaCirculo{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        System.out.print("Ingresa el valor del radio de tu circulo: ");
        double radio = fn.nextDouble();

        AreaCirculo a1 = new AreaCirculo();

        a1.setRadio(radio);
        a1.sacarArea();
        a1.mostrarRes();
        System.out.println(a1.toString());
       }
}