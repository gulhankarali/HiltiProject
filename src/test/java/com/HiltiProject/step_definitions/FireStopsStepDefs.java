package com.HiltiProject.step_definitions;

import com.HiltiProject.pages.FireStopsFilterPage;
import com.HiltiProject.pages.FireStopsSumbittalPage;
import com.HiltiProject.utilities.BrowserUtils;
import com.HiltiProject.utilities.ConfigurationReader;
import com.HiltiProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;




public class FireStopsStepDefs{

    FireStopsFilterPage fireStopsFilterPage = new FireStopsFilterPage();
    FireStopsSumbittalPage fireStopsSumbittalPage= new FireStopsSumbittalPage();

    @Given("user navigates to firestops webpage")
    public void user_navigates_to_firestops_webpage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("user choses Joint radio button")
    public void user_choses_joint_radio_button() {
        BrowserUtils.clickWithJS(fireStopsFilterPage.jointBy);
    }

    @Then("Main system search filters appear")
    public void main_system_search_filters_appear() {

    }
    @Then("user choses Concrete Floor from list box of Barrier Type")
    public void user_choses_concrete_floor_from_list_box_of_barrier_type() throws InterruptedException {
        try {
            BrowserUtils.waitForClickablility(fireStopsFilterPage.barrierType,2);
            fireStopsFilterPage.barrierType.click();

        } catch(Exception e){
            e.printStackTrace();
        }
        try {
            BrowserUtils.waitForClickablility(fireStopsFilterPage.concreteFloor,1);
            fireStopsFilterPage.concreteFloor.click();

        } catch(Exception e){
            e.printStackTrace();
        }

    }
    @Then("user choses {string} from list box of F-Rating")
    public void user_choses_from_list_box_of_f_rating(String string) throws InterruptedException {
        BrowserUtils.waitFor(3);
        try{
            BrowserUtils.waitForVisibility(fireStopsFilterPage.fRating,2);
            BrowserUtils.waitForClickablility(fireStopsFilterPage.fRating,5);
            fireStopsFilterPage.fRating.click();
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            BrowserUtils.waitForClickablility(fireStopsFilterPage.twoHour,3);
            fireStopsFilterPage.twoHour.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Then("user choses {string} from list box of Max. Joint Width")
    public void user_choses_from_list_box_of_max_joint_width(String string) throws InterruptedException {
        BrowserUtils.waitFor(3);
        try{
            BrowserUtils.waitForClickablility(fireStopsFilterPage.maxJointWidth,4);
            fireStopsFilterPage.maxJointWidth.click();
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            BrowserUtils.waitForClickablility(fireStopsFilterPage.sixInchOrGreater,4);
            fireStopsFilterPage.sixInchOrGreater.click();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Then("{string} results are listed")
    public void results_are_listed(String string) {

    }
    @Then("user choses {string} out of {string} results in the result set")
    public void user_choses_out_of_results_in_the_result_set(String string, String string2) {
        BrowserUtils.waitFor(5);
        try {
            BrowserUtils.waitForVisibility(fireStopsFilterPage.firstOne,3);
            BrowserUtils.clickWithJS(fireStopsFilterPage.firstOne);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Then("user clicks Submittal Button")
    public void user_clicks_submittal_button() {
        BrowserUtils.clickWithJS(fireStopsFilterPage.createSubmittalButton);
    }
    @Given("FireStops builder page appears")
    public void fire_stops_builder_page_appears() {
        Assert.assertEquals("https://www.hilti.com/firestops/builder", Driver.get().getCurrentUrl());

    }
    @Given("{string} FireStops systems are listed")
    public void fire_stops_systems_are_listed(String string) {
        int listSize = fireStopsSumbittalPage.tableOfSystems.size();
        Assert.assertTrue(listSize>0);
    }
    @Then("user unchecks all of them and checks again first one")
    public void user_unchecks_all_of_them_and_checks_again_first_one() {
        try {
            BrowserUtils.waitForClickablility(fireStopsSumbittalPage.iUnderstandButton, 5);
            BrowserUtils.clickWithJS(fireStopsSumbittalPage.iUnderstandButton);
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            for (WebElement we : fireStopsSumbittalPage.tableOfSystems) {
                we.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            for (WebElement we : fireStopsSumbittalPage.tableOfSystems) {
                we.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Then("user unchecks Mineral wool check box")
    public void user_unchecks_mineral_wool_check_box() {
        try{
            BrowserUtils.clickWithJS(fireStopsSumbittalPage.mineralWool);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Then("user choses No Cover Page radio button from Submittal Options")
    public void user_choses_no_cover_page_radio_button_from_submittal_options() {
        try{
            BrowserUtils.clickWithJS(fireStopsSumbittalPage.noCover);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    @Then("user choses Include Page Number Yes radio button from Submittal Options")
    public void user_choses_include_page_number_yes_radio_button_from_submittal_options() {
        try{
            BrowserUtils.clickWithJS(fireStopsSumbittalPage.pageNumbersYes);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Then("user clicks Generate Submittal button")
    public void user_clicks_generate_submittal_button() {
        fireStopsSumbittalPage.createSubmittal.click();
    }
    @Then("system produces product spec as downloadable pdf file")
    public void system_produces_product_spec_as_downloadable_pdf_file() {
        String innerHtml= fireStopsSumbittalPage.checkDownloadable.getAttribute("innerHTML");
        Assert.assertTrue(innerHtml.contains("download-link"));

    }

}
