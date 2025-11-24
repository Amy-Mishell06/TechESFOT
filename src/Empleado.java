public abstract class Empleado {
    private int codigo;
    private String nombre;
    private String cargo;

    public Empleado (int codigo, String nombre, String cargo ) throws DatoInvalidoException {
        setCargo(cargo);
        setCodigo(codigo);
        setNombre(nombre);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCargo(String cargo) throws DatoInvalidoException {
        if (cargo == null || cargo.isEmpty()){
            throw new DatoInvalidoException("El cargo no puede estar vacio ...");
        }
        this.cargo = cargo;
    }

    public void setCodigo(int codigo) throws DatoInvalidoException {
        if (codigo <= 0){
            throw new DatoInvalidoException("El codigo no puede estar vacio ...");
        }
        this.codigo = codigo;
    }

    public void setNombre(String nombre) throws DatoInvalidoException {
        if (nombre == null || nombre.isEmpty()) {
            throw new DatoInvalidoException("El nombre no puede estar vacio ...");
        }
        this.nombre = nombre;
    }

    public abstract String MostrarInfo();
    public abstract String calcularSueldo();
}
