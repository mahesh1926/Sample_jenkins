package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.Baseclass;
import page.Download;
import page.LoginPage;
import page.MyShop;
import page.Mystore;

public class DownloadProductDetails extends Baseclass {
	@Test
	public void downloaddetails() throws FileNotFoundException, IOException {
	LoginPage l=new LoginPage(driver);
	l.signinButton();
	l.entermail(p.getdata("email"));
	
	Mystore m=new Mystore(driver);
	WebElement loc = m.getCoats();
	Point l1 = loc.getLocation();
	int x = l1.getX();
	int y=l1.getY();
	u.scrollbar(driver, x, y);
	m.coats();
	
	MyShop m1=new MyShop(driver);
	m1.createmystore();
	
	Download d=new Download(driver);
	u.dropdown(d.getProfiledd(),p.getdata("partner"));
	d.downloaddetail(p.getdata("mail"));
	}

}
