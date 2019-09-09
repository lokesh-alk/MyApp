package pageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.BasePage;
import pageObject.DresProdDetailObject;
import pageObject.DressesPageObject;
import pageObject.HomePageObject;

public class DresProdDetailTest 
{
	HomePageObject HP;
	BasePage BP;
	DressesPageObject DP;
	DresProdDetailObject PD;
	
	public DresProdDetailTest()
	{
		HP= new HomePageObject();
		BP= new BasePage();
		DP= new DressesPageObject();
		PD= new DresProdDetailObject(); 
	}
	
	@Test
	public void verifyProdDetail1()
	{
		HP.getDressesTab().click();
		DP.getimg().click();
		Assert.assertTrue(BP.elementFound(PD.verifyTweet()), "Tweet is NOT displayed");
		Assert.assertTrue(BP.elementFound(PD.verifyFBshare()), "FBshare is NOT displayed");

		Assert.assertTrue(PD.getProdDesc().isEmpty(), "Product Description available");
		
	}

}
