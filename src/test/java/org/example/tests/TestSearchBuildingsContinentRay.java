package org.example.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestSearchBuildingsContinentRay extends TestBase {

    @Tag("web")
    @Test
    public void testSearchBuildingsContinentRay(){
        openSiteLun();
        homePage.setValueInToFieldSearch("Continent Ray");
        continentRayPage.checkShouldContainNameBuilding();
    }
}
