package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plsbtn;
	
	@FindBy(id="group_1")
	private WebElement sizedd;
	
	
	@FindBy(name="Orange")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedtocheckout;
	
	

	
	public AddtoCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}

	public void plussbtn() {
		plsbtn.click();
	}

	public WebElement getSizedd() {
		return sizedd;
	}
	
	public void blueclr() {
		color.click();
	}
	
	public void addtocart() {
		addtocart.click();
	}
	
	public void proceddtochkeck() {
		proceedtocheckout.click();
	}
	
	
}
