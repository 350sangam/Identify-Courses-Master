package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.ForBusiness;
import testBase.BaseClass;
import utility.ScreenShots;

public class TC_003_ForBusiness extends BaseClass {
	
	@Test
	public void enterpriseValidation() throws InterruptedException, IOException {
		ForBusiness en = new ForBusiness(driver);
		ScreenShots ss = new ScreenShots(driver);
		
		en.accessForBusiness();
		ss.ScreenShot("errorMessage");
	}
}
