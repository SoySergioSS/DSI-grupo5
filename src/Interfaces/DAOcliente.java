package Interfaces;

import Logica.Cliente;
import Logica.Usuario;

public interface DAOcliente {
    public boolean Registrar(Cliente cliente) throws Exception;
    public boolean Modificar(Cliente cliente) throws Exception;
    public int Seleccionar(Usuario cliente) throws Exception;
    public Cliente SeleccionarD(int idCliente) throws Exception;

}
