package Interfaces;

public interface DAOclientearticulo {
    public boolean Modificar(boolean favorito, int idArticulo, int idCliente) throws Exception;
    public boolean Buscar(int idArticulo, int idCliente) throws Exception;
}
