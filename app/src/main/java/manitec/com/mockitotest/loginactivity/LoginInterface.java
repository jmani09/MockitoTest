package manitec.com.mockitotest.loginactivity;

/**
 * Created by mani on 7/10/18.
 */

public interface LoginInterface {
    interface View{
        void userValid();
        void error();
        String getUserName();
        String getPassword();
    }

    interface  Presenter{
        void validateUser(String user, String pass);
        void userValid();
        void error();
    }

    interface Model{
        void validateUser(String user, String pass);
    }
}
