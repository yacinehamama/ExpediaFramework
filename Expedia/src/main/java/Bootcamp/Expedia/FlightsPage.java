package Bootcamp.Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {
	public WebDriver driver;
	
	@FindBy(xpath = "//body[@class='uitk-no-outline']")
	WebElement roundtripbutton;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement leavingfield;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]/div[1]/div[2]")
	WebElement clickjfk;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement gointofield;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]/div[1]/div[1]/span[1]/strong[1]")
	WebElement clickalg;
//	@FindBy(id = "d1-btn")
//	WebElement frombutton;
//	@FindBy(xpath = "//td[@class='uitk-new-date-picker-day-number uitk-new-date-picker-first-of-month']//button[@class='uitk-new-date-picker-day']")
//	WebElement leavingdate;
//	@FindBy(xpath = "//tr[1]//td[5]//button[1]")
//	WebElement returndate;
//	@FindBy(xpath = "//span[contains(text(),'Done')]")
//	WebElement donebutton;
	@FindBy(className = "uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary")
	WebElement searchbutton;
	
	public FlightsPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void roundtripbuttonverification() {
	roundtripbutton.click();
	}
	public void leavingfieldverification() {
		leavingfield.sendKeys("jfk");
	}
	public void clickjfkverification() {
		clickjfk.click();
	}
	public void goingtofieldverification() {
		gointofield.sendKeys("alg");
	}
	public void clickalgverification() {
		clickalg.click();
	}
//	public void frombuttonverification() {
//		frombutton.click();
//	}
//	public void leavingdateverification() {
//		leavingdate.click();
//	}
//	public void returndateverification() {
//		returndate.click();
//	}
//	public void donebuttonverification() {
//		donebutton.click();
//	}
	public void searchbuttonverification() {
		searchbutton.click();
	}
	

}
