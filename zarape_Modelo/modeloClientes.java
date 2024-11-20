
public class modeloClientes {
    public class Cliente {
    private int idCliente;
    private int idPersona;
    private boolean activo;
    private int idUsuario;
    
    
    public Cliente(int idCliente, int idPersona, boolean activo, int idUsuario) {
        this.idCliente = idCliente;
        this.idPersona = idPersona;
        this.activo = activo;
        this.idUsuario = idUsuario;
    }
    
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}

}