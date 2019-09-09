package pageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.BasePage;
import pageObject.HomePageObject;

public class HomePageTest 
{
	HomePageObject HP;
	BasePage BP;
	
	public HomePageTest()
	{
		HP= new HomePageObject();
		BP= new BasePage();
	}
	
	@Test
	public void VerifyHomePage()
	{
//		Assert.assertTrue(BP.elementFound(HP.getTitleHome()));
		Assert.assertTrue(BP.elementFound(HP.getWomenTab()), "Women Tab not Displayed");
		Assert.assertTrue(BP.elementFound(HP.getDressesTab()), "Dresses Tab not Displayed");
		Assert.assertTrue(BP.elementFound(HP.getTshirtsTab()), "T-Shirts Tab not Displayed");		
	}
	
	@Test
	public void verifyNavigate()
	{
		//Navigate to Women page
		HP.getWomenTab().click();
		String Women= HP.getTitlte();
		Assert.assertTrue(Women.contains("Women"), "Women Page not found");
		BP.NavigateBack();
		
		//Navigate to Dresses page
		HP.getDressesTab().click();
		String Dresses= BP.getTitlte();
		Assert.assertTrue(Dresses.contains("Dresses"), "Dresses page not found");
		BP.NavigateBack();
		
		//Navigate to T-shirts Page
		HP.getTshirtsTab().click();
		String Tshirts= BP.getTitlte();
		Assert.assertTrue(Tshirts.contains("T-shirts"), "T-Shirts page not found");
	}
	
	@Test
	public void VerifyNewsLetr()
	{
		BP.setText(HP.emailNewsLetr(), "Soka@yahoo.com");
		//HP.emailNewsLetr().sendKeys("Soka@yahoo.com");
		HP.sbmtNewsLetr().click();
		Assert.assertTrue(HP.newsLetrAlert().getText().contains("successfully subscribed"), "Newsletter subscription failed");
		
	}


}
