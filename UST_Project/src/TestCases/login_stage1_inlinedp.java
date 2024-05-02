package testNGtestcases;



import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class login_stage1_inlinedp {
  
	boolean res;
	
	@DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "abc", "ddd" },
	      new Object[] { "tomsmith", "SuperSecretPassword!" },
	    };
	  }
	
	@Test(dataProvider = "dp")
  public void login(String u, String p) {
		
		System.out.println("Username:" + u + " Password " + p);
  
	res = u.equals("tomsmith") ? true : false;
	
	Assert.assertEquals(true,res);	
		
  
  }

  
}
