
package CadenaDeResponsabilidad;

import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidadorCorreoTest {
    
    public ValidadorCorreoTest() {
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
    public void testValidarCorreoConArroba() {
        ValidadorCorreo validador = new ValidadorCorreo();
        JTextField campo = new JTextField("usuario@dominio.com");

        try {
            boolean resultado = validador.validar(campo);
            assertTrue("El validador debería aceptar correos con un '@'.", resultado);
        } catch (Exception e) {
            fail("No debería lanzar excepción para un correo válido con '@'.");
        }
    }

    @Test
    public void testValidarCorreoSinArroba() {
        ValidadorCorreo validador = new ValidadorCorreo();
        JTextField campo = new JTextField("usuariodominio.com");

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para un correo sin '@'.");
        } catch (Exception e) {
            assertEquals("El campo debe contener exactamente un '@'.", e.getMessage());
        }
    }

    @Test
    public void testValidarCorreoConDosArrobas() {
        ValidadorCorreo validador = new ValidadorCorreo();
        JTextField campo = new JTextField("usuario@@dominio.com");

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para un correo con más de un '@'.");
        } catch (Exception e) {
            assertEquals("El campo debe contener exactamente un '@'.", e.getMessage());
        }
    }

    @Test
    public void testValidarCorreoVacio() {
        ValidadorCorreo validador = new ValidadorCorreo();
        JTextField campo = new JTextField("");

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para un correo vacío.");
        } catch (Exception e) {
            assertEquals("El campo debe contener exactamente un '@'.", e.getMessage());
        }
    }
}
