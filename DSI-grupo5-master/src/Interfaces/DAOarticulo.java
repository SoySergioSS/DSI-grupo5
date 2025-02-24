package Interfaces;

import Logica.Articulo;
import java.sql.SQLException;
import java.util.ArrayList;

public interface DAOarticulo {
    public boolean Registrar(Articulo articulo) throws Exception;
    public boolean Modificar(int idArticulo) throws Exception;
    public boolean Eliminar(int idArticulo) throws Exception;
    public ArrayList<Articulo> Seleccionar() throws Exception;
    public Articulo SeleccionarD(int idArticulo) throws SQLException;
}
