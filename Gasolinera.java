import java.text.DecimalFormat;

class Gasolinera{

    double gasLitros, gasGal;
    DecimalFormat fn = new DecimalFormat("#0.00");

    public Gasolinera(double gasGal){
        this.gasGal = gasGal;
    }

    public double getGasLitros() {
        return gasLitros;
    }


    public void setGasLitros(double gasLitros) {
        this.gasLitros = gasLitros;
    }


    public double getGasGal() {
        return gasGal;
    }


    public void setGasGal(double gasGal) {
        this.gasGal = gasGal;
    }


    public double conversionGaLit(){

        gasLitros = gasGal*3.785;

        return gasLitros;
    }

    public void mostrarRes(){

        System.out.println("-----------------------------");
        System.out.println("Galones de gasolina: " + fn.format(getGasGal()));
        System.out.println("-----------------------------");
        System.out.println("Litros de gasolina: " + fn.format(getGasLitros()));
        System.out.println("-----------------------------");
        
    }

    @Override
    public String toString() {
        return "Gasolinera [getGasLitros()=" + getGasLitros() + ", getGasGal()=" + getGasGal() + "]";
    }

}