package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HKPages.LandingPage;
import HKPages.LoginPage;
import utils.openChromeBrowser;

public class LoginPageTestCases {
  
	static WebDriver driver;
	static LoginPage lp;
	static LandingPage landingpage;
	boolean res;
	
	@AfterClass
	public void closeDriver()
	{
		
		driver.quit();
	}
	
	@BeforeClass
	public void initDriver()
	{
		
		openChromeBrowser ob = new openChromeBrowser();
		driver = ob.openChrome();
		driver.get("https://the-internet.herokuapp.com/login");
		lp = new LoginPage(driver);
		landingpage = new LandingPage(driver);  	
	}
	
	
	@Test
  public void chkTitleOfLoginPage () {
	  
	 res= lp.chkTitle("The Internet");
	  
	Assert.assertEquals(true,res);  
  }
	@Test
	public void chkToSeeIfFooterIsThere ()
	{
		
		Assert.assertEquals(true, lp.chkPageFooter());
		
	}
	
	@Test
	public void chkToSeePasswordMasked()
	{
		Assert.assertEquals(true, lp.isPasswordMasked());
	}
	
	@Test
	public void doLogin()
	{
		lp.fillUsername("tomsmith");
		lp.fillPassword("SuperSecretPassword!");
		lp.clickLoginBtn();
		
		Assert.assertEquals(true,landingpage.isLoginSuccess());
		
	}
	@Test
	public void doLoginNegativeSecurity()
	{
		lp.fillUsername("tomsmith");
		lp.fillPassword("SuperSPassword!");
		lp.clickLoginBtn();
		
		Assert.assertEquals(false,landingpage.isLoginSuccess());
		
	}
	
	
}
