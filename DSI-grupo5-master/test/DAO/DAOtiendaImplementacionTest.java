package DAO;

import Logica.Tienda;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.*;
import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class DAOtiendaImplementacionTest {

    private DAOtiendaImplementacion dao;

    @Mock
    private Connection mockConnection;

    @Mock
    private Statement mockStatement;

    @Mock
    private PreparedStatement mockPreparedStatement;

    @Mock
    private ResultSet mockResultSet;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        dao = spy(new DAOtiendaImplementacion());

        doNothing().when(dao).conectar();
        doReturn(mockConnection).when(dao).getConexion();
    }

    @Test
    public void testRegistrar_TiendaValida() throws Exception {
        when(mockConnection.createStatement()).thenReturn(mockStatement);
        when(mockStatement.executeUpdate(anyString())).thenReturn(1);

        Tienda tienda = new Tienda();
        tienda.setNombre("Tienda Test");
        tienda.setLink("http://tienda.test");
        tienda.setIdAdministrador(1);

        boolean result = dao.Registrar(tienda);

        assertTrue(result);
        verify(mockStatement).executeUpdate(anyString());
    }

    @Test
    public void testRegistrar_TiendaFallida() throws Exception {
        when(mockConnection.createStatement()).thenReturn(mockStatement);
        when(mockStatement.executeUpdate(anyString())).thenReturn(0);

        Tienda tienda = new Tienda();
        tienda.setNombre("Tienda Test");
        tienda.setLink("http://tienda.test");
        tienda.setIdAdministrador(1);

        boolean result = dao.Registrar(tienda);

        assertFalse(result);
    }

    @Test
    public void testEliminar_TiendaValida() throws Exception {
        when(mockConnection.createStatement()).thenReturn(mockStatement);
        when(mockStatement.executeUpdate(anyString())).thenReturn(1);

        boolean result = dao.Eliminar(1);

        assertTrue(result);
        verify(mockStatement).executeUpdate(anyString());
    }

    @Test
    public void testEliminar_TiendaFallida() throws Exception {
        when(mockConnection.createStatement()).thenReturn(mockStatement);
        when(mockStatement.executeUpdate(anyString())).thenReturn(0);

        boolean result = dao.Eliminar(1);

        assertFalse(result);
    }

    @Test
    public void testSeleccionar_Tiendas() throws SQLException {
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);

        when(mockResultSet.next()).thenReturn(true).thenReturn(false); // Una fila encontrada
        when(mockResultSet.getInt("idTienda")).thenReturn(1);
        when(mockResultSet.getString("nombre")).thenReturn("Tienda Test");
        when(mockResultSet.getString("link")).thenReturn("http://tienda.test");

        ArrayList<Tienda> tiendas = dao.Seleccionar();

        assertTrue(tiendas.size() == 1);
        Tienda tienda = tiendas.get(0);
        assertTrue(tienda.getIdTienda() == 1);
        assertTrue(tienda.getNombre().equals("Tienda Test"));
        assertTrue(tienda.getLink().equals("http://tienda.test"));
    }

    @Test
    public void testSeleccionar_SinTiendas() throws SQLException {
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);

        when(mockResultSet.next()).thenReturn(false);

        ArrayList<Tienda> tiendas = dao.Seleccionar();

        assertTrue(tiendas.isEmpty());
    }
}