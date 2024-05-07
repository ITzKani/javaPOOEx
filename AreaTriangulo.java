import java.text.DecimalFormat;

class AreaTriangulo{

    private double base, altura, resultado;
    DecimalFormat df1 = new DecimalFormat("#0.00");

    public AreaTriangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
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
    
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double sacarArea(){

        resultado = (base * altura)/2;

        return resultado;
    }

    public void mostrarRes(){

        System.out.println("El area de tu triangulo: " + df1.format(getResultado()));
    }

    @Override
    public String toString() {
        return "AreaTriangulo [getBase()=" + getBase() + ", getAltura()=" + getAltura() + ", getResultado()="
                + getResultado() + "]";
    }

}