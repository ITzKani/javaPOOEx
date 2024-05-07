import java.util.Scanner;

class MainAreaTriangulo{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        double base, altura;

        do{

        System.out.print("Ingresa el valor de la base de tu triangulo: ");
        base = fn.nextDouble();

        System.out.print("Ingresa el valor de la altura de tu triangulo: ");
        altura = fn.nextDouble();

        AreaTriangulo a1 = new AreaTriangulo(base, altura);

        a1.sacarArea();
        a1.mostrarRes();
        System.out.println(a1.toString());

        }while(!(base==0 && altura==0));
       }
}