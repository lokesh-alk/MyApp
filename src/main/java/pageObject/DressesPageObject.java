package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPageObject extends BasePage 
{
	public DressesPageObject()
	{
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath= "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement sizeS;
	
	public WebElement getSizeS()
	{
		return sizeS;
	}
	
	@FindBy(xpath= "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement sizeM;
	
	public WebElement getSizeM()
	{
		return sizeM;
	}
		
	@FindBy(xpath= "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement sizeL;
	
	public WebElement getSizeL()
	{
		return sizeL;
	}
	
	@FindBy(xpath= "//*[@id=\"layered_id_attribute_group_1\"]")
	private WebElement checkboxS;
	
	public WebElement selectCheckboxS()
	{
		return checkboxS;		
	}
	
	@FindBy(xpath= "//*[@id=\"layered_id_attribute_group_2\"]")
	private WebElement checkboxM;
	
	public WebElement selectCheckboxM()
	{
		return checkboxM;		
	}
	
	@FindBy(xpath= "//*[@id=\"layered_id_attribute_group_3\"]")
	private WebElement checkboxL;
	
	public WebElement selectCheckboxL()
	{
		return checkboxL;		
	}
	
	@FindBys(@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li"))
	private List<WebElement> prodList;
	
	public int getProdList()
	{
		return prodList.size();
	}

	
	@FindBy(xpath= "//*[@class='heading-counter']")
	private WebElement prodCountS;
	
	public int getProdCountS()
	{
		String[] arr= prodCountS.getText().split(" ");
		String str= arr[2].toString();
		int Count= Integer.parseInt(str);
		return Count;		
	}
	
	@FindBy(xpath= "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	private WebElement OpenCart;
	
	public WebElement getOpenCart()
	{
		return OpenCart;		
	}
	
	@FindBy(xpath= "//*[@id=\"center_column\"]/p")
	private WebElement emtyCart;
	
	public WebElement getEmtyCart()
	{
		return emtyCart;		
	}
	
	@FindBy(xpath= "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement img;
	
	public WebElement getimg()
	{
		return img;		
	}
	
	@FindBy(xpath= "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	private WebElement addDress;
	
	public WebElement addDresses()
	{
		return addDress;
		
	}	
	
	@FindBy(xpath= "//*[@title='Continue shopping']")
	private WebElement contShop;
	
	public WebElement getContShop()
	{
		return contShop;
		
	}
	
	@FindBy(xpath= "//*[@class='ajax_cart_quantity unvisible']")
	private WebElement cartCount;
	
	public String getCartCount()
	{
		String num= cartCount.getText();
		return num;		
	}
	///////////////////////////////////////////////////////////////////////////////////
	
	/*@FindBy(xpath= "//*[@id='short_description_content']/p")
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
	*/



	

	
	

}
