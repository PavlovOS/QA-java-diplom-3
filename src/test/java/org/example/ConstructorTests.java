package org.example;

import org.example.page.object.HomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class ConstructorTests extends Configuration {

    @Test
    public void openSectionBuns() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.openSectionSauces();
        homePage.openSectionBuns();
        Assert.assertTrue(homePage.checkCurrentClassBuns());
    }

    @Test
    public void openSectionSauces() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.openSectionSauces();
        Assert.assertTrue(homePage.checkCurrentClassSauces());
    }

    @Test
    public void openSectionFillings() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.openSectionFillings();
        Assert.assertTrue(homePage.checkCurrentClassFillings());
    }

    @After
    public void deleteUserAndCloseBrowser() {
        driver.quit();
    }
}
