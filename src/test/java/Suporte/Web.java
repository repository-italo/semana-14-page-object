package Suporte;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web {
    public static WebDriver createDrive(){
        WebDriver navegador = new FirefoxDriver();
        navegador.get("https://the-internet.herokuapp.com/login");
        return navegador;
    }


}
