
package CadenaDeResponsabilidad;

import Interfaces.Validador;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidadorTelefonoTest {
    
    public ValidadorTelefonoTest() {
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
    public void testTelefonoValido() {
        ValidadorTelefono validador = new ValidadorTelefono();
        JTextField campo = new JTextField("912345678");

        try {
            boolean resultado = validador.validar(campo);
            assertTrue("El validador debería aceptar un número de teléfono válido.", resultado);
        } catch (Exception e) {
            fail("No debería lanzar excepción para un número de teléfono válido.");
        }
    }

    @Test
    public void testTelefonoConLongitudIncorrecta() {
        ValidadorTelefono validador = new ValidadorTelefono();
        JTextField campo = new JTextField("91234567"); // Solo 8 dígitos

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para un número de teléfono con longitud incorrecta.");
        } catch (Exception e) {
            assertEquals("El campo debe tener exactamente 9 dígitos.", e.getMessage());
        }
    }

    @Test
    public void testTelefonoNoEmpiezaConNueve() {
        ValidadorTelefono validador = new ValidadorTelefono();
        JTextField campo = new JTextField("812345678");

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para un número de teléfono que no empieza con 9.");
        } catch (Exception e) {
            assertEquals("El campo debe comenzar con el número 9.", e.getMessage());
        }
    }

    @Test
    public void testTelefonoConCaracteresNoNumericos() {
        ValidadorTelefono validador = new ValidadorTelefono();
        JTextField campo = new JTextField("91234A678");

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para un número de teléfono con caracteres no numéricos.");
        } catch (Exception e) {
            assertEquals("El campo ebe contener solo números.", e.getMessage());
        }
    }

    @Test
    public void testTelefonoVacio() {
        ValidadorTelefono validador = new ValidadorTelefono();
        JTextField campo = new JTextField("");

        try {
            validador.validar(campo);
            fail("Debería lanzar excepción para un campo vacío.");
        } catch (Exception e) {
            assertEquals("El campo debe tener exactamente 9 dígitos.", e.getMessage());
        }
    }

    @Test
    public void testPasarAlSiguienteValidador() {
        ValidadorTelefono validador1 = new ValidadorTelefono();
        Validador siguienteValidador = new Validador() {
            @Override
            public void setSiguiente(Validador siguiente) {
            }

            @Override
            public boolean validar(JTextField campo) {
                return campo.getText().startsWith("91");
            }
        };

        validador1.setSiguiente(siguienteValidador);
        JTextField campo = new JTextField("912345678");

        try {
            boolean resultado = validador1.validar(campo);
            assertTrue("Debería pasar al siguiente validador sin problemas.", resultado);
        } catch (Exception e) {
            fail("No debería lanzar excepción cuando pasa al siguiente validador.");
        }
    }

}
