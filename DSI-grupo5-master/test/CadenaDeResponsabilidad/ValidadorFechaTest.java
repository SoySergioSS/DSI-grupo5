
package CadenaDeResponsabilidad;

import Interfaces.Validador;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidadorFechaTest {
    
    public ValidadorFechaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testFechaValida() {
        ValidadorFecha validador = new ValidadorFecha();
        JTextField campo = new JTextField("25/12/2023");

        try {
            boolean resultado = validador.validar(campo);
            assertTrue("El validador debería aceptar una fecha válida.", resultado);
        } catch (Exception e) {
            fail("No debería lanzar excepción para una fecha válida.");
        }
    }

    @Test
    public void testFechaInvalidaFormatoErroneo() {
        ValidadorFecha validador = new ValidadorFecha();
        JTextField campo = new JTextField("2023-12-25"); // Formato incorrecto

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para un formato de fecha inválido.");
        } catch (Exception e) {
            assertEquals("El campo no tiene el formato DD/MM/AAAA o no es una fecha válida.", e.getMessage());
        }
    }

    @Test
    public void testFechaInvalidaLogicamente() {
        ValidadorFecha validador = new ValidadorFecha();
        JTextField campo = new JTextField("32/12/2023"); // Día inválido

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para una fecha inválida lógicamente.");
        } catch (Exception e) {
            assertEquals("El campo no tiene el formato DD/MM/AAAA o no es una fecha válida.", e.getMessage());
        }
    }

    @Test
    public void testFechaVacia() {
        ValidadorFecha validador = new ValidadorFecha();
        JTextField campo = new JTextField("");

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para una fecha vacía.");
        } catch (Exception e) {
            assertEquals("El campo no tiene el formato DD/MM/AAAA o no es una fecha válida.", e.getMessage());
        }
    }

    @Test
    public void testPasarAlSiguienteValidador() {
        ValidadorFecha validador1 = new ValidadorFecha();
        Validador siguienteValidador = new Validador() {
            @Override
            public void setSiguiente(Validador siguiente) {
                // No se necesita implementación aquí
            }

            @Override
            public boolean validar(JTextField campo) {
                return campo.getText().length() >= 10; // Validación básica
            }
        };

        validador1.setSiguiente(siguienteValidador);
        JTextField campo = new JTextField("25/12/2023");

        try {
            boolean resultado = validador1.validar(campo);
            assertTrue("Debería pasar al siguiente validador sin problemas.", resultado);
        } catch (Exception e) {
            fail("No debería lanzar excepción cuando pasa al siguiente validador.");
        }
    }
}
