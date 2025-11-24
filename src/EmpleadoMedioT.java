public class EmpleadoMedioT extends Empleado {
    private int horasTrabajadas;
    private double pHora;

    public EmpleadoMedioT(int codigo, String nombre, String cargo, int horasTrabajadas, double pHora ) throws DatoInvalidoException {
        super(codigo, nombre, cargo);
        setHorasTrabajadas(horasTrabajadas);
        setpHora(pHora);
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) throws DatoInvalidoException {
        if (horasTrabajadas <= 0){
            throw new DatoInvalidoException("Las horas no pueden ser menor a 0");
        }
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getpHora() {
        return pHora;
    }

    public void setpHora(double pHora) throws DatoInvalidoException {
        if (pHora <= 0){
            throw new DatoInvalidoException("El bono no pueden ser menor a 0");
        }
        this.pHora = pHora;
    }


    @Override
    public String calcularSueldo() {
        double sueldoTotal = this.horasTrabajadas + this.pHora;
        return sueldoTotal + "";
    }

    @Override
    public String MostrarInfo() {
        return "-------- LISTADO DE EMPLEADO MEDIO TIEMPO REGISTRADOS ---------"
                + "\nCodigo: " + getCodigo()
                + "\nNombre: " + getNombre()
                + "\nCargo: " + getCargo()
                + "\nSueldo: " + calcularSueldo();
    }
}
