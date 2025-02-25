package Main;

import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class WindowManagerTest {
    
    public WindowManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    private JFrame window1;
    private JFrame window2;

    @Before
    public void setUp() {
        window1 = new JFrame("Ventana 1");
        window2 = new JFrame("Ventana 2");

        WindowManager.registerWindow("window1", window1);
        WindowManager.registerWindow("window2", window2);
    }

    @After
    public void tearDown() {
        window1.dispose();
        window2.dispose();
    }

    @Test
    public void testRegisterAndGetWindow() {
        assertEquals(window1, WindowManager.getWindow("window1"));
        assertEquals(window2, WindowManager.getWindow("window2"));
    }

    @Test
    public void testShowWindow() {
        WindowManager.showWindow("window1");
        assertTrue(window1.isVisible());
        assertFalse(window2.isVisible());

        WindowManager.showWindow("window2");
        assertFalse(window1.isVisible());
        assertTrue(window2.isVisible());
    }

    @Test
    public void testGetAndSetIdUsuario() {
        WindowManager.setIdUsuario(123);
        assertEquals(123, WindowManager.getIdUsuario());
    }

    @Test
    public void testGetAndSetIdAdministrador() {
        WindowManager.setIdAdministrador(456);
        assertEquals(456, WindowManager.getIdAdministrador());
    }

    @Test
    public void testShowNonExistentWindow() {
        WindowManager.showWindow("nonexistentWindow");
        assertFalse(window1.isVisible());
        assertFalse(window2.isVisible());
    }
}
