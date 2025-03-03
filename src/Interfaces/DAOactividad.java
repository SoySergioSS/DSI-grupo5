package Interfaces;

import Logica.Actividad;
import java.sql.SQLException;
import java.util.ArrayList;

public interface DAOactividad {
    public boolean Registrar(Actividad actividad) throws Exception;
    public boolean Modificar(int idActividad) throws Exception;
    public boolean Eliminar(int idActividad) throws Exception;
    public ArrayList<Actividad> Seleccionar() throws Exception;
    public Actividad SeleccionarD(int idActividad) throws SQLException;
}
