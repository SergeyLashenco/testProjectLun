package org.example.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$$;

public class TestOpenSiteLun extends TestBase {


    @Tag("web")
    @Test
    public void testOpenSiteLun () {
        openSiteLun();
        $$(".nav-logo").get(0).should(Condition.visible);
    }
}
