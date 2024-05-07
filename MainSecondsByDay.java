import java.util.Scanner;

class MainSecondsByDay{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de dias: ");
        int dias = fn.nextInt();

        SecondsByDay s1 = new SecondsByDay(dias);
        
        s1.convertirDiasASeg();
        s1.mostrarRes();

        System.out.println(s1.toString());

    }
}