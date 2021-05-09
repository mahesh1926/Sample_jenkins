package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mystore {

	@FindBy (xpath="(//img[@class='item-img'])[5]")
	private WebElement coats;
	
	public WebElement getCoats() {
		return coats;
	}

	public Mystore(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void coats() {
		coats.click();
	}
}
