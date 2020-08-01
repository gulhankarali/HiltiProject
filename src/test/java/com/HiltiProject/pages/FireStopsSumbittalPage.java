package com.HiltiProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FireStopsSumbittalPage extends BasePage {

    @FindBy(xpath ="//table[@id='firestopSystems']/tbody/tr/td[1]/div")
    public List<WebElement> tableOfSystems;

    @FindBy(css= "button.a-button-primary.js-smartbar-banner-close-forever.js-prevent-tooltip-closing")
    public WebElement iUnderstandButton;

    @FindBy(xpath=  " //input[starts-with(@name,'related_r361')]")
    public WebElement firestopAcrylicSealant;

    @FindBy(xpath= "//div/div/div/input[@id='r2787']")
    public WebElement mineralWool;

    @FindBy(xpath= "//div/div/div/input[@id='r2582']")
    public WebElement cp;

    @FindBy(xpath ="//div/div/div/input[@id='useHiltiCover']")
    public WebElement hiltiCover;

    @FindBy(xpath ="//div/div/div/input[@id='useCustomCover']")
    public WebElement customCover;

    @FindBy(xpath ="//div/div/div/input[@id='noCover']")
    public WebElement noCover;

    @FindBy(id = "page-numbers-yes")
    public WebElement pageNumbersYes;

    @FindBy(id = "page-numbers-no")
    public WebElement pageNumbersNo;

    @FindBy(id = "create-submittal")
    public WebElement createSubmittal;

    @FindBy(xpath = "//span[text()='Download submittal']/parent::a/parent::div")
    public WebElement checkDownloadable;
}

