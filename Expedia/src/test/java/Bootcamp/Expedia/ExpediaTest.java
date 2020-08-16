package Bootcamp.Expedia;

import org.testng.annotations.Test;

public class ExpediaTest extends Base {
  @Test(priority = 1)
  public void HomePageVerification () {
	  HomePage home = new HomePage(driver);
	  home.flightsbuttonclick();
  }
  @Test(priority = 2)
  public void FlightsPageVerification () throws InterruptedException {
	  FlightsPage flight = new FlightsPage(driver);
	  
	  flight.roundtripbuttonverification();
	  flight.leavingfieldverification();
	  flight.clickjfkverification();
	  flight.goingtofieldverification();
	  Thread.sleep(5000);
	  flight.clickalgverification();
//	  flight.frombuttonverification();
//	  flight.leavingdateverification();
//	  flight.returndateverification();
//	  flight.donebuttonverification();
	  flight.searchbuttonverification();
  }
  @Test (priority = 3)
  public void continuebuttonver() {
	  ConfirmationFlightPage fl = new ConfirmationFlightPage(driver);
	  fl.continubuttonverification();
  }
  @Test (priority = 4)
  public void travelerinfoverification() {
	  TravelerInfo info = new TravelerInfo(driver);
	  info.firstnamefield();
	  info.lastnamefield();
	  info.phonenumberfield();
	  info.genderfield();
  }
}
