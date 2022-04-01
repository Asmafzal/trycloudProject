package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ContactStepDefs {

    FilesPage filesPage = new FilesPage();
    @Then("verify the contact names are listed")
    public void verify_the_contact_names_are_listed(List<String> expectedContacts) {
        Assert.assertEquals(expectedContacts, filesPage.getContactNames());
    }
}
