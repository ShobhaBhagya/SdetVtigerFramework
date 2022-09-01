package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comcast.vtiger.genericUtility.WebDriver_Utility;

public class homePage {
	
	public homePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(linkText="Organizations")
	private WebElement organizationModule;
	
	@FindBy(linkText="Products")
	private WebElement productsModule;
	
	@FindBy(linkText="More")
	private WebElement moreModule;
	
	@FindBy(linkText="Campaigns")
	private WebElement campaignModule;
	
	@FindBy(xpath="//img[@style='padding: 0px;padding-left:5px']")
	private WebElement admistratorBtn;
	
	@FindBy(linkText="Sign Out")
	private WebElement signoutBtn;

	//getter methods
	
	public WebElement getOrganizationModule() {
		return organizationModule;
	}

	public WebElement getProductsModule() {
		return productsModule;
	}

	public WebElement getMoreModule() {
		return moreModule;
	}

	public WebElement getCampaignModule() {
		return campaignModule;
	}

	public WebElement getSignoutBtn() {
		return signoutBtn;
	}
	
	//business Logics
	/**
	 * this method is used select below modules
	 * @param organization
	 * @param product
	 * @param campaign
	 * @param more
	 * @param administrator
	 * @param signout
	 * @author Bhargavi
	 */

	public void clickorganizationModule()
	{
		organizationModule.click();	
	}
	
	public void clickproductsModule()
	
	{
		productsModule.click();
	}
	public void clickmoreModule()
	{
		moreModule.click();
	}
	public void clickcampaignModule()
	
	{
		campaignModule.click();
	}
	
	public void mouseoverOnAdminstrator(WebDriver driver)
	{
		 WebDriver_Utility wlib= new WebDriver_Utility();
		 wlib.mouseHoverOnElement(driver, admistratorBtn);
	}
	public void clicksignoutBtn()
	{
		signoutBtn.click();
	}



}
