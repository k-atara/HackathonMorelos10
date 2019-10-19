package mx.hackathonmorelos.Iximati.test;

import mx.hackathonmorelos.Iximati.util.drivers.BrowserDriver;
import mx.hackathonmorelos.Iximati.util.drivers.BrowserOption;
import mx.hackathonmorelos.Iximati.util.drivers.EnhancedWebDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class InaiCrawlerTest {
    private static EnhancedWebDriver chrome;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        chrome = new EnhancedWebDriver(BrowserDriver.getDriver(BrowserOption.Chrome));
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        chrome.quit();
    }

    @Test
    public void InaiCrawler_Should_FindTerm() throws InterruptedException {
        InaiCrawler.SearchTerm(chrome, "hospital");
    }
}
