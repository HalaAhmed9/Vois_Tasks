package Booking;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scenario1 extends PagesBase {

	public Scenario1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By 	BtnNext = By.xpath("//*[@id=\"routeSlider\"]/div/a[2]");
	public void press_BtnNext() {
	driver.findElement(BtnNext).click();
	}
	
	private By CountryChosen = By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a");
	public void press_CountryChosen() {
	driver.findElement(CountryChosen).click();	
	}
	
	/*private By ArivalDate = By.id("txtJourneyDate");
	public void press_ArivalDate() {
	driver.findElement(ArivalDate).click();
	}*/
	
	private By 	BtnNextMonth = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span");
	public void press_BtnNextMonth() {
	driver.findElement(BtnNextMonth).click();
	}
	
	private By 	BtnforDay = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a");
	public void press_BtnforDay () {
	driver.findElement(BtnforDay ).click();
	}
	
	private By 	BtnSearchForBus = By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button");
	public void press_BtnSearchForBus () {
	driver.findElement(BtnSearchForBus).click();
	}
	
	private By 	SelectaSeatBtn = By.id("SrvcSelectBtnForward0");
	public void press_SelectaSeatBtn() {
	driver.findElement(SelectaSeatBtn).click();
	}
	
	private By 	ChooseaSeat = By.xpath("//*[@id=\"Forward8\"]");
	public void press_ChooseaSeat() {
	driver.findElement(ChooseaSeat).click();
	}
	
	private By 	BoardingPointClick = By.id("BpFid");
	public void press_BoardingPointClick() {
	driver.findElement(BoardingPointClick).click();
	}
	
	private By 	ChooseBoarding = By.xpath("//*[@id=\"Forward-1467550949362\"]");
	public void press_ChooseBoarding() {
	driver.findElement(ChooseBoarding).click();
	}

	private By 	DroppingPointClick = By.id("DpFid");
	public void press_DroppingPointClick() {
	driver.findElement(DroppingPointClick).click();
	}
	
	private By 	ChooseDropping = By.xpath("//*[@id=\"Forward-1467543003073\"]");
	public void press_ChooseDropping() {
	driver.findElement(ChooseDropping).click();
	}
	
	//Passenger Details
	private By PassengerName = By.id("passengerNameForward0");
	public void send_PassengerName () {
	driver.findElement(PassengerName ).sendKeys("standard_user");	
	}
	
	private By 	SelectGenderBtn = By.id("genderCodeIdForward0");
	public void press_SelectGenderBtn () {
	driver.findElement(SelectGenderBtn ).click();
	}
	
    private By Gender=By.id("");
    public void select_Gender() {
	Select Gender=new;
    Gender.selectByIndex(2);
    }

    
	private By PassengerAge = By.id("passengerAgeForward0");
	public void send_PassengerAge() {
	driver.findElement(PassengerAge).sendKeys("22");
	}
	
	private By 	concessionBtn = By.id("genderCodeIdForward0");
	public void press_concessionBtn () {
	driver.findElement(concessionBtn ).click();
	}
	
    public void select_concession() {
	Select concession=new;
	concession.selectByIndex(1);
    }
	private By 	CountryBtn = By.id("nationalityForward0");
	public void press_CountryBtn () {
	driver.findElement(CountryBtn ).click();
	}
	
    public void select_country() {
	Select Country=new;
	Country.selectByIndex(0);
    }
	
	//Customer Details
	private By 	CustomerDeatilsBtn = By.id("Forwardprofile-tab");
	public void press_CustomerDeatilsBtn() {
	driver.findElement(CustomerDeatilsBtn).click();
	}
	
	private By MobileNumber = By.id("mobileNo");
	public void send_MobileNumber() {
	driver.findElement(MobileNumber).sendKeys("6789125987");
	}
	
	private By Email = By.id("email");
	public void send_Email() {
	driver.findElement(Email).sendKeys("h@email.com");
	}
	
	private By 	MakePaymentBtn = By.id("PgBtn");
	public void press_MakePaymentBtn() {
	driver.findElement(MakePaymentBtn).click();
	}
	
	
	
}