package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
	
	//Intialization
			public CampaignPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
		}
			
		 //Declaration
			@FindBy(xpath="//img[@title='Create Campaign...']")
			private WebElement CreateCampaignPlusBtn;

			//getters method
			public WebElement getCreateCampaignPlusBtn() {
				return CreateCampaignPlusBtn;
			}

			//business Logics
			/**
			 * this method is used to create new create organization page
			 * @param organization
			 * @author Bhargavi
			 */
			
			public void CampaignPagePlusBtn()
			{
				CreateCampaignPlusBtn.click();
			}

}
