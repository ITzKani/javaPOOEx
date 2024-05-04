import java.text.DecimalFormat;

class ConversorDolares{

    private double pesos, dolares;
    DecimalFormat f1 = new DecimalFormat("#0.00");

    public double conversor(){

        dolares = pesos/16.97;

        return dolares;
    }

    public void mostrarRes(){

        System.out.println("Tu dinero en dolares: $" + f1.format(dolares));
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

    public DecimalFormat getF1() {
        return f1;
    }

    public void setF1(DecimalFormat f1) {
        this.f1 = f1;
    }

    @Override
    public String toString() {
        return "ConversorDolares [pesos=" + pesos + ", dolares=" + f1.format(dolares) + "]";
    }

    
}