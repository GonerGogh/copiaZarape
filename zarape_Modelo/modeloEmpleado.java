package zarape_Modelo; // Paquete principal del proyecto

// Importar los modelos relacionados dentro del mismo paquete
import zarape_Modelo.modeloPersona;
import zarape_Modelo.modeloUsuario;
/**
 *
 * @author flore
 */

public class modeloEmpleado {
    private int idEmpleado;
    private modeloPersona persona; 
    private modeloUsuario usuario; 
    private int idSucursal;
    private int activo;

    // Constructor vacío
    public modeloEmpleado() {
    }

    // Constructor con parámetros
    public modeloEmpleado(int idEmpleado, modeloPersona persona, modeloUsuario usuario, int idSucursal, int activo) {
        this.idEmpleado = idEmpleado;
        this.persona = persona;
        this.usuario = usuario;
        this.idSucursal = idSucursal;
        this.activo = activo;
    }

    // Getters y setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public modeloPersona getPersona() {
        return persona;
    }

    public void setPersona(modeloPersona persona) {
        this.persona = persona;
    }

    public modeloUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(modeloUsuario usuario) {
        this.usuario = usuario;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }
}
