package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyShop {
	
	@FindBy(xpath="(//button[@class=\"ButtonGroup__BtnStyle-sc-1usw1pe-0 bAcKU\"])[1]")
	private WebElement refuse;
	
	@FindBy(xpath="//a[contains(text(),' Create my store')]")
	private WebElement createstore;
	
	public MyShop(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void createmystore() {
		refuse.click();
		createstore.click();
	}

}
