import java.text.DecimalFormat;

class ConversorDolares{

    private double pesos, dolares;
    DecimalFormat f1 = new DecimalFormat("#0.00");

    public ConversorDolares(double pesos){
        this.pesos = pesos;
    }

    
    public double getPesos() {
        return pesos;
    }
    
    public void setPesos(double pesos) {
        this.pesos = pesos;
    }
    
    public double getDolares() {
        return dolares;
    }
    
    public void setDolares(double dolares) {
        this.dolares = dolares;
    }
    
    public double conversor(){

        dolares = pesos/16.97;

        return dolares;
    }

    public void mostrarRes(){

        System.out.println("Tu dinero en dolares: $" + f1.format(getDolares()));
    }

    @Override
    public String toString() {
        return "ConversorDolares [getPesos()=" + getPesos() + ", getDolares()=" + getDolares() + "]";
    }

   
    
}