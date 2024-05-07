import java.text.DecimalFormat;

class ConversionTemp{

    private double c, f;
    DecimalFormat f1 = new DecimalFormat("#0.0");

    public ConversionTemp(double c){
        this.c = c;
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
    
    public double conversion(){

        f = (c * 9/5) + 32;

        return f;
    }

    public void mostrarRes(){
        

        System.out.println("La temperatura en grados F° es: " + f1.format(getF()));

    }

    @Override
    public String toString() {
        return "ConversionTemp [getC()=" + getC() + ", getF()=" + getF() + "]";
    }
    
}