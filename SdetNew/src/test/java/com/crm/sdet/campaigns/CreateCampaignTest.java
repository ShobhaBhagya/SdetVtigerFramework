package com.crm.sdet.campaigns;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtility.BaseClass;
import comcast.vtiger.genericUtility.Excel_Utility;
import comcast.vtiger.genericUtility.Java_Utility;
import comcast.vtiger.genericUtility.WebDriver_Utility;
import comcast.vtiger.objectRepository.CampaignPage;
import comcast.vtiger.objectRepository.CampaignValidation;
import comcast.vtiger.objectRepository.CreateCampaignPage;
import comcast.vtiger.objectRepository.homePage;

public class CreateCampaignTest extends BaseClass {
	
	@Test(groups= {"smokeTest"})
	public void CreateCampaigns() throws Throwable {
		        
		        WebDriver_Utility wlib= new WebDriver_Utility();
				wlib.waitForPageToLoad(driver);
				
				//selecting campaign from more and creating campaign
				homePage homepage = new homePage(driver);
				homepage.clickmoreModule();
				homepage.clickcampaignModule();
				
				CampaignPage campaignpage= new CampaignPage(driver);
				campaignpage.CampaignPagePlusBtn();
				
				//random number for campaign name
				Java_Utility jlib= new Java_Utility();
				int ranNum = jlib.getRandomNum();
				
				Excel_Utility elib=new Excel_Utility();
				String campaignName = elib.getDataFromExcel("campaigns", 1, 0)+ranNum;
				System.out.println(campaignName);
				
				//entering cmpaign name into campaign field
		        CreateCampaignPage createcampaign = new CreateCampaignPage(driver);
		        createcampaign.CampaignNameField(campaignName);
		        
		        //save the create campaign page
		        createcampaign.CampaignSaveBtn();
		        
		       //get the header text of create campaign
		        CampaignValidation actualCampaignName = new CampaignValidation(driver);
		        String actualCampaigndata= actualCampaignName.actualCampaignName();
		        Assert.assertEquals(actualCampaigndata.contains(campaignName), true);
		        
		        
//		        String actData = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
//		        if(actData.contains(campaignName))
//		        {
//		        	System.out.println("pass");
//		        }
//		        else
//		        {
//		        	System.out.println("fail");
//		        }
		        
		        //sign out   
			      homepage.mouseoverOnAdminstrator(driver);
			      homepage.clicksignoutBtn();
			        
				  driver.close();			  
	}
   

}
