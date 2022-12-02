package BookingTests;


import org.testng.annotations.Test;

import Booking.Scenario1;



public class TestScenario1 extends TestBase {
	
	
    @Test
    public void TestSenario1()throws InterruptedException{
		
	    Scenario1 Senario1_TC = new Scenario1(driver) ;
	       
	    Senario1_TC.press_BtnNext ();
		Thread.sleep(2000);
		Senario1_TC.press_CountryChosen ();
		Thread.sleep(2000);
		Senario1_TC.press_BtnNextMonth ();
		Thread.sleep(2000);
	    Senario1_TC.press_BtnforDay ();
		Thread.sleep(2000);
		Senario1_TC.press_BtnSearchForBus ();
		Thread.sleep(2000);
		Senario1_TC.press_SelectaSeatBtn();
		Thread.sleep(2000);
	    Senario1_TC.press_ChooseaSeat();
		Thread.sleep(2000);
		Senario1_TC.press_BoardingPointClick();
		Thread.sleep(2000);
		Senario1_TC.press_ChooseBoarding();
		Thread.sleep(2000);
	    Senario1_TC.press_DroppingPointClick();
		Thread.sleep(2000);
		Senario1_TC.press_ChooseDropping();
		Thread.sleep(2000);
		Senario1_TC.send_PassengerName ();
		Thread.sleep(2000);
		Senario1_TC.press_SelectGenderBtn ();
		Thread.sleep(2000);
		Senario1_TC.select_Gender ();
		Thread.sleep(2000);
	    Senario1_TC.send_PassengerAge();
		Thread.sleep(2000); 
	    Senario1_TC.press_concessionBtn ();
		Thread.sleep(2000);
		Senario1_TC.select_concession() ;
		Thread.sleep(2000);
		Senario1_TC.press_CountryBtn ();
		Thread.sleep(2000);
		Senario1_TC.select_country() ;
		Thread.sleep(2000);
		Senario1_TC.press_CustomerDeatilsBtn();
		Thread.sleep(2000);
		Senario1_TC.send_MobileNumber();
		Thread.sleep(2000);
	    Senario1_TC.send_Email();
		Thread.sleep(2000);
		Senario1_TC.press_MakePaymentBtn();
		Thread.sleep(2000);

}
}