public class EmpleadoTCompleto extends Empleado{
    private double sueldoBase;
    private double bono;


    public EmpleadoTCompleto(int codigo, String nombre, String cargo, double sueldoBase, double bono) throws DatoInvalidoException {
        super(codigo, nombre, cargo);
        setSueldoBase(sueldoBase);
        setBono(bono);
    }

    public void setSueldoBase(double sueldoBase) throws DatoInvalidoException {
        if (sueldoBase <= 0){
            throw new DatoInvalidoException("El sueldo debe ser mayor a 0");
        }
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setBono(double bono) throws DatoInvalidoException {
        if (bono <= 0){
            throw new DatoInvalidoException("El bono debe ser mayor a 0");
        }
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    @Override
    public String calcularSueldo() {
        double sueldoTotal = this.sueldoBase + this.bono;
        System.out.println("Sueldo: " + sueldoTotal);
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
