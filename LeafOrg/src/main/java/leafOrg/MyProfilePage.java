package leafOrg;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.LeafOrgWrappers;

public class MyProfilePage extends LeafOrgWrappers{ 

	public MyProfilePage(AndroidDriver<?> driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	public MyProfilePage editFirstName(String fName){
		enterTextByXpath(prop.getProperty("MyProfilePage.FirstName.Xpath"),fName);
		return this;

	}
	public MyProfilePage editLastName(String lName){
		enterTextByXpath(prop.getProperty("MyProfilePage.LastName.Xpath"),lName);
		return this;

	}
	public MyProfilePage editPhoneNum(String pNum){
		enterTextByXpath(prop.getProperty("MyProfilePage.PhoneNumber.Xpath"),pNum);
		return this;

	}
	public MyProfilePage clickSaveChanges(){
		clickByXpath(prop.getProperty("MyProfilePage.SaveChanges.Xpath"));		
		return this;
	}
	public MyProfilePage clickOK(){
		clickByXpath(prop.getProperty("MyProfilePage.Confirmation.Xpath"));		
		return this;
	}
	public SettingsPage clickSettings2(){
		clickByXpath(prop.getProperty("HomePage.Settings.Xpath"));

		return new SettingsPage(driver, test);
	}
}
