package org.example.pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

  SelenideElement fieldSearch =  $(
          By.xpath(".//input[@type='text' and @placeholder='Введіть назву ЖК або району']"));
  SelenideElement hrefContinentRay = $(".GeoControl-dropdown");

  SelenideElement navigationList = $(".NavigationProjectsList-dropdown");
  SelenideElement buttonCloseNavigation = $(".nav-projects-trigger");

  public HomePage setValueInToFieldSearch (String valueSearch ){
      fieldSearch.click();
      fieldSearch.setValue(valueSearch);
      hrefContinentRay.click();
      return  this;
  }
}
