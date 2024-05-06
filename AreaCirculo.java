import java.text.DecimalFormat;

class AreaCirculo{

    private double radio, resultado;
    DecimalFormat df1 = new DecimalFormat("#0.000");

    public double sacarArea(){

        resultado = Math.PI * Math.pow(radio, 2);

        return resultado;
    }

    public void mostrarRes(){

        System.out.println("El area de tu circulo es: " + df1.format(resultado));
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "AreaCirculo [radio=" + radio + ", resultado=" + resultado + "]";
    }

}