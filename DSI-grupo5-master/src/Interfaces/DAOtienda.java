package Interfaces;

import Logica.Tienda;
import java.util.ArrayList;

public interface DAOtienda {
    public boolean Registrar(Tienda tienda);
    public boolean Modificar(Tienda tienda);
    public boolean Eliminar(int idTienda);
    public ArrayList<Tienda> Seleccionar();
}
