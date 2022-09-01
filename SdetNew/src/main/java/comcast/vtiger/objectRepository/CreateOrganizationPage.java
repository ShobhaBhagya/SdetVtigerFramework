package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	
	//Intialization
		public CreateOrganizationPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	 //Declaration
		
		@FindBy(name="accountname")
		private WebElement CreateOrganizationNameField;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement CreateOrganiztionSaveBtn;
		
		//getter methods

		public WebElement getCreateOrganizationNameField() {
			return CreateOrganizationNameField;
		}

		public WebElement getCreateOrganiztionSaveBtn() {
			return CreateOrganiztionSaveBtn;
		}
		
		//business Logics
		/**
		 * this method is used to cretae organization page
		 * @param organization
		 * @author Bhargavi
		 */
		
		public void OrganizationName(String orgName)
		{
			CreateOrganizationNameField.sendKeys(orgName);
		}
		
		public void OrganizationSave()
		{
			CreateOrganiztionSaveBtn.click();
		}

}
