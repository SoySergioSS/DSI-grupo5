
package CadenaDeResponsabilidad;

import Interfaces.Validador;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidadorVacioTest {
    
    public ValidadorVacioTest() {
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
    public void testCampoNoVacio() {
        ValidadorVacio validador = new ValidadorVacio();
        JTextField campo = new JTextField("Texto válido");

        try {
            boolean resultado = validador.validar(campo);
            assertTrue("El validador debería aceptar un campo no vacío.", resultado);
        } catch (Exception e) {
            fail("No debería lanzar excepción para un campo no vacío.");
        }
    }

    @Test
    public void testCampoVacio() {
        ValidadorVacio validador = new ValidadorVacio();
        JTextField campo = new JTextField("   "); // Espacios en blanco

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para un campo vacío.");
        } catch (Exception e) {
            assertEquals("El campo está vacío.", e.getMessage());
        }
    }

    @Test
    public void testCampoCompletamenteVacio() {
        ValidadorVacio validador = new ValidadorVacio();
        JTextField campo = new JTextField(""); // Sin texto

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para un campo completamente vacío.");
        } catch (Exception e) {
            assertEquals("El campo está vacío.", e.getMessage());
        }
    }

    @Test
    public void testPasarAlSiguienteValidador() {
        ValidadorVacio validador1 = new ValidadorVacio();
        Validador siguienteValidador = new Validador() {
            @Override
            public void setSiguiente(Validador siguiente) {
            }

            @Override
            public boolean validar(JTextField campo) {
                return campo.getText().length() > 3;
            }
        };

        validador1.setSiguiente(siguienteValidador);
        JTextField campo = new JTextField("Texto");

        try {
            boolean resultado = validador1.validar(campo);
            assertTrue("Debería pasar al siguiente validador sin problemas.", resultado);
        } catch (Exception e) {
            fail("No debería lanzar excepción cuando pasa al siguiente validador.");
        }
    }
}
