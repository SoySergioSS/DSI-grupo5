package Interfaces;

import Logica.ArticuloFavorito;
import java.util.List;

public interface DAOarticulofavorito {
    public boolean Modificar(boolean favorito, int idArticulo, int idCliente) throws Exception;
    public boolean Buscar(int idArticulo, int idCliente) throws Exception;
}
