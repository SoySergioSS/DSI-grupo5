package Interfaces;

import Logica.ClienteActividad;
import java.util.List;

public interface DAOclienteactividad {
    public boolean Modificar(boolean asistencia, int idActividad, int idCliente) throws Exception;
    public boolean Buscar(int idActividad, int idCliente) throws Exception;
    public List<ClienteActividad> Seleccionar(int idActividad) throws Exception;
}
