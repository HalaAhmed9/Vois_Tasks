package Tests;

import org.testng.annotations.Test;

import pages.Scenario1;


public class Scenario1Test extends TestsBase {
	
	
    @Test
    
    public void sc1() throws java.lang.InterruptedException{
		
	    Scenario1 Scenario1_TC = new Scenario1(driver) ;
	       
	    Scenario1_TC.send_searchBar();
		Thread.sleep(2000);
		Scenario1_TC.press_searchBtn();
		Thread.sleep(2000);
		Scenario1_TC.press_FirstItem();
		Thread.sleep(2000);
		Scenario1_TC.press_FristItemSecondClick();
		Thread.sleep(2000);
		Scenario1_TC.press_AddToCardBtn();
		Thread.sleep(2000);
		Scenario1_TC.press_VeiwCardBtn();
		Thread.sleep(2000);
}
}
