package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginPage userName(String userName){
    navegador.findElement(By.id("username"))
            .sendKeys(userName);

    return this;
    }

    public LoginPage password (String password){
        navegador.findElement(By.id("password"))
                .sendKeys(password);

        return this;
    }

    public SecureArea pagina(){
        navegador.findElement(
                By.xpath("/html/body/div[2]/div/div/form/button"))
                .click();

        return new SecureArea(navegador);
    }

}
