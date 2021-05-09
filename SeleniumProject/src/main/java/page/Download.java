package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download {
	@FindBy(id="edit-submitted-type")
	private WebElement profiledd;

	public WebElement getProfiledd() {
		return profiledd;
	}
	
	@FindBy(id="edit-submitted-email")
	private WebElement email;
	
	@FindBy(xpath="//label[text()='I agree to the ']")
	private WebElement iagree;
	
	@FindBy(xpath="(//label[text()='I agree to the '])[2]")
	private WebElement iagree1;
	
	@FindBy(name="op")
	private WebElement download;
	
	public Download(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void downloaddetail(String mail) {
		email.sendKeys(mail);
		iagree.click();
		iagree1.click();
		download.click();
	}

}
