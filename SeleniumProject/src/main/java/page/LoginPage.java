package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement signinbtn;
	
	@FindBy(id="search_query_top")
	private WebElement searchtb;
	
	@FindBy(name="submit_search")
	private WebElement gobutton;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dressbtn;
	
	public WebElement getDressbtn() {
		return dressbtn;
	}
	
	@FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
	private WebElement eveningdress;
	
	@FindBy(id="newsletter-input")
	private WebElement newslettertb;
	
	@FindBy(name="submitNewsletter")
	private WebElement gobtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void signinButton() {
		signinbtn.click();
	}
	
	public void serachtextbox(String product) {
		searchtb.sendKeys(product);
	}
	
	public void searchButton() {
		gobutton.click();
	}
	
	public void eveningdresstab() {
		eveningdress.click();
	}
	
	public void entermail(String email) {
		newslettertb.sendKeys(email);
		gobtn.click();
	}
	
}
