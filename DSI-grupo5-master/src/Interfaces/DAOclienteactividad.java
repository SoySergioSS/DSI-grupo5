package Interfaces;

public interface DAOclienteactividad {
    public boolean Modificar(boolean asistencia, int idActividad, int idCliente) throws Exception;
    public boolean Buscar(int idActividad, int idCliente) throws Exception;
}
