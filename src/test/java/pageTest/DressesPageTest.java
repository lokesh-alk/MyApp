package pageTest;

//import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.BasePage;
import pageObject.DressesPageObject;
import pageObject.HomePageObject;

public class DressesPageTest 
{
	HomePageObject HP;
	BasePage BP;
	DressesPageObject DP;
	
	public DressesPageTest()
	{
		HP= new HomePageObject();
		BP= new BasePage();
		DP = new DressesPageObject();
	}
	
	@Test
	public void verifySize()
	{
		HP.getDressesTab().click();
		Assert.assertTrue(BP.elementFound(DP.getSizeS()), "Size S not displayed");
		Assert.assertTrue(BP.elementFound(DP.getSizeM()), "Size M not displayed");
		Assert.assertTrue(BP.elementFound(DP.getSizeL()), "Size L not displayed");
		
	}
	
	@Test
	public void selectSize()
	{
		HP.getDressesTab().click();
		DP.selectCheckboxS().click();	
		Assert.assertTrue(DP.getProdList()== DP.getProdCountS(), "Product Count does not match");	
		//Assert.assertTrue(BP.isSelected(DP.selectCheckboxS()), "Size S is not selected");
//		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void addDressToCart()
	{
		HP.getDressesTab().click();
		DP.getOpenCart().click();
		Assert.assertTrue(DP.getEmtyCart().getText().contains("empty"), "Cart is NOT Empty");
		BP.NavigateBack();
		BP.MouseOver(DP.getimg());
		DP.addDresses().click();
		DP.getContShop().click();
		Assert.assertTrue(DP.getCartCount().contains("1"), "Product is NOT added");		
	}
	
	/*@Test
	public void verifyProdDetail()
	{
		HP.getDressesTab().click();
		DP.getimg().click();
		Assert.assertTrue(BP.elementFound(DP.verifyTweet()), "Tweet is NOT displayed");
		Assert.assertTrue(BP.elementFound(DP.verifyFBshare()), "FBshare is NOT displayed");

		Assert.assertTrue(DP.getProdDesc().isEmpty(), "Product Description available");
		
	}
	*/
	
}
