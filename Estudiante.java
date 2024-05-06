class Estudiante{

    private String name;
    private int age, score;


    public String getName() {

        System.out.println("Nombre: " + name);
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {

        if(age<0){

            System.out.println("Error: Edad invalida.");
        }

        else{

            System.out.println("Edad: " + age);
        }

        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getScore() {

        if(score<0){

            System.out.println("Error: Puntuacion invalida.");
        }

        else{

            System.out.println("Puntuacion: " + score);
        }
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public void mostrarRes(){

        getName();
        getAge();
        getScore();

    }
    @Override
    public String toString() {
        return "Estudiante [name=" + name + ", age=" + age + ", score=" + score + "]";
    }
    

    
}