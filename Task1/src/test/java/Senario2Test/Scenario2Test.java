package TestPage2;

import org.testng.annotations.Test;

import Tests.TestsBase;
import page2.Scenario2;
import pages.Scenario1;

public class Scenario2Test extends TestsBase {
	@Test
    public void sc2() throws java.lang.InterruptedException{
		
	    Scenario2 Scenario2_TC = new Scenario2(driver) ;
	       
	    Scenario2_TC.press_TodayDealsBtn();
		Thread.sleep(2000);
		Scenario2_TC.press_HeadphonesClick();
		Thread.sleep(2000);
		Scenario2_TC.press_GroceryClick();
		Thread.sleep(2000);
		Scenario2_TC.press_DsicountBtn ();
		Thread.sleep(2000);
		Scenario2_TC.press_BtnNext();
		Thread.sleep(2000);
		Scenario2_TC.press_BtnNext();
		Thread.sleep(2000);
		Scenario2_TC.press_BtnNext();
		Thread.sleep(2000);
		Scenario2_TC.press_ClickOnItem();
		Thread.sleep(2000);
		Scenario2_TC.press_ClickAddedToCardBtn();
		Thread.sleep(2000);
		
}
}

