package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FilesPage {
    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(),this );
    }


    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAllCbox;

    @FindBy(xpath = "//td[@class='selection']/input ")
    public List<WebElement> allCboxInFiles;


    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> contactNamesElements;

    public List<String> getContactNames() {
        List<String> contactNames = new ArrayList<>();
        for (WebElement namesElement : contactNamesElements) {
            contactNames.add(namesElement.getText());
        }
        return contactNames;
    }


}
