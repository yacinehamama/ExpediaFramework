package Bootcamp.Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationFlightPage {
	public WebDriver driver;
	
	@FindBy (xpath = "/html[1]/body[1]/div[2]/div[11]/section[1]/div[1]/div[13]/ul[1]/li[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]")
    WebElement continuebutton;

public ConfirmationFlightPage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void continubuttonverification() {
	continuebutton.click();
}

}