package manitec.com.mockitotest.loginactivity;

/**
 * Created by mani on 7/10/18.
 */

public class LoginModel implements LoginInterface.Model{
    private LoginInterface.Presenter presenter;

    public LoginModel(LoginInterface.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void validateUser(String user, String pass) {
        if(user.equals("Alberto") && pass.equals("1234")){
            presenter.userValid();
        }else{
            presenter.error();
        }
    }
}
