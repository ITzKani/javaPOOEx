import java.util.Scanner;

class MainEstudiante{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        System.out.print("Ingresa el nombre: ");
        String name = fn.nextLine();

        System.out.print("Ingresa la edad: ");
        int age = fn.nextInt();

        System.out.print("Ingresa la puntuacion: ");
        int score = fn.nextInt();

        Estudiante e1 = new Estudiante();

        e1.setName(name);
        e1.setAge(age);
        e1.setScore(score);

        e1.mostrarRes();
        System.out.println(e1.toString());

    }
}