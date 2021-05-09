package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveningDress {
	
	@FindBy(id="layered_id_attribute_group_1")
	private WebElement sizech;
	
	@FindBy(id="layered_id_attribute_group_24")
	private WebElement colorch;
	
	@FindBy(id="layered_quantity_1")
	private WebElement quntitych;
	
	@FindBy(xpath="//a[@title='Delivery']")
	private WebElement delivery;
	
	@FindBy(xpath="//a[@class='ui-slider-handle ui-state-default ui-corner-all ui-state-hover']")
	private WebElement sliders;
	
	public EveningDress (WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	public void sizecheckbox() {
		sizech.click();
	}
	
	public void colorcheckbox() {
		colorch.click();
	}
	
	public void quntitycheckbox() {
		quntitych.click();
	}
	
	public void deliverybtn() {
		delivery.click();
	}

	
	public WebElement getSliders() {
		return sliders;
	}

}
