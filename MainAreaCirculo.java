import java.util.Scanner;

class MainAreaCirculo{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        double radio;

        do{

        System.out.print("Ingresa el valor del radio de tu circulo: ");
        radio = fn.nextDouble();

        AreaCirculo a1 = new AreaCirculo(radio);
        
        a1.sacarArea();
        a1.mostrarRes();
        System.out.println(a1.toString());

        }while(!(radio==0));
       }
}