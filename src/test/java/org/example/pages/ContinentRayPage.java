package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ContinentRayPage {

    SelenideElement buildingContacts = $(".BuildingContacts");

    public void checkShouldContainNameBuilding (){
        buildingContacts.shouldHave(Condition.text("ЖК Continent Ray"));
    }
}
