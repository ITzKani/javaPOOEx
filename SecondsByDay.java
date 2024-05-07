class SecondsByDay{

    private int dias, dSegundos;

    public SecondsByDay(int dias){
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }
    
    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public int getdSegundos() {
        return dSegundos;
    }

    public void setdSegundos(int dSegundos) {
        this.dSegundos = dSegundos;
    }

    public int convertirDiasASeg(){

        dSegundos = dias * 86400;

        return dSegundos;
    }

    public void mostrarRes(){

        System.out.println("Dias es Segundos: " + getdSegundos());
    }

    @Override
    public String toString() {
        return "SecondsByDay [getDias()=" + getDias() + ", getdSegundos()=" + getdSegundos() + "]";
    }
    
}