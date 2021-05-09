package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Baseclass;
import page.AddtoCart;
import page.HomePage;
import page.LoginPage;

public class AddingProductTocart extends Baseclass {
	@Test
	public void addtocart() throws FileNotFoundException, IOException {
		LoginPage l=new LoginPage(driver);
		l.signinButton();
		l.serachtextbox(p.getdata("product"));
		l.searchButton();
		
		HomePage h=new HomePage(driver);
		u.dropdown(h.getSortdd(),p.getdata("sortdd"));
		h.selecteddress();
		
		AddtoCart a=new AddtoCart(driver);
		a.plussbtn();
		u.scrollbar(driver, 0, 2000);
		u.dropdown(a.getSizedd(), p.getdata("sizedd"));
		a.blueclr();
		a.addtocart();
		a.proceddtochkeck();
		Assert.assertEquals(driver.getTitle(), p.getdata("proceedtocheckout"));

}
}