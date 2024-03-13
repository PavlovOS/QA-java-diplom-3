package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static org.example.api.user.UserApi.deleteUser;

public class Configuration {
    public WebDriver driver;

    @Before
    public void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = Browser.getWebDriver("chrome");
    }

    @After
    public void deleteUserAndCloseBrowser() {
        deleteUser();
        driver.quit();
    }
}
