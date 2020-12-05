import java.util.ArrayList;

public class LoginDAO {
    private ArrayList<Login> loginList = new ArrayList<>();

    public boolean addLogin(Login login) {
        if (login != null) {
            return loginList.add(login);
        }

        return false;
    }

    public boolean deleteLogin(Login login) {
        if (login != null) {
            return loginList.remove(login);
        }

        return false;
    }
}
