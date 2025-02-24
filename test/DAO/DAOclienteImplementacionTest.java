package DAO;

import Logica.Cliente;
import Logica.Usuario;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class DAOclienteImplementacionTest {

    private DAOclienteImplementacion dao;

    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockStatement;

    @Mock
    private ResultSet mockResultSet;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        dao = spy(new DAOclienteImplementacion());

        doNothing().when(dao).conectar();
        doReturn(mockConnection).when(dao).getConexion();
    }

    @Test
    public void testRegistrar_ClienteValido() throws Exception {
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS))).thenReturn(mockStatement);
        when(mockStatement.executeUpdate()).thenReturn(1); // Simula éxito al insertar en TBusuario
        when(mockStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getInt(1)).thenReturn(1); // Simula el ID generado

        PreparedStatement mockStatementCliente = mock(PreparedStatement.class);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStatementCliente);
        when(mockStatementCliente.executeUpdate()).thenReturn(1); // Simula éxito al insertar en TBcliente

        Cliente cliente = new Cliente();
        cliente.setUsuario("testUser");
        cliente.setPassword("testPass");
        cliente.setNombre("Test Cliente");
        cliente.setTelefono("123456789");
        cliente.setDistrito("Test Distrito");
        cliente.setCorreo("test@example.com");

        boolean result = dao.Registrar(cliente);

        assertTrue(result);
        verify(mockStatement).executeUpdate();
        verify(mockStatementCliente).executeUpdate();
    }

    @Test
    public void testModificar_ClienteValido() throws Exception {
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStatement);
        when(mockStatement.executeUpdate()).thenReturn(1); // Simula éxito al actualizar TBcliente y TBusuario

        Cliente cliente = new Cliente();
        cliente.setIdCliente(1);
        cliente.setNombre("Nuevo Nombre");
        cliente.setTelefono("987654321");
        cliente.setDistrito("Nuevo Distrito");
        cliente.setCorreo("new@example.com");
        cliente.setPassword("newPassword");

        boolean result = dao.Modificar(cliente);

        assertTrue(result);
        verify(mockStatement, times(2)).executeUpdate();
    }

    @Test
    public void testSeleccionar_ClienteValido() throws SQLException {
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStatement);
        when(mockStatement.executeQuery()).thenReturn(mockResultSet);

        when(mockResultSet.next()).thenReturn(true).thenReturn(false); // Una fila encontrada
        when(mockResultSet.getString("tipo")).thenReturn("Cliente");
        when(mockResultSet.getInt("idUsuario")).thenReturn(1);

        Usuario usuario = new Usuario();
        usuario.setUsuario("testUser");
        usuario.setPassword("testPass");

        int result = dao.Seleccionar(usuario);

        assertTrue(result == 1);
        verify(mockStatement).executeQuery();
    }

    @Test
    public void testSeleccionar_ClienteNoValido() throws SQLException {
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStatement);
        when(mockStatement.executeQuery()).thenReturn(mockResultSet);

        when(mockResultSet.next()).thenReturn(false);

        Usuario usuario = new Usuario();
        usuario.setUsuario("invalidUser");
        usuario.setPassword("invalidPass");

        int result = dao.Seleccionar(usuario);

        assertTrue(result == -1);
        verify(mockStatement).executeQuery();
    }
}