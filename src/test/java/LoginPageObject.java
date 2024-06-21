import Pages.LoginPage;
import Suporte.Web;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createDrive();
    }

    @Test
    public void test(){
        new LoginPage(navegador)
                .userName("tomsmith")
                .password("SuperSecretPassword!")
                .pagina();
    }

    @After
    public void tearDown(){
        navegador.quit();
    }
}
