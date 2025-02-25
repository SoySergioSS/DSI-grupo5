
package CadenaDeResponsabilidad;

import Interfaces.Validador;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidadorLinkTest {
    
    public ValidadorLinkTest() {
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
    public void testLinkValido() {
        ValidadorLink validador = new ValidadorLink();
        JTextField campo = new JTextField("www.example.com");

        try {
            boolean resultado = validador.validar(campo);
            assertTrue("El validador debería aceptar un link válido.", resultado);
        } catch (Exception e) {
            fail("No debería lanzar excepción para un link válido.");
        }
    }

    @Test
    public void testLinkSinPunto() {
        ValidadorLink validador = new ValidadorLink();
        JTextField campo = new JTextField("wwwexamplecom");

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para un link sin un punto.");
        } catch (Exception e) {
            assertEquals("El campo no contiene un link válido.", e.getMessage());
        }
    }

    @Test
    public void testCampoVacio() {
        ValidadorLink validador = new ValidadorLink();
        JTextField campo = new JTextField("");

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para un campo vacío.");
        } catch (Exception e) {
            assertEquals("El campo no contiene un link válido.", e.getMessage());
        }
    }

    @Test
    public void testPasarAlSiguienteValidador() {
        ValidadorLink validador1 = new ValidadorLink();
        Validador siguienteValidador = new Validador() {
            @Override
            public void setSiguiente(Validador siguiente) {
            }

            @Override
            public boolean validar(JTextField campo) {
                return campo.getText().startsWith("http");
            }
        };

        validador1.setSiguiente(siguienteValidador);
        JTextField campo = new JTextField("http://example.com");

        try {
            boolean resultado = validador1.validar(campo);
            assertTrue("Debería pasar al siguiente validador sin problemas.", resultado);
        } catch (Exception e) {
            fail("No debería lanzar excepción cuando pasa al siguiente validador.");
        }
    }
    
}
