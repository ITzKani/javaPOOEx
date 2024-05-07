import java.text.DecimalFormat;

class CostoAuto{

    private double precio, impuesto, precioTotal;
    DecimalFormat df1 = new DecimalFormat("#0.00");

    public CostoAuto(double precio){
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public double getImpuesto() {
        return impuesto;
    }


    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }


    public double getPrecioTotal() {
        return precioTotal;
    }


    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }


    public double generarPrecio(){

        impuesto = (precio*0.06) + (precio*0.12);

        precioTotal =  impuesto + precio;

        return precioTotal;
    }

    public void MostrarRes(){

        System.out.println("-----------------------------");
        System.out.println("Precio sin impuestos: $" + df1.format(getPrecio()));
        System.out.println("-----------------------------");
        System.out.println("Impuestos: $" + df1.format(getImpuesto()));
        System.out.println("-----------------------------");
        System.out.println("Precio total (con impuestos): $" + df1.format(getPrecioTotal()));
        System.out.println("-----------------------------");
    }

    @Override
    public String toString() {
        return "CostoAuto [getPrecio()=" + getPrecio() + ", getImpuesto()=" + getImpuesto() + ", getPrecioTotal()="
                + getPrecioTotal() + "]";
    }

    
}