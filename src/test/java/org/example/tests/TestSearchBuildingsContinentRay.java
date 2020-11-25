package org.example.tests;

import org.junit.jupiter.api.Test;

public class TestSearchBuildingsContinentRay extends TestBase {

    @Test
    public void testSearchBuildingsContinentRay(){
        openSiteLun();
        homePage.setValueInToFieldSearch("Continent Ray");
        continentRayPage.checkShouldContainNameBuilding();
    }
}
