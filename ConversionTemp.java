import java.text.DecimalFormat;

class ConversionTemp{

    private double c, f;
    DecimalFormat f1 = new DecimalFormat("#0.00");

    public double conversion(){

        f = (c * 9/5) + 32;

        return f;
    }

    public void mostrarRes(){
        

        System.out.println("La temperatura en grados F° es: " + f1.format(f));

    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    @Override
    public String toString() {
        return "ConversionTemp [c=" + c + ", f=" + f1.format(f) + "]";
    }

    
}