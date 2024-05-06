class SecondsByDay{

    private int dias, dSegundos;

    public int convertirDiasASeg(){

        dSegundos = dias * 86400;

        return dSegundos;
    }

    public void mostrarRes(){

        System.out.println("Dias es Segundos: " + dSegundos);
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "SecondsByDay [dias=" + dias + ", dSegundos=" + dSegundos + "]";
    }
    
}