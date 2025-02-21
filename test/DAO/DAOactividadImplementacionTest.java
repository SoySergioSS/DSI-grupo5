
package DAO;

import Logica.Actividad;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import java.sql.*;
import java.util.ArrayList;

public class DAOactividadImplementacionTest {

    private DAOactividadImplementacion daoActividad;
    private Connection mockConnection;
    private Statement mockStatement;
    private PreparedStatement mockPreparedStatement;
    private ResultSet mockResultSet;

    @Before
    public void setUp() throws Exception {
        daoActividad = spy(new DAOactividadImplementacion());
        mockConnection = mock(Connection.class);
        mockStatement = mock(Statement.class);
        mockPreparedStatement = mock(PreparedStatement.class);
        mockResultSet = mock(ResultSet.class);

        doReturn(mockConnection).when(daoActividad).conectar();
    }

    @Test
    public void testRegistrar() throws Exception {
        String sql = "INSERT INTO TBactividad (titulo, descripcion, distrito, fecha, aceptado, idCliente) VALUES ('Actividad 1', 'Descripcion 1', 'Distrito 1', '2024-11-25', 0, 1);";
        when(mockConnection.createStatement()).thenReturn(mockStatement);
        when(mockStatement.executeUpdate(sql)).thenReturn(1);

        Actividad actividad = new Actividad();
        actividad.setTitulo("Actividad 1");
        actividad.setDescripcion("Descripcion 1");
        actividad.setDistrito("Distrito 1");
        actividad.setFecha("2024-11-25");
        actividad.setIdCliente(1);

        boolean result = daoActividad.Registrar(actividad);

        assertTrue(result);
        verify(mockStatement).executeUpdate(sql);
    }

    @Test
    public void testModificar() throws Exception {
        String sql = "UPDATE TBactividad SET aceptado = 1 WHERE idActividad = 1;";
        when(mockConnection.createStatement()).thenReturn(mockStatement);
        when(mockStatement.executeUpdate(sql)).thenReturn(1);

        boolean result = daoActividad.Modificar(1);

        assertTrue(result);
        verify(mockStatement).executeUpdate(sql);
    }

    @Test
    public void testEliminar() throws Exception {
        String sql = "DELETE FROM TBactividad WHERE idActividad = 1;";
        when(mockConnection.createStatement()).thenReturn(mockStatement);
        when(mockStatement.executeUpdate(sql)).thenReturn(1);

        boolean result = daoActividad.Eliminar(1);

        assertTrue(result);
        verify(mockStatement).executeUpdate(sql);
    }

    @Test
    public void testSeleccionar() throws Exception {
        when(mockConnection.prepareStatement("SELECT * FROM TBactividad")).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);

        when(mockResultSet.next()).thenReturn(true, false); // Solo una fila
        when(mockResultSet.getInt("idActividad")).thenReturn(1);
        when(mockResultSet.getString("titulo")).thenReturn("Actividad 1");
        when(mockResultSet.getString("descripcion")).thenReturn("Descripcion 1");
        when(mockResultSet.getString("distrito")).thenReturn("Distrito 1");
        when(mockResultSet.getString("fecha")).thenReturn("2024-11-25");
        when(mockResultSet.getBoolean("aceptado")).thenReturn(false);
        when(mockResultSet.getInt("idCliente")).thenReturn(1);

        ArrayList<Actividad> actividades = daoActividad.Seleccionar();

        assertNotNull(actividades);
        assertEquals(1, actividades.size());

        Actividad actividad = actividades.get(0);
        assertEquals(1, actividad.getIdActividad());
        assertEquals("Actividad 1", actividad.getTitulo());
        assertEquals("Descripcion 1", actividad.getDescripcion());
        assertEquals("Distrito 1", actividad.getDistrito());
        assertEquals("2024-11-25", actividad.getFecha());
        assertFalse(actividad.isAceptado());
        assertEquals(1, actividad.getIdCliente());

        verify(mockPreparedStatement).executeQuery();
    }
}