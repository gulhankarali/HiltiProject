package com.HiltiProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FireStopsFilterPage extends BasePage {
    @FindBy(id ="filterbar_search_input")
    public WebElement filterBy;

    @FindBy(id ="search_results_filterbar_systemType_0")
    public WebElement jointBy;

    @FindBy(id ="search_results_filterbar_systemType_1")
    public WebElement penetrationBy;

//    @FindBy(xpath ="//a/span[text()='Barrier Type']/parent::a")
//    public WebElement barrierType;

    @FindBy(xpath ="//a/span[text()='Barrier Type']/parent::a/parent::div")
    public WebElement barrierType;

    @FindBy(xpath ="//a/span[text()='F-Rating']/parent::a/parent::div")
    public WebElement fRating;

    @FindBy(xpath ="//a/span[text()='Max. Joint Width']/parent::a/parent::div")
    public WebElement maxJointWidth;

    @FindBy(xpath ="//a/span[contains(text(),'Barrier Type')]/parent::a//following-sibling::div/ul/li[@data-option-array-index=2]")
    public WebElement concreteFloor;

    @FindBy(xpath ="//a/span[contains(text(),'F-Rating')]/parent::a//following-sibling::div/ul/li[@data-option-array-index=4]")
    public WebElement twoHour;

    @FindBy(xpath ="//a/span[contains(text(),'Max. Joint Width')]/parent::a//following-sibling::div/ul/li[@data-option-array-index=3]")
    public WebElement sixInchOrGreater;

    @FindBy(id ="PRD_SYSTEM_2270144")
    public WebElement firstOne;

    @FindBy(css= "a.a-button.a-button-primary.js-firestop-btn")
    public WebElement createSubmittalButton;

    @FindBy(css= "button.a-button-primary.js-smartbar-banner-close-forever.js-prevent-tooltip-closing")
    public WebElement iUnderstandButton;



}
