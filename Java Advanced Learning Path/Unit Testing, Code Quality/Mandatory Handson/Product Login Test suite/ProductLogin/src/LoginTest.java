import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginTest {
    @Test
    public void methoddeleteLogin() {
        Login login1 = new Login("ritam", "password");
        Login login2 = new Login("pritam", "password");

        LoginDAO loginDAO = new LoginDAO();

        // LoginDAO.addLogin(Login login) test
        assertTrue(loginDAO.addLogin(login1));
        assertFalse(loginDAO.addLogin(null));

        login1.setUserName("Ritam");
        login1.setPassword("new password");

        // LoginDAO.deleteLogin(Login login) test
        assertTrue(loginDAO.deleteLogin(login1));
        assertFalse(loginDAO.deleteLogin(login2));
        assertFalse(loginDAO.deleteLogin(null));
    }
}
