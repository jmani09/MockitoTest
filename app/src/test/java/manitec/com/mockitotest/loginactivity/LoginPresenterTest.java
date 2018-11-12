package manitec.com.mockitotest.loginactivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by mani on 7/10/18.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {
    @Mock
    private LoginInterface.View view;
    @Mock
    private LoginInterface.Model model;

    private  LoginPresenter presenter;

    @Before
    public void setUp() throws Exception{
        presenter = new LoginPresenter(view);
    }

    @Test
    public void shouldShowErrorMessageWhenUserorPasswordisWrong() throws Exception{
        when(view.getUserName()).thenReturn("jaime");
        when(view.getPassword()).thenReturn("1234");
        presenter.validateUser(view.getUserName(), view.getPassword());
        verify(view).error();
    }

    @Test
    public void shouldShowErrorMessageWhenUserorPasswordisCorrect() throws Exception{
        when(view.getUserName()).thenReturn("alberto");
        when(view.getPassword()).thenReturn("1234");
        presenter.validateUser(view.getUserName(), view.getPassword());
        verify(view).userValid();
    }


}