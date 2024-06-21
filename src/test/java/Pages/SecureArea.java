package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class SecureArea extends PageBase {
    public SecureArea(WebDriver navegador) {
        super(navegador);
        Assert.assertTrue(
                        navegador.getPageSource()
                                .contains(" You logged into a secure area!")
        );
    }
}
