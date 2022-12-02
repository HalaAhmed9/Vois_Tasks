package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scenario1 extends PagesBase {

	public Scenario1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By serchBar = By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	public void send_searchBar() {
	driver.findElement(serchBar).sendKeys("car accessories");	
	}
	
	
	private By 	searchBtn = By.id("nav-search-submit-button");
	public void press_searchBtn() {
	driver.findElement(searchBtn).click();
	}
	
	private By 	FristItem = By.className("a-section a-spacing-top-mini s-visual-card-navigation-carousel-card-title s-visual-card-navigation-line-clamp-2 aok-block s-padding-left-small s-padding-right-small s-spacing-medium");
	public void press_FirstItem() {
	driver.findElement(FristItem).click();
	}
	
	private By 	FristItemSecondClick = By.className("a-section a-spacing-base");
	public void press_FristItemSecondClick() {
	driver.findElement(FristItemSecondClick).click();
	}
	
	private By 	AddToCardBtn = By.id("add-to-cart-button");
	public void press_AddToCardBtn() {
	driver.findElement(AddToCardBtn).click();
	}
	private By 	VeiwCardBtn = By.id("nav-cart");
	public void press_VeiwCardBtn() {
	driver.findElement(VeiwCardBtn).click();
	}
	
	
	
	
	
}
