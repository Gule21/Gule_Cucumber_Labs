package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class Home extends BrowserUtils {

    public Home() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//a[@href='addtariffplans.php'][1]")
    private WebElement addTariff;
    public void setAddTariff(){
        staticWait(2);
        addTariff.click();}
    @FindBy(xpath = "//input[@name='rental']")
    private WebElement monthlyRental;
    public void inputMonthlyRental(String rent){
        staticWait(2);
        monthlyRental.sendKeys(rent);
    }
    @FindBy(xpath = "//input[@name='local_minutes']")
    private WebElement freeLocalMinutes;
    public void inputFreeLocalMinutes(String min){
        staticWait(2);
    }

    @FindBy(xpath = "//input[@name='inter_minutes']")
    private WebElement freeIntMin;
    public void inputFreeIntMin(String intMin) {
        staticWait(2);
    }
        @FindBy(xpath = "//input[@name='sms_pack']")
        private WebElement freeSms;
        public void setFreeSms (String sms){
            staticWait(2);
            freeSms.sendKeys(sms);
        }
        @FindBy(xpath = "//input[@name='minutes_charges']")
        private WebElement localMinutes;
        public void setLocalMinutes (String localmin){
            staticWait(2);
            localMinutes.sendKeys(localmin);
        }
        @FindBy(xpath = "//input[@name='inter_charges']")
        private WebElement interMinutes;
        public void setInterMinutes (String intermin){
            staticWait(2);
            interMinutes.sendKeys(intermin);
        }
        @FindBy(xpath = "//input[@name='sms_charges']")
        private WebElement smsCharges;
        public void setSmsCharges (String smsChr){
            staticWait(2);
            smsCharges.sendKeys(smsChr);
        }
        @FindBy(xpath = "//input[@name='submit']")
        private WebElement submit;
        public void setSubmit () {
            staticWait(2);
            submit.click();
        }
        @FindBy(xpath = "//h2[.='Congratulation you add Tariff Plan']")
        private WebElement verifymsg;
        public void setVerifymsg (String expectedmsg){
            staticWait(2);
            Assert.assertEquals(expectedmsg, verifymsg.getText());

        }
        @FindBy(xpath = "//h1[.='Add Tariff Plans']")
        private WebElement verifyheader;
        public void setVerifyheader (String expectedheader){
            staticWait(2);
            Assert.assertEquals(expectedheader, verifyheader.getText());
        }

    }
