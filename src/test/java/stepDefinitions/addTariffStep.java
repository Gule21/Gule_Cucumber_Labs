package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.addTariffHome;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

import java.util.Map;

public class addTariffStep extends BrowserUtils{
    addTariffHome home=new addTariffHome();
    //PageFactory.initElements(Driver.getDriver(), this);

    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("demoURL"));
        BrowserUtils.waitForPageToLoad(4);
        Driver.getDriver().manage().window().maximize();
    }

    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() throws InterruptedException {
        home.setAddTariff();
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();
    }

    @Then("The user wants to verify {string} headerr")
    public void the_user_wants_to_verify_headerr(String string) {
        home.setVerifyheader("Add Tariff Plans");

    }
    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String,String> dataTable) throws InterruptedException {

        home.setMonthlyRental();
        home.setInterMinutes();
        home.setLocalMinutes();
        home.setFreeSms();
        home.setFreeLocal();
        home.setFreeInternational();
        home.setSmsCharges();

    }

    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        home.setSubmit();

    }

    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        home.setVerifymsg("Congratulation you add Tariff Plan");

    }
}

