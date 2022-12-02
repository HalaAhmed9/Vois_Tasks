package page2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.PagesBase;

public class Scenario2 extends PagesBase {

	public Scenario2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By TodayDealsBtn = By.xpath("//*[@id=\"nav-xshop\"]/a[1]");
	public void press_TodayDealsBtn() {
	driver.findElement(TodayDealsBtn).click();	
	}
	
	
	private By 	HeadphonesClick = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[20]/label/input");
	public void press_HeadphonesClick() {
	driver.findElement(HeadphonesClick).click();
	}
	
	private By 	GroceryClick = By.xpath("//*[@id=\\\"grid-main-container\\\"]/div[2]/span[3]/ul/li[18]/label/input");
	public void press_GroceryClick() {
	driver.findElement(GroceryClick).click();
	}
	
	private By 	DsicountBtn = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/ul/li[2]/div/a");
	public void press_DsicountBtn () {
	driver.findElement(DsicountBtn ).click();
	}
	
	private By 	BtnNext = By.xpath("//*[@id=\"slot-15\"]/div/div/div[3]/div/ul/li[7]/a");
	public void press_BtnNext() {
	driver.findElement(BtnNext).click();
	}
	
	private By 	ClickOnItem = By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[2]");
	public void press_ClickOnItem() {
	driver.findElement(ClickOnItem).click();
	}
	
	private By 	ClickAddedToCardBtn = By.id("submit.add-to-cart");
	public void press_ClickAddedToCardBtn () {
	driver.findElement(ClickAddedToCardBtn ).click();
	}
	

}
