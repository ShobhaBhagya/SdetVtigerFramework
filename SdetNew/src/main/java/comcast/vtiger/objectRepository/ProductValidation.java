package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductValidation {

	public ProductValidation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(css="span.lvtHeaderText")
	private WebElement actualProductdata;

	public WebElement getActualProductdata() {
		return actualProductdata;
	}

	public String actualProductName()
	{
		return actualProductdata.getText();
		
	}
}
