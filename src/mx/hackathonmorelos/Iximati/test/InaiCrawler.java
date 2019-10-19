package mx.hackathonmorelos.Iximati.test;

import mx.hackathonmorelos.Iximati.util.drivers.EnhancedWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class InaiCrawler {
    public static void SearchTerm(EnhancedWebDriver driver, String searchTerm) throws InterruptedException {
        driver.get("https://consultapublicamx.inai.org.mx/vut-web/faces/view/consultaPublica.xhtml#sujetosObligados");
        WebElement state = driver.findDynamicElement(By.className("dropdown-toggle"));
        for (int i = 0; i<33; i++)changeState(driver,state,searchTerm);
        Thread.sleep(4000);


    }
    private static void changeState(EnhancedWebDriver driver, WebElement state, String searchTerm) throws InterruptedException {
        if (state!=null) {
            state.click();
            WebElement temp  = driver.switchTo().activeElement();
            temp.sendKeys(Keys.ARROW_DOWN);
            temp.sendKeys(Keys.ENTER);
            driver.findDynamicElement(By.className("capaBloqueaPantalla"));
            driver.waitForElementToDisappear(By.className("capaBloqueaPantalla"),60,500);
            WebElement searchBar = driver.findDynamicElement(By.id("formEntidadFederativa:filtroSujetoObligado"));
            if (searchBar!= null) searchBar.sendKeys(searchTerm);
            Thread.sleep(1000);
            driver.scroll(300);
            Thread.sleep(1000);
            driver.scroll(-300);
        }
    }
}
