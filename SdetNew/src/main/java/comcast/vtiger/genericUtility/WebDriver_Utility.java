package comcast.vtiger.genericUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utility {
	
	/**
	 * wait for the page to load before identifying any synchronized element in DOM
	 * @author Bhargavi
	 */
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	}
	
	
	/**
	 * after very action it will wait for the next action to perform
	 * @author Bhargavi
	 */
	public void scripeTimeOut(WebDriver driver)
	{
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);	}
	
	/**
	 * used to wait for the element to be clickable in GUI, and check for specific element for every 500 milliseconds
	 * @param driver
	 * @param element
	 * @author Bhargavi
	 */
	
	public void waitFortheElementTobeClickable(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * used for the element to be clickable in GUI AND and check for specific element for every 500 milliseconds
	 * @author Bhargavi
	 */
	public void waitforElemntwithCustomTimeOut(WebDriver driver, WebElement element, int pollingTime)
	{
	     FluentWait wait=new FluentWait(driver);
	     wait.pollingEvery(Duration.ofSeconds(20));
	     wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * used for the switching the window
	 * @author Bhargavi
	 */
	public void switchToWindow(WebDriver driver, String PartialWindowTitle)
	{
		Set<String> allId = driver.getWindowHandles();
        Iterator<String> it = allId.iterator();
        while(it.hasNext())
        {
        	String wid = it.next();
        	driver.switchTo().window(wid);
        	if(driver.getTitle().contains(PartialWindowTitle))
        	{
        		break;
        	}
        }
	}
	
	/**
	 * used for switching alertwindow and accept(click on ok button)
	 * @param driver
	 * @author Bhargavi
	 */
	public void alertPopupok(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * used for canceling alertpopup
	 * @param driver
	 * @author Bhargavi
	 */
	public void alertPopupcancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * used for the mouse cursor on the webelement
	 * @param driver
	 * @param ele
	 *  @author Bhargavi
	 */
	public void mouseHoverOnElement(WebDriver driver, WebElement element)
	{
		Actions a =new Actions(driver);
		a.moveToElement(element).perform();
	}
	/**
	 * used for the doubleclick on the webelement
	 * @param driver
	 * @param ele
	 *  @author Bhargavi
	 */
	public void doubleclickOnElement(WebDriver driver, WebElement element)
	{
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	/**
	 * used for rightclick on the specific element
	 * @param driver
	 * @param ele
	 *  @author Bhargavi
	 */
	public void rightclickOnElement(WebDriver driver, WebElement element)
	{
		Actions a =new Actions(driver);
		a.contextClick(element).perform();
	}
	/**
	 * used for the draganddrop on the webelement
	 * @param driver
	 * @param source
	 * @param target
	 *  @author Bhargavi
	 */
	public void draganddropOnElement(WebDriver driver, WebElement source, WebElement target)
	{
		Actions a =new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	
	/**
	 * used to switch to frame window based on Index
	 * @param driver
	 * @param index
	 *  @author Bhargavi
	 */
	public void switchToframe(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * used to switch to frame window based on id or name attribute
	 * @param driver
	 * @param id_name_attributes
	 * @author Bhargavi
	 */
	public void switchToFrame(WebDriver driver, String id_name_attributes)
	{
		driver.switchTo().frame(id_name_attributes);
	}
	/**
	 * used to select the value from the dropdown based on the text
	 * @param element
	 * @param Text
	 * @author Bhargavi
	 */
	public void select(WebElement element, String Text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(Text);
	}
	
	/**
	 * used to select the value from the dropdown based on the index
	 * @param element
	 * @param index
	 * @author Bhargavi
	 */
	public void select(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	

}
