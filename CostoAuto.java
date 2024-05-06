import java.text.DecimalFormat;

class CostoAuto{

    private double precio, impuesto, precioTotal;
    DecimalFormat df1 = new DecimalFormat("#0.00");

    public double generarPrecio(){

        impuesto = (precio*0.06) + (precio*0.12);

        precioTotal =  impuesto + precio;

        return precioTotal;
    }

    public void MostrarRes(){

        System.out.println("-----------------------------");
        System.out.println("Precio sin impuestos: $" + df1.format(precio));
        System.out.println("-----------------------------");
        System.out.println("Impuestos: $" + df1.format(impuesto));
        System.out.println("-----------------------------");
        System.out.println("Precio total (con impuestos): $" + df1.format(precioTotal));
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "CostoAuto [precio=" + precio + ", impuesto=" + impuesto + ", precioTotal=" + precioTotal + "]";
    }

    
}