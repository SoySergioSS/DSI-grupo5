package DAO;

import Logica.Usuario;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class DAOadministradorImplementacionTest {

    private DAOadministradorImplementacion dao;

    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockStatement;

    @Mock
    private ResultSet mockResultSet;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        dao = Mockito.spy(new DAOadministradorImplementacion());

        doNothing().when(dao).conectar();
        doReturn(mockConnection).when(dao).getConexion();
    }

    @Test
    public void testSeleccionar_AdministradorValido() throws Exception {
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStatement);
        when(mockStatement.executeQuery()).thenReturn(mockResultSet);

        when(mockResultSet.next()).thenReturn(true).thenReturn(false);
        when(mockResultSet.getString("tipo")).thenReturn("Administrador");
        when(mockResultSet.getInt("idUsuario")).thenReturn(1);

        Usuario administrador = new Usuario();
        administrador.setUsuario("admin");
        administrador.setPassword("1234");

        int result = dao.Seleccionar(administrador);

        assertEquals(1, result);

        verify(mockConnection).prepareStatement("SELECT * FROM TBusuario WHERE usuario = ? AND password = ?;");
        verify(mockStatement).setString(1, "admin");
        verify(mockStatement).setString(2, "1234");
        verify(mockStatement).executeQuery();
        verify(mockResultSet, times(1)).next();
        verify(mockResultSet).close();
        verify(mockStatement).close();
    }

    @Test
    public void testSeleccionar_UsuarioNoAdministrador() throws Exception {
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStatement);
        when(mockStatement.executeQuery()).thenReturn(mockResultSet);

        when(mockResultSet.next()).thenReturn(true).thenReturn(false);
        when(mockResultSet.getString("tipo")).thenReturn("Usuario");

        Usuario administrador = new Usuario();
        administrador.setUsuario("user");
        administrador.setPassword("abcd");

        int result = dao.Seleccionar(administrador);

        assertEquals(-1, result);

        verify(mockConnection).prepareStatement("SELECT * FROM TBusuario WHERE usuario = ? AND password = ?;");
        verify(mockStatement).setString(1, "user");
        verify(mockStatement).setString(2, "abcd");
        verify(mockStatement).executeQuery();
        verify(mockResultSet, times(1)).next();
        verify(mockResultSet).close();
        verify(mockStatement).close();
    }
}
