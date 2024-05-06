import java.text.DecimalFormat;

class AreaTriangulo{

    private double base, altura, resultado;
    DecimalFormat df1 = new DecimalFormat("#0.00");

    public double sacarArea(){

        resultado = (base * altura)/2;

        return resultado;
    }

    public void mostrarRes(){

        System.out.println("El area de tu triangulo: " + df1.format(resultado));
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "AreaTriangulo [base=" + base + ", altura=" + altura + ", resultado=" + resultado + "]";
    }


}