package org.example.tests;

import org.example.pages.BuildingsKievRegionPage;
import org.example.pages.ContinentRayPage;
import org.example.pages.HomePage;
import org.junit.jupiter.api.AfterEach;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    HomePage homePage = new HomePage();
    BuildingsKievRegionPage buildingsKievRegionPage = new BuildingsKievRegionPage();
    ContinentRayPage continentRayPage = new ContinentRayPage();
    public void openSiteLun (){
        open("https://lun.ua/");
    }

    @AfterEach
    public void tearDown() {
        closeWindow();
    }

}
