package Interfaces;

public interface DAOactividadfavorito {
    public boolean Modificar(boolean favorito, int idActividad, int idCliente) throws Exception;
    public boolean Buscar(int idActividad, int idCliente) throws Exception;
}
