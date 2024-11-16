public class modeloEstado {
    private int idEstado;
    private String nombre;

    // Constructor
    public modeloEstado(int idEstado, String nombre) {
        this.idEstado = idEstado;
        this.nombre = nombre;
    }

    // Getters y setters
    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
