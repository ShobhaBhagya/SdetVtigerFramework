package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	
	//Intialization
			public CreateCampaignPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
		    //Declaration
			
			@FindBy(name="campaignname")
			private WebElement CreateCampaignNameField;
			
			@FindBy(xpath="//input[@title='Save [Alt+S]']")
			private WebElement CreateCampaignSaveBtn;
			
			@FindBy(xpath="//img[@title='Select']")
			private WebElement CreateCampaignPageProdcuPlusBtn;
			
			//getter methods
			public WebElement getCreateCampaignNameField() {
				return CreateCampaignNameField;
			}

			public WebElement getCreateCampaignSaveBtn() {
				return CreateCampaignSaveBtn;
			}

			public WebElement getCreateCampaignPageProdcuPlusBtn() {
				return CreateCampaignPageProdcuPlusBtn;
			}
			
			//business Logics
			/**
			 * this method is used to cretae campaign page with product
			 * @param organization
			 * @author Bhargavi
			 */
			
			public void CampaignNameField(String campaignName)
			{
				CreateCampaignNameField.sendKeys(campaignName);
			}

			public void CampaignSaveBtn()
			{
				CreateCampaignSaveBtn.click();
			}
			
			public void CreateCampaignProductPlusBtn()
			{
				CreateCampaignPageProdcuPlusBtn.click();
			}


}
