package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DresProdDetailObject extends BasePage 
{
	public DresProdDetailObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//*[@id='short_description_content']/p")
	private WebElement prodDesc;
	
	public String getProdDesc()
	{
		String prodDes= prodDesc.getText();
		return prodDes;
	}
	
	@FindBy(xpath= "//*[@id='center_column']/div/div/div[3]/p[7]/button[1]")
	private WebElement tweet;
	
	public WebElement verifyTweet()
	{
		return tweet;		
	}
	
	@FindBy(xpath= "//*[@id='center_column']/div/div/div[3]/p[7]/button[2]")
	private WebElement fb;
	
	public WebElement verifyFBshare()
	{
		return fb;		
	}
}
