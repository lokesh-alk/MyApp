package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage 
{
	public HomePageObject() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement womenTab;
	
	public WebElement getWomenTab() 
	{
		return womenTab;
	}
	
	@FindBy(xpath= "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dressesTab;
	
	public WebElement getDressesTab()
	{
		return dressesTab;
	}
	
	@FindBy(xpath= "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement tshirtsTab;
	
	public WebElement getTshirtsTab()
	{
		return tshirtsTab;
	}
	
	@FindBy(xpath= "//*[@id='newsletter-input']")
	private WebElement emailNews;
	
	public WebElement emailNewsLetr()
	{
		return emailNews;		
	}
	
	
	@FindBy(xpath= "//*[@name='submitNewsletter']")
	private WebElement subNewsLtr;
	
	public WebElement sbmtNewsLetr()
	{
		return subNewsLtr;		
	}
	
	@FindBy(xpath= "//*[@class='alert alert-success']")
	private WebElement newsAlert;
	
	public WebElement newsLetrAlert()
	{
		return newsAlert;		
	}
	


}
