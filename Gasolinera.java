import java.text.DecimalFormat;

class Gasolinera{

    double gasLitros, gasGal;
    DecimalFormat fn = new DecimalFormat("#0.00");

    public double conversionGaLit(){

        gasLitros = gasGal*3.785;

        return gasLitros;
    }

    public void mostrarRes(){

        System.out.println("-----------------------------");
        System.out.println("Galones de gasolina: " + fn.format(gasGal));
        System.out.println("-----------------------------");
        System.out.println("Litros de gasolina: " + fn.format(gasLitros));
        System.out.println("-----------------------------");
        
    }

    @Override
    public String toString() {
        return "Gasolinera [gasLitros=" + gasLitros + ", gasGal=" + gasGal + "]";
    }

}