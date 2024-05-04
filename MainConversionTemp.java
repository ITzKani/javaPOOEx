import java.util.Scanner;
class MainConversionTemp{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);
        
        System.out.println("-----------------------------");
        System.out.print("Temperatura en grados C°: ");
        double c = fn.nextDouble();

        ConversionTemp cv = new ConversionTemp();

        cv.setC(c);

        System.out.println("-----------------------------");
        cv.conversion();
        cv.mostrarRes();
        System.out.println("-----------------------------");

        System.out.println(cv.toString());
    }
}