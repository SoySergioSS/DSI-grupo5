
package CadenaDeResponsabilidad;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    CadenaDeResponsabilidad.ValidadorTelefonoTest.class,
    CadenaDeResponsabilidad.ValidadorCorreoTest.class,
    CadenaDeResponsabilidad.ValidadorVacioTest.class,
    CadenaDeResponsabilidad.ValidadorFechaTest.class,
    CadenaDeResponsabilidad.ValidadorLinkTest.class
})
public class CadenaDeResponsabilidadSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Iniciando la ejecución del conjunto de pruebas...");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("Finalizando la ejecución del conjunto de pruebas.");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Preparando el entorno para una prueba individual...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Limpiando el entorno después de una prueba individual...");
    }
}
