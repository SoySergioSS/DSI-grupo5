
package DAO;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
    DAOactividadImplementacionTest.class,
    DAOadministradorImplementacionTest.class,
    DAOclienteImplementacionTest.class,
    DAOtiendaImplementacionTest.class,
})

public class DAOSuite {
}
