package manitec.com.mockitotest.loginactivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by mani on 7/10/18.
 */

@RunWith(MockitoJUnitRunner.class)
public class LoginModelTest {
    @Mock
    private LoginInterface.Presenter presenter;
        private LoginModel model;

    @Before
    public void setUp() throws Exception{
        model = new LoginModel(presenter);
    }

    @Test
    public void shouldSuccesWithValidUserAndPassword() throws Exception{
        model.validateUser("Alberto","1234");
        verify(presenter).userValid();
    }

    @Test
    public void shouldNotSuccesWithValidUserAndPassword() throws Exception{
        model.validateUser("pepe", "1224");
        verify(presenter).error();
    }
}