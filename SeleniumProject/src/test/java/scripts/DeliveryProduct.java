package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Baseclass;
import page.EveningDress;
import page.LoginPage;

public class DeliveryProduct extends Baseclass {
	@Test
	public void delivery() throws InterruptedException, FileNotFoundException, IOException {
		LoginPage l=new LoginPage(driver);
		l.signinButton();
		u.mousehover(driver,l.getDressbtn());
		l.eveningdresstab();
		
		EveningDress e=new EveningDress(driver);
		e.sizecheckbox();
		Thread.sleep(5000);
		e.colorcheckbox();
		Thread.sleep(5000);
		e.quntitycheckbox();
		Thread.sleep(5000);
		u.sliders(driver, e.getSliders());
		Thread.sleep(5000);
		e.deliverybtn();
		Assert.assertEquals(driver.getTitle(), p.getdata("delivery"));
	}
	

}
