package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FileStepDefs {

    @When("user clicks {string} module")
    public void user_clicks_module(String module) {
      new DashboardPage().clickModule(module);
    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

}
