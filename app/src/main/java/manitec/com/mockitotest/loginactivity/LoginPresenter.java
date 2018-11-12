package manitec.com.mockitotest.loginactivity;

/**
 * Created by mani on 7/10/18.
 */

public class LoginPresenter implements LoginInterface.Presenter {
    private LoginInterface.View view;
    private LoginInterface.Model model;


    public LoginPresenter(LoginInterface.View view) {
        this.view = view;
        model = new LoginModel(this);
    }

    @Override
    public void validateUser(String user, String pass) {
        if(view!=null){
            model.validateUser(user, pass);
        }
    }

    @Override
    public void userValid() {
        if(view!=null){
            view.userValid();
        }
    }

    @Override
    public void error() {
        if(view!=null){
            view.error();
        }
    }
}
