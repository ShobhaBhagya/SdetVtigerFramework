package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	//Intialization
		public OrganizationPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	 //Declaration
		@FindBy(xpath="//img[@alt='Create Organization...' ]")
		private WebElement CreateOrganizationPlusBtn;

		//getters method
		public WebElement getCreateOrganizationPlusBtn() {
			return CreateOrganizationPlusBtn;
		}
		
		//business Logics
		/**
		 * this method is used to create new create organization page
		 * @param organization
		 * @author Bhargavi
		 */
		
		public void OrganizationPagePlusBtn()
		{
			CreateOrganizationPlusBtn.click();
		}

}
