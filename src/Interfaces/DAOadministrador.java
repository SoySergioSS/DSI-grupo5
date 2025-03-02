package Interfaces;

import Logica.Administrador;
import Logica.Usuario;
import java.sql.SQLException;

public interface DAOadministrador {
    public int Seleccionar(Usuario administrador) throws Exception;
    public Administrador SeleccionarD(int idAdmin) throws SQLException;
}
