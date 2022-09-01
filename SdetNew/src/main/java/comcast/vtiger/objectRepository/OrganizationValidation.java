package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationValidation {
	
	public OrganizationValidation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="span.dvHeaderText")
	private WebElement actualOrganizationdata;

	public WebElement getActualOrganizationdata() {
		return actualOrganizationdata;
	}
	
	public String actualOrganizationName()
	{
		return actualOrganizationdata.getText();
	}

}
