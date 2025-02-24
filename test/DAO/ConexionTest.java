package DAO;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Connection;
import java.sql.SQLException;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class ConexionTest {

    private Conexion conexionTest;

    @Mock
    private Connection mockConnection;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        conexionTest = new Conexion() {
            @Override
            public Connection getConexion() {
                return mockConnection;
            }
        };
    }

    @Test
    public void testConectar() throws Exception {
        conexionTest.conectar();

        verify(mockConnection, times(1)).getClass();
    }

    @Test
    public void testCerrar_ConexionAbierta() throws SQLException {
        when(mockConnection.isClosed()).thenReturn(false);

        conexionTest.cerrar();

        verify(mockConnection, times(1)).close();
    }

    @Test
    public void testCerrar_ConexionCerrada() throws SQLException {
        when(mockConnection.isClosed()).thenReturn(true);

        conexionTest.cerrar();

        verify(mockConnection, times(0)).close();
    }

    @Test
    public void testGetConexion() {
        Connection connection = conexionTest.getConexion();

        assertEquals(mockConnection, connection);
    }
}