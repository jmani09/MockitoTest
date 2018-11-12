package manitec.com.mockitotest.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import manitec.com.mockitotest.R;
import manitec.com.mockitotest.finalactivity.FinalActivity;

public class LoginActivity extends AppCompatActivity  implements LoginInterface.View{
    private EditText edUser, edPass;
    private LoginInterface.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edUser = (EditText)findViewById(R.id.edUser);
        edPass = (EditText) findViewById(R.id.edPass);
        presenter = new LoginPresenter(this);
    }

    @Override
    public void userValid() {
        startActivity(new Intent(LoginActivity.this, FinalActivity.class));
    }

    @Override
    public void error() {
        Toast.makeText(this, "User not valid", Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getUserName() {
        return edUser.getText().toString();
    }

    @Override
    public String getPassword() {
        return edPass.getText().toString();
    }


}
