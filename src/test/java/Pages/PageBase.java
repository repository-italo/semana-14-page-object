package Pages;

import org.openqa.selenium.WebDriver;

public class PageBase {
    protected WebDriver navegador;

    public PageBase(WebDriver navegador){
        this.navegador = navegador;
    }
}
